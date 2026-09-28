package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yac0 extends pf implements jaj<List<? extends dmc0>, lni0, AssetsInfo, km3, v1b<? super cw3>, Object> {
    @Override // defpackage.jaj
    public final Object l(List<? extends dmc0> list, lni0 lni0Var, AssetsInfo assetsInfo, km3 km3Var, v1b<? super cw3> v1bVar) {
        List<? extends dmc0> list2 = list;
        lni0 lni0Var2 = lni0Var;
        AssetsInfo assetsInfo2 = assetsInfo;
        km3 km3Var2 = km3Var;
        abc0 abc0Var = (abc0) this.a;
        abc0Var.getClass();
        if (lni0Var2 == lni0.a || km3Var2 == null) {
            return null;
        }
        int size = list2.size();
        Object[] objArr = {abc0Var.b.B(), bjb0.U(assetsInfo2.balance, Locale.US)};
        StringUiText stringUiText = vch0.a;
        return new cw3(new zp3(size, new ResourceUiText(R.string.app_common__var_var, ay0.S(objArr))), null, km3Var2);
    }
}
