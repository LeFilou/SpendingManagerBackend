package org.melsif.form;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExpenditureForm {
    private int cost;
    private String date;
    private String type;
}
