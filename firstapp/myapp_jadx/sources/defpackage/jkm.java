package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.horseracing.presentation.HorseRacingViewModel$onSdkLoaded$2", f = "HorseRacingViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class jkm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public fkm a;
    public int b;
    public final /* synthetic */ fkm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkm(fkm fkmVar, v1b<? super jkm> v1bVar) {
        super(2, v1bVar);
        this.c = fkmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jkm(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jkm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fkm fkmVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            fkm fkmVar2 = this.c;
            mgb0 mgb0Var = fkmVar2.d;
            this.a = fkmVar2;
            this.b = 1;
            Object userId = mgb0Var.getUserId(this);
            if (userId == y5bVar) {
                return y5bVar;
            }
            obj = userId;
            fkmVar = fkmVar2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fkmVar = this.a;
            uj50.b(obj);
        }
        kzh.d(new g1i(fkmVar.a.h(pu0.b.a), new mkm(fkmVar, (String) obj, null)), o8i0.d(fkmVar));
        return Unit.a;
    }
}
