public  class ProductBuilder{
    private String name;
    private String price;
    private String description;

    public ProductBuilder setName(String name){
        this.name = name;
        return this;
    }
    public ProductBuilder setPrice(String price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Product build(){
        return new Product(name , price ,description);
    }

}