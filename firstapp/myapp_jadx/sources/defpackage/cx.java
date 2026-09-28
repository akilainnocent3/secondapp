package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cx {
    public final String a;
    public final int b;
    public final kcg c;

    static {
        new cx("", 0, kcg.a.b);
    }

    public cx(String str, int i, kcg kcgVar) {
        this.a = str;
        this.b = i;
        this.c = kcgVar;
    }

    public static cx a(cx cxVar, kcg kcgVar) {
        String str = cxVar.a;
        int i = cxVar.b;
        str.getClass();
        return new cx(str, i, kcgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return Intrinsics.g(this.a, cxVar.a) && this.b == cxVar.b && Intrinsics.g(this.c, cxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "AmountUiState(amountText=", this.a, ", selectionIndex=", ", errorHint=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ cx() {
        this("", 0, kcg.a.b);
    }
}
