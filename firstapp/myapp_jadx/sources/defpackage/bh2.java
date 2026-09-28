package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;

/* JADX INFO: loaded from: classes2.dex */
public final class bh2 {
    public final boolean a;
    public final boolean b;
    public final ResourceUiText c;
    public final int d;
    public final int e;

    public bh2(boolean z, boolean z2, ResourceUiText resourceUiText, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = resourceUiText;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh2)) {
            return false;
        }
        bh2 bh2Var = (bh2) obj;
        return this.a == bh2Var.a && this.b == bh2Var.b && this.c.equals(bh2Var.c) && this.d == bh2Var.d && this.e == bh2Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gpp.a(this.d, wh8.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a(ACKxwYRsuWyGz.THyjKE, ", isDetailsView=", ", titleUiText=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", backgroundResId=");
        sbA.append(this.d);
        sbA.append(", titleColorResId=");
        return zk1.a(this.e, ")", sbA);
    }
}
