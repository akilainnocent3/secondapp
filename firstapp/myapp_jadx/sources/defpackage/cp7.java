package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cp7 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final uxs f;

    public /* synthetic */ cp7(String str, String str2, String str3, String str4, int i) {
        this(false, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, uxs.ENABLE);
    }

    public static cp7 a(cp7 cp7Var, boolean z, uxs uxsVar, int i) {
        if ((i & 1) != 0) {
            z = cp7Var.a;
        }
        boolean z2 = z;
        String str = cp7Var.b;
        String str2 = cp7Var.c;
        String str3 = cp7Var.d;
        String str4 = cp7Var.e;
        if ((i & 32) != 0) {
            uxsVar = cp7Var.f;
        }
        uxs uxsVar2 = uxsVar;
        cp7Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        uxsVar2.getClass();
        return new cp7(z2, str, str2, str3, str4, uxsVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp7)) {
            return false;
        }
        cp7 cp7Var = (cp7) obj;
        return this.a == cp7Var.a && Intrinsics.g(this.b, cp7Var.b) && Intrinsics.g(this.c, cp7Var.c) && Intrinsics.g(this.d, cp7Var.d) && Intrinsics.g(this.e, cp7Var.e) && this.f == cp7Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("ClabeScreenState(isProgressIndicatorVisible=", ", currency=", this.b, ", depositAmount=", this.a);
        hxa.c(sbA, this.c, ", depositFormatted=", this.d, ", clabeNumber=");
        sbA.append(this.e);
        sbA.append(", doneButtonStatus=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }

    public cp7(boolean z, String str, String str2, String str3, String str4, uxs uxsVar) {
        wd7.a(str, str2, str3, str4);
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uxsVar;
    }

    public cp7() {
        this(null, null, null, null, 63);
    }
}
