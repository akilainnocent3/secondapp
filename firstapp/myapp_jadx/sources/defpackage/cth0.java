package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class cth0 {

    public static final class a {
        public final kmn a;
        public final boolean b;

        public a(kmn kmnVar, boolean z) {
            this.a = kmnVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Result(inputState=" + this.a + ", isBalanceDeposit=" + this.b + ")";
        }
    }

    public final a a(kmn kmnVar, vjh0.b bVar) {
        kmnVar.getClass();
        xln xlnVar = kmnVar.a;
        xln xlnVar2 = kmnVar.b;
        xln xlnVar3 = kmnVar.c;
        evd0 evd0VarA = duh0.a(xlnVar3.a, bVar.c, bVar.d, bVar.e);
        ResourceUiText resourceUiText = null;
        xln xlnVarA = xln.a(xlnVar, xlnVar.a.length() == 0 || auh0.a(xlnVar.a, xlnVar2.a, true, bVar.a, bVar.b), null, 5);
        xln xlnVarA2 = xln.a(xlnVar2, xlnVar2.a.length() == 0 || auh0.a(xlnVar2.a, xlnVar.a, false, bVar.a, bVar.b), null, 5);
        boolean z = !(evd0VarA instanceof evd0.d);
        if (evd0VarA instanceof evd0.a) {
            Object[] objArr = {bjb0.O(((evd0.a) evd0VarA).a)};
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.component_betslip__please_enter_a_value_no_less_than_vmount, ay0.S(objArr));
        } else if (evd0VarA instanceof evd0.b) {
            Object[] objArr2 = {bjb0.O(((evd0.b) evd0VarA).a)};
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.component_betslip__greater_than_max, ay0.S(objArr2));
        }
        return new a(new kmn(xlnVarA, xlnVarA2, xln.a(xlnVar3, z, resourceUiText, 1)), evd0VarA instanceof evd0.c);
    }
}
