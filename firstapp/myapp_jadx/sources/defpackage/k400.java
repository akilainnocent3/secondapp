package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.feature.payment.impl.common.presentation.widget.PayTabLayout;
import com.sportygames.sportyherocompose.components.RangeComponent;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k400 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ k400(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                TabLayout tabLayout = ((PayTabLayout) viewGroup).G;
                tabLayout.smoothScrollBy(-tabLayout.getWidth(), 0);
                return;
            default:
                RangeComponent rangeComponent = (RangeComponent) viewGroup;
                double dA = hez.a(rangeComponent.binding.J0, 1, rangeComponent.binding.J0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList = rangeComponent.f;
                if (sideBetConfigsList == null) {
                    Intrinsics.n("leftSideBetConfigs");
                    throw null;
                }
                if (dA >= sideBetConfigsList.getMaxCoefficient()) {
                    return;
                }
                wz.a("StartCoefficientPlusClick", "Sporty Hero", "RANGE");
                TextView textView = rangeComponent.binding.J0;
                TreeMap treeMap = pw.a;
                double dA2 = hez.a(rangeComponent.binding.J0, 1, textView.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList2 = rangeComponent.f;
                if (sideBetConfigsList2 == null) {
                    Intrinsics.n("leftSideBetConfigs");
                    throw null;
                }
                textView.setText(pw.q(sideBetConfigsList2.getStepValue() + dA2).concat("x"));
                double d = Double.parseDouble(rangeComponent.binding.J0.getText().toString().substring(0, rangeComponent.binding.J0.getText().toString().length() - 1)) - 0.01d;
                SideBetConfigsList sideBetConfigsList3 = rangeComponent.f;
                if (sideBetConfigsList3 == null) {
                    Intrinsics.n("leftSideBetConfigs");
                    throw null;
                }
                if (d < sideBetConfigsList3.getMinCoefficient()) {
                    rangeComponent.f(0.4f, false);
                } else {
                    rangeComponent.f(1.0f, true);
                }
                double dA3 = hez.a(rangeComponent.binding.J0, 1, rangeComponent.binding.J0.getText().toString(), 0);
                double dA4 = hez.a(rangeComponent.binding.G0, 1, rangeComponent.binding.G0.getText().toString(), 0);
                double d2 = dA3 + 0.01d;
                SideBetConfigsList sideBetConfigsList4 = rangeComponent.f;
                if (sideBetConfigsList4 == null) {
                    Intrinsics.n("leftSideBetConfigs");
                    throw null;
                }
                if (d2 > sideBetConfigsList4.getMaxCoefficient()) {
                    rangeComponent.h(0.4f, false);
                    return;
                } else if (d2 < dA4) {
                    rangeComponent.h(1.0f, true);
                    return;
                } else {
                    rangeComponent.h(0.4f, false);
                    rangeComponent.e(0.4f, false);
                    return;
                }
        }
    }
}
