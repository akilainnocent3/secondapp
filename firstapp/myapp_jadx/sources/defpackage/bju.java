package defpackage;

import android.widget.ImageView;
import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bju implements lfy {
    public final /* synthetic */ MainActivity a;

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        Boolean bool = (Boolean) obj;
        int i = MainActivity.m0;
        MainActivity mainActivity = this.a;
        if (mainActivity.D == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        ImageView imageView = mainActivity.D;
        if (zBooleanValue) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }
}
