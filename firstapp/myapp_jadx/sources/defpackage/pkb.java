package defpackage;

import android.view.View;
import com.sportygames.sportyherov2.components.OverUnderComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pkb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pkb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zqy zqyVar = (zqy) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ((x5a0) zqyVar.p0().e).setValue(Boolean.FALSE);
                    ((x5a0) zqyVar.p0().B).setValue(0);
                    v91.b.j("0");
                }
                return Unit.a;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj2;
                int i2 = OverUnderComponent.b0;
                ((View) obj).getClass();
                SHKeypadContainer sHKeypadContainer = overUnderComponent.R;
                if (sHKeypadContainer == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                if (sHKeypadContainer.getVisibility() == 0) {
                    SHKeypadContainer sHKeypadContainer2 = overUnderComponent.R;
                    if (sHKeypadContainer2 == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                    sHKeypadContainer2.performClick();
                }
                if (overUnderComponent.M) {
                    wz.a("CoefficientClicked", "Sporty Hero", "OVER_UNDER", "1");
                } else {
                    wz.a("CoefficientClicked", "Sporty Hero", "OVER_UNDER", "2");
                }
                SHKeypadContainer sHKeypadContainer3 = overUnderComponent.R;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                sHKeypadContainer3.setVisibility(0);
                overUnderComponent.binding.j0.setEnabled(false);
                overUnderComponent.binding.l0.setEnabled(true);
                overUnderComponent.z = 2;
                overUnderComponent.j();
                return Unit.a;
        }
    }
}
