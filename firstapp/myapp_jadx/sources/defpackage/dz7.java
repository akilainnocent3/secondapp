package defpackage;

import android.content.Context;
import com.google.android.material.slider.RangeSlider;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dz7 implements e42 {
    public final /* synthetic */ ez7 a;

    @Override // defpackage.e42
    public final /* bridge */ /* synthetic */ void a(Object obj, float f, boolean z) {
        b((RangeSlider) obj);
    }

    public final void b(RangeSlider rangeSlider) {
        Float f = rangeSlider.getValues().get(0);
        f.getClass();
        float fFloatValue = f.floatValue();
        ez7 ez7Var = this.a;
        ez7Var.c = fFloatValue;
        Float f2 = rangeSlider.getValues().get(1);
        f2.getClass();
        ez7Var.d = f2.floatValue();
        int iB = ez7.b(ez7Var);
        RangeSlider rangeSlider2 = ez7Var.a;
        Context context = rangeSlider2.getContext();
        context.getClass();
        String strB = iB == Integer.MAX_VALUE ? sn5.b(context, R.string.component_odds_filters__max, new Object[0]) : String.valueOf(iB);
        int iC = ez7.c(ez7Var);
        Context context2 = rangeSlider2.getContext();
        context2.getClass();
        String strB2 = iC == Integer.MAX_VALUE ? sn5.b(context2, R.string.component_odds_filters__max, new Object[0]) : String.valueOf(iC);
        xy7 xy7Var = ez7Var.i;
        if (xy7Var != null) {
            xy7Var.invoke(strB, strB2);
        }
    }
}
