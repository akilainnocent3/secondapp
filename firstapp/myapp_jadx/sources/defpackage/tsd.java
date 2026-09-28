package defpackage;

import android.view.View;
import com.sportybet.android.user.verifiedinfo.VerifiedInfoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tsd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tsd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((usd) obj).P0().Y1();
                break;
            default:
                int i2 = VerifiedInfoActivity.d;
                ((VerifiedInfoActivity) obj).finish();
                break;
        }
    }
}
