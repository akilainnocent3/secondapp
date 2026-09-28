package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$rejectIdentityVerify$2", f = "PatronRepositoryImpl.kt", l = {676}, m = "invokeSuspend", v = 2)
public final class xyz extends tje0 implements Function2<v5b, v1b<? super BaseResponse<Object>>, Object> {
    public int a;
    public final /* synthetic */ nyz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyz(nyz nyzVar, v1b<? super xyz> v1bVar) {
        super(2, v1bVar);
        this.b = nyzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xyz(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BaseResponse<Object>> v1bVar) {
        return ((xyz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        xxz xxzVar = this.b.a;
        this.a = 1;
        Object objW = xxzVar.w(this);
        return objW == y5bVar ? y5bVar : objW;
    }
}
