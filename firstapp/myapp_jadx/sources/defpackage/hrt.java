package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hrt {
    public final UiText a;
    public final long b;
    public final String c;

    public hrt(UiText uiText, long j, String str) {
        uiText.getClass();
        this.a = uiText;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrt)) {
            return false;
        }
        hrt hrtVar = (hrt) obj;
        if (!Intrinsics.g(this.a, hrtVar.a)) {
            return false;
        }
        long j = hrtVar.b;
        int i = j58.n;
        return nbh0.a(this.b, j) && this.c.equals(hrtVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return this.c.hashCode() + f87.a(iHashCode, this.b, 31);
    }

    public final String toString() {
        String strI = j58.i(this.b);
        StringBuilder sb = new StringBuilder("LoyaltyBannerTag(text=");
        sb.append(this.a);
        sb.append(", badgeColor=");
        sb.append(strI);
        sb.append(", resourceId=");
        return uf80.a(sb, this.c, ")");
    }
}
