package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$special$$inlined$flatMapLatest$1", f = "GiftViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ezk extends tje0 implements gaj<myh<? super Unit>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yyk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezk(v1b v1bVar, yyk yykVar) {
        super(3, v1bVar);
        this.d = yykVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Unit> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        ezk ezkVar = new ezk(v1bVar, this.d);
        ezkVar.b = myhVar;
        ezkVar.c = bool;
        return ezkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            boolean zBooleanValue = ((Boolean) this.c).booleanValue();
            yyk yykVar = this.d;
            lyh lyhVarC = ozh.c(new or60(new lyk(yykVar, zBooleanValue, null)), yykVar.a);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarC, this) == y5bVar) {
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
