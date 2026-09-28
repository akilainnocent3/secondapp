package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t640 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final String a;
    public final List<String> b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final ColoredUiText l;
    public final d m;
    public final Integer n;
    public final Integer o;
    public final ColoredUiText p;
    public final StringUiText q;
    public final StringUiText r;
    public final UiText s;
    public final ColoredUiText t;
    public final boolean u;
    public final boolean v;
    public final UiText w;
    public final UiText x;
    public final UiText y;
    public final UiText z;

    public static final class a {
        public final StringUiText a;
        public final StringUiText b;

        public a(StringUiText stringUiText, StringUiText stringUiText2) {
            this.a = stringUiText;
            this.b = stringUiText2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "DateMonthUiState(dateUiText=" + this.a + ", monthUiText=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b {
        public final UiText a;
        public final c b;
        public final a c;

        public b(StringUiText stringUiText, c cVar, a aVar) {
            this.a = stringUiText;
            this.b = cVar;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            int iHashCode = (this.b.hashCode() + ((uiText == null ? 0 : uiText.hashCode()) * 31)) * 31;
            a aVar = this.c;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "DateUiState(yearUiText=" + this.a + lTGEJfVytU.WeEmjcoPbeVe + this.b + ", dateMonthUiState=" + this.c + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final /* synthetic */ c[] c;

        static {
            c cVar = new c("FULL_WIDTH", 0);
            a = cVar;
            c cVar2 = new c("CONTENT_WIDTH", 1);
            b = cVar2;
            c = new c[]{cVar, cVar2};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c.clone();
        }
    }

    public interface d {

        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 107716512;
            }

            public final String toString() {
                return "AnyWin";
            }
        }

        public static final class b implements d {
            public final ColoredUiText a;

            public b(ColoredUiText coloredUiText) {
                this.a = coloredUiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Flex(descUiText=" + this.a + ")";
            }
        }

        public static final class c implements d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1684414328;
            }

            public final String toString() {
                return "None";
            }
        }

        /* JADX INFO: renamed from: t640$d$d, reason: collision with other inner class name */
        public static final class C1115d implements d {
            public static final C1115d a = new C1115d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1115d);
            }

            public final int hashCode() {
                return 507909964;
            }

            public final String toString() {
                return "OneCut";
            }
        }
    }

    public t640(String str, List list, Long l, Long l2, boolean z, boolean z2, String str2, boolean z3, boolean z4, int i, int i2, ColoredUiText coloredUiText, d dVar, Integer num, Integer num2, ColoredUiText coloredUiText2, StringUiText stringUiText, StringUiText stringUiText2, UiText uiText, ColoredUiText coloredUiText3, boolean z5, boolean z6, UiText uiText2, UiText uiText3, UiText uiText4, ResourceUiText resourceUiText, boolean z7, boolean z8, boolean z9, boolean z10, String str3, boolean z11) {
        str.getClass();
        dVar.getClass();
        this.a = str;
        this.b = list;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = z2;
        this.g = str2;
        this.h = z3;
        this.i = z4;
        this.j = i;
        this.k = i2;
        this.l = coloredUiText;
        this.m = dVar;
        this.n = num;
        this.o = num2;
        this.p = coloredUiText2;
        this.q = stringUiText;
        this.r = stringUiText2;
        this.s = uiText;
        this.t = coloredUiText3;
        this.u = z5;
        this.v = z6;
        this.w = uiText2;
        this.x = uiText3;
        this.y = uiText4;
        this.z = resourceUiText;
        this.A = z7;
        this.B = z8;
        this.C = z9;
        this.D = z10;
        this.E = str3;
        this.F = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t640)) {
            return false;
        }
        t640 t640Var = (t640) obj;
        return Intrinsics.g(this.a, t640Var.a) && Intrinsics.g(this.b, t640Var.b) && Intrinsics.g(this.c, t640Var.c) && Intrinsics.g(this.d, t640Var.d) && this.e == t640Var.e && this.f == t640Var.f && Intrinsics.g(this.g, t640Var.g) && this.h == t640Var.h && this.i == t640Var.i && this.j == t640Var.j && this.k == t640Var.k && this.l.equals(t640Var.l) && Intrinsics.g(this.m, t640Var.m) && Intrinsics.g(this.n, t640Var.n) && Intrinsics.g(this.o, t640Var.o) && this.p.equals(t640Var.p) && this.q.equals(t640Var.q) && this.r.equals(t640Var.r) && this.s.equals(t640Var.s) && this.t.equals(t640Var.t) && this.u == t640Var.u && this.v == t640Var.v && Intrinsics.g(this.w, t640Var.w) && Intrinsics.g(this.x, t640Var.x) && Intrinsics.g(this.y, t640Var.y) && Intrinsics.g(this.z, t640Var.z) && this.A == t640Var.A && this.B == t640Var.B && this.C == t640Var.C && this.D == t640Var.D && Intrinsics.g(this.E, t640Var.E) && this.F == t640Var.F;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List<String> list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iA = mtg0.a(mtg0.a((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode4 = (this.m.hashCode() + ((this.l.hashCode() + gpp.a(this.k, gpp.a(this.j, mtg0.a(mtg0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31), 31)) * 31)) * 31;
        Integer num = this.n;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.o;
        int iA2 = mtg0.a(mtg0.a((this.t.hashCode() + yvf.a((this.r.a.hashCode() + ((this.q.a.hashCode() + ((this.p.hashCode() + ((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.s)) * 31, 31, this.u), 31, this.v);
        UiText uiText = this.w;
        int iHashCode6 = (iA2 + (uiText == null ? 0 : uiText.hashCode())) * 31;
        UiText uiText2 = this.x;
        int iHashCode7 = (iHashCode6 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        UiText uiText3 = this.y;
        int iHashCode8 = (iHashCode7 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31;
        UiText uiText4 = this.z;
        int iA3 = mtg0.a(mtg0.a(mtg0.a(mtg0.a((iHashCode8 + (uiText4 == null ? 0 : uiText4.hashCode())) * 31, 31, this.A), 31, this.B), 31, this.C), 31, this.D);
        String str2 = this.E;
        return Boolean.hashCode(this.F) + ((iA3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RealBetHistoryOrderUiState(orderId=");
        sb.append(this.a);
        sb.append(", betIds=");
        sb.append(this.b);
        sb.append(", createTime=");
        sb.append(this.c);
        sb.append(", lastOrderCreateTime=");
        sb.append(this.d);
        sb.append(", isDeletable=");
        nng.a(", isSwipable=", ", userNote=", sb, this.e, this.f);
        uts.b(this.g, ", isLeadingCheckBoxShown=", ", isLeadingCheckBoxChecked=", sb, this.h);
        sb.append(this.i);
        sb.append(", headerBackgroundColorResId=");
        sb.append(this.j);
        sb.append(", headerContentColorResId=");
        sb.append(this.k);
        sb.append(", orderTypeUiText=");
        sb.append(this.l);
        sb.append(", insureUiState=");
        sb.append(this.m);
        sb.append(", winningIconDrawableResId=");
        sb.append(this.n);
        sb.append(", winningIconTintColorResId=");
        sb.append(this.o);
        sb.append(", winningStatusUiText=");
        sb.append(this.p);
        sb.append(", currencyUiText=");
        sb.append(this.q);
        sb.append(", totalStakeValueUiText=");
        sb.append(this.r);
        sb.append(", totalReturnLabelUiText=");
        sb.append(this.s);
        sb.append(", totalReturnValueUiText=");
        sb.append(this.t);
        sb.append(", isLiveOddsBoostShown=");
        nng.a(", isLiveFlashBoostShown=", ", matchDesc1UiText=", sb, this.u, this.v);
        vh8.a(sb, this.w, ", matchDesc2UiText=", this.x, ", matchDesc3UiText=");
        vh8.a(sb, this.y, ", matchDesc4UiText=", this.z, ", isPendingDescShown=");
        nng.a(", isEditBetButtonShown=", ", isRemixBetButtonShown=", sb, this.A, this.B);
        nng.a(", isRemixBetRedDotShown=", ", remixBetFsAttributeValue=", sb, this.C, this.D);
        return x9d.a(this.E, ", isCustomerMessageViewShown=", ")", sb, this.F);
    }
}
