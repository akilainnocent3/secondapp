package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class enc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final List<onc0> g;

    public enc0(String str, String str2, String str3, String str4, boolean z, int i, List<onc0> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enc0)) {
            return false;
        }
        enc0 enc0Var = (enc0) obj;
        return this.a.equals(enc0Var.a) && this.b.equals(enc0Var.b) && this.c.equals(enc0Var.c) && this.d.equals(enc0Var.d) && this.e == enc0Var.e && this.f == enc0Var.f && Intrinsics.g(this.g, enc0Var.g);
    }

    public final int hashCode() {
        int iA = gpp.a(this.f, mtg0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        List<onc0> list = this.g;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsTeam(teamId=", this.a, ", name=", this.b, ", leagueId=");
        hxa.c(sbA, this.c, ", logoUrl=", this.d, ", isLegends=");
        sbA.append(this.e);
        sbA.append(", star=");
        sbA.append(this.f);
        sbA.append(gvQvkPPtA.WYgdknbVAox);
        return ng1.a(sbA, this.g, ")");
    }
}
