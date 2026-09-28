package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.home.MainActivity;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wiu implements lfy {
    public final /* synthetic */ MainActivity a;

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        vak0 vak0Var = (vak0) obj;
        int i = MainActivity.m0;
        t2k0 t2k0Var = vak0Var.e;
        String str = t2k0Var != null ? t2k0Var.a : null;
        ResourceUiText resourceUiText = vak0Var.a;
        resourceUiText.getClass();
        MainActivity mainActivity = this.a;
        String string = resourceUiText.e(mainActivity).toString();
        ResourceUiText resourceUiText2 = vak0Var.b;
        resourceUiText2.getClass();
        String string2 = resourceUiText2.e(mainActivity).toString();
        boolean z = vak0Var.c;
        string.getClass();
        string2.getClass();
        tak0 tak0Var = new tak0();
        tak0Var.setArguments(vj5.a(new Pair("MESSAGE", string), new Pair("ACTION", string2), new Pair("SHOW_SUCCESSFUL_STATUS", Boolean.valueOf(z)), new Pair("WORLD_CUP_PASS_PRICE", str)));
        tak0Var.i = new iju(mainActivity, t2k0Var, vak0Var);
        if (t2k0Var != null) {
            mainActivity.U.a(s2k0.r.a, k00.d);
        }
        tak0Var.show(mainActivity.getSupportFragmentManager(), "SuccessfulRegistrationDialog");
    }
}
