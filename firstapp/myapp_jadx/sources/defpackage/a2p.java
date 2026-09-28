package defpackage;

import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.usecase.IsWithdrawPinPromptRequiredUseCase$invoke$$inlined$flatMapLatest$1", f = "IsWithdrawPinPromptRequiredUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class a2p extends tje0 implements gaj<myh<? super zi50<? extends Boolean>>, zi50<? extends WithdrawalPinStatusInfo>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y1p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2p(v1b v1bVar, y1p y1pVar) {
        super(3, v1bVar);
        this.d = y1pVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super zi50<? extends Boolean>> myhVar, zi50<? extends WithdrawalPinStatusInfo> zi50Var, v1b<? super Unit> v1bVar) {
        a2p a2pVar = new a2p(v1bVar, this.d);
        a2pVar.b = myhVar;
        a2pVar.c = zi50Var;
        return a2pVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        lyh<Boolean> lyhVarNeedShow;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            Object obj2 = ((zi50) this.c).a;
            Throwable thA = zi50.a(obj2);
            if (thA == null) {
                int i2 = y1p.a.a[((WithdrawalPinStatusInfo) obj2).getSportyPinStatus().ordinal()];
                if (i2 == 1) {
                    y1p y1pVar = this.d;
                    lyhVarNeedShow = y1pVar.b.j() ? y1pVar.c.needShow("PREF_KEY_PIN_PROMPT_SKIPPED") : new gzh(Boolean.TRUE);
                } else {
                    if (i2 != 2 && i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    lyhVarNeedShow = new gzh(Boolean.FALSE);
                }
                gzhVar = new b2p(lyhVarNeedShow);
            } else {
                gzhVar = new gzh(new zi50(new zi50.b(thA)));
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
