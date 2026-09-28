package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x02 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ x02(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return b.k(RegularMarketRule.a("186", null), RegularMarketRule.a("328", null), RegularMarketRule.a("330", null));
            default:
                return Unit.a;
        }
    }
}
