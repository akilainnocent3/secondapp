package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportybet.feature.loyalty.impl.bettingstreak.BettingStreakActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m04 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wae waeVar = (wae) obj;
                int i2 = BettingStreakActivity.c;
                waeVar.getClass();
                azm azmVar = ((BettingStreakActivity) obj2).b;
                if (azmVar != null) {
                    azmVar.d(waeVar);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                ((Function1) obj2).invoke(new b.r.a(zrd0Var));
                return Unit.a;
        }
    }
}
