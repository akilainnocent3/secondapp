package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportygames.commons.views.NavigationActivity;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rm0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ rm0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mpe0 mpe0Var = on0.a;
                return (g2t) on0.a().a(g2t.class);
            case 1:
                return b.k(RegularMarketRule.a("1", null), RegularMarketRule.a("18", null));
            case 2:
                int i = NavigationActivity.y;
                return Unit.a;
            default:
                return Unit.a;
        }
    }
}
