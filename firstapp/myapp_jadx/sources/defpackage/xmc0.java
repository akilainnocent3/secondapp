package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xmc0 {
    public final wwd0 a = xwd0.a(null);
    public final wwd0 b = xwd0.a(rmc0.b);

    public static smc0 a(dnc0.a aVar, knc0 knc0Var, cnc0 cnc0Var) {
        List<ufc0> list;
        int i;
        ColoredUiText coloredUiText;
        int i2 = aVar == dnc0.a.a ? R.color.bg_inverse_brand_sub_primary : R.color.text_danger;
        dnc0 dnc0Var = new dnc0(aVar, cnc0Var != null ? cnc0Var.b : knc0Var.a, cnc0Var != null ? cnc0Var.c : knc0Var.b, cnc0Var != null ? cnc0Var.m : 0);
        qcn qcnVarB = null;
        kmc0 kmc0Var = cnc0Var != null ? new kmc0(String.valueOf(cnc0Var.j), i2) : null;
        if (cnc0Var != null && (list = cnc0Var.l) != null) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (ufc0 ufc0Var : list) {
                int i3 = ufc0Var.e;
                int i4 = ufc0Var.f;
                if (i3 > i4) {
                    dnc0.a aVar2 = dnc0.a.a;
                    i = aVar == aVar2 ? R.color.bg_inverse_brand_sub_primary : R.color.bg_brand_main_primary;
                    int i5 = aVar == aVar2 ? R.color.text_tertiary : R.color.text_inverse_primary;
                    StringUiText stringUiText = vch0.a;
                    coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_instant_virtual__stats_popup_w), Integer.valueOf(i5), null);
                } else {
                    i = aVar == dnc0.a.a ? R.color.bg_brand_sub_tertiary_d_darker : R.color.bg_brand_main_secondary;
                    StringUiText stringUiText2 = vch0.a;
                    coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_instant_virtual__stats_popup_l), Integer.valueOf(R.color.text_inverse_secondary), null);
                }
                arrayList.add(new anc0(new zmc0(i, coloredUiText), d40.a(ufc0Var.e, i4, ":")));
            }
            qcnVarB = a4h.b(arrayList);
        }
        return new smc0(dnc0Var, kmc0Var, qcnVarB);
    }
}
