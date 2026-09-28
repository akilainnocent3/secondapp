package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.component.runningpage.MatchTrackerVideoViewKt$VideoPlayerSection$1$1", f = "MatchTrackerVideoView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k8v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ so10 a;
    public final /* synthetic */ glc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8v(so10 so10Var, glc0 glc0Var, v1b<? super k8v> v1bVar) {
        super(2, v1bVar);
        this.a = so10Var;
        this.b = glc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k8v(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k8v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        so10 so10Var = this.a;
        if (so10Var != null) {
            so10Var.L(this.b == glc0.MUTED ? 0.0f : 1.0f);
        }
        return Unit.a;
    }
}
