package defpackage;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class al10 implements xk10 {
    public static Typeface c(String str, t9i t9iVar, int i) {
        if (i == 0 && Intrinsics.g(t9iVar, t9i.B) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iA = o70.a(t9iVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iA) : Typeface.create(str, iA);
    }

    @Override // defpackage.xk10
    public final Typeface a(t9i t9iVar, int i) {
        return c(null, t9iVar, i);
    }

    @Override // defpackage.xk10
    public final Typeface b(v1k v1kVar, t9i t9iVar, int i) {
        String strA = v1kVar.f;
        int i2 = t9iVar.a / 100;
        if (i2 >= 0 && i2 < 2) {
            strA = yk10.a(strA, "-thin");
        } else if (2 <= i2 && i2 < 4) {
            strA = yk10.a(strA, "-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strA = yk10.a(strA, "-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strA = yk10.a(strA, "-black");
            }
        }
        Typeface typeface = null;
        if (strA.length() != 0) {
            Typeface typefaceC = c(strA, t9iVar, i);
            if (!Intrinsics.g(typefaceC, Typeface.create(Typeface.DEFAULT, o70.a(t9iVar, i))) && !Intrinsics.g(typefaceC, c(null, t9iVar, i))) {
                typeface = typefaceC;
            }
        }
        return typeface == null ? c(v1kVar.f, t9iVar, i) : typeface;
    }
}
