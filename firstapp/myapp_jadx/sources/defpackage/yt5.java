package defpackage;

import android.content.Intent;
import java.util.Calendar;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class yt5 {
    public static final Calendar a(Calendar calendar, int i) {
        calendar.getClass();
        Object objClone = calendar.clone();
        objClone.getClass();
        Calendar calendar2 = (Calendar) objClone;
        calendar2.add(5, i);
        return calendar2;
    }

    public static final Calendar b(Calendar calendar) {
        calendar.getClass();
        Object objClone = calendar.clone();
        objClone.getClass();
        Calendar calendar2 = (Calendar) objClone;
        calendar2.add(1, -18);
        return calendar2;
    }

    public static final String c(Calendar calendar) {
        calendar.getClass();
        return (String) b.k("sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday").get(calendar.get(7) - 1);
    }

    public static final void d(Calendar calendar) {
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
    }

    public static final void e(Calendar calendar) {
        calendar.getClass();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static final boolean f(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(6) == calendar2.get(6);
    }

    public static final void g(Intent intent, String str, Integer num, bew bewVar) {
        str.getClass();
        intent.putExtra("action_load_booking_code_from", str);
        if (num != null) {
            intent.putExtra("extra_booking_code_order_type", num.intValue());
        }
        if (bewVar != null) {
            intent.putExtra("multi_maker_code_action", bewVar.a);
        }
    }
}
