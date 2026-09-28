package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gop {
    public static final gop e = new gop(0, 0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;

    public gop(int i, int i2, int i3) {
        this(-1, (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2);
    }

    public static gop a(int i) {
        gop gopVar = e;
        return new gop(gopVar.a, gopVar.b, (i & 4) != 0 ? gopVar.c : 3, (i & 8) != 0 ? gopVar.d : 7);
    }

    public final bcn b(boolean z) {
        int i = this.a;
        fop fopVar = new fop(i);
        if (i == -1) {
            fopVar = null;
        }
        int i2 = fopVar != null ? fopVar.a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        hop hopVar = new hop(i3);
        if (i3 == 0) {
            hopVar = null;
        }
        int i4 = hopVar != null ? hopVar.a : 1;
        int i5 = this.d;
        acn acnVar = i5 != -1 ? new acn(i5) : null;
        return new bcn(z, i2, zBooleanValue, i4, acnVar != null ? acnVar.a : 1, cet.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gop)) {
            return false;
        }
        gop gopVar = (gop) obj;
        return this.a == gopVar.a && Intrinsics.g(this.b, gopVar.b) && this.c == gopVar.c && this.d == gopVar.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return gpp.a(this.d, gpp.a(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) fop.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) hop.a(this.c)) + ", imeAction=" + ((Object) acn.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    public gop(int i, Boolean bool, int i2, int i3) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
    }
}
