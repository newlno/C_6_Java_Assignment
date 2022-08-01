public class pTP {
    int number;
    int fuel;
   int velocity;
int changeVelocity;
int max;
String states;
int pessengersNum;
int remainSeats;
int count;
String destination;
int distance;
int fee;
int standarizeFee;
int standarizeDistance;
int addFee;
int total;
    public pTP(int number, int fuel, int velocity, int changeVelocity, int max, int pessengersNum ) {
        this.number = number;
        this.fuel = fuel;
        this.velocity = velocity;
        this.changeVelocity = changeVelocity;
        this.max = max;
        this.pessengersNum=pessengersNum;
        this.remainSeats=max-pessengersNum;
    }

    public pTP(int pessengersNum ) {
        double randomValue=Math.random();
        this.number = (int)(randomValue*1000)+1;
        this.changeVelocity = 0;
        this.max = 30;
        this.fuel=100;
        this.velocity=0;
        this.states="run";
        this.pessengersNum=pessengersNum;
        this.remainSeats=max-pessengersNum;

        this.count=0;
    }
    public pTP(  ) {
        this.fuel = 100;
        this.states="available";
        this.pessengersNum=0;// 손님 수
        this.changeVelocity=0;// 속력 변화
        double randomValue=Math.random();
        this.number=(int)(randomValue*1000)+1;// 차 번호
        this.fee=0;// 누적요금
        this. standarizeDistance=1;// 기본 거리
        this.standarizeFee= 3000;// 기본 요금
        this. velocity=0;// 속력
        this. addFee=1000;// 추가 요금
        this. total=0;// 총 금액
        this.max=4;// 최대 자리
this.destination="";
this.distance=0;
    }
}

