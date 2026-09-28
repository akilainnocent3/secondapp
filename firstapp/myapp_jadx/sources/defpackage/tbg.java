package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.sportygames.sportyherov2.components.OverUnderComponent;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tbg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ tbg(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                xbg xbgVar = (xbg) callback;
                try {
                    String str = xbgVar.i;
                    AppCompatButton appCompatButton = xbgVar.d;
                    if (appCompatButton == null) {
                        Intrinsics.n("errorActionButton");
                        throw null;
                    }
                    xbg.b(str, appCompatButton.getText().toString());
                    xbg.a aVar = xbgVar.f;
                    if (aVar == null) {
                        Intrinsics.n("errorInfo");
                        throw null;
                    }
                    aVar.c.invoke();
                    xbgVar.dismiss();
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) callback;
                double dA = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList = overUnderComponent.c;
                if (sideBetConfigsList == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (dA <= sideBetConfigsList.getMinCoefficient()) {
                    return;
                }
                if (overUnderComponent.giftItem != null) {
                    if (hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0) <= overUnderComponent.Q) {
                        return;
                    }
                }
                wz.a("CoefficientMinusClick", "Sporty Hero", "OVER_UNDER");
                double dA2 = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList2 = overUnderComponent.c;
                if (sideBetConfigsList2 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                double stepValue = dA2 - sideBetConfigsList2.getStepValue();
                SideBetConfigsList sideBetConfigsList3 = overUnderComponent.c;
                if (sideBetConfigsList3 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (stepValue <= sideBetConfigsList3.getMinCoefficient()) {
                    SideBetConfigsList sideBetConfigsList4 = overUnderComponent.c;
                    if (sideBetConfigsList4 == null) {
                        Intrinsics.n("sideBetConfigsList");
                        throw null;
                    }
                    stepValue = sideBetConfigsList4.getMinCoefficient();
                }
                if (overUnderComponent.giftItem != null) {
                    double d = overUnderComponent.Q;
                    if (stepValue <= d) {
                        stepValue = d;
                    }
                }
                TextView textView = overUnderComponent.binding.T0;
                TreeMap treeMap = pw.a;
                pr7.b(stepValue, "x", textView);
                double dA3 = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList5 = overUnderComponent.c;
                if (sideBetConfigsList5 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (dA3 <= sideBetConfigsList5.getMinCoefficient()) {
                    overUnderComponent.d(0.4f, false);
                } else {
                    if (hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0) > overUnderComponent.Q || overUnderComponent.giftItem == null) {
                        overUnderComponent.d(1.0f, true);
                    } else {
                        overUnderComponent.d(0.4f, false);
                    }
                }
                double dA4 = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList6 = overUnderComponent.c;
                if (sideBetConfigsList6 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                double stepValue2 = sideBetConfigsList6.getStepValue() + dA4;
                SideBetConfigsList sideBetConfigsList7 = overUnderComponent.c;
                if (sideBetConfigsList7 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (stepValue2 >= sideBetConfigsList7.getMaxCoefficient()) {
                    overUnderComponent.e(0.4f, false);
                    return;
                } else {
                    overUnderComponent.e(1.0f, true);
                    return;
                }
        }
    }
}
