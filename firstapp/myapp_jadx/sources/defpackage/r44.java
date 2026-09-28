package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.BettingStreakViewModel$updateAlertStatus$1", f = "BettingStreakViewModel.kt", l = {273}, m = "invokeSuspend", v = 2)
public final class r44 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q44 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r44(q44 q44Var, boolean z, v1b<? super r44> v1bVar) {
        super(2, v1bVar);
        this.b = q44Var;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r44(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r44) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        k44 k44VarA;
        Object objF;
        Object value2;
        k44 k44VarA2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        boolean z = this.c;
        q44 q44Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (!(((k44) q44Var.i.getValue()).a instanceof m4e0.c)) {
                return Unit.a;
            }
            wwd0 wwd0Var = q44Var.i;
            do {
                value = wwd0Var.getValue();
                k44VarA = (k44) value;
                m4e0 m4e0Var = k44VarA.a;
                if (!(m4e0Var instanceof m4e0.c)) {
                    m4e0Var = null;
                }
                m4e0.c cVar = (m4e0.c) m4e0Var;
                if (cVar != null) {
                    k44VarA = k44.a(k44VarA, new m4e0.c(n7e0.a(cVar.a, false, null, null, null, null, null, false, this.c, null, false, false, 4063231)), null, null, null, null, 30);
                }
            } while (!wwd0Var.g(value, k44VarA));
            c34 c34Var = q44Var.e;
            this.a = 1;
            objF = c34Var.f(z, this);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objF = obj;
        }
        lk50 lk50Var = (lk50) objF;
        wwd0 wwd0Var2 = q44Var.i;
        do {
            value2 = wwd0Var2.getValue();
            k44VarA2 = (k44) value2;
            m4e0 m4e0Var2 = k44VarA2.a;
            if (!(m4e0Var2 instanceof m4e0.c)) {
                m4e0Var2 = null;
            }
            m4e0.c cVar2 = (m4e0.c) m4e0Var2;
            if (cVar2 != null) {
                if (lk50Var instanceof lk50.c) {
                    k44VarA2 = k44.a(k44VarA2, new m4e0.c(n7e0.a(cVar2.a, false, null, null, null, null, null, false, ((Boolean) ((lk50.c) lk50Var).a).booleanValue(), null, false, false, 4063231)), null, null, null, null, 30);
                } else if (lk50Var instanceof lk50.a) {
                    m4e0.c cVar3 = new m4e0.c(n7e0.a(cVar2.a, false, null, null, null, null, null, false, !z, null, false, false, 4063231));
                    SprThrowable sprThrowableH = bm50.h(lk50Var);
                    k44VarA2 = k44.a(k44VarA2, cVar3, new r4e0.a(sprThrowableH != null ? sprThrowableH.b() : vch0.b), null, null, null, 28);
                } else if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
            }
        } while (!wwd0Var2.g(value2, k44VarA2));
        return Unit.a;
    }
}
