package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend")
public final class q01 extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q01 q01Var = new q01(2, v1bVar);
        q01Var.a = ((Boolean) obj).booleanValue();
        return q01Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((q01) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(!this.a);
    }
}
