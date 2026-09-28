package defpackage;

import com.sportybet.feature.recap.presentation.RecapActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.presentation.RecapActivity$handleUiEvent$1", f = "RecapActivity.kt", l = {113}, m = "invokeSuspend", v = 2)
public final class qc40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ RecapActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc40(RecapActivity recapActivity, v1b<? super qc40> v1bVar) {
        super(2, v1bVar);
        this.b = recapActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qc40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qc40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        RecapActivity recapActivity = this.b;
        if (i == 0) {
            uj50.b(obj);
            mgb0 mgb0Var = recapActivity.d;
            if (mgb0Var == null) {
                Intrinsics.n("sportyAccountManager");
                throw null;
            }
            this.a = 1;
            if (mgb0Var.ensureLogin(recapActivity, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        recapActivity.finish();
        return Unit.a;
    }
}
