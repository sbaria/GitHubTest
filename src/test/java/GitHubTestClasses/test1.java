package GitHubTestClasses;

public class test1 {
    public static void main(String[] args) {
        test1 ts=new test1();
        ts.gitHubTest2();
        ts.gitHubTest3();
        ts.gitHubFetch2();
        ts.branch4();

        System.out.println("my first class commit to github from branch1");
        System.out.println("checking fetch for origin/master");
        System.out.println("checking pull request");
    }
    public void gitHubTest2(){
        System.out.println("my commit for branch 2 which i will marge with master on gitHub and pull to local master");
    }
    public void gitHubTest3(){
        System.out.println("i commit this change to check fetch command");
    }
    public void gitHubFetch2(){
        System.out.println("i commit this change to check fetch command1");
    }
    public void branch4(){
        System.out.println("final commit");
    }
    //git branch -a
}
