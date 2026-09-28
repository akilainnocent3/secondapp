package defpackage;

import android.content.Context;
import com.sportygames.commons.models.OnboardingItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s6j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                Context context = u6jVar.getContext();
                if (context != null) {
                    ArrayList<OnboardingItem> arrayListA = sny.a(context, "fruit-hunt");
                    djh djhVar = u6jVar.b;
                    boolean z2 = djhVar != null && djhVar.y.d.getVisibility() == 0;
                    if (arrayListA.isEmpty()) {
                        z = u6jVar.f0;
                    } else {
                        int i2 = z2 ? 4 : 3;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2) {
                                z = false;
                            } else {
                                Boolean isView = arrayListA.get(i3).getIsView();
                                if (isView != null ? isView.booleanValue() : false) {
                                    i3++;
                                } else {
                                    z = u6jVar.f0;
                                }
                            }
                        }
                    }
                } else {
                    z = false;
                }
                Object value = u6jVar.t0().N.getValue();
                khp khpVar = khp.f;
                if (value != khpVar && !z) {
                    u6jVar.p0();
                }
                double dDoubleValue = ((Number) u6jVar.t0().I.a.getValue()).doubleValue();
                Double d = (Double) u6jVar.t0().E.a.getValue();
                if (dDoubleValue > (d != null ? d.doubleValue() : 0.0d)) {
                    Double d2 = (Double) u6jVar.t0().E.a.getValue();
                    if ((d2 != null ? d2.doubleValue() : 0.0d) >= u6jVar.a0) {
                        u6jVar.M0();
                        u6jVar.Y = false;
                        wwd0 wwd0Var = u6jVar.t0().B;
                        Boolean bool = Boolean.TRUE;
                        wwd0Var.getClass();
                        wwd0Var.k(null, bool);
                    } else if (u6jVar.t0().N.getValue() != khpVar) {
                        u6jVar.t0().D1(3);
                    }
                } else {
                    u6jVar.Y = false;
                    wwd0 wwd0Var2 = u6jVar.t0().B;
                    Boolean bool2 = Boolean.TRUE;
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, bool2);
                }
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
        return Unit.a;
    }
}
