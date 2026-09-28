package defpackage;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.text.format.DateUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class lu5 {
    public static uyc a(Calendar calendar, yl80 yl80Var, int i) {
        uyc uycVar = new uyc();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        uycVar.a = calendar2;
        Date time = calendar.getTime();
        uycVar.c = time != null && DateUtils.isToday(time.getTime());
        uycVar.b = calendar.get(2) == i;
        au5 au5Var = yl80Var.c;
        Set<Long> set = au5Var.c;
        if (set != null) {
            uycVar.e = set.contains(Integer.valueOf(calendar2.get(7)));
        }
        Set<Long> set2 = au5Var.a;
        if (set2 != null) {
            uycVar.d = e(uycVar, set2);
        }
        yl80Var.c.getClass();
        au5Var.b.getClass();
        return uycVar;
    }

    public static ArrayList b(yl80 yl80Var) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, -6);
        for (int i = 0; i < 7; i++) {
            arrayList.add(c(calendar.getTime(), yl80Var));
            calendar.add(2, 1);
        }
        return arrayList;
    }

    public static u4w c(Date date, yl80 yl80Var) {
        Date time;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date);
        calendar3.set(5, calendar3.getActualMinimum(5));
        Date time2 = calendar3.getTime();
        calendar2.setTime(time2);
        calendar2.get(2);
        int i = calendar2.get(2);
        int i2 = yl80Var.b.a;
        Calendar calendar4 = Calendar.getInstance();
        if (time2 != null) {
            calendar4.setTime(time2);
        }
        calendar4.clear(11);
        calendar4.clear(10);
        while (calendar4.get(7) != i2) {
            calendar4.add(5, -1);
        }
        Date time3 = calendar4.getTime();
        calendar.setTime(time3);
        Calendar calendar5 = Calendar.getInstance();
        Calendar calendar6 = Calendar.getInstance();
        calendar6.setTime(date);
        calendar6.set(5, calendar6.getActualMaximum(5));
        Date time4 = calendar6.getTime();
        Calendar calendar7 = Calendar.getInstance();
        if (time4 != null) {
            calendar7.setTime(time4);
        }
        calendar7.clear(11);
        calendar7.clear(10);
        if (calendar7.get(5) == calendar7.getActualMaximum(5) && calendar7.get(7) == 1) {
            time = calendar7.getTime();
        } else {
            calendar7.set(7, calendar7.getActualMaximum(7));
            while (calendar7.get(7) != 1) {
                calendar7.add(5, 1);
            }
            time = calendar7.getTime();
        }
        calendar5.setTime(time);
        if (yl80Var.a.x) {
            ArrayList arrayList2 = new ArrayList();
            Calendar calendar8 = Calendar.getInstance();
            calendar8.setTime(time3);
            int i3 = calendar8.get(7);
            do {
                arrayList2.add(new zyc(calendar8.getTime()));
                calendar8.add(5, 1);
            } while (calendar8.get(7) != i3);
            arrayList.addAll(arrayList2);
        }
        arrayList.add(a(calendar, yl80Var, i));
        while (true) {
            calendar.add(5, 1);
            arrayList.add(a(calendar, yl80Var, i));
            if (calendar.get(5) == calendar5.get(5) && calendar.get(2) == calendar5.get(2)) {
                uyc uycVarA = a(calendar2, yl80Var, i);
                u4w u4wVar = new u4w();
                u4wVar.a = arrayList;
                u4wVar.b = uycVarA;
                return u4wVar;
            }
        }
    }

    public static int d(Resources resources, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        return options.outHeight;
    }

    public static boolean e(uyc uycVar, Set<Long> set) {
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jLongValue);
            if (uycVar.a.get(1) == calendar.get(1) && uycVar.a.get(6) == calendar.get(6)) {
                return true;
            }
        }
        return false;
    }
}
