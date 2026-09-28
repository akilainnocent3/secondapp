package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportygames.sportyherov2.components.RangeComponent;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qyg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qyg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((uyg) obj).c.f();
                return;
            default:
                RangeComponent rangeComponent = (RangeComponent) obj;
                double dA = hez.a(rangeComponent.binding.G0, 1, rangeComponent.binding.G0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList = rangeComponent.i;
                if (sideBetConfigsList == null) {
                    Intrinsics.n("rightSideBetConfigs");
                    throw null;
                }
                if (dA >= sideBetConfigsList.getMaxCoefficient()) {
                    return;
                }
                wz.a("EndCoefficientPlusClick", "Sporty Hero", "RANGE");
                TextView textView = rangeComponent.binding.G0;
                TreeMap treeMap = pw.a;
                double dA2 = hez.a(rangeComponent.binding.G0, 1, textView.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList2 = rangeComponent.i;
                if (sideBetConfigsList2 == null) {
                    Intrinsics.n("rightSideBetConfigs");
                    throw null;
                }
                textView.setText(pw.q(sideBetConfigsList2.getStepValue() + dA2).concat("x"));
                double d = Double.parseDouble(rangeComponent.binding.G0.getText().toString().substring(0, rangeComponent.binding.G0.getText().toString().length() - 1)) - 0.01d;
                SideBetConfigsList sideBetConfigsList3 = rangeComponent.i;
                if (sideBetConfigsList3 == null) {
                    Intrinsics.n("rightSideBetConfigs");
                    throw null;
                }
                if (d < sideBetConfigsList3.getMinCoefficient()) {
                    rangeComponent.e(0.4f, false);
                } else {
                    rangeComponent.e(1.0f, true);
                }
                double dA3 = hez.a(rangeComponent.binding.J0, 1, rangeComponent.binding.J0.getText().toString(), 0);
                double dA4 = hez.a(rangeComponent.binding.G0, 1, rangeComponent.binding.G0.getText().toString(), 0);
                double d2 = dA4 + 0.01d;
                SideBetConfigsList sideBetConfigsList4 = rangeComponent.i;
                if (sideBetConfigsList4 == null) {
                    Intrinsics.n("rightSideBetConfigs");
                    throw null;
                }
                if (d2 > sideBetConfigsList4.getMaxCoefficient()) {
                    rangeComponent.g(0.4f, false);
                    return;
                } else if (dA3 + 0.01d >= dA4) {
                    rangeComponent.g(1.0f, true);
                    return;
                } else {
                    rangeComponent.h(1.0f, true);
                    rangeComponent.e(1.0f, true);
                    return;
                }
        }
    }
}
