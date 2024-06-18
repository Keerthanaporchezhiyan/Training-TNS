package extendthread;

public class ExtendThreadClass {

    public static void main(String[] args) {
        System.out.println("Creating PrintNameThread object instance");
        PrintNameThread pnt = new PrintNameThread("A");
        System.out.println("Calling start method of " + pnt.getName() + " thread");
        pnt.start();
        System.out.println("Creating PrintNameThread object instance");
        PrintNameThread pnt1 = new PrintNameThread("B");
        System.out.println("Calling start method of " + pnt1.getName() + " thread");
        pnt1.start();
        System.out.println("Creating PrintNameThread object instance");
        PrintNameThread pnt2 = new PrintNameThread("C");
        System.out.println("Calling start method of " + pnt2.getName() + " thread");
        pnt2.start();
    }
}

class PrintNameThread extends Thread {

    PrintNameThread(String Name) {
        super(Name);
    }

    public void run() {
        System.out.println("Printing run method " + this.getName() + " Thread called");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName());
        }
    }
}
