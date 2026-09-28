package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rb70 {
    public final Integer a;
    public final String b;

    public rb70(Integer num, String str) {
        str.getClass();
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb70)) {
            return false;
        }
        rb70 rb70Var = (rb70) obj;
        return Intrinsics.g(this.a, rb70Var.a) && Intrinsics.g(this.b, rb70Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ScheduledFootballOpenBetsCountRowState(sportIconResId=" + this.a + ", betCountText=" + this.b + ")";
    }
}
