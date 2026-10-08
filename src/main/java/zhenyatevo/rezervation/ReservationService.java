package zhenyatevo.rezervation;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class ReservationService {

    private final Map<Long,Reservation> reservationMap = Map.of(
            1L,new Reservation(
                    1L,
                    100L,
                    40L,
                    LocalDate.now(),
                    LocalDate.now().plusDays(5),
                    ReservationStatus.APPROVED
            ),
            2L,new Reservation(
                    2L,
                    110L,
                    44L,
                    LocalDate.now(),
                    LocalDate.now().plusDays(5),
                    ReservationStatus.APPROVED
            ),
            3L,new Reservation(
                    3L,
                    103L,
                    27L,
                    LocalDate.now(),
                    LocalDate.now().plusDays(5),
                    ReservationStatus.APPROVED
            )
    );

    public Reservation getReservationById(Long id) {
        return new Reservation(
                id,
                100L,
                40L,
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                ReservationStatus.APPROVED
        );
    }

    public List<Reservation> findAllReservation() {
        return List.of(
                new Reservation(
                        1L,
                        100L,
                        40L,
                        LocalDate.now(),
                        LocalDate.now().plusDays(5),
                        ReservationStatus.APPROVED
                ),
                new Reservation(
                        2L,
                        100L,
                        40L,
                        LocalDate.now(),
                        LocalDate.now().plusDays(5),
                        ReservationStatus.APPROVED
                )

        );
    }
}
