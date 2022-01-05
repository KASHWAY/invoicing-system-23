package pl.targosz.invoicing.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Invoice {

    private UUID id;
    private LocalDateTime createdAt;
    private Company seller;
    private Company buyer;
    private List<InvoiceEntry> entries;
}
