package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
public final class s67 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ myh<Object> c;
    public final /* synthetic */ u67<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s67(myh<Object> myhVar, u67<Object> u67Var, v1b<? super s67> v1bVar) {
        super(2, v1bVar);
        this.c = myhVar;
        this.d = u67Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s67 s67Var = new s67(this.c, this.d, v1bVar);
        s67Var.b = obj;
        return s67Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s67) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wf40<Object> wf40VarK = this.d.k((v5b) this.b);
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
