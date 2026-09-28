package defpackage;

import com.sportybet.feature.recap.presentation.RecapActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.presentation.RecapActivity$observeUiEvents$1", f = "RecapActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rc40 extends tje0 implements Function2<of40, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecapActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc40(RecapActivity recapActivity, v1b<? super rc40> v1bVar) {
        super(2, v1bVar);
        this.b = recapActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rc40 rc40Var = new rc40(this.b, v1bVar);
        rc40Var.a = obj;
        return rc40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(of40 of40Var, v1b<? super Unit> v1bVar) {
        return ((rc40) create(of40Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        of40 of40Var = (of40) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = RecapActivity.f;
        boolean zG = Intrinsics.g(of40Var, of40.c.a);
        RecapActivity recapActivity = this.b;
        if (zG) {
            ej5.c(ebs.a(recapActivity.getLifecycle()), null, null, new qc40(recapActivity, null), 3);
        } else if (Intrinsics.g(of40Var, of40.b.a)) {
            azm azmVar = recapActivity.c;
            if (azmVar == null) {
                Intrinsics.n("router");
                throw null;
            }
            azmVar.d(wae.HOME);
            recapActivity.finish();
        } else if (Intrinsics.g(of40Var, of40.d.a)) {
            phx phxVar = recapActivity.e;
            if (phxVar != null) {
                yfx.i(phxVar, "RESULT", null, 6);
            }
        } else {
            if (!Intrinsics.g(of40Var, of40.a.a)) {
                uhc.a();
                return null;
            }
            recapActivity.finish();
        }
        return Unit.a;
    }
}
