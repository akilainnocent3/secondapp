package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class llb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ llb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj;
                enbVar.w0().getClass();
                Fragment fragmentG = null;
                if (SportyGamesManager.getInstance().getUser() == null) {
                    enbVar.U = enb.a.c;
                    enbVar.w0().getClass();
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                } else {
                    e activity = enbVar.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        fragmentG = supportFragmentManager.G(R.id.flContent);
                    }
                    if (!(fragmentG instanceof a)) {
                        enbVar.R0();
                    }
                }
                break;
            default:
                ((Function1) obj).invoke(c9q.i.a);
                break;
        }
        return Unit.a;
    }
}
