package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoHandlerImpl$initHandler$$inlined$flatMapLatest$1", f = "BuildAndGoHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class le5 extends tje0 implements gaj<myh<? super lk50<? extends Round>>, lk50<? extends Sports>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ se5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le5(se5 se5Var, v1b v1bVar) {
        super(3, v1bVar);
        this.d = se5Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends Round>> myhVar, lk50<? extends Sports> lk50Var, v1b<? super Unit> v1bVar) {
        le5 le5Var = new le5(this.d, v1bVar);
        le5Var.b = myhVar;
        le5Var.c = lk50Var;
        return le5Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lk50 lk50Var = (lk50) this.c;
            if (lk50Var instanceof lk50.b) {
                gzhVar = new gzh(lk50.b.a);
            } else if (lk50Var instanceof lk50.a) {
                gzhVar = new gzh(new lk50.a(new Throwable("Sports config failed")));
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                Sports sports = (Sports) ((lk50.c) lk50Var).a;
                gzhVar = (sports == null || !sports.getActive()) ? new gzh(new lk50.a(new Throwable("Sports config inactive"))) : bm50.a(this.d.a.s());
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
