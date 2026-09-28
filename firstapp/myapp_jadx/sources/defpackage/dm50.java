package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.network.data.ResultsKt$waitSuccessOrThrow$result$1", f = "Results.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dm50 extends tje0 implements Function2<lk50<Object>, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dm50 dm50Var = new dm50(2, v1bVar);
        dm50Var.a = obj;
        return dm50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<Object> lk50Var, v1b<? super Boolean> v1bVar) {
        return ((dm50) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(!Intrinsics.g(lk50Var, lk50.b.a));
    }
}
