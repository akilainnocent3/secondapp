package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mcg {
    public final String a;
    public final String b;
    public final r8b c;
    public final Function0<Unit> d;
    public final long e;

    public mcg(String str, String str2, r8b r8bVar, Function0 function0, long j) {
        str2.getClass();
        function0.getClass();
        this.a = str;
        this.b = str2;
        this.c = r8bVar;
        this.d = function0;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mcg) {
            mcg mcgVar = (mcg) obj;
            if (this.a.equals(mcgVar.a) && Intrinsics.g(this.b, mcgVar.b) && this.c == mcgVar.c && Intrinsics.g(this.d, mcgVar.d)) {
                long j = mcgVar.e;
                int i = j58.n;
                if (nbh0.a(this.e, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = x7g.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.e) + iA;
    }

    public final String toString() {
        String strI = j58.i(this.e);
        StringBuilder sbA = ux5.a("ErrorInfo(message=", this.a, ", btnText=", this.b, ", onConfirm=");
        sbA.append(this.c);
        sbA.append(", onClose=");
        sbA.append(this.d);
        sbA.append(", btnBgColor=");
        return uf80.a(sbA, strI, ")");
    }
}
