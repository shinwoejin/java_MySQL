public class TermProjectDemo {

    public static void main(String[] aStrings) {

        System.out.println("선택");

        TermProject_Polls polls = new TermProject_Polls();
        int val = polls.PollFunction();

        // System.out.println("선택");

        TermProjectStatics stat = new TermProjectStatics();
        val = stat.statFunction();
        return;
    }
}
