package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wsg0 {
    public final nk0 a;
    public final mly b;

    public wsg0(nk0 nk0Var, mly mlyVar) {
        this.a = nk0Var;
        this.b = mlyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsg0)) {
            return false;
        }
        wsg0 wsg0Var = (wsg0) obj;
        return Intrinsics.g(this.a, wsg0Var.a) && this.b.equals(wsg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
