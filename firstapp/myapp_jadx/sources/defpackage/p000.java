package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.PayBaseViewModel$onViewCreated$1", f = "PayBaseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p000 extends tje0 implements Function2<List<? extends String>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ n000 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p000(n000 n000Var, v1b<? super p000> v1bVar) {
        super(2, v1bVar);
        this.b = n000Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p000 p000Var = new p000(this.b, v1bVar);
        p000Var.a = obj;
        return p000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, v1b<? super Unit> v1bVar) {
        return ((p000) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<String> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.I1().a(list);
        return Unit.a;
    }
}
