package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.BettingStreakViewModel$participateMission$1", f = "BettingStreakViewModel.kt", l = {312}, m = "invokeSuspend", v = 2)
public final class p44 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q44 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ s24 d;

    public static final class a<T> implements myh {
        public final /* synthetic */ q44 a;
        public final /* synthetic */ boolean b;

        public a(q44 q44Var, boolean z) {
            this.a = q44Var;
            this.b = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            k44 k44Var;
            SprThrowable sprThrowableH;
            Object value2;
            Object value3;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.b;
            q44 q44Var = this.a;
            if (z) {
                wwd0 wwd0Var = q44Var.i;
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, k44.a((k44) value3, null, null, h4e0.d.a, null, uxs.LOADING, 11)));
            } else if (lk50Var instanceof lk50.c) {
                if (!this.b) {
                    return q44Var.y1(v1bVar);
                }
                wwd0 wwd0Var2 = q44Var.i;
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, k44.a((k44) value2, null, null, new h4e0.b(((btz) ((lk50.c) lk50Var).a).c), null, uxs.ENABLE, 11)));
                q44Var.d.a(q7e0.f.a, k00.d);
            } else {
                if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var3 = q44Var.i;
                do {
                    value = wwd0Var3.getValue();
                    k44Var = (k44) value;
                    sprThrowableH = bm50.h(lk50Var);
                } while (!wwd0Var3.g(value, k44.a(k44Var, null, new r4e0.a(sprThrowableH != null ? sprThrowableH.b() : vch0.b), h4e0.d.a, null, uxs.ENABLE, 9)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p44(q44 q44Var, boolean z, s24 s24Var, v1b<? super p44> v1bVar) {
        super(2, v1bVar);
        this.b = q44Var;
        this.c = z;
        this.d = s24Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p44(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p44) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            q44 q44Var = this.b;
            c34 c34Var = q44Var.e;
            s24 s24Var = this.d;
            boolean z = this.c;
            yzh yzhVarB = c34Var.b(new zsz(z, s24Var));
            a aVar = new a(q44Var, z);
            this.a = 1;
            if (yzhVarB.collect(aVar, this) == y5bVar) {
                return y5bVar;
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
