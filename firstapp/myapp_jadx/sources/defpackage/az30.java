package defpackage;

import com.sportygames.sportyherocompose.components.RangeComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class az30 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ az30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                RangeComponent rangeComponent = (RangeComponent) obj;
                String string = rangeComponent.d.J0.getText().toString();
                double dA = 0.0d;
                double dA2 = (string == null || string.length() == 0 || string.equals("x")) ? 0.0d : j560.a(1, 0, string);
                String string2 = rangeComponent.d.G0.getText().toString();
                double dA3 = (string2 == null || string2.length() == 0 || string2.equals("x")) ? 0.0d : j560.a(1, 0, string2);
                String string3 = rangeComponent.d.D0.getText().toString();
                if (string3 != null && string3.length() != 0) {
                    dA = tr80.a(rangeComponent.d.D0);
                }
                rangeComponent.p(dA2, dA, dA3);
                int i2 = rangeComponent.D;
                if (i2 == rangeComponent.b) {
                    rangeComponent.d.J0.setText("0x");
                } else {
                    int i3 = rangeComponent.c;
                    pv80 pv80Var = rangeComponent.d;
                    if (i2 == i3) {
                        pv80Var.G0.setText("0x");
                    } else {
                        pv80Var.D0.setText("0");
                    }
                }
                return Unit.a;
            default:
                return ((qhp) ((List) obj).get(0)).g();
        }
    }
}
