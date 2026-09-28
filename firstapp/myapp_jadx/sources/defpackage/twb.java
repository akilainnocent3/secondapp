package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class twb {

    public static final class a extends twb {
        public final OrderBetType a;
        public final String b;
        public final UiText c;
        public final UiText d;
        public final UiText e;
        public final String f;
        public final UiText g;
        public final UiText h;
        public final m980 i;
        public final kmn j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final UiText n;
        public final String o;
        public final uxs p;

        public a(OrderBetType orderBetType, String str, UiText uiText, UiText uiText2, UiText uiText3, String str2, UiText uiText4, UiText uiText5, m980 m980Var, kmn kmnVar, boolean z, boolean z2, boolean z3, UiText uiText6, String str3, uxs uxsVar) {
            orderBetType.getClass();
            uiText.getClass();
            m980Var.getClass();
            str3.getClass();
            this.a = orderBetType;
            this.b = str;
            this.c = uiText;
            this.d = uiText2;
            this.e = uiText3;
            this.f = str2;
            this.g = uiText4;
            this.h = uiText5;
            this.i = m980Var;
            this.j = kmnVar;
            this.k = z;
            this.l = z2;
            this.m = z3;
            this.n = uiText6;
            this.o = str3;
            this.p = uxsVar;
        }

        public static a a(a aVar, String str, ConcatUiText concatUiText, m980 m980Var, kmn kmnVar, boolean z, boolean z2, boolean z3, ResourceUiText resourceUiText, uxs uxsVar, int i) {
            OrderBetType orderBetType = aVar.a;
            String str2 = aVar.b;
            UiText uiText = aVar.c;
            UiText uiText2 = aVar.d;
            UiText uiText3 = aVar.e;
            String str3 = (i & 32) != 0 ? aVar.f : str;
            UiText uiText4 = (i & 64) != 0 ? aVar.g : concatUiText;
            UiText uiText5 = aVar.h;
            m980 m980Var2 = (i & 256) != 0 ? aVar.i : m980Var;
            kmn kmnVar2 = (i & 512) != 0 ? aVar.j : kmnVar;
            boolean z4 = (i & 1024) != 0 ? aVar.k : z;
            boolean z5 = (i & 2048) != 0 ? aVar.l : z2;
            boolean z6 = (i & 4096) != 0 ? aVar.m : z3;
            UiText uiText6 = (i & 8192) != 0 ? aVar.n : resourceUiText;
            String str4 = aVar.o;
            uxs uxsVar2 = (i & 32768) != 0 ? aVar.p : uxsVar;
            aVar.getClass();
            orderBetType.getClass();
            uiText.getClass();
            uiText2.getClass();
            uiText3.getClass();
            str3.getClass();
            uiText4.getClass();
            uiText5.getClass();
            m980Var2.getClass();
            kmnVar2.getClass();
            uiText6.getClass();
            str4.getClass();
            uxsVar2.getClass();
            return new a(orderBetType, str2, uiText, uiText2, uiText3, str3, uiText4, uiText5, m980Var2, kmnVar2, z4, z5, z6, uiText6, str4, uxsVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && Intrinsics.g(this.g, aVar.g) && Intrinsics.g(this.h, aVar.h) && Intrinsics.g(this.i, aVar.i) && Intrinsics.g(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && Intrinsics.g(this.n, aVar.n) && Intrinsics.g(this.o, aVar.o) && this.p == aVar.p;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.p.hashCode() + gmf0.a(yvf.a(mtg0.a(mtg0.a(mtg0.a((this.j.hashCode() + ((this.i.hashCode() + yvf.a(yvf.a(gmf0.a(yvf.a(yvf.a(yvf.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Create(orderBetType=");
            sb.append(this.a);
            sb.append(", iconUrl=");
            sb.append(this.b);
            sb.append(", teamInfo=");
            vh8.a(sb, this.c, ", marketDesc=", this.d, ", outcomeDesc=");
            sb.append(this.e);
            sb.append(", odds=");
            sb.append(this.f);
            sb.append(", balance=");
            vh8.a(sb, this.g, ", minStakeHint=", this.h, ", selectionStatus=");
            sb.append(this.i);
            sb.append(", inputState=");
            sb.append(this.j);
            sb.append(", isBalanceDeposit=");
            nng.a(", isAgreed=", ", isCheckBoxError=", sb, this.k, this.l);
            sb.append(this.m);
            sb.append(", buttonText=");
            sb.append(this.n);
            sb.append(", currency=");
            sb.append(this.o);
            sb.append(", buttonStatus=");
            sb.append(this.p);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b extends twb {
        public final OrderBetType a;
        public final UiText b;
        public final UiText c;
        public final UiText d;
        public final String e;
        public final UiText f;
        public final UiText g;
        public final m980 h;
        public final kmn i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final UiText m;
        public final String n;
        public final uxs o;

        public b(OrderBetType orderBetType, UiText uiText, UiText uiText2, UiText uiText3, String str, UiText uiText4, UiText uiText5, m980 m980Var, kmn kmnVar, boolean z, boolean z2, boolean z3, UiText uiText6, String str2, uxs uxsVar) {
            uiText.getClass();
            uiText2.getClass();
            uiText3.getClass();
            m980Var.getClass();
            str2.getClass();
            this.a = orderBetType;
            this.b = uiText;
            this.c = uiText2;
            this.d = uiText3;
            this.e = str;
            this.f = uiText4;
            this.g = uiText5;
            this.h = m980Var;
            this.i = kmnVar;
            this.j = z;
            this.k = z2;
            this.l = z3;
            this.m = uiText6;
            this.n = str2;
            this.o = uxsVar;
        }

        public static b a(b bVar, ConcatUiText concatUiText, kmn kmnVar, boolean z, boolean z2, boolean z3, int i) {
            OrderBetType orderBetType = bVar.a;
            bVar.getClass();
            UiText uiText = bVar.b;
            UiText uiText2 = bVar.c;
            UiText uiText3 = bVar.d;
            String str = bVar.e;
            UiText uiText4 = (i & 64) != 0 ? bVar.f : concatUiText;
            UiText uiText5 = bVar.g;
            UiText uiText6 = uiText4;
            m980 m980Var = bVar.h;
            kmn kmnVar2 = (i & 512) != 0 ? bVar.i : kmnVar;
            boolean z4 = (i & 1024) != 0 ? bVar.j : z;
            boolean z5 = (i & 2048) != 0 ? bVar.k : z2;
            boolean z6 = (i & 4096) != 0 ? bVar.l : z3;
            UiText uiText7 = bVar.m;
            String str2 = bVar.n;
            uxs uxsVar = bVar.o;
            bVar.getClass();
            orderBetType.getClass();
            uiText.getClass();
            uiText2.getClass();
            uiText3.getClass();
            str.getClass();
            uiText6.getClass();
            uiText5.getClass();
            m980Var.getClass();
            kmnVar2.getClass();
            uiText7.getClass();
            str2.getClass();
            uxsVar.getClass();
            return new b(orderBetType, uiText, uiText2, uiText3, str, uiText6, uiText5, m980Var, kmnVar2, z4, z5, z6, uiText7, str2, uxsVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Intrinsics.g(this.f, bVar.f) && Intrinsics.g(this.g, bVar.g) && Intrinsics.g(this.h, bVar.h) && Intrinsics.g(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && Intrinsics.g(this.m, bVar.m) && Intrinsics.g(this.n, bVar.n) && this.o == bVar.o;
        }

        public final int hashCode() {
            return this.o.hashCode() + gmf0.a(yvf.a(mtg0.a(mtg0.a(mtg0.a((this.i.hashCode() + ((this.h.hashCode() + yvf.a(yvf.a(gmf0.a(yvf.a(yvf.a(yvf.a(this.a.hashCode() * 961, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmptyCount(orderBetType=");
            sb.append(this.a);
            sb.append(", iconUrl=null, teamInfo=");
            sb.append(this.b);
            sb.append(", marketDesc=");
            vh8.a(sb, this.c, ", outcomeDesc=", this.d, ", odds=");
            sb.append(this.e);
            sb.append(", balance=");
            sb.append(this.f);
            sb.append(", minStakeHint=");
            sb.append(this.g);
            sb.append(", selectionStatus=");
            sb.append(this.h);
            sb.append(", inputState=");
            sb.append(this.i);
            sb.append(", isBalanceDeposit=");
            sb.append(this.j);
            sb.append(", isAgreed=");
            nng.a(", isCheckBoxError=", ", buttonText=", sb, this.k, this.l);
            sb.append(this.m);
            sb.append(CaxEybC.yAb);
            sb.append(this.n);
            sb.append(", buttonStatus=");
            sb.append(this.o);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class c extends twb {
        public final OrderBetType a;

        public c(OrderBetType orderBetType) {
            orderBetType.getClass();
            this.a = orderBetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(orderBetType=" + this.a + ")";
        }
    }

    public static final class d extends twb {
        public final OrderBetType a;
        public final int b;
        public final ResourceUiText c;

        public d(OrderBetType orderBetType, int i, ResourceUiText resourceUiText) {
            this.a = orderBetType;
            this.b = i;
            this.c = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && Intrinsics.g(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "ErrorCount(orderBetType=" + this.a + ", selectionCount=" + this.b + ", buttonText=" + this.c + ")";
        }
    }

    public static final class e extends twb {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 982759059;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class f extends twb {
        public final OrderBetType a;
        public final String b;
        public final UiText c;
        public final UiText d;
        public final UiText e;
        public final String f;
        public final String g;
        public final UiText h;
        public final uxs i;

        public f(OrderBetType orderBetType, String str, UiText uiText, UiText uiText2, UiText uiText3, String str2, String str3, UiText uiText4, uxs uxsVar) {
            orderBetType.getClass();
            str.getClass();
            uiText.getClass();
            uiText2.getClass();
            uiText3.getClass();
            str3.getClass();
            uiText4.getClass();
            uxsVar.getClass();
            this.a = orderBetType;
            this.b = str;
            this.c = uiText;
            this.d = uiText2;
            this.e = uiText3;
            this.f = str2;
            this.g = str3;
            this.h = uiText4;
            this.i = uxsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c) && Intrinsics.g(this.d, fVar.d) && Intrinsics.g(this.e, fVar.e) && Intrinsics.g(this.f, fVar.f) && Intrinsics.g(this.g, fVar.g) && Intrinsics.g(this.h, fVar.h) && this.i == fVar.i;
        }

        public final int hashCode() {
            int iA = yvf.a(yvf.a(yvf.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            String str = this.f;
            return this.i.hashCode() + yvf.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(orderBetType=");
            sb.append(this.a);
            sb.append(", settingId=");
            sb.append(this.b);
            sb.append(", teamInfo=");
            vh8.a(sb, this.c, ", marketDesc=", this.d, ", outcomeDesc=");
            sb.append(this.e);
            sb.append(", iconUrl=");
            sb.append(this.f);
            sb.append(", stake=");
            sb.append(this.g);
            sb.append(", oddsRange=");
            sb.append(this.h);
            sb.append(", removeButtonStatus=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }
    }
}
