package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.repositories.AnTestRepository$sendVisitInfo$result$1", f = "AnTestRepository.kt", l = {20}, m = "invokeSuspend", v = 1)
public final class fz extends tje0 implements Function1<v1b<? super HTTPResponse<Unit>>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(int i, int i2, v1b<? super fz> v1bVar) {
        super(1, v1bVar);
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new fz(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<Unit>> v1bVar) {
        return ((fz) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        p pVarC = on0.c();
        this.a = 1;
        Object objC = pVarC.c(this.b, this.c, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
