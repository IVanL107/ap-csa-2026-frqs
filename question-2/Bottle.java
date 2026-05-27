public class Bottle{
  double cap;
  double amo;

  public Bottle(double cc) {
    cap = cc;
    amo = cap;
  }
  public doubble updateAmount(double change){
    amo -= change;
    if(amo < (cap  * 0.25)) {
      amount = cap;
    }
    return amo;
  }
}
