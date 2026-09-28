package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.BettingStreakViewModel$applyStreakRepairTool$1", f = "BettingStreakViewModel.kt", l = {219}, m = "invokeSuspend", v = 2)
public final class m44 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q44 b;
    public final /* synthetic */ boolean c;

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
            p04 p04Var;
            Object value2;
            Object value3;
            lk50 lk50Var = (lk50) obj;
            q44 q44Var = this.a;
            wwd0 wwd0Var = q44Var.i;
            if (lk50Var instanceof lk50.b) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, k44.a((k44) value3, null, null, null, h850.c.a, null, 23)));
            } else if (lk50Var instanceof lk50.a) {
                SprThrowable sprThrowableH = bm50.h(lk50Var);
                UiText uiTextB = sprThrowableH != null ? sprThrowableH.b() : vch0.b;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, k44.a((k44) value2, null, new r4e0.a(uiTextB), null, h850.b.a, null, 21)));
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                if (this.b) {
                    do {
                        value = wwd0Var.getValue();
                        p04Var = (p04) ((lk50.c) lk50Var).a;
                    } while (!wwd0Var.g(value, k44.a((k44) value, null, null, null, new h850.a(p04Var.a, p04Var.b), null, 23)));
                } else {
                    ej5.c(o8i0.d(q44Var), null, null, new n44(q44Var, true, null), 3);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m44(q44 q44Var, boolean z, v1b<? super m44> v1bVar) {
        super(2, v1bVar);
        this.b = q44Var;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m44(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m44) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            q44 q44Var = this.b;
            c34 c34Var = q44Var.b.a;
            boolean z = this.c;
            yzh yzhVarA = c34Var.a(z);
            a aVar = new a(q44Var, z);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
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
