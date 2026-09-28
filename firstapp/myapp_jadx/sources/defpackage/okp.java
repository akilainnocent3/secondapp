package defpackage;

import android.view.View;
import com.sporty.android.core.model.ads.Ads;
import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;
import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class okp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ okp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = KeWithdrawActivity.Z;
                sh8.c().e(((Ads) obj).getLinkUrl());
                break;
            default:
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = (PreMatchMyFavoriteActivity) obj;
                int i3 = PreMatchMyFavoriteActivity.b1;
                preMatchMyFavoriteActivity.E1(false);
                preMatchMyFavoriteActivity.D1();
                break;
        }
    }
}
