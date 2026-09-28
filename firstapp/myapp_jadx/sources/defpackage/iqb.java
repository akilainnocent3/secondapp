package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crash.remote.models.FairnessResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.repository.CrashRepository$fairness$2", f = "CrashRepository.kt", l = {79}, m = "invokeSuspend", v = 1)
public final class iqb extends tje0 implements Function1<v1b<? super HTTPResponse<FairnessResponse>>, Object> {
    public int a;
    public final /* synthetic */ zqb b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqb(zqb zqbVar, String str, v1b<? super iqb> v1bVar) {
        super(1, v1bVar);
        this.b = zqbVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new iqb(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<FairnessResponse>> v1bVar) {
        return ((iqb) create(v1bVar)).invokeSuspend(Unit.a);
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
        dpb dpbVarA = this.b.a.a();
        this.a = 1;
        Object objFairness = dpbVarA.fairness(this.c, this);
        return objFairness == y5bVar ? y5bVar : objFairness;
    }
}
