package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend")
public final class qzz extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s9s c;
    public final /* synthetic */ s9s.b d;
    public final /* synthetic */ Function2<v5b, v1b<Object>, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qzz(s9s s9sVar, s9s.b bVar, Function2<? super v5b, ? super v1b<Object>, ? extends Object> function2, v1b<? super qzz> v1bVar) {
        super(2, v1bVar);
        this.c = s9sVar;
        this.d = bVar;
        this.e = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qzz qzzVar = new qzz(this.c, this.d, this.e, v1bVar);
        qzzVar.b = obj;
        return qzzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((qzz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        ias iasVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iasVar = (ias) this.b;
            try {
                uj50.b(obj);
                iasVar.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                iasVar.a();
                throw th;
            }
        }
        uj50.b(obj);
        c9p c9pVar = (c9p) ((v5b) this.b).getCoroutineContext().get(c9p.b.a);
        if (c9pVar == null) {
            ib5.a("when[State] methods should have a parent job");
            return null;
        }
        pzz pzzVar = new pzz();
        ias iasVar2 = new ias(this.c, this.d, pzzVar.b, c9pVar);
        try {
            Function2<v5b, v1b<Object>, Object> function2 = this.e;
            this.b = iasVar2;
            this.a = 1;
            obj = ej5.d(pzzVar, function2, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            iasVar = iasVar2;
            iasVar.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            iasVar = iasVar2;
            iasVar.a();
            throw th;
        }
    }
}
