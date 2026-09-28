package defpackage;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sporty.android.compose.ui.component.hint.HintPopupKt$SportyTooltip$2$1", f = "HintPopup.kt", l = {128}, m = "invokeSuspend", v = 2)
public final class l9m extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ b1g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9m(boolean z, b1g0 b1g0Var, v1b<? super l9m> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = b1g0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l9m(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l9m) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            boolean z = this.b;
            b1g0 b1g0Var = this.c;
            if (z) {
                this.a = 1;
                if (b1g0Var.c(huw.a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                b1g0Var.a();
            }
        } else {
            if (i != 1) {
                ib5.a(dqvOSm.RRnYVWdYnn);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
