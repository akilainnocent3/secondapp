package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.component.SportyLegendsMarketCategoryInfoKt$SportyLegendsMarketCategoryInfo$1$1", f = "SportyLegendsMarketCategoryInfo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xdc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int a;
    public final /* synthetic */ ved b;
    public final /* synthetic */ qcn<dec0> c;
    public final /* synthetic */ Function1<String, Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdc0(int i, ved vedVar, qcn qcnVar, Function1 function1, v1b v1bVar) {
        super(2, v1bVar);
        this.a = i;
        this.b = vedVar;
        this.c = qcnVar;
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xdc0(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xdc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ved vedVar = this.b;
        if (this.a == vedVar.k()) {
            return Unit.a;
        }
        dec0 dec0Var = (dec0) CollectionsKt.V(vedVar.k(), this.c);
        if (dec0Var != null) {
            this.d.invoke(dec0Var.a);
        }
        return Unit.a;
    }
}
