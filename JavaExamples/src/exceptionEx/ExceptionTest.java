package exceptionEx;

public class ExceptionTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if(userID == null) {
            throw new IDFormatException("아이디는 null 알 수 없습니다.");
        }
        else if(userID.length() < 8 || userID.length()>20){
            throw new IDFormatException("아이디는 8자이상 20이하로 쓰세요.");
        }
        this.userID = userID;
    }

    public static void main(String[] args){
        ExceptionTest ex = new ExceptionTest();
        String userID = "12";

        try {
            ex.setUserID(userID);
        }
        catch (IDFormatException e) {
            System.out.println(e);
        }
    }
}

