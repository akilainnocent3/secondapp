package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$showCampaignCompletedToast$1", f = "CrashInitiatedFragment.kt", l = {3164}, m = "invokeSuspend", v = 1)
public final class wnb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ enb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnb(enb enbVar, v1b<? super wnb> v1bVar) {
        super(2, v1bVar);
        this.b = enbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wnb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wnb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        enb enbVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            hvi hviVar = enbVar.a;
            if (hviVar != null) {
                hviVar.y.setCampaignCompletedText();
            }
            hvi hviVar2 = enbVar.a;
            if (hviVar2 != null) {
                hviVar2.y.setVisibility(0);
            }
            hvi hviVar3 = enbVar.a;
            if (hviVar3 != null) {
                hviVar3.y.setClickable(true);
            }
            this.a = 1;
            if (hkd.b(2000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        hvi hviVar4 = enbVar.a;
        if (hviVar4 != null) {
            hviVar4.y.setVisibility(8);
        }
        hvi hviVar5 = enbVar.a;
        if (hviVar5 != null) {
            hviVar5.y.setClickable(false);
        }
        return Unit.a;
    }
}
