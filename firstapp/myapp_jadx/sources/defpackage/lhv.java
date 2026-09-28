package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$refreshDailyStreakInfo$1", f = "MeViewModel.kt", l = {726}, m = "invokeSuspend", v = 2)
public final class lhv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhv(rhv rhvVar, v1b<? super lhv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lhv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lhv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        rhv rhvVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            qfv qfvVar = rhvVar.w;
            this.a = 1;
            obj = qfvVar.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Integer num = (Integer) obj;
        if (!rhvVar.U && num != null) {
            rhvVar.U = true;
            rhvVar.B.a(new ggv(num.intValue()), k00.d);
        }
        return Unit.a;
    }
}
