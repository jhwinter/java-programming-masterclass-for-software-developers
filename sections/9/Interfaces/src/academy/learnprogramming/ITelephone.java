package academy.learnprogramming;

public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public boolean answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
