package models;

import java.util.Arrays;

public class Brand{

  private String brandName;
  private CarModel[] modelo;

  public Brand(String brandName, CarModel[] modelo) {
    this.brandName = brandName;
    this.modelo = modelo;
  }
  
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public CarModel[] getModelo() {
    return modelo;
  }


  public void setModelo(CarModel[] modelo) {
    this.modelo = modelo;
  }

  public int getTotalValidYears(){
    int total=0;
    int len = modelo.length;
    for (int i=0 ; i<len; i++){
      CarYear[] carYears = modelo[i].getCarYears();
      for (int j=0 ; j<len; j++){
        if(carYears[j].getIsValid() == true){
          total++;
        }
      }
    }
    return total;
  }

}
