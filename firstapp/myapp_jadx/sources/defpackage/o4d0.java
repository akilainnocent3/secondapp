package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class o4d0 {
    public final wwd0 a = xwd0.a(Boolean.FALSE);
    public final wwd0 b = xwd0.a(null);
    public final wwd0 c = xwd0.a(Boolean.TRUE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("LEFT", 0);
            a = aVar;
            a aVar2 = new a("RIGHT", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static n4d0 a(a aVar, g5d0 g5d0Var) {
        List<c5d0> list;
        int i;
        ColoredUiText coloredUiText;
        qcn qcnVarB = null;
        m4d0 m4d0Var = g5d0Var != null ? new m4d0(String.valueOf(g5d0Var.b), aVar == a.a ? R.color.bg_inverse_brand_sub_primary : R.color.text_danger) : null;
        if (g5d0Var != null && (list = g5d0Var.c) != null) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (c5d0 c5d0Var : list) {
                int i2 = c5d0Var.a;
                int i3 = c5d0Var.b;
                if (i2 > i3) {
                    a aVar2 = a.a;
                    i = aVar == aVar2 ? R.color.bg_inverse_brand_sub_primary : R.color.bg_brand_main_primary;
                    int i4 = aVar == aVar2 ? R.color.text_tertiary : R.color.text_inverse_primary;
                    StringUiText stringUiText = vch0.a;
                    coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_instant_virtual__stats_popup_w), Integer.valueOf(i4), null);
                } else {
                    i = aVar == a.a ? R.color.bg_brand_sub_tertiary_d_darker : R.color.bg_brand_main_secondary;
                    StringUiText stringUiText2 = vch0.a;
                    coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_instant_virtual__stats_popup_l), Integer.valueOf(R.color.text_inverse_secondary), null);
                }
                arrayList.add(new e5d0(new d5d0(i, coloredUiText), d40.a(c5d0Var.a, i3, ":"), c5d0Var.c));
            }
            qcnVarB = a4h.b(arrayList);
        }
        return new n4d0(m4d0Var, qcnVarB);
    }
}
