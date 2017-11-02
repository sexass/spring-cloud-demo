package prv.demo.entity;

/**
 * 商品
 *
 * @author 郭友文
 * @create 2017-10-26 17:53
 **/
public class ItemModel {
    private Long id;
    private String code;
    private String name;
    private Double price;

    public ItemModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
