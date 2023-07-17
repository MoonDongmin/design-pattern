package Chapter11.gumballmonitor;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
 
	State state = soldOutState;
	int count = 0;
 	String location;
 
	public GumballMachine(String location, int count) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = count;
 		if (count > 0) {
			state = noQuarterState;
		} 
		this.location = location;
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("알맹이를 내보내고 있습니다.");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	public int getCount() {
		return count;
	}

	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }
 
    public String getLocation() {
        return location;
    }
 
    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n주식회사 왕뽑기");
		result.append("\n자바로 돌아가는 최신형 뽑기 기계");
		result.append("\n남은 개수: " + count);
		if (count != 1) {
			result.append("개");
		}
		result.append("\n");
		result.append("이 기계는 " + state + "\n");
		return result.toString();
	}
}
