package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.components.RangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class cy30 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                RangeComponent rangeComponent = (RangeComponent) obj2;
                int i2 = RangeComponent.f0;
                ((View) obj).getClass();
                if (rangeComponent.betPlaced) {
                    return Unit.a;
                }
                if (rangeComponent.binding.w0.getVisibility() == 8) {
                    rangeComponent.binding.h0.setVisibility(0);
                }
                rangeComponent.binding.d0.setVisibility(8);
                rangeComponent.binding.e0.setVisibility(8);
                rangeComponent.binding.f0.setVisibility(8);
                rangeComponent.binding.g0.setVisibility(8);
                Function1<? super Boolean, Unit> function1 = rangeComponent.R;
                if (function1 == null) {
                    Intrinsics.n("onFbgClick");
                    throw null;
                }
                function1.invoke(Boolean.TRUE);
                rangeComponent.getOnBetChipSelected().invoke(0);
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!q1c0Var.y1 || q1c0Var.x1) {
                    return Unit.a;
                }
                if (!q1c0Var.I1() && q1c0Var.O0 == null) {
                    if (zBooleanValue) {
                        q1c0Var.x1 = true;
                        q1c0Var.Z1(-1);
                    }
                    return Unit.a;
                }
                q1c0Var.x1 = false;
                op5 op5Var = op5.a;
                String string = q1c0Var.getString(R.string.fbg_one_gift_usage_allowed_msg_cms);
                string.getClass();
                String string2 = q1c0Var.getString(R.string.one_gift_allowed);
                string2.getClass();
                op5Var.getClass();
                String strB = op5.b(string, string2, null);
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null) {
                    w3c0Var.w0.k(ebs.a(q1c0Var.getLifecycle()), strB, 1800L);
                }
                return Unit.a;
        }
    }
}
