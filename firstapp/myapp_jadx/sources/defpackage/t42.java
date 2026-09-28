package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t42 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t42(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Fragment fragmentG = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
            case 1:
                fgb fgbVar = (fgb) obj;
                if (fgbVar.z1()) {
                    fgbVar.U1 = fgb.a.c;
                    fgbVar.V1();
                } else {
                    e activity = fgbVar.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        fragmentG = supportFragmentManager.G(R.id.flContent);
                    }
                    if (!(fragmentG instanceof a)) {
                        fgbVar.U2("");
                    }
                }
                return Unit.a;
            case 2:
                return " • 1 ".concat(sn5.d((eqy) obj, R.string.component_betslip__l_games_cut, new Object[0]));
            default:
                ((b5) obj).gotoSportyBet(xae.c, null);
                return Unit.a;
        }
    }
}
