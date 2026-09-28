package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class epf {
    public final int a;
    public final String b;
    public final int c;
    public final UiText d;
    public final String e;
    public final String f;
    public final uf00<b> g;
    public final uf00<a> h;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("CashOutHistoryDetail(time=", this.a, ", usedStake=", this.b, ", amount="), this.c, ")");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final uf00<b> j;
        public final String k;
        public final boolean l;

        public b(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, uf00<b> uf00Var, String str9, boolean z) {
            str7.getClass();
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = uf00Var;
            this.k = str9;
            this.l = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f.equals(bVar.f) && this.g.equals(bVar.g) && Intrinsics.g(this.h, bVar.h) && this.i.equals(bVar.i) && Intrinsics.g(this.j, bVar.j) && this.k.equals(bVar.k) && this.l == bVar.l;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            uf00<b> uf00Var = this.j;
            return Boolean.hashCode(this.l) + gmf0.a((iA + (uf00Var != null ? uf00Var.hashCode() : 0)) * 31, 31, this.k);
        }

        public final String toString() {
            StringBuilder sbA = uqe0.a(this.a, "SelectionDetail(selectionStatus=", ", gameId=", this.b, ", time=");
            hxa.c(sbA, this.c, ", home=", this.d, ", away=");
            hxa.c(sbA, this.e, ", score=", this.f, ", pick=");
            hxa.c(sbA, this.g, ", market=", this.h, ", outcome=");
            sbA.append(this.i);
            sbA.append(", betBuilderSelections=");
            sbA.append(this.j);
            sbA.append(", tournament=");
            return x9d.a(this.k, ", isOutright=", ")", sbA, this.l);
        }
    }

    public epf() {
        throw null;
    }

    public epf(int i, String str, int i2, String str2, String str3, uf00 uf00Var, uf00 uf00Var2) {
        ResourceUiText resourceUiTextA = n980.a(i2);
        str3.getClass();
        uf00Var.getClass();
        uf00Var2.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = resourceUiTextA;
        this.e = str2;
        this.f = str3;
        this.g = uf00Var;
        this.h = uf00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epf)) {
            return false;
        }
        epf epfVar = (epf) obj;
        return this.a == epfVar.a && Intrinsics.g(this.b, epfVar.b) && this.c == epfVar.c && Intrinsics.g(this.d, epfVar.d) && Intrinsics.g(this.e, epfVar.e) && Intrinsics.g(this.f, epfVar.f) && Intrinsics.g(this.g, epfVar.g) && Intrinsics.g(this.h, epfVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + yvz.a(this.g, gmf0.a(gmf0.a(yvf.a(gpp.a(this.c, gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "EditHistoryDetailData(editBetType=", ", time=", this.b, ", selectionSize=");
        sbA.append(this.c);
        sbA.append(", selectionType=");
        sbA.append(this.d);
        sbA.append(jbkEboCkTqmGf.cMgSLlHJxPlPpA);
        hxa.c(sbA, this.e, ", odds=", this.f, ", selections=");
        sbA.append(this.g);
        sbA.append(", cashOutHistoryList=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
