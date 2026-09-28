package com.sporty.android.book.presentation.sportsmenu.time;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import defpackage.sn5;
import defpackage.yt5;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final ArrayList a(Context context, boolean z) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        if (z) {
            arrayList.add(new TimePickerItem("all", sn5.b(context, R.string.common_functions__all, new Object[0]), null, 0L, 0L, 4, null));
        }
        String strB = sn5.b(context, R.string.common_dates__today, new Object[0]);
        calendar.getClass();
        yt5.e(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        yt5.e(calendar);
        arrayList.add(new TimePickerItem("today", strB, null, timeInMillis, calendar.getTimeInMillis() + 86399999, 4, null));
        Calendar calendarA = yt5.a(calendar, 1);
        String strB2 = sn5.b(context, R.string.common_dates__tomorrow, new Object[0]);
        yt5.e(calendarA);
        long timeInMillis2 = calendarA.getTimeInMillis();
        yt5.e(calendarA);
        arrayList.add(new TimePickerItem("tomorrow", strB2, null, timeInMillis2, calendarA.getTimeInMillis() + 86399999, 4, null));
        List listK = kotlin.collections.b.k(Integer.valueOf(R.string.common_dates__sunday), Integer.valueOf(R.string.common_dates__monday), Integer.valueOf(R.string.common_dates__tuesday), Integer.valueOf(R.string.common_dates__wednesday), Integer.valueOf(R.string.common_dates__thursday), Integer.valueOf(R.string.common_dates__friday), Integer.valueOf(R.string.common_dates__saturday));
        int i = calendar.get(7);
        int i2 = i - 1;
        int i3 = i + 1;
        for (int i4 = 0; i4 < 5; i4++) {
            int i5 = i3 + i4;
            Calendar calendarA2 = yt5.a(calendar, i5 - i2);
            String strC = yt5.c(calendarA2);
            String strB3 = sn5.b(context, ((Number) listK.get(i5 % 7)).intValue(), new Object[0]);
            yt5.e(calendarA2);
            long timeInMillis3 = calendarA2.getTimeInMillis();
            yt5.e(calendarA2);
            arrayList.add(new TimePickerItem(strC, strB3, null, timeInMillis3, calendarA2.getTimeInMillis() + 86399999, 4, null));
        }
        if (i2 == 0) {
            String strB4 = sn5.b(context, R.string.common_dates__weekend, new Object[0]);
            yt5.e(calendar);
            long timeInMillis4 = calendar.getTimeInMillis();
            yt5.e(calendar);
            arrayList.add(new TimePickerItem("weekend", strB4, null, timeInMillis4, calendar.getTimeInMillis() + 86399999, 4, null));
            return arrayList;
        }
        Calendar calendarA3 = yt5.a(calendar, 6 - i2);
        String strB5 = sn5.b(context, R.string.common_dates__weekend, new Object[0]);
        yt5.e(calendarA3);
        long timeInMillis5 = calendarA3.getTimeInMillis();
        yt5.e(calendarA3);
        arrayList.add(new TimePickerItem("weekend", strB5, null, timeInMillis5, 172799998 + calendarA3.getTimeInMillis(), 4, null));
        return arrayList;
    }
}
