package defpackage;

import com.sportygames.sportyherov2.components.OverUnderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qxk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qxk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) ((chp) obj)).invoke(yxk.g.a);
                break;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj;
                String string = overUnderComponent.a.T0.getText().toString();
                double dA = 0.0d;
                double dA2 = (string == null || string.length() == 0 || string.equals("x")) ? 0.0d : j560.a(1, 0, string);
                String string2 = overUnderComponent.a.L0.getText().toString();
                if (string2 != null && string2.length() != 0) {
                    dA = tr80.a(overUnderComponent.a.L0);
                }
                overUnderComponent.k(dA2, dA);
                int i2 = overUnderComponent.z;
                ru80 ru80Var = overUnderComponent.a;
                if (i2 == 2) {
                    ru80Var.T0.setText("0x");
                } else {
                    ru80Var.L0.setText("0");
                }
                break;
        }
        return Unit.a;
    }
}
