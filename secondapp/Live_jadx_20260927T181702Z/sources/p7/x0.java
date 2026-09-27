package p7;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 {
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof w4.h);
    }

    public static void c(w4.a.c cVar) {
        cVar.b();
        if (cVar.k() instanceof Spanned) {
            if (!(cVar.k() instanceof Spannable)) {
                cVar.B(SpannableString.valueOf(cVar.k()));
            }
            e((Spannable) zi.l0.E(cVar.k()), new zi.m0() { // from class: p7.v0
                @Override // zi.m0
                public final boolean apply(Object obj) {
                    return x0.b(obj);
                }
            });
        }
        d(cVar);
    }

    public static void d(w4.a.c cVar) {
        cVar.D(-3.4028235E38f, Integer.MIN_VALUE);
        if (cVar.k() instanceof Spanned) {
            if (!(cVar.k() instanceof Spannable)) {
                cVar.B(SpannableString.valueOf(cVar.k()));
            }
            e((Spannable) zi.l0.E(cVar.k()), new zi.m0() { // from class: p7.w0
                @Override // zi.m0
                public final boolean apply(Object obj) {
                    return x0.a(obj);
                }
            });
        }
    }

    public static void e(Spannable spannable, zi.m0<Object> m0Var) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (m0Var.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
