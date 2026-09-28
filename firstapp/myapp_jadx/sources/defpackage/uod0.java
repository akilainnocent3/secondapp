package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.data.repository.StackerRepository$startRound$2", f = "StackerRepository.kt", l = {66}, m = "invokeSuspend", v = 1)
public final class uod0 extends tje0 implements Function1<v1b<? super HTTPResponse<yod0>>, Object> {
    public int a;
    public final /* synthetic */ xod0 b;
    public final /* synthetic */ zod0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uod0(xod0 xod0Var, zod0 zod0Var, v1b<? super uod0> v1bVar) {
        super(1, v1bVar);
        this.b = xod0Var;
        this.c = zod0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new uod0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<yod0>> v1bVar) {
        return ((uod0) create(v1bVar)).invokeSuspend(Unit.a);
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
        mld0 mld0VarM = this.b.m();
        this.a = 1;
        Object objE = mld0VarM.e(this.c, this);
        return objE == y5bVar ? y5bVar : objE;
    }
}
