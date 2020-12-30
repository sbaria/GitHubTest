package GitHubTestClasses;

public class test2 {
    public static void main(String[] args) {
       test2 t2=new test2();
       t2.fetchMaster();
        System.out.println("last commit for fetch to local");
    }
    public void fetchMaster(){
        System.out.println("final pull and fetch to git local master");
    }
}
