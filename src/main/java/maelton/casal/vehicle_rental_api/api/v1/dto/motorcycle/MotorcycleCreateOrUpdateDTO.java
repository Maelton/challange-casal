package maelton.casal.vehicle_rental_api.api.v1.dto.motorcycle;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO for creating or updating motorcycles")
public record MotorcycleCreateOrUpdateDTO(String name, String chassis, int tankCapacity) {
}
