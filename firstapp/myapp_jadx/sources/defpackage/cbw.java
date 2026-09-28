package defpackage;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;

/* JADX INFO: loaded from: classes2.dex */
public final class cbw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final float e;

    public cbw(float f, int i, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbw)) {
            return false;
        }
        cbw cbwVar = (cbw) obj;
        return this.a == cbwVar.a && this.b == cbwVar.b && this.c == cbwVar.c && this.d == cbwVar.d && Float.compare(this.e, cbwVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + gpp.a(this.d, mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("MultiLevelBonusRoundUiVisibility(showCashoutBonusButton=", ", showBonusRoundButton=", ", hasCashedOutBonusRound=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", bonusRoundsUnlockRemainingForSheet=");
        sbA.append(this.d);
        sbA.append(jbkEboCkTqmGf.bRdzqqElhWN);
        return wi1.a(this.e, ")", sbA);
    }
}
