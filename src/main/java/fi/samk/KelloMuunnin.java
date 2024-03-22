package fi.samk;

public class KelloMuunnin {
    public String convertSeconds(int sec) {
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int rem_sec = (sec % 3600) % 60;
        String str_hour = String.format("%02d", hour);
        String str_min = String.format("%02d", min);
        String str_sec = String.format("%02d", rem_sec);
        return String.join(":", str_hour, str_min, str_sec);
    }
}
