package school.sorokin.javacore.exception.lesson4;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        try {
            hotel.bookRoom(115);
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
        hotel.setBusy(false);
        hotel.bookRoom(120);
        try {
            hotel.checkRoomNumber(1200);
        } catch (InvalidRoomNumberException e) {
            System.out.println(e.getMessage());
        }
        hotel.checkRoomNumber(146);
    }
}
