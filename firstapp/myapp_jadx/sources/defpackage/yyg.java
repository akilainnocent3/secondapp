package defpackage;

import android.view.View;
import com.sportygames.sportyherov2.components.RangeComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class yyg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yyg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b01.b bVar = (b01.b) obj;
                bVar.getClass();
                ((ytw) obj2).setValue(Boolean.valueOf(bVar instanceof b01.b.d));
                return Unit.a;
            default:
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
                    wz.a("StartCoefficientClicked", "Sporty Hero", "RANGE", "1");
                } else {
                    wz.a("StartCoefficientClicked", "Sporty Hero", "RANGE", "2");
                }
                SHKeypadContainer sHKeypadContainer3 = rangeComponent.V;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("rangeKeypad");
                    throw null;
                }
                sHKeypadContainer3.setVisibility(0);
                rangeComponent.binding.i0.setEnabled(false);
                rangeComponent.binding.k0.setEnabled(true);
                rangeComponent.binding.j0.setEnabled(false);
                rangeComponent.D = rangeComponent.b;
                rangeComponent.p();
                return Unit.a;
        }
    }
}
