class StringBuffer{
    public static void main(String args[]){

    StringBuffer s=new StringBuffer();
    System.out.println(s.capacity());
    s.append("sachin");
    System.out.println(s.capacity());
    s.append("is a great batsman");
    System.out.println(s.capacity());
    }
}