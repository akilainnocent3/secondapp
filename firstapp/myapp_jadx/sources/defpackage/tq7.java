package defpackage;

import android.view.View;
import com.sportybet.plugin.common.gift.GiftsActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tq7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tq7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((uq7.a) obj).dismiss();
                break;
            default:
                int i2 = GiftsActivity.P;
                ((GiftsActivity) obj).z1();
                break;
        }
    }
}
