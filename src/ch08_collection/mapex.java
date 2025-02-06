package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class mapex {

    public static void main(String[] args) {
        ArrayList<String> playList = new ArrayList<>(Arrays.asList("REBELHEART:IVE(아이브)",
                "HOMESWEETHOME(feat.태양,대성):G-DRAGON", "Dash:PLAVE", "Whiplash:aespa", "RIZZ:PLAVE", "나는반딧불:황가람",
                "ChromaDrift:PLAVE", "12:32(AtoT):PLAVE", "APT.:로제(ROSÉ),BrunoMars", "Island:PLAVE",
                "toxictilltheend:로제(ROSÉ)", "Drowning:WOODZ", "오늘만ILOVEYOU:BOYNEXTDOOR", "POWER:G-DRAGON",
                "HAPPY:DAY6(데이식스)", "DRIP:BABYMONSTER", "너와의모든지금:재쓰비(JAESSBEE)", "내게사랑이뭐냐고물어본다면:로이킴", "사랑은늘도망가:임영웅",
                "내이름맑음:QWER", "WelcometotheShow:DAY6(데이식스)", "소나기:이클립스(ECLIPSE)", "UP(KARINASolo):aespa", "온기:임영웅",
                "우리들의블루스:임영웅", "Supernova:aespa", "천상연:이창섭", "ATTITUDE:IVE(아이브)", "Home:임영웅", "한페이지가될수있게:DAY6(데이식스)",
                "슬픈초대장:순순희(지환)", "모래알갱이:임영웅", "다시만날수있을까:임영웅", "이제나만믿어요:임영웅", "어떻게이별까지사랑하겠어,널사랑하는거지:AKMU(악뮤)",
                "DoorDie:임영웅", "무지개:임영웅", "LondonBoy:임영웅", "Polaroid:임영웅", "인생찬가:임영웅", "고민중독:QWER", "예뻤어:DAY6(데이식스)",
                "Mantra:제니(JENNIE)", "Lovewinsall:아이유", "연애편지:임영웅", "HowSweet:NewJeans", "나는아픈건딱질색이니까:(여자)아이들",
                "Supersonic:프로미스나인", "너의모든순간:성시경", "보금자리:임영웅", "첫만남은계획대로되지않아:TWS(투어스)", 
                "그대만있다면(여름날우리X너드커넥션(NerdConnection)):너드커넥션(NerdConnection)", "비의랩소디:임재현",
                "무제(無題)(Untitled,2014):G-DRAGON", "IAM:IVE(아이브)", "Smallgirl(feat.도경수(D.O.)):이영지", "살기위해서:순순희", 
                "numberonegirl:로제(ROSÉ)", "에피소드:이무진", "청바지:부석순(SEVENTEEN)", "헤어지자말해요:박재정", "미안해미워해사랑해:Crush",
                "Hug(포옹):RIIZE", "Magnetic:아일릿(ILLIT)", "Ditto:NewJeans", "모든날,모든순간(Everyday,EveryMoment):폴킴",
                "Igloo:KISSOFLIFE", "다정히내이름을부르면:경서예지,전건호", "청춘만화:이무진", "해야(HEYA):IVE(아이브)", "인사:범진", "Armageddon:aespa",
                "주저하는연인들을위해:잔나비", "DieWithASmile:LadyGaga,BrunoMars", "첫눈:EXO", "눈이오잖아(Feat.헤이즈):이무진",
                "청혼하지않을이유를못찾았어:이무진", "Seven(feat.Latto)-CleanVer.:정국", "녹아내려요:DAY6(데이식스)", "클락션(Klaxon):(여자)아이들",
                "HypeBoy:NewJeans", "Supernatural:NewJeans", "LoveHangover(feat.DominicFike):제니(JENNIE),DominicFike",
                "Love119:RIIZE", "Sticky:KISSOFLIFE", "사랑인가봐:멜로망스", "사건의지평선:윤하(YOUNHA)", "To.X:태연(TAEYEON)",
                "SPOT!(feat.JENNIE):지코(ZICO)", "WAY4LUV:PLAVE", "취중고백:김민석", "BoomBoomBass:RIIZE",
                "Congratulations:DAY6(데이식스)", "BubbleGum:NewJeans", "사막에서꽃을피우듯:우디(Woody)", "Dynamite:방탄소년단",
                "PumpUpTheVolume!:PLAVE", "봄날:방탄소년단", "Drama:aespa", "봄여름가을겨울(StillLife):BIGBANG(빅뱅)"));

        // 고유한 가수 목록 생성
        HashSet<String> uniqesingers = new HashSet<>();
        for (int i = 0; i < playList.size(); i++) {
            String[] album = playList.get(i).split(":");
            String singer = album[1];
            uniqesingers.add(singer);
        }

        // 가수명과 노래 목록을 맵에 저장
        HashMap<String, ArrayList<String>> songMap = new HashMap<>();
        for (String songEntry : playList) {
            String[] parts = songEntry.split(":");
            String songTitle = parts[0];
            String singer = parts[1];

            // 가수명 key가 있으면 노래 목록에 추가
            if (songMap.containsKey(singer)) {
                ArrayList<String> songs = songMap.get(singer);
                songs.add(songTitle);
                songMap.put(singer, songs);
            } else {
                ArrayList<String> songs = new ArrayList<>();
                songs.add(songTitle);
                songMap.put(singer, songs);
            }
        }

        // 1. 가수명 5명씩 출력
        System.out.println("===== Top 100 가수명 =====");
        int count = 0;
        for (String singer : uniqesingers) {
            System.out.print(singer + "\s");
            count++;
            if (count % 5 == 0) {
                System.out.println();  // 5명마다 줄 바꿈
            }
        }
        System.out.println();

        // 2. 사용자로부터 가수명 입력받고, 해당 가수의 노래 목록 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("가수명을 입력하세요: ");
        String inputSinger = sc.nextLine();

        // 해당 가수의 노래 목록을 출력
        if (songMap.containsKey(inputSinger)) {
            System.out.println(inputSinger + "의 노래 목록:");
            ArrayList<String> songs = songMap.get(inputSinger);
            for (String song : songs) {
                System.out.println(song);
            }
        } else {
            System.out.println("입력한 가수는 존재하지 않습니다.");
        }

        sc.close();
    }
}
