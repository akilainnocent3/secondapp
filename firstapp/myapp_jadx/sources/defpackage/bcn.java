package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bcn {
    public static final bcn g = new bcn(false, 0, true, 1, 1, cet.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final cet f;

    public bcn(boolean z, int i, boolean z2, int i2, int i3, cet cetVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = cetVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcn)) {
            return false;
        }
        bcn bcnVar = (bcn) obj;
        return this.a == bcnVar.a && this.b == bcnVar.b && this.c == bcnVar.c && this.d == bcnVar.d && this.e == bcnVar.e && Intrinsics.g(this.f, bcnVar.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + gpp.a(this.e, gpp.a(this.d, mtg0.a(gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) fop.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) hop.a(this.d)) + ", imeAction=" + ((Object) acn.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
