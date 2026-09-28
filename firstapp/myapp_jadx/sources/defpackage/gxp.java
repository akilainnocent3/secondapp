package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.balance.LNBalanceViewModel$special$$inlined$flatMapLatest$1", f = "LNBalanceViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class gxp extends tje0 implements gaj<myh<? super UiText>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iey d;
    public final /* synthetic */ hxp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxp(v1b v1bVar, iey ieyVar, hxp hxpVar) {
        super(3, v1bVar);
        this.d = ieyVar;
        this.e = hxpVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super UiText> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        gxp gxpVar = new gxp(v1bVar, this.d, this.e);
        gxpVar.b = myhVar;
        gxpVar.c = bool;
        return gxpVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((Boolean) this.c).booleanValue()) {
                hey heyVar = new hey(bm50.f(this.d.a.h(pu0.b.a)));
                hxp hxpVar = this.e;
                gzhVar = new exp(new xzh(new dxp(heyVar, hxpVar), new cxp(hxpVar, null)));
            } else {
                StringUiText stringUiText = vch0.a;
                gzhVar = new gzh(new ResourceUiText(R.string.page_lucky_numbers__join_login));
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
