import jakarta.persistence.Entity;
import jakara.persistence.Id;

import java.lang.annotation.Inherited;

import jakara.persistence.GeneratedValue;

@Entity
public class Securities{
    
    @Id
    @GeneratedValue()
    private long securityID;

    @Column
    private string name;

    @Column
    private string type;

    @Column
    private string currency;

    @Column
    private string purchaseDate;

    @Column
    private string purchasePrice;

    @Column
    private long quantity;

    protected Securities(){};

    public Securities(String name, String type, String currency,
                      String purchaseDate, long purchasePrice, long quantity) {
        this.name = name;
        this.type = type;
        this.currency = currency;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }
}