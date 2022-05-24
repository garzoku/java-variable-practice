class App {
  public int vin;
  public String vehicleMake;
  public String vehicleColor;
  public boolean hasTowPackage;
  public int odometerReading;
  public int price;
  public char quality;

  public App(int vin, String vehicleMake, String vehicleColor, boolean hasTowPackage, int odometerReading, int price,
      char quality) {
    this.vin = vin;
    this.vehicleMake = vehicleMake;
    this.vehicleColor = vehicleColor;
    this.hasTowPackage = hasTowPackage;
    this.odometerReading = odometerReading;
    this.price = price;
    this.quality = quality;
  }

  public int getVin() {
    return this.vin;
  }

  public String getVehicleMake() {
    return this.vehicleMake;
  }

  public String getVehicleColor() {
    return this.vehicleColor;
  }

  public boolean getHasTowPackage() {
    return this.hasTowPackage;
  }

  public int getOdometerReading() {
    return this.odometerReading;
  }

  public int getPrice() {
    return this.price;
  }

  public char getQuality() {
    return this.quality;
  }

  public static void main(String args[]) {
    App vehicle = new App(4583729, "Toyota Camry", "Blue", true, 34000, 29999, 'C');
    System.out.println(vehicle.getVin());
    System.out.println(vehicle.getVehicleMake());
    System.out.println(vehicle.getVehicleColor());
    System.out.println("hasTowPackage: " + vehicle.getHasTowPackage());
    System.out.println(vehicle.getOdometerReading());
    StringBuilder price = new StringBuilder();
    price.append('$');
    price.append(vehicle.getPrice());
    System.out.println(price.toString());
    System.out.println(vehicle.getQuality());
  }
}
