package defpackage;

import com.sporty.android.core.model.loyalty.DailyRecordContent;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public interface w0u {
    static String L(Date date) {
        date.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        return bwf0.l(date, "dd MMM", locale, 0, 0);
    }

    static String W(DailyRecordContent dailyRecordContent) {
        if (dailyRecordContent == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dailyRecordContent.getDailyRewardStartDate());
        Calendar calendar2 = Calendar.getInstance();
        Long dailyRewardEndDate = dailyRecordContent.getDailyRewardEndDate();
        calendar2.setTimeInMillis(dailyRewardEndDate != null ? dailyRewardEndDate.longValue() : 0L);
        if (!dailyRecordContent.isAccumulate()) {
            Date time = calendar.getTime();
            time.getClass();
            return L(time);
        }
        if (calendar.get(2) == calendar2.get(2)) {
            int i = calendar.get(5);
            Date time2 = calendar2.getTime();
            time2.getClass();
            return vga.a(i, " - ", L(time2));
        }
        Date time3 = calendar.getTime();
        time3.getClass();
        String strL = L(time3);
        Date time4 = calendar2.getTime();
        time4.getClass();
        return tug.a(strL, " - ", L(time4));
    }

    static String b1(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(2) == calendar2.get(2)) {
            int i = calendar.get(5);
            Date time = calendar2.getTime();
            time.getClass();
            return vga.a(i, " - ", L(time));
        }
        Date time2 = calendar.getTime();
        time2.getClass();
        String strL = L(time2);
        Date time3 = calendar2.getTime();
        time3.getClass();
        return tug.a(strL, " - ", L(time3));
    }
}
