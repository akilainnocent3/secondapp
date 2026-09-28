package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", l = {227}, m = "invokeSuspend")
public final class q6w extends tje0 implements Function2<v5b, v1b<? super k6w.a>, Object> {
    public int a;
    public final /* synthetic */ k6w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6w(k6w k6wVar, v1b<? super q6w> v1bVar) {
        super(2, v1bVar);
        this.b = k6wVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q6w(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super k6w.a> v1bVar) {
        return ((q6w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        tb5 tb5Var = this.b.e;
        this.a = 1;
        Object objD = w5b.d(new l6w(tb5Var, null), this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
