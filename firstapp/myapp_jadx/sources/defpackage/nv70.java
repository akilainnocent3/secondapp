package defpackage;

import com.sportybet.plugin.realsports.search.SearchFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.SearchFragment$observe$1$6", f = "SearchFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nv70 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SearchFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv70(SearchFragment searchFragment, v1b<? super nv70> v1bVar) {
        super(2, v1bVar);
        this.b = searchFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nv70 nv70Var = new nv70(this.b, v1bVar);
        nv70Var.a = obj;
        return nv70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((nv70) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = SearchFragment.V;
        this.b.n0(str);
        return Unit.a;
    }
}
