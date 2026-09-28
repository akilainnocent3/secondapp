package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class z0u {
    public final imf0 a;
    public final imf0 b;

    public z0u(imf0 imf0Var, imf0 imf0Var2) {
        this.a = imf0Var;
        this.b = imf0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0u)) {
            return false;
        }
        z0u z0uVar = (z0u) obj;
        return this.a.equals(z0uVar.a) && this.b.equals(z0uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyTypography(rewardStreakMultiplier=" + this.a + ", missionBannerSubTitle=" + this.b + ")";
    }
}
