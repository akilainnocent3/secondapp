package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.data.repository.VirtualLobbyCMSRepositoryImpl$getVirtualLobbyCmsMapFlow$$inlined$flatMapLatest$1", f = "VirtualLobbyCMSRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class igi0 extends tje0 implements gaj<myh<? super lk50<? extends List<? extends CMSResponse>>>, String, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kgi0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igi0(v1b v1bVar, kgi0 kgi0Var) {
        super(3, v1bVar);
        this.d = kgi0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends List<? extends CMSResponse>>> myhVar, String str, v1b<? super Unit> v1bVar) {
        igi0 igi0Var = new igi0(v1bVar, this.d);
        igi0Var.b = myhVar;
        igi0Var.c = str;
        return igi0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh lyhVarB = wo5.b(this.d.b, "page_virtuals_lobby", (String) this.c, 2);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarB, this) == y5bVar) {
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
