package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txdetails.TxDetailsViewModel$updateNowButtonUiStateLiveData$2", f = "TxDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d5h0 extends tje0 implements gaj<Integer, Boolean, v1b<? super c330>, Object> {
    public /* synthetic */ int a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(Integer num, Boolean bool, v1b<? super c330> v1bVar) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        d5h0 d5h0Var = new d5h0(3, v1bVar);
        d5h0Var.a = iIntValue;
        d5h0Var.b = zBooleanValue;
        return d5h0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ResourceUiText resourceUiText;
        int i = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (z) {
            return c330.b.a;
        }
        boolean z2 = i > 0;
        boolean z3 = !z2;
        if (z2) {
            Object[] objArr = {String.valueOf(i)};
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_transaction__wait_vsecond, ay0.S(objArr));
        } else {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.app_common__update_now);
        }
        return new c330.a(resourceUiText, z3);
    }
}
