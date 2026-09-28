package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rqi {
    public final wia0 a;
    public final String b;
    public final String c;
    public final int d;
    public final dja0 e;
    public final boolean f;
    public final kl00 g;

    public rqi(wia0 wia0Var, String str, String str2, int i, dja0 dja0Var, boolean z, kl00 kl00Var) {
        dja0Var.getClass();
        this.a = wia0Var;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = dja0Var;
        this.f = z;
        this.g = kl00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqi)) {
            return false;
        }
        rqi rqiVar = (rqi) obj;
        return this.a == rqiVar.a && this.b.equals(rqiVar.b) && Intrinsics.g(this.c, rqiVar.c) && this.d == rqiVar.d && this.e == rqiVar.e && this.f == rqiVar.f && this.g.equals(rqiVar.g);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.g.hashCode() + mtg0.a((this.e.hashCode() + gpp.a(this.d, (iA + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForYouFeedItem(sectionType=");
        sb.append(this.a);
        sb.append(", username=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        wxa.b(this.d, this.c, ", followers=", ", userType=", sb);
        sb.append(this.e);
        sb.append(", isFollowed=");
        sb.append(this.f);
        sb.append(", codeState=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
