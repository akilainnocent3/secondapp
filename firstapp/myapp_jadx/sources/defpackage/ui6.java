package defpackage;

import com.sportybet.plugin.realsports.data.BetSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ui6 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ui6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BetSelection betSelection = (BetSelection) obj;
                betSelection.getClass();
                return Integer.valueOf(betSelection.ogOrderNum);
            case 1:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                tyi0.a aVar = (tyi0.a) obj;
                aVar.getClass();
                String str = aVar.d;
                String str2 = aVar.a;
                String str3 = aVar.b;
                boolean z = aVar.e;
                StringBuilder sbA = ux5.a("\n                - ", str, ":\n                  Package: ", str2, "\n                  Version: ");
                sbA.append(str3);
                sbA.append("\n                  System Browser: ");
                sbA.append(z);
                sbA.append("\n                ");
                return qae0.c(sbA.toString());
        }
    }
}
