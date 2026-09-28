package com.sportygames.roulette.data;

import android.text.format.DateUtils;
import com.sportygames.commons.SportyGamesManager;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class History {
    public static final int LOST = 2;
    public static final int RUNNING = 0;
    public static final int WIN = 1;
    private static final SimpleDateFormat mDateFormat = new SimpleDateFormat("dd/MM/yyyy", SportyGamesManager.locale);
    public String betId;
    private String dateString;
    public long placeTime;
    public String result;
    public String stake;
    public long status;
    public String winningAmount;

    private String getDateString(long j) {
        if (DateUtils.isToday(j)) {
            return "Today";
        }
        return DateUtils.isToday(86400000 + j) ? "Yesterday" : mDateFormat.format(new Date(j));
    }

    public String getDateString() {
        String str = this.dateString;
        if (str != null) {
            return str;
        }
        String dateString = getDateString(this.placeTime);
        this.dateString = dateString;
        return dateString;
    }
}
