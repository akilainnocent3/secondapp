package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.components.RangeComponent;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import java.text.DecimalFormat;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jy30 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                RangeComponent rangeComponent = (RangeComponent) obj;
                double dA = tr80.a(rangeComponent.binding.D0);
                DetailResponse detailResponse = rangeComponent.e;
                if (detailResponse == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA <= detailResponse.getMinAmount()) {
                    return;
                }
                wz.a("BetAmountMinClick", "Sporty Hero", "RANGE");
                TextView textView = rangeComponent.binding.D0;
                TreeMap treeMap = pw.a;
                DetailResponse detailResponse2 = rangeComponent.e;
                if (detailResponse2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                Double dH = b.h(pw.q(detailResponse2.getMinAmount()));
                String str = "0.00";
                if (dH != null) {
                    try {
                        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                        str2.getClass();
                        str = str2;
                    } catch (Exception unused) {
                    }
                }
                textView.setText(str);
                rangeComponent.a(0.4f, false);
                rangeComponent.b(1.0f, true);
                rangeComponent.userInputAmount = tr80.a(rangeComponent.binding.D0);
                return;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                if (!q1c0Var.K1()) {
                    q1c0Var.X1();
                    return;
                } else {
                    q1c0Var.Q0 = q1c0.a.b;
                    q1c0Var.a2();
                    return;
                }
        }
    }
}
