package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoGiftHandlerImpl$collectGiftGroupList$$inlined$flatMapLatest$1", f = "BuildAndGoGiftHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class rd5 extends tje0 implements gaj<myh<? super lk50<? extends Sports>>, Long, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uwd0 d;
    public final /* synthetic */ uwd0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd5(v1b v1bVar, uwd0 uwd0Var, uwd0 uwd0Var2) {
        super(3, v1bVar);
        this.d = uwd0Var;
        this.e = uwd0Var2;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends Sports>> myhVar, Long l, v1b<? super Unit> v1bVar) {
        rd5 rd5Var = new rd5(v1bVar, this.d, this.e);
        rd5Var.b = myhVar;
        rd5Var.c = l;
        return rd5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            ((Number) this.c).longValue();
            vd5 vd5Var = new vd5(3, null);
            this.b = null;
            this.c = null;
            this.a = 1;
            h99.a(myhVar);
            Object objA = r78.a(this, myhVar, new o1i(vd5Var, null), q1i.a, new lyh[]{this.d, this.e});
            if (objA != y5b.a) {
                objA = Unit.a;
            }
            if (objA != y5b.a) {
                objA = Unit.a;
            }
            if (objA == obj2) {
                return obj2;
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
