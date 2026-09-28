package defpackage;

import android.appwidget.AppWidgetManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class mu0 {
    public static final boolean a(cx90 cx90Var, cx90 cx90Var2) {
        cx90Var2.getClass();
        return ((float) Math.ceil((double) cx90Var.b())) + 1.0f >= cx90Var2.b() && ((float) Math.ceil((double) cx90Var.a())) + 1.0f >= cx90Var2.a();
    }

    public static final float b(cx90 cx90Var) {
        cx90Var.getClass();
        return cx90Var.a() * cx90Var.b();
    }

    public static final tlr c(AppWidgetManager appWidgetManager, int i) {
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
        int i2 = appWidgetOptions.getInt("appWidgetMinWidth", -1);
        int i3 = appWidgetOptions.getInt("appWidgetMaxHeight", -1);
        if (i2 >= 0 && i3 >= 0) {
            int i4 = appWidgetOptions.getInt("appWidgetMaxWidth", -1);
            int i5 = appWidgetOptions.getInt("appWidgetMinHeight", -1);
            if (i4 >= 0 && i5 >= 0) {
                return new tlr(new cx90(i4, i5), new cx90(i2, i3));
            }
        }
        return null;
    }
}
