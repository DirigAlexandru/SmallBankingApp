public class ContBancar {

  int id;

  String descriere;

  String data;

  double suma;

  public ContBancar (int id, String descriere, String data, double suma) {

    super();// fie folosesti super(); fie constructorul implicit
    this.id = id;
    this.descriere = descriere;
    this.data = data;
    this.suma = suma;
  }
  ContBancar(){}; //Constructorul implicit
}
