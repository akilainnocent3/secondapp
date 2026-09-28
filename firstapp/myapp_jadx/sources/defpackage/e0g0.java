package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e0g0 {

    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        h0g0 h0g0Var = h0g0.z;
        if (h0g0Var != null && h0g0Var.a == view) {
            h0g0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new h0g0(view, charSequence);
            return;
        }
        h0g0 h0g0Var2 = h0g0.A;
        if (h0g0Var2 != null && h0g0Var2.a == view) {
            h0g0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
