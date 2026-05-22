// 학번 : 2025005685
// 이름 : 유다경 

package hw05;

public class ReservationSystem implements ReservationInterface {
    protected int[][] seats;
    protected int row;
    protected int col;

    protected static final int EMPTY = 0;
    protected static final int OCCUPIED = 1;

    @Override
    public void makeSeats(int row, int col) {
        this.row = row;
        this.col = col;
        seats = new int[row][col];
    }

    public int getReservedCount() {
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (seats[i][j] == OCCUPIED) {
                    count++;
                }
            }
        }

        return count;
    }

    public int getTotalSeats() {
        return row * col;
    }

    protected char getRowName(int rowIndex) {
        return (char)('A' + (row - 1 - rowIndex));
    }

    protected int getRowIndex(char rowName) {
        rowName = Character.toUpperCase(rowName);

        int index = row - 1 - (rowName - 'A');

        if (index < 0 || index >= row) {
            return -1;
        }

        return index;
    }

    protected int getColIndex(String seatName) {
        if (seatName == null || seatName.length() < 2 || seatName.length() > 3) {
            return -1;
        }

        String numberPart = seatName.substring(0, seatName.length() - 1);

        for (int i = 0; i < numberPart.length(); i++) {
            if (!Character.isDigit(numberPart.charAt(i))) {
                System.out.println(seatName + ": 숫자가 아닌 잘못된 좌석 이름입니다.");
                return -1;
            }
        }

        int seatNumber = Integer.parseInt(numberPart);

        if (seatNumber < 1 || seatNumber > col) {
            System.out.println(seatName + ": 좌석의 범위를 넘은 잘못된 좌석 이름입니다.");
            return -1;
        }

        return seatNumber - 1;
    }

    protected int[] parseSeat(String seatName) {
        if (seatName == null || seatName.length() < 2 || seatName.length() > 3) {
            return null;
        }

        char rowChar = seatName.charAt(seatName.length() - 1);
        int rowIndex = getRowIndex(rowChar);
        int colIndex = getColIndex(seatName);

        if (rowIndex == -1 || colIndex == -1) {
            return null;
        }

        return new int[] { rowIndex, colIndex };
    }

    @Override
    public int reserveSeat(String seatName) {
        int[] index = parseSeat(seatName);

        if (index == null) {
            System.out.println("[예약 실패]: 잘못된 좌석 이름입니다.");
            return -1;
        }

        int r = index[0];
        int c = index[1];

        if (seats[r][c] == OCCUPIED) {
            System.out.println("[예약 실패] " + seatName + ": 이미 예약된 좌석입니다.");
            return -1;
        }

        seats[r][c] = OCCUPIED;
        System.out.println("[예약 성공] " + seatName);
        return 0;
    }

    @Override
    public int cancelSeat(String seatName) {
        int[] index = parseSeat(seatName);

        if (index == null) {
            System.out.println("[예약 취소 실패]: 잘못된 좌석 이름입니다.");
            return -1;
        }

        int r = index[0];
        int c = index[1];

        if (seats[r][c] == EMPTY) {
            System.out.println("[예약 취소 실패] " + seatName + ": 예약 되지 않은 좌석입니다.");
            return -1;
        }

        seats[r][c] = EMPTY;
        System.out.println("[예약 취소 성공] " + seatName);
        return 0;
    }

    @Override
    public void displaySeat(String systemTitle) {
        System.out.println("[" + systemTitle + " 예약 현황] 예약 좌석: "
                + getReservedCount() + "/ 총 좌석: " + getTotalSeats());

        for (int i = 0; i < row; i++) {
            char rowName = getRowName(i);

            for (int j = 0; j < col; j++) {
                System.out.printf("[%2d%c]  ", j + 1, rowName);
            }
            System.out.println();

            for (int j = 0; j < col; j++) {
                if (seats[i][j] == OCCUPIED) {
                    System.out.print("  X    ");
                } else {
                    System.out.print("  O    ");
                }
            }
            System.out.println();

            if ((row == 4 && i == 1) || (row == 3 && i == 0)) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("\t앞\t\t\t통로\t\t\t뒤");
                System.out.println("--------------------------------------------------------------------");
            }
        }
    }
}