package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z46 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z46(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zn80 binding;
        zn80 binding2;
        zn80 binding3;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            default:
                l560 l560Var = (l560) obj;
                c760 c760VarF0 = l560Var.F0();
                ej5.c(o8i0.d(c760VarF0), null, null, new g760(c760VarF0, null), 3);
                eo80 eo80Var = l560Var.l0;
                if (eo80Var != null && eo80Var.f.getVisibility() == 0 && !l560Var.isRemoving()) {
                    l560Var.F = false;
                    op5 op5Var = op5.a;
                    String string = l560Var.getString(R.string.err_something_wrong_cms);
                    string.getClass();
                    String string2 = l560Var.getString(R.string.sg_rush_something_went_wrong);
                    string2.getClass();
                    String strC = op5.c(op5Var, string, string2);
                    Context context = l560Var.getContext();
                    if (context != null) {
                        eo80 eo80Var2 = l560Var.l0;
                        if (eo80Var2 != null) {
                            eo80Var2.P.setVisibility(0);
                        }
                        eo80 eo80Var3 = l560Var.l0;
                        if (eo80Var3 != null && (binding3 = eo80Var3.P.getBinding()) != null) {
                            binding3.b.setBackgroundColor(context.getColor(R.color.sg_rush_error_bg));
                        }
                        eo80 eo80Var4 = l560Var.l0;
                        if (eo80Var4 != null && (binding2 = eo80Var4.P.getBinding()) != null) {
                            binding2.c.setText(strC);
                        }
                        eo80 eo80Var5 = l560Var.l0;
                        if (eo80Var5 != null && (binding = eo80Var5.P.getBinding()) != null) {
                            binding.c.setTextColor(context.getColor(R.color.error_text));
                        }
                        if (l560Var.M0() && !l560Var.y0) {
                            pfd pfdVar = fse.a;
                            ej5.c(w5b.a(gku.a), null, null, new f660(l560Var, null), 3);
                        }
                    }
                    l560Var.J0();
                }
                if (!l560Var.isRemoving()) {
                    l560Var.y0();
                }
                break;
        }
        return Unit.a;
    }
}
