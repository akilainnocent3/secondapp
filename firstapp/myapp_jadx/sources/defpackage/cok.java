package defpackage;

import com.sportygames.fbg_dialog.data.model.GiftItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class cok {
    public final GiftItem a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final dwk g;
    public final boolean h;
    public final boolean i;
    public final double j;
    public final String k;
    public dwk l;
    public final double m;
    public String n;
    public final int o;
    public final String p;

    public cok(GiftItem giftItem, String str, String str2, String str3, String str4, String str5, dwk dwkVar, boolean z, boolean z2, double d, String str6, dwk dwkVar2, double d2, int i, String str7) {
        str.getClass();
        str7.getClass();
        this.a = giftItem;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = dwkVar;
        this.h = z;
        this.i = z2;
        this.j = d;
        this.k = str6;
        this.l = dwkVar2;
        this.m = d2;
        this.n = "";
        this.o = i;
        this.p = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cok)) {
            return false;
        }
        cok cokVar = (cok) obj;
        return this.a.equals(cokVar.a) && Intrinsics.g(this.b, cokVar.b) && this.c.equals(cokVar.c) && this.d.equals(cokVar.d) && this.e.equals(cokVar.e) && this.f.equals(cokVar.f) && this.g == cokVar.g && this.h == cokVar.h && this.i == cokVar.i && Double.compare(this.j, cokVar.j) == 0 && this.k.equals(cokVar.k) && this.l == cokVar.l && Double.compare(this.m, cokVar.m) == 0 && this.n.equals(cokVar.n) && this.o == cokVar.o && this.p.equals(cokVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + gpp.a(this.o, gmf0.a(nrg0.a((this.l.hashCode() + gmf0.a(nrg0.a(mtg0.a(mtg0.a((this.g.hashCode() + mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, true)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftItemExtendV2(giftItem=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", currentBalanceText=");
        sb.append(this.c);
        sb.append(", availableText=");
        sb.append(this.d);
        sb.append(", expiryText=");
        sb.append(this.e);
        sb.append(", giftAmount=");
        sb.append(this.f);
        sb.append(", expand=true, giftUseType=");
        sb.append(this.g);
        sb.append(", isAllDisable=");
        sb.append(this.h);
        sb.append(", isCardDisable=");
        sb.append(this.i);
        sb.append(", maxPartialAmount=");
        sb.append(this.j);
        sb.append(", partialTextPlaceHolder=");
        sb.append(this.k);
        sb.append(", selectedGiftType=");
        sb.append(this.l);
        sb.append(", minPartialAmount=");
        sb.append(this.m);
        sb.append(", userInput=");
        sb.append(this.n);
        sb.append(", userSelection=");
        sb.append(this.o);
        sb.append(", offOrLeftText=");
        return j26.a(sb, this.p, ')');
    }
}
