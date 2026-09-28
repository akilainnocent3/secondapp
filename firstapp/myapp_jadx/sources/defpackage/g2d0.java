package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class g2d0 implements h2d0 {
    public final String a;

    public g2d0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2d0) && this.a.equals(((g2d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 126487659;
    }

    public final String toString() {
        return tug.a("SportyPenaltySettlementKickingStaticState(goalkeeperIdleLottie=https://s.sporty.net/cms/GK_idle_7e623b53be.json, playerIdleLottie=", this.a, ")");
    }
}
