package telran.parking.dto;

import java.time.LocalDateTime;
import jakarta.validation.constraints.*;
public record ParkingDto(@NotNull long cameraId,@NotNull String slotNumber,String carNumber,@NotNull LocalDateTime timeStamp) {

}
