package defpackage;

import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class rh20 extends OneUpTwoUpSwitch.d {
    public final /* synthetic */ PreMatchMyFavoriteActivity a;

    public rh20(PreMatchMyFavoriteActivity preMatchMyFavoriteActivity) {
        this.a = preMatchMyFavoriteActivity;
    }

    @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
    public final void d(OneUpTwoUpSwitch.f fVar) {
        String strA;
        int i = PreMatchMyFavoriteActivity.b1;
        PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
        if (wc.d(preMatchMyFavoriteActivity)) {
            String str = preMatchMyFavoriteActivity.b0;
            avy avyVarG = hih0.g(fVar);
            if (preMatchMyFavoriteActivity.v.f(preMatchMyFavoriteActivity.f0.getId(), preMatchMyFavoriteActivity.b0, false) && (strA = preMatchMyFavoriteActivity.v.a(preMatchMyFavoriteActivity.f0.getId(), preMatchMyFavoriteActivity.b0, avyVarG, false)) != null) {
                str = strA;
            }
            if (str != null) {
                preMatchMyFavoriteActivity.R1(str);
                if (wlc.a(preMatchMyFavoriteActivity.v.d(preMatchMyFavoriteActivity.f0.getId(), preMatchMyFavoriteActivity.b0, false))) {
                    xlc xlcVar = preMatchMyFavoriteActivity.J0;
                    lkf lkfVar = lkf.e;
                    zjf zjfVar = zjf.a;
                    xlcVar.x1(lkfVar, avyVarG == avy.a ? pkf.a : pkf.b);
                } else {
                    preMatchMyFavoriteActivity.H0.C1(wuy.e, uuy.b, vuy.b(avyVarG));
                }
            }
        }
        preMatchMyFavoriteActivity.N0.setState(fVar, false);
    }
}
