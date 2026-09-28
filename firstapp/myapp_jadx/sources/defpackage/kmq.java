package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kmq {
    public final qcn<String> a;
    public final qcn<ipq> b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public kmq(qcn<String> qcnVar, qcn<? extends ipq> qcnVar2, boolean z) {
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = qcnVar;
        this.b = qcnVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmq)) {
            return false;
        }
        kmq kmqVar = (kmq) obj;
        return Intrinsics.g(this.a, kmqVar.a) && Intrinsics.g(this.b, kmqVar.b) && this.c == kmqVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shu.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNLobbyConfig(bannerList=");
        sb.append(this.a);
        sb.append(", tagList=");
        sb.append(this.b);
        sb.append(", showRewardCenter=");
        return mq0.a(sb, this.c, ")");
    }

    public kmq() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kmq(int i) {
        n1a0 n1a0Var = n1a0.c;
        this(n1a0Var, n1a0Var, false);
    }
}
