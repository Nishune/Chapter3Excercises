public class PetrolPurchase {

    private String location;
    private String petrol;
    private int quantityInLitres;
    private double pricePerLitre;
    private double discount;

    public PetrolPurchase(String location, String petrol, int quantityInLitres, double pricePerLitre, double discount) {
        this.location = location;
        this.petrol = petrol;
        this.quantityInLitres = quantityInLitres;
        this.pricePerLitre = pricePerLitre;
        this.discount = discount;
    }

    public double getPurchaseAmount() {
        double totalCost = quantityInLitres * pricePerLitre;
        double discountAmount = totalCost * (discount / 100);
        return totalCost - discountAmount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    public int getQuantityInLitres() {
        return quantityInLitres;
    }

    public void setQuantityInLitres(int quantityInLitres) {
        this.quantityInLitres = quantityInLitres;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
