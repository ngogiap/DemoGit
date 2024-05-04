public class DuongThang {
    private Diem A,B;
    public DuongThang(Diem A, Diem B){
        this.A=A;
        this.B=B;
    }
    public Diem GetA(){
        return A;
    }
    public void SetA(Diem A){
        this.A=A;
    }
    public Diem GetB(){
        return B;
    }
    public void SetB(Diem B){
        this.B=B;
    }
    public double tinhDoDai(){
        return Math.sqrt(Math.pow(A.GetX()-B.GetX()),2+Math.pow(A.GetY()-B.GetY()),2);
    } 
}
