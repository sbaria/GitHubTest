package GitHubTestClasses;

public class test1 {
    public static void main(String[] args) {
        test1 ts=new test1();
        ts.gitHubTest2();
        ts.gitHubTest3();
        System.out.println("my first class commit to github from branch1");
    }
    public void gitHubTest2(){
        System.out.println("my commit for branch 2 which i will marge with master on gitHub and pull to local master");
    }
    public void gitHubTest3(){
        System.out.println("i commit this change to check fetch command");
    }
    public void gitHubFetch1(){
        System.out.println("i commit this change to check fetch command1");
    }
}
