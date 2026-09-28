package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eta0 extends pf implements iaj<Boolean, Boolean, zta0, v1b<? super tta0>, Object> {
    @Override // defpackage.iaj
    public final Object d(Boolean bool, Boolean bool2, zta0 zta0Var, v1b<? super tta0> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        zta0 zta0Var2 = zta0Var;
        ((kta0) this.a).getClass();
        if (!zBooleanValue || !zBooleanValue2) {
            return null;
        }
        tta0.a aVar = new tta0.a(R.color.border_primary, R.color.bg_secondary_d_base, R.color.icon_primary, R.color.text_primary);
        String id = zta0Var2.getId();
        String id2 = zta0Var2.getId();
        bua0.a aVar2 = new bua0.a(R.color.text_primary, R.color.border_primary);
        zta0.a.C1422a.a.getClass();
        boolean zEquals = "1".equals(id2);
        StringUiText stringUiText = vch0.a;
        bua0 bua0Var = new bua0("speed_controller_speed_option_multiplier_1x", 1.0f, "1", zEquals, new StringUiText("1x"), aVar2);
        zta0.a.b.a.getClass();
        bua0 bua0Var2 = new bua0("speed_controller_speed_option_multiplier_2x", 1.0f, "2", "2".equals(id2), new StringUiText("2x"), aVar2);
        zta0.b.a.getClass();
        return new tta0(false, new aua0(id, a4h.a(bua0Var, bua0Var2, new bua0("speed_controller_speed_option_skip", 2.0f, "skip", "skip".equals(id2), new ResourceUiText(R.string.common_functions__skip), aVar2))), aVar);
    }
}
