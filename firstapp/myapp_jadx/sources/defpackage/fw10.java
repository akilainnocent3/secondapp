package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fw10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ fw10(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) fragment;
                GameDetails gameDetails = zy10Var.B;
                Fragment fragmentG = null;
                wz.a("HowToPlay", gameDetails != null ? gameDetails.getName() : null, "HamMenu");
                e activity = zy10Var.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    fragmentG = supportFragmentManager.G(R.id.flContent);
                }
                if (!(fragmentG instanceof a)) {
                    zy10Var.E1(false, new ow10());
                }
                break;
            default:
                ((x5a0) ((l560) fragment).w0).setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
