package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class klg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ klg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM CacheBetBuilderMarkets WHERE sportId = ?");
                try {
                    hq60VarH1.L(1, str);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            default:
                MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) obj2;
                long jLongValue = ((Long) obj).longValue();
                int i2 = MatchEventDetailActivity.U;
                matchEventDetailActivity.W1(new a5o.w(((n4p) matchEventDetailActivity.C1()).c(), jLongValue, System.currentTimeMillis() / 1000));
                m3v m3vVarI1 = matchEventDetailActivity.I1();
                ej5.c(o8i0.d(m3vVarI1), null, null, new e3v(null, m3vVarI1), 3);
                return Unit.a;
        }
    }
}
