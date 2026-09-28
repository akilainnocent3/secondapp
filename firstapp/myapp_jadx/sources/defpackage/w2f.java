package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w2f {
    public final String a;
    public final String b;

    public w2f(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2f)) {
            return false;
        }
        w2f w2fVar = (w2f) obj;
        return Intrinsics.g(this.a, w2fVar.a) && Intrinsics.g(this.b, w2fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((this.a.hashCode() + 126487659) * 31) - 1239024398) * 31) + 966059935) * 31);
    }

    public final String toString() {
        return tx5.a("DoubleOrNothingKickingVisualState(goalkeeperIdleLottie=https://s.sporty.net/cms/GK_idle_7e623b53be.json, goalkeeperGuardLottie=", this.a, ", playerIdleLottie=https://s.sporty.net/cms/PL_idle_39f33c3038.json, playerKickLottie=https://s.sporty.net/cms/PL_kick_ceb91b0891.json, ballLottie=", this.b, ")");
    }
}
