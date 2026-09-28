package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.common.framework.loading.LoadingTaskKt$loadingFlow$2", f = "LoadingTask.kt", l = {}, m = "invokeSuspend", v = 1)
public final class nzs extends tje0 implements Function2<List<? extends kzs<?>>, v1b<? super lyh<? extends kzs<?>>>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nzs nzsVar = new nzs(2, v1bVar);
        nzsVar.a = obj;
        return nzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends kzs<?>> list, v1b<? super lyh<? extends kzs<?>>> v1bVar) {
        return ((nzs) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new ezh(list);
    }
}
