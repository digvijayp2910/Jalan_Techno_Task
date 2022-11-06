
import java.time.Clock;
public class task2 extends Clock
{
	public int alarmHour;
	public int alarmMinute;
	public int alarmSecond;

	//Constructors
	public task2()
	{
		super();
		alarmHour = 0;
		alarmMinute = 0;
		alarmSecond = 0;
	}

	public task2(int theHour, int theMinute, int theSecond, int alarmH, int alarmM, int alarmS)
	{
		super(theHour, theMinute, theSecond);
		setAlarmHour(alarmH);
		setAlarmMinute(alarmM);
		setAlarmSecond(alarmS);
	}

	
	public void setAlarmHour(int alarmH)
	{
		if((alarmH >= 0) && (alarmH <= 24))
			alarmHour = alarmH;
		else
			System.out.println("Fatal error: invalid alarm hour");
	}

	public void setAlarmMinute(int alarmM)
	{
		if((alarmM >= 0) && (alarmM <= 59))
			alarmMinute = alarmM;
		else
			System.out.println("Fatal error: invalid alarm minute");
	}

	public void setAlarmSecond(int alarmS)
	{
		if((alarmS >= 0) && (alarmS <= 59))
			alarmSecond = alarmS;
		else
			System.out.println("Fatal error: invalid alarm second");
	}
	
	public int getAlarmHour()
	{
		return alarmHour;
	}

	public int getAlarmMinute()
	{
		return alarmMinute;
	}

	public int getAlarmSecond()
	{
		return alarmSecond;
	}

	public String getCurrentAlarmTime()
	{
		return "The alarm is set to " + alarmHour + ":" + alarmMinute + ":" + alarmSecond;
	}

	
	public String toString()
	{
		return "The current time is " + getAlarmHour() + ":" + getAlarmMinute() + ":" +
				getAlarmSecond() + "\nThe alarm is set to " + getAlarmHour() + ":" +
				getAlarmMinute() + ":" + getAlarmSecond();
	}

	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		else if(getClass() != o.getClass())
			return false;
		else
		{
			task2 otherClock = (task2) o;
			return((getAlarmHour() == otherClock.getAlarmHour()) && (getAlarmMinute() == otherClock.getAlarmMinute()) && (getAlarmSecond() == otherClock.getAlarmSecond()) && (alarmHour == otherClock.alarmHour) && (alarmMinute == otherClock.alarmMinute) && (alarmSecond == otherClock.alarmSecond));
		}

	}

}