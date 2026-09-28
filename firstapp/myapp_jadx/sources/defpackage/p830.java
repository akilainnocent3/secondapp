package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", f = "ReactiveFlow.kt", l = {83}, m = "invokeSuspend")
public final class p830 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ myh<Object> c;
    public final /* synthetic */ o830<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p830(myh<Object> myhVar, o830<Object> o830Var, v1b<? super p830> v1bVar) {
        super(2, v1bVar);
        this.c = myhVar;
        this.d = o830Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p830 p830Var = new p830(this.c, this.d, v1bVar);
        p830Var.b = obj;
        return p830Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p830) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            v5b v5bVar = (v5b) this.b;
            o830<Object> o830Var = this.d;
            wf40<Object> wf40VarK = o830Var.k(new j1b(v5bVar.getCoroutineContext().plus(o830Var.a)));
            this.a = 1;
            Object objB = izh.b(this.c, wf40VarK, true, this);
            if (objB != obj2) {
                objB = Unit.a;
            }
            if (objB == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
