package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$requiredResource$$inlined$flatMapLatest$1", f = "LNLobbyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class fqq extends tje0 implements gaj<myh<? super Boolean>, Long, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqq(v1b v1bVar, ArrayList arrayList) {
        super(3, v1bVar);
        this.d = arrayList;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, Long l, v1b<? super Unit> v1bVar) {
        fqq fqqVar = new fqq(v1bVar, this.d);
        fqqVar.b = myhVar;
        fqqVar.c = l;
        return fqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            ((Number) this.c).longValue();
            jqq jqqVar = new jqq((lyh[]) CollectionsKt.A0(this.d).toArray(new lyh[0]));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, jqqVar, this) == y5bVar) {
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
