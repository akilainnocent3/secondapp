package defpackage;

import android.content.Intent;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qst implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qst(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            case 1:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                int i2 = PreMatchEventActivity.a2;
                rdd0 rdd0Var = preMatchEventActivity.c;
                if (rdd0Var == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                rdd0Var.a(s2k0.y.a, k00.d);
                preMatchEventActivity.startActivity(new Intent(preMatchEventActivity, (Class<?>) SportyTvRedirectActivity.class));
                return Unit.a;
            default:
                x3b0 x3b0Var = (x3b0) obj;
                if (x3b0Var.b == null) {
                    Intrinsics.n("dismissListener");
                    throw null;
                }
                Unit unit = Unit.a;
                x3b0Var.dismiss();
                return Unit.a;
        }
    }
}
