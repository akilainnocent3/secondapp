package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.horseracing.presentation.HorseRacingViewModel$onHomeIconClick$1", f = "HorseRacingViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
public final class hkm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fkm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkm(fkm fkmVar, v1b<? super hkm> v1bVar) {
        super(2, v1bVar);
        this.b = fkmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hkm(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hkm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<ckm> ku90Var = this.b.w;
            ckm.a aVar = ckm.a.a;
            this.a = 1;
            if (ku90Var.a.emit(aVar, this) == y5bVar) {
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
