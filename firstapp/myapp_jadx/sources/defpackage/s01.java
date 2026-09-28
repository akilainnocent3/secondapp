package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend")
public final class s01 extends tje0 implements Function2<v5b, v1b<? super li10>, Object> {
    public final /* synthetic */ qqz.e<Object> a;
    public final /* synthetic */ v01<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s01(qqz.e<Object> eVar, v01<Object> v01Var, v1b<? super s01> v1bVar) {
        super(2, v1bVar);
        this.a = eVar;
        this.b = v01Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s01(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super li10> v1bVar) {
        return ((s01) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qqz.e<Object> eVar = this.a;
        return ni10.a(eVar.b, eVar.a, this.b.a);
    }
}
