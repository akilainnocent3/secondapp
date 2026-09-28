package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class lop {
    public static final void a(View view) {
        view.getClass();
        b(view, Boolean.FALSE);
    }

    public static void b(View view, Boolean bool) {
        Context context = view.getContext();
        if (context != null) {
            try {
                Object systemService = context.getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                if (bool != null) {
                    view.setTag(bool);
                    Unit unit = Unit.a;
                }
            } catch (Throwable unused) {
                Unit unit2 = Unit.a;
            }
        }
    }

    public static final void c(View view) {
        view.getClass();
        Context context = view.getContext();
        if (context != null) {
            try {
                Object systemService = context.getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).showSoftInput(view, 2);
            } catch (Throwable unused) {
                Unit unit = Unit.a;
            }
        }
    }

    public static final void d(View view) {
        view.getClass();
        Context context = view.getContext();
        if (context != null) {
            try {
                Object systemService = context.getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).toggleSoftInput(2, 1);
            } catch (Throwable unused) {
                Unit unit = Unit.a;
            }
        }
    }
}
