package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.ui.TournamentBracketKt$TournamentBracket$4$1", f = "TournamentBracket.kt", l = {146}, m = "invokeSuspend", v = 2)
public final class o5g0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zp70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5g0(zp70 zp70Var, v1b<? super o5g0> v1bVar) {
        super(2, v1bVar);
        this.b = zp70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o5g0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o5g0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zp70 zp70Var = this.b;
            if (((u5a0) zp70Var.a).D() != 0) {
                this.a = 1;
                if (zp70Var.f(0, new fkd0(null, 7), this) == y5bVar) {
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
