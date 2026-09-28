package defpackage;

import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoBetOddsBetBuilder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jj00 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                kl00 kl00Var = (kl00) obj;
                kl00Var.getClass();
                String str = kl00Var.a;
                String str2 = kl00Var.d;
                long j = kl00Var.f;
                double d = kl00Var.b;
                int i = kl00Var.c;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(str2);
                sb.append("_");
                sb.append(j);
                hib0.b(d, "_", "_", sb);
                sb.append(i);
                return sb.toString();
            default:
                SportyLegendsSettlementRoundInfoBetOddsBetBuilder.Selection selection = (SportyLegendsSettlementRoundInfoBetOddsBetBuilder.Selection) obj;
                selection.getClass();
                return selection.b;
        }
    }
}
