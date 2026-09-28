package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.repository.limits.model.SaveLimitsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.domain.SaveTimeLimitsUseCase$invoke$1", f = "SaveTimeLimitsUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class at60 extends tje0 implements Function2<lk50<? extends SaveLimitsResponse>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bt60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at60(bt60 bt60Var, v1b<? super at60> v1bVar) {
        super(2, v1bVar);
        this.c = bt60Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        at60 at60Var = new at60(this.c, v1bVar);
        at60Var.b = obj;
        return at60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends SaveLimitsResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((at60) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (lk50Var instanceof lk50.c) {
                des desVar = this.c.a;
                SaveLimitsResponse saveLimitsResponse = (SaveLimitsResponse) ((lk50.c) lk50Var).a;
                Integer dailyLimit = saveLimitsResponse.getDailyLimit();
                Integer weeklyLimit = saveLimitsResponse.getWeeklyLimit();
                this.b = null;
                this.a = 1;
                if (desVar.o(dailyLimit, weeklyLimit, this) == y5bVar) {
                    return y5bVar;
                }
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
