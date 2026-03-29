import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Portfolio{
    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column
    private string name;

    @Column
    private string category;

    @Column
    private string purchaseDate;

    @Column
    private string purchasePrice;

    @Column
    private long numberOfInvestments;

    @Column
    private long lastReviewDate;

    protected Portfolio(){};

    public Portfolio(String name, String category, LocalDate purchaseDate,
                     double purchasePrice, long numberOfInvestments, LocalDate lastReviewDate) {
        
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.numberOfInvestments = numberOfInvestments;
        this.lastReviewDate = lastReviewDate;
    }
    
    @OneToMany(mappedBy = "portfolio")  
    private List<Securities> securities;
    
    @OneToOne(mappedBy = "portfolio")
    private Client client;
}