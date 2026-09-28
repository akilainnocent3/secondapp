package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.sportygames.sportyherov2.components.RangeComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vy30 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vy30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w3c0 w3c0Var;
        w3c0 w3c0Var2;
        qq80 binding;
        qq80 binding2;
        w3c0 w3c0Var3;
        w3c0 w3c0Var4;
        qq80 binding3;
        CharSequence text;
        String string;
        w3c0 w3c0Var5;
        int i = this.a;
        Double dValueOf = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                RangeComponent rangeComponent = (RangeComponent) obj2;
                int i2 = RangeComponent.f0;
                ((View) obj).getClass();
                SHKeypadContainer sHKeypadContainer = rangeComponent.V;
                if (sHKeypadContainer == null) {
                    Intrinsics.n("rangeKeypad");
                    throw null;
                }
                if (sHKeypadContainer.getVisibility() == 0) {
                    SHKeypadContainer sHKeypadContainer2 = rangeComponent.V;
                    if (sHKeypadContainer2 == null) {
                        Intrinsics.n("rangeKeypad");
                        throw null;
                    }
                    sHKeypadContainer2.performClick();
                }
                if (rangeComponent.O) {
                    wz.a("EndCoefficientClicked", "Sporty Hero", "RANGE", "1");
                } else {
                    wz.a("EndCoefficientClicked", "Sporty Hero", "RANGE", "2");
                }
                SHKeypadContainer sHKeypadContainer3 = rangeComponent.V;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("rangeKeypad");
                    throw null;
                }
                sHKeypadContainer3.setVisibility(0);
                rangeComponent.binding.i0.setEnabled(false);
                rangeComponent.binding.k0.setEnabled(false);
                rangeComponent.binding.j0.setEnabled(true);
                rangeComponent.D = rangeComponent.c;
                rangeComponent.p();
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                String str = (String) obj;
                str.getClass();
                if (q1c0Var.V && (w3c0Var5 = (w3c0) q1c0Var.b) != null) {
                    w3c0Var5.e.setCashOutAmount();
                }
                SharedPreferences sharedPreferences = q1c0Var.j0;
                if (sharedPreferences != null && !sharedPreferences.getBoolean("SPORTY_HERO_ONE_TAP", false)) {
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null) {
                        q1c0.t1(w3c0Var6.e);
                    }
                    q1c0Var.c0 = true;
                } else if (!q1c0Var.G.isEmpty() && (w3c0Var = (w3c0) q1c0Var.b) != null && !w3c0Var.e.getBetPlaced() && (w3c0Var2 = (w3c0) q1c0Var.b) != null && !w3c0Var2.e.getBetInProgress()) {
                    if (q1c0Var.V && (w3c0Var4 = (w3c0) q1c0Var.b) != null && (binding3 = w3c0Var4.e.getBinding()) != null && (text = binding3.G.getText()) != null && (string = text.toString()) != null) {
                        dValueOf = Double.valueOf(Double.parseDouble(string));
                    }
                    List<DetailResponse> list = q1c0Var.G;
                    if (list != null && !list.isEmpty() && q1c0Var.G.size() > 1 && (w3c0Var3 = (w3c0) q1c0Var.b) != null) {
                        q1c0Var.u2(1, str, dValueOf, w3c0Var3.e);
                    }
                    w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                    if (w3c0Var7 != null && (binding2 = w3c0Var7.e.getBinding()) != null) {
                        binding2.v.setClickable(false);
                    }
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (w3c0Var8 != null && (binding = w3c0Var8.e.getBinding()) != null) {
                        binding.v.setAlpha(0.65f);
                    }
                    q1c0Var.X0();
                    q1c0Var.E2(1, str);
                }
                q1c0Var.C1();
                q1c0Var.n2();
                return Unit.a;
        }
    }
}
