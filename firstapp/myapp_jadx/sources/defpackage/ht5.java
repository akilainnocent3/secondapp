package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.utils.apicache.CachedResourceImpl$safeEmit$2", f = "CachedResourceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ht5 extends tje0 implements Function2<Object, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ht5 ht5Var = new ht5(2, v1bVar);
        ht5Var.a = obj;
        return ht5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, v1b<? super Boolean> v1bVar) {
        return ((ht5) create(obj, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(Intrinsics.g(obj2, obj2));
    }
}
