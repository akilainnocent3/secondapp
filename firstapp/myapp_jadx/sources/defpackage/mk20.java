package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mk20 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mk20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PreMatchSportActivity preMatchSportActivity = (PreMatchSportActivity) obj;
                hjd0 hjd0Var = preMatchSportActivity.b;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                hjd0Var.A.s0(0);
                hjd0 hjd0Var2 = preMatchSportActivity.b;
                if (hjd0Var2 != null) {
                    hjd0Var2.N.s0(0);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
            default:
                ((kab0) obj).B = null;
                return Unit.a;
        }
    }
}
