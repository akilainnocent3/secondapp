package ho;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static int a(Context context, int itemsOnScreen) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return -2;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x / itemsOnScreen;
    }

    public static int b(final int position, final int centerItem, final int shiftCells) {
        if (position > centerItem) {
            return position + shiftCells;
        }
        return position < centerItem ? position - shiftCells : position;
    }

    public static int c(Calendar startInclusive, Calendar endExclusive) {
        i(startInclusive);
        i(endExclusive);
        return (int) TimeUnit.MILLISECONDS.toDays(endExclusive.getTimeInMillis() - startInclusive.getTimeInMillis());
    }

    public static boolean d(Calendar date, Calendar origin) {
        int i10 = date.get(6);
        int i11 = date.get(1);
        if (i11 > origin.get(1)) {
            return true;
        }
        return i11 == origin.get(1) && i10 > origin.get(6);
    }

    public static boolean e(Calendar date, Calendar origin) {
        int i10 = date.get(6);
        int i11 = date.get(1);
        if (i11 < origin.get(1)) {
            return true;
        }
        return i11 == origin.get(1) && i10 < origin.get(6);
    }

    public static boolean f(Calendar calendar1, Calendar calendar2) {
        return g(calendar1, calendar2) && calendar1.get(5) == calendar2.get(5);
    }

    public static boolean g(Calendar calendar1, Calendar calendar2) {
        return calendar1.get(1) == calendar2.get(1) && calendar1.get(2) == calendar2.get(2);
    }

    public static int h(Calendar startInclusive, Calendar endExclusive) {
        int i10 = startInclusive.get(2);
        return (endExclusive.get(2) - i10) + ((endExclusive.get(1) - startInclusive.get(1)) * 12);
    }

    public static void i(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(16, 0);
    }
}
