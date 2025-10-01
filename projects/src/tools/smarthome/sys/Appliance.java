package tools.smarthome.sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Appliance {
    private String name;
    private String type;
    private String status;
}
