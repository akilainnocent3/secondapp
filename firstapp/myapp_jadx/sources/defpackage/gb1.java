package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$loadConfigAndCheckEnabled$1", f = "AutoBetViewModel.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class gb1 extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fb1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb1(fb1 fb1Var, v1b<? super gb1> v1bVar) {
        super(2, v1bVar);
        this.c = fb1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gb1 gb1Var = new gb1(this.c, v1bVar);
        gb1Var.b = obj;
        return gb1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((gb1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            fb1 fb1Var = this.c;
            lq1 lq1Var = fb1Var.d.a;
            boolean zA = qq1.a(lq1Var, BOConfigParam.AutoBetEnabled, false);
            boolean zA2 = qq1.a(lq1Var, BOConfigParam.AutoBetActive, false);
            osa0.a(zA, fb1Var.R, null);
            wwd0 wwd0Var = fb1Var.T;
            Boolean boolValueOf = Boolean.valueOf(zA2);
            wwd0Var.getClass();
            wwd0Var.k(null, boolValueOf);
            Boolean boolValueOf2 = Boolean.valueOf(zA);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(boolValueOf2, this) == y5bVar) {
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
