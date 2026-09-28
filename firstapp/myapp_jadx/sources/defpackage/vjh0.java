package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vjh0 {

    public static abstract class a {

        /* JADX INFO: renamed from: vjh0$a$a, reason: collision with other inner class name */
        public static final class C1215a extends a {
            public final String a;

            public C1215a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1215a) && Intrinsics.g(this.a, ((C1215a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("MaxOdds(value=", this.a, ")");
            }
        }

        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("MinOdds(value=", this.a, ")");
            }
        }

        public static final class c extends a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("Stake(value=", this.a, ")");
            }
        }
    }

    public static final class b {
        public final double a;
        public final double b;
        public final double c;
        public final double d;
        public final BigDecimal e;

        public b(double d, double d2, double d3, double d4, BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
            this.e = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.a, bVar.a) == 0 && Double.compare(this.b, bVar.b) == 0 && Double.compare(this.c, bVar.c) == 0 && Double.compare(this.d, bVar.d) == 0 && Intrinsics.g(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + nrg0.a(nrg0.a(nrg0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ffp.a(this.a, "Limits(minOddsLimit=", ", maxOddsLimit=");
            sbA.append(this.b);
            hib0.b(this.c, ", minStakeLimit=", ", maxStakeLimit=", sbA);
            sbA.append(this.d);
            sbA.append(", balanceBD=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c {
        public final kmn a;
        public final boolean b;

        public c(kmn kmnVar, boolean z) {
            this.a = kmnVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Result(inputState=" + this.a + ", isBalanceDeposit=" + this.b + ")";
        }
    }

    public final c a(kmn kmnVar, a aVar, b bVar) {
        ResourceUiText resourceUiText;
        kmnVar.getClass();
        xln xlnVar = kmnVar.a;
        xln xlnVar2 = kmnVar.b;
        if (aVar instanceof a.b) {
            a.b bVar2 = (a.b) aVar;
            return new c(kmn.a(kmnVar, new xln(4, bVar2.a, auh0.a(bVar2.a, xlnVar2.a, true, bVar.a, bVar.b)), xln.a(xlnVar2, auh0.a(xlnVar2.a, bVar2.a, false, bVar.a, bVar.b), null, 5), null, 4), false);
        }
        if (aVar instanceof a.C1215a) {
            a.C1215a c1215a = (a.C1215a) aVar;
            return new c(kmn.a(kmnVar, xln.a(xlnVar, auh0.a(xlnVar.a, c1215a.a, true, bVar.a, bVar.b), null, 5), new xln(4, c1215a.a, auh0.a(c1215a.a, xlnVar.a, false, bVar.a, bVar.b)), null, 4), false);
        }
        if (!(aVar instanceof a.c)) {
            uhc.a();
            return null;
        }
        a.c cVar = (a.c) aVar;
        evd0 evd0VarA = duh0.a(cVar.a, bVar.c, bVar.d, bVar.e);
        String str = cVar.a;
        boolean z = !(evd0VarA instanceof evd0.d);
        if (evd0VarA instanceof evd0.a) {
            Object[] objArr = {bjb0.O(((evd0.a) evd0VarA).a)};
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.component_betslip__please_enter_a_value_no_less_than_vmount, ay0.S(objArr));
        } else if (evd0VarA instanceof evd0.b) {
            Object[] objArr2 = {bjb0.O(((evd0.b) evd0VarA).a)};
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.component_betslip__greater_than_max, ay0.S(objArr2));
        } else {
            resourceUiText = null;
        }
        return new c(kmn.a(kmnVar, null, null, new xln(resourceUiText, str, z), 3), evd0VarA instanceof evd0.c);
    }
}
