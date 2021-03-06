package shop.buyAndSell.quickr.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Data
@Document(collection = "Product")
public class Product {

@Id
private String productId;
private String productName;
private String categoryId;
private String productDescription;
private String sellerId;
private double productPrice;

private List<String> productImages;
private boolean productStatus;

}
