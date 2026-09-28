package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.feature.winning.WinningDialogActivity;
import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;
import java.util.WeakHashMap;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ch20 implements OUEarlyGoalsSwitch.b, faj {
    public final /* synthetic */ py1 a;

    public /* synthetic */ ch20(py1 py1Var) {
        this.a = py1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.faj
    public Object apply(Object obj) {
        WinningDialogActivity winningDialogActivity = (WinningDialogActivity) this.a;
        WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
        ct90<z190> ct90VarB1 = winningDialogActivity.T.B1(winningDialogActivity.d0, (MultipartBody.Part) obj, !TextUtils.isEmpty(winningDialogActivity.Q));
        return ct90VarB1 instanceof zaj ? ((zaj) ct90VarB1).a() : new gw90(ct90VarB1);
    }

    @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
    public void onStateChanged(boolean z) {
        PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = (PreMatchMyFavoriteActivity) this.a;
        int i = PreMatchMyFavoriteActivity.b1;
        if (wc.d(preMatchMyFavoriteActivity)) {
            String strA = preMatchMyFavoriteActivity.b0;
            if (preMatchMyFavoriteActivity.d.b(ckf.c, preMatchMyFavoriteActivity.f0.getId(), preMatchMyFavoriteActivity.b0, false)) {
                strA = yay.a(strA, z);
            }
            if (strA != null) {
                preMatchMyFavoriteActivity.R1(strA);
                preMatchMyFavoriteActivity.I0.B1(lkf.e, zjf.b, z ? pkf.a : pkf.b);
            }
        }
        preMatchMyFavoriteActivity.O0.setState(z, false, false);
    }
}
