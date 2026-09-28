package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dln {
    public final cln a;
    public final wz80 b;

    public dln(cln clnVar, wz80 wz80Var) {
        clnVar.getClass();
        wz80Var.getClass();
        this.a = clnVar;
        this.b = wz80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dln)) {
            return false;
        }
        dln dlnVar = (dln) obj;
        return Intrinsics.g(this.a, dlnVar.a) && Intrinsics.g(this.b, dlnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InlineShareEvent(action=" + this.a + ", data=" + this.b + ")";
    }
}
