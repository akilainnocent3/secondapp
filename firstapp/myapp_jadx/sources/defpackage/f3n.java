package defpackage;

import com.appsflyer.internal.a0;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f3n {
    public final d a;
    public final f b;
    public final i c;
    public final g d;
    public final e e;
    public final a f;
    public final b g;
    public final h h;
    public final c i;
    public final k3n j;
    public final z2n k;
    public final d3n l;
    public final ucn<String> m;
    public final ucn<String> n;

    public static final class a {
        public final boolean a;
        public final String b;

        public a(boolean z, String str) {
            str.getClass();
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "AttackState(visible=" + this.a + ", lottieFile=" + this.b + ")";
        }
    }

    public static final class b {
        public final String a;
        public final UiText b;
        public final boolean c;

        public b(UiText uiText, String str, boolean z) {
            uiText.getClass();
            this.a = str;
            this.b = uiText;
            this.c = z;
        }

        public static b a(b bVar, String str, UiText uiText, boolean z, int i) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            if ((i & 2) != 0) {
                uiText = bVar.b;
            }
            if ((i & 4) != 0) {
                z = bVar.c;
            }
            bVar.getClass();
            str.getClass();
            uiText.getClass();
            return new b(uiText, str, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + yvf.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return mq0.a(x45.a(this.b, "CommentaryState(winnerTeam=", this.a, ", uiText=", ", visible="), this.c, ")");
        }
    }

    public static final class c {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("GameEndState(visible=", ")", this.a);
        }
    }

    public static final class d {
        public final UiText a;
        public final UiText b;
        public final UiText c;
        public final boolean d;
        public final boolean e;

        public d(UiText uiText, UiText uiText2, UiText uiText3, boolean z, boolean z2) {
            uiText.getClass();
            uiText2.getClass();
            uiText3.getClass();
            this.a = uiText;
            this.b = uiText2;
            this.c = uiText3;
            this.d = z;
            this.e = z2;
        }

        public static d a(d dVar, ResourceUiText resourceUiText, UiText uiText, UiText uiText2, boolean z, int i) {
            UiText uiText3 = resourceUiText;
            if ((i & 1) != 0) {
                uiText3 = dVar.a;
            }
            UiText uiText4 = uiText3;
            if ((i & 2) != 0) {
                uiText = dVar.b;
            }
            UiText uiText5 = uiText;
            if ((i & 4) != 0) {
                uiText2 = dVar.c;
            }
            UiText uiText6 = uiText2;
            boolean z2 = dVar.e;
            dVar.getClass();
            uiText4.getClass();
            uiText5.getClass();
            uiText6.getClass();
            return new d(uiText4, uiText5, uiText6, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + mtg0.a(yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "HeaderState(statusUiText=", ", quarterUiText=", ", quarterLabelUiText=");
            sbA.append(this.c);
            sbA.append(", isHighlightPhase=");
            sbA.append(this.d);
            sbA.append(", isVisible=");
            return mq0.a(sbA, this.e, ")");
        }
    }

    public static final class e {
        public final UiText a;
        public final boolean b;

        public e(UiText uiText, boolean z) {
            uiText.getClass();
            this.a = uiText;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "HighlightState(highlightUiText=" + this.a + ", visible=" + this.b + ")";
        }
    }

    public static final class f {
        public final boolean a;
        public final String b;

        public f(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && Intrinsics.g(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "OpeningState(visible=" + this.a + ", lottieFile=" + this.b + ")";
        }
    }

    public static final class g {
        public final int a;
        public final long b;

        public g(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sbA = a0.a("ProgressState(quarterIndex=", ", duration=", this.a, this.b);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class i {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;

        public i(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = i4;
            this.i = z;
        }

        public static i a(i iVar, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, boolean z, int i5) {
            if ((i5 & 1) != 0) {
                str = iVar.a;
            }
            String str5 = str;
            if ((i5 & 2) != 0) {
                str2 = iVar.b;
            }
            String str6 = str2;
            if ((i5 & 4) != 0) {
                str3 = iVar.c;
            }
            String str7 = str3;
            if ((i5 & 8) != 0) {
                str4 = iVar.d;
            }
            String str8 = str4;
            if ((i5 & 16) != 0) {
                i = iVar.e;
            }
            int i6 = i;
            int i7 = (i5 & 32) != 0 ? iVar.f : i2;
            int i8 = (i5 & 64) != 0 ? iVar.g : i3;
            int i9 = (i5 & 128) != 0 ? iVar.h : i4;
            boolean z2 = (i5 & 256) != 0 ? iVar.i : z;
            iVar.getClass();
            str5.getClass();
            str6.getClass();
            str7.getClass();
            str8.getClass();
            return new i(str5, str6, str7, str8, i6, i7, i8, i9, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.g(this.a, iVar.a) && Intrinsics.g(this.b, iVar.b) && Intrinsics.g(this.c, iVar.c) && Intrinsics.g(this.d, iVar.d) && this.e == iVar.e && this.f == iVar.f && this.g == iVar.g && this.h == iVar.h && this.i == iVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + gpp.a(this.h, gpp.a(this.g, gpp.a(this.f, gpp.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("TeamState(home=", this.a, ", away=", this.b, ", displayHome=");
            hxa.c(sbA, this.c, ", displayAway=", this.d, ", homeBgColorRes=");
            d5d.a(sbA, this.e, ", awayBgColorRes=", this.f, ", enterDuration=");
            d5d.a(sbA, this.g, ", exitDuration=", this.h, ", visible=");
            return mq0.a(sbA, this.i, ")");
        }
    }

    public f3n(d dVar, f fVar, i iVar, g gVar, e eVar, a aVar, b bVar, h hVar, c cVar, k3n k3nVar, z2n z2nVar, d3n d3nVar, ucn<String> ucnVar, ucn<String> ucnVar2) {
        dVar.getClass();
        cVar.getClass();
        ucnVar.getClass();
        ucnVar2.getClass();
        this.a = dVar;
        this.b = fVar;
        this.c = iVar;
        this.d = gVar;
        this.e = eVar;
        this.f = aVar;
        this.g = bVar;
        this.h = hVar;
        this.i = cVar;
        this.j = k3nVar;
        this.k = z2nVar;
        this.l = d3nVar;
        this.m = ucnVar;
        this.n = ucnVar2;
    }

    public static f3n a(f3n f3nVar, d dVar, f fVar, i iVar, g gVar, e eVar, a aVar, b bVar, h hVar, c cVar, k3n k3nVar, z2n z2nVar, d3n d3nVar, ucn ucnVar, ucn ucnVar2, int i2) {
        d dVar2 = (i2 & 1) != 0 ? f3nVar.a : dVar;
        f fVar2 = (i2 & 2) != 0 ? f3nVar.b : fVar;
        i iVar2 = (i2 & 4) != 0 ? f3nVar.c : iVar;
        g gVar2 = (i2 & 8) != 0 ? f3nVar.d : gVar;
        e eVar2 = (i2 & 16) != 0 ? f3nVar.e : eVar;
        a aVar2 = (i2 & 32) != 0 ? f3nVar.f : aVar;
        b bVar2 = (i2 & 64) != 0 ? f3nVar.g : bVar;
        h hVar2 = (i2 & 128) != 0 ? f3nVar.h : hVar;
        c cVar2 = (i2 & 256) != 0 ? f3nVar.i : cVar;
        k3n k3nVar2 = (i2 & 512) != 0 ? f3nVar.j : k3nVar;
        z2n z2nVar2 = (i2 & 1024) != 0 ? f3nVar.k : z2nVar;
        d3n d3nVar2 = (i2 & 2048) != 0 ? f3nVar.l : d3nVar;
        ucn ucnVar3 = (i2 & 4096) != 0 ? f3nVar.m : ucnVar;
        ucn ucnVar4 = (i2 & 8192) != 0 ? f3nVar.n : ucnVar2;
        dVar2.getClass();
        fVar2.getClass();
        iVar2.getClass();
        gVar2.getClass();
        eVar2.getClass();
        aVar2.getClass();
        bVar2.getClass();
        hVar2.getClass();
        cVar2.getClass();
        k3nVar2.getClass();
        ucnVar3.getClass();
        ucnVar4.getClass();
        return new f3n(dVar2, fVar2, iVar2, gVar2, eVar2, aVar2, bVar2, hVar2, cVar2, k3nVar2, z2nVar2, d3nVar2, ucnVar3, ucnVar4);
    }

    public final int b(boolean z, boolean z2, boolean z3) {
        c cVar = this.i;
        if (z3 && !cVar.a) {
            return R.color.virtual_running_page_overtime1;
        }
        if (cVar.a && z) {
            return z2 ? R.color.bg_brand_sub_secondary_d_base : R.color.virtual_running_page_overtime2;
        }
        return R.color.bg_secondary_d_base;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3n)) {
            return false;
        }
        f3n f3nVar = (f3n) obj;
        return Intrinsics.g(this.a, f3nVar.a) && Intrinsics.g(this.b, f3nVar.b) && Intrinsics.g(this.c, f3nVar.c) && Intrinsics.g(this.d, f3nVar.d) && Intrinsics.g(this.e, f3nVar.e) && Intrinsics.g(this.f, f3nVar.f) && Intrinsics.g(this.g, f3nVar.g) && Intrinsics.g(this.h, f3nVar.h) && Intrinsics.g(this.i, f3nVar.i) && this.j == f3nVar.j && Intrinsics.g(this.k, f3nVar.k) && Intrinsics.g(this.l, f3nVar.l) && Intrinsics.g(this.m, f3nVar.m) && Intrinsics.g(this.n, f3nVar.n);
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + mtg0.a((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.i.a)) * 31;
        z2n z2nVar = this.k;
        int iHashCode2 = (iHashCode + (z2nVar == null ? 0 : z2nVar.hashCode())) * 31;
        d3n d3nVar = this.l;
        return this.n.hashCode() + ((this.m.hashCode() + ((iHashCode2 + (d3nVar != null ? d3nVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "IbMatchTrackerContentState(header=" + this.a + ", opening=" + this.b + ", teams=" + this.c + ", progress=" + this.d + ", highlight=" + this.e + ", attack=" + this.f + ", commentary=" + this.g + ", scoreUpdate=" + this.h + ", gameEnd=" + this.i + ", gameState=" + this.j + ", currentIbMatchTrackerAttackAnimation=" + this.k + ", currentIbMatchTrackerCommentary=" + this.l + ", usedAnimationIds=" + this.m + ", usedCommentaryIds=" + this.n + ")";
    }

    public static final class h {
        public final boolean a;
        public final qcn<a4n> b;

        public h(int i, qcn qcnVar) {
            this((i & 2) != 0 ? n1a0.c : qcnVar, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && Intrinsics.g(this.b, hVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ScoreUpdateState(shouldUpdate=" + this.a + ", updatedItems=" + this.b + ")";
        }

        public h(qcn qcnVar, boolean z) {
            qcnVar.getClass();
            this.a = z;
            this.b = qcnVar;
        }
    }
}
