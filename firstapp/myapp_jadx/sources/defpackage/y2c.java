package defpackage;

import com.appsflyer.internal.y;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class y2c {
    public static final /* synthetic */ int a = 0;

    public static final boolean a(String str, String str2) throws Exception {
        Date date = new SimpleDateFormat("yyMM", Locale.getDefault()).parse(str + str2);
        if (date == null) {
            y.a("Parse yy mm failed");
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (calendar.get(1) < 2000) {
            calendar.add(1, 100);
        }
        calendar.set(5, calendar.getActualMaximum(5));
        return new Date().after(calendar.getTime());
    }
}
