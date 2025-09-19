package school.sorokin.javacore.exception.lesson4;

public class Hotel {

    private boolean isBusy;

    public Hotel() {
        isBusy = true;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public void bookRoom(int roomNumber) {
            if(isBusy) {
                throw new RoomNotAvailableException("Номер " + roomNumber + " занят");
            } else {
                System.out.println("Номер " + roomNumber + " забронирован");
            }
    }

    public void checkRoomNumber(int roomNumber) {
        if (roomNumber < 0 || roomNumber > 1000) {
            throw new InvalidRoomNumberException("Номер " + roomNumber + " не существует");
        } else {
            System.out.println("Номер " + roomNumber + " можно забронировать");
        }
    }
}
