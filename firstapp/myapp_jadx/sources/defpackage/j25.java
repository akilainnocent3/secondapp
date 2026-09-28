package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j25 {
    public final String a;
    public final ResourceUiText b;
    public final ResourceUiText c;
    public final ResourceUiText d;
    public final yik e;
    public final ResourceUiText f;
    public final int g;
    public final Integer h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final z15 n;

    public j25(String str, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, yik yikVar, ResourceUiText resourceUiText4, int i, Integer num, int i2, int i3, int i4, int i5, int i6, z15 z15Var) {
        str.getClass();
        this.a = str;
        this.b = resourceUiText;
        this.c = resourceUiText2;
        this.d = resourceUiText3;
        this.e = yikVar;
        this.f = resourceUiText4;
        this.g = i;
        this.h = num;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = z15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j25)) {
            return false;
        }
        j25 j25Var = (j25) obj;
        return Intrinsics.g(this.a, j25Var.a) && this.b.equals(j25Var.b) && this.c.equals(j25Var.c) && this.d.equals(j25Var.d) && this.e.equals(j25Var.e) && this.f.equals(j25Var.f) && this.g == j25Var.g && Intrinsics.g(this.h, j25Var.h) && this.i == j25Var.i && this.j == j25Var.j && this.k == j25Var.k && this.l == j25Var.l && this.m == j25Var.m && this.n.equals(j25Var.n);
    }

    public final int hashCode() {
        int iA = gpp.a(this.g, wh8.a((this.e.hashCode() + wh8.a(wh8.a(wh8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31);
        Integer num = this.h;
        return this.n.hashCode() + gpp.a(this.m, gpp.a(this.l, gpp.a(this.k, gpp.a(this.j, gpp.a(this.i, (iA + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ACKxwYRsuWyGz.tMDLH);
        sb.append(this.a);
        sb.append(", boostTimeFrame=");
        sb.append(this.b);
        sb.append(", boostPercentage=");
        sb.append(this.c);
        sb.append(", expiryText=");
        sb.append(this.d);
        sb.append(", button=");
        sb.append(this.e);
        sb.append(", typeName=");
        sb.append(this.f);
        sb.append(", topDrawableRes=");
        sb.append(this.g);
        sb.append(", topTintColorRes=");
        sb.append(this.h);
        sb.append(", bottomDrawableRes=");
        d5d.a(sb, this.i, ", topTextColorRes=", this.j, ", primaryColorRes=");
        d5d.a(sb, this.k, ", secondaryColorRes=", this.l, ", buttonTextColorRes=");
        sb.append(this.m);
        sb.append(", boostGift=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
