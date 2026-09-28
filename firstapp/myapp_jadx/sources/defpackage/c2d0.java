package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c2d0 implements h2d0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public c2d0(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2d0)) {
            return false;
        }
        c2d0 c2d0Var = (c2d0) obj;
        return Intrinsics.g(this.a, c2d0Var.a) && Intrinsics.g(this.b, c2d0Var.b) && Intrinsics.g(this.c, c2d0Var.c) && Intrinsics.g(this.d, c2d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(gmf0.a(126487659, 31, this.a), 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("SportyPenaltySettlementKickingAnimatedState(goalkeeperIdleLottie=https://s.sporty.net/cms/GK_idle_7e623b53be.json, goalkeeperGuardLottie=", this.a, ", playerIdleLottie=", this.b, ", playerKickLottie="), this.c, ", ballLottie=", this.d, ")");
    }
}
