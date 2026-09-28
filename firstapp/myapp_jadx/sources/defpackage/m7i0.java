package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

/* JADX INFO: loaded from: classes7.dex */
public final class m7i0 {
    public static final String a(int i, int i2, Fragment fragment) {
        fragment.getClass();
        try {
            Context context = fragment.getContext();
            if (context != null) {
                return b(context, i, i2);
            }
            String string = fragment.getString(i2);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String b(Context context, int i, int i2) {
        context.getClass();
        op5 op5Var = op5.a;
        String string = context.getString(i);
        string.getClass();
        String string2 = context.getString(i2);
        string2.getClass();
        op5Var.getClass();
        return op5.b(string, string2, null);
    }

    public static final ViewGroup.LayoutParams c(float f, int i, int i2) {
        return new ViewGroup.LayoutParams((int) (i * f), (int) (i2 * f));
    }

    public static final ViewGroup.LayoutParams d(int i, float f) {
        return new ViewGroup.LayoutParams((int) (i * f), -2);
    }

    public static final int e(Fragment fragment) {
        e activity = fragment.getActivity();
        if (activity == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }
        WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        insetsIgnoringVisibility.getClass();
        return (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
    }

    public static final int f(Fragment fragment) {
        e activity = fragment.getActivity();
        if (activity == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
        WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        insetsIgnoringVisibility.getClass();
        return (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
    }
}
