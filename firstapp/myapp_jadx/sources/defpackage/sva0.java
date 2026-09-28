package defpackage;

import com.sporty.android.core.model.pocket.common.ClabeResponse;
import com.sportybet.android.globalpay.stp.spei.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel$clabeResponseDeferred$1", f = "SpeiByStpDepositViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class sva0 extends tje0 implements Function2<v5b, v1b<? super ClabeResponse>, Object> {
    public int a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sva0(b bVar, v1b<? super sva0> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sva0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ClabeResponse> v1bVar) {
        return ((sva0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            k4k k4kVar = this.b.e;
            this.a = 1;
            objA = k4kVar.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objA instanceof zi50.b) {
            return null;
        }
        return objA;
    }
}
