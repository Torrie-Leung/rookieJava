public class Main {

    public static void main(String[] args) {
	    // 使用array需要开辟空间
        int[] scores = new int[]{100,99,65};
        for (int i = 0; i < scores.length; i++)
            System.out.println(scores[i]);
        // java foreach
        for(int score: scores)
            System.out.println(score);
    }
}
