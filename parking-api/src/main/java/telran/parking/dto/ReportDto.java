package telran.parking.dto;


import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;

public record ReportDto(String carNumber,long cameraId,String cameraAdress,LocalDateTime timeStamp,long ownerId,String ownerEmail,double adressFinePrice,FineStatus fineStatus,String ownerName) {

}
