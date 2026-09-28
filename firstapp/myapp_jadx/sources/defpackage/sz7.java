package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$loadWorldCupTeams$1", f = "CodeHubViewmodel.kt", l = {461}, m = "invokeSuspend", v = 2)
public final class sz7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mz7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz7(mz7 mz7Var, v1b<? super sz7> v1bVar) {
        super(2, v1bVar);
        this.d = mz7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sz7 sz7Var = new sz7(this.d, v1bVar);
        sz7Var.c = obj;
        return sz7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sz7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var;
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            mz7 mz7Var = this.d;
            wwd0 wwd0Var2 = mz7Var.O;
            try {
                zi50.a aVar = zi50.b;
                s6k0 s6k0Var = mz7Var.A;
                this.c = null;
                this.a = wwd0Var2;
                this.b = 1;
                obj = s6k0Var.c(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } catch (Throwable th) {
                th = th;
                wwd0Var = wwd0Var2;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var = this.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (List) obj;
        zi50.a aVar4 = zi50.b;
        Object obj2 = m2g.a;
        if (bVar instanceof zi50.b) {
            bVar = obj2;
        }
        wwd0Var.setValue(bVar);
        return Unit.a;
    }
}
