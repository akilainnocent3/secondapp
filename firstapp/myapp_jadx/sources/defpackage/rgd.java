package defpackage;

import android.view.View;
import com.sportybet.android.virtual.presentation.activity.InstantBetslipActivity;
import com.sportybet.plugin.myfavorite.widget.DefaultStakeLayout;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rgd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rgd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DefaultStakeLayout defaultStakeLayout = (DefaultStakeLayout) obj;
                int i2 = DefaultStakeLayout.z;
                if (defaultStakeLayout.d()) {
                    defaultStakeLayout.c();
                }
                break;
            default:
                int i3 = InstantBetslipActivity.Y;
                ((InstantBetslipActivity) obj).K1(false);
                break;
        }
    }
}
