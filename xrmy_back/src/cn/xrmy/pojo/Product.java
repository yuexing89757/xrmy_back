package cn.xrmy.pojo;

public class Product {
    private Long id;

    private String name;

    private Double price;

    private String photo;

    private String productType;

    private Boolean ifRecommend;

    private String viedoTitle;

    private String viedoUrl;

    private String viedoPhoto;

    private String describtion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public Boolean getIfRecommend() {
        return ifRecommend;
    }

    public void setIfRecommend(Boolean ifRecommend) {
        this.ifRecommend = ifRecommend;
    }

    public String getViedoTitle() {
        return viedoTitle;
    }

    public void setViedoTitle(String viedoTitle) {
        this.viedoTitle = viedoTitle == null ? null : viedoTitle.trim();
    }

    public String getViedoUrl() {
        return viedoUrl;
    }

    public void setViedoUrl(String viedoUrl) {
        this.viedoUrl = viedoUrl == null ? null : viedoUrl.trim();
    }

    public String getViedoPhoto() {
        return viedoPhoto;
    }

    public void setViedoPhoto(String viedoPhoto) {
        this.viedoPhoto = viedoPhoto == null ? null : viedoPhoto.trim();
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion == null ? null : describtion.trim();
    }
}