package defpackage;

import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoGiftHandlerImpl$collectGiftGroupList$$inlined$flatMapLatest$2", f = "BuildAndGoGiftHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class sd5 extends tje0 implements gaj<myh<? super lk50<? extends List<? extends GiftGroup>>>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ be5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd5(be5 be5Var, v1b v1bVar) {
        super(3, v1bVar);
        this.d = be5Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends List<? extends GiftGroup>>> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        sd5 sd5Var = new sd5(this.d, v1bVar);
        sd5Var.b = myhVar;
        sd5Var.c = bool;
        return sd5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh lyhVarA = ((Boolean) this.c).booleanValue() ? bm50.a(this.d.a.a(146, new Integer(OrderBetType.ALL.getValue()))) : new gzh(new lk50.c(m2g.a));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarA, this) == y5bVar) {
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
