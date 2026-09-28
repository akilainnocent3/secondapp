package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tsf0 {
    public final String a;
    public final h430 b;

    public tsf0(String str, h430 h430Var) {
        h430Var.getClass();
        this.a = str;
        this.b = h430Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsf0)) {
            return false;
        }
        tsf0 tsf0Var = (tsf0) obj;
        return this.a.equals(tsf0Var.a) && Intrinsics.g(this.b, tsf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TierRankUpData(value=" + this.a + ", progressState=" + this.b + ")";
    }
}
