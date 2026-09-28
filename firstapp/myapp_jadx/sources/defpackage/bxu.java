package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bxu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bxu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                MatchEventActivity matchEventActivity = (MatchEventActivity) obj;
                int i2 = MatchEventActivity.a0;
                azm azmVar = matchEventActivity.X;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.HOME);
                matchEventActivity.U1(new a5o.b(0));
                return Unit.a;
            case 1:
                int i3 = SearchMarketView.K;
                return ((Context) obj).getDrawable(R.drawable.icon_outright_clear);
            default:
                tak0 tak0Var = (tak0) obj;
                iju ijuVar = tak0Var.i;
                if (ijuVar != null) {
                    ijuVar.a();
                }
                tak0Var.dismiss();
                return Unit.a;
        }
    }
}
