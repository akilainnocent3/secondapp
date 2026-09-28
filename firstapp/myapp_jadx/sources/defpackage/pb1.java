package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$onRemoveAutoBet$2$1", f = "AutoBetViewModel.kt", l = {422}, m = "invokeSuspend", v = 2)
public final class pb1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fb1 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb1(fb1 fb1Var, int i, v1b<? super pb1> v1bVar) {
        super(2, v1bVar);
        this.b = fb1Var;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pb1(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pb1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            fb1 fb1Var = this.b;
            b390 b390Var = fb1Var.b0;
            cg50 cg50Var = fb1Var.A;
            int i2 = fb1Var.H;
            int i3 = fb1Var.M;
            cg50Var.getClass();
            ra1 ra1VarA = cg50.a(this.c, i2, i3);
            this.a = 1;
            if (b390Var.emit(ra1VarA, this) == y5bVar) {
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
