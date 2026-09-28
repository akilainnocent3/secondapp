package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class bbv {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(int i, Context context, boolean z) {
        TypedValue typedValueA = a(context, i);
        if (typedValueA == null || typedValueA.type != 18) {
            return z;
        }
        return typedValueA.data != 0;
    }

    public static int c(Context context, int i, int i2) {
        TypedValue typedValueA = a(context, i);
        return (typedValueA == null || typedValueA.type != 16) ? i2 : typedValueA.data;
    }

    public static int d(Context context) {
        TypedValue typedValueA = a(context, R.attr.minTouchTargetSize);
        return (int) ((typedValueA == null || typedValueA.type != 5) ? context.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : typedValueA.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue e(int i, Context context, String str) {
        TypedValue typedValueA = a(context, i);
        if (typedValueA != null) {
            return typedValueA;
        }
        ljh.a("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }
}
