package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class aoh implements lfy<Integer> {
    public final /* synthetic */ znh a;

    public aoh(znh znhVar) {
        this.a = znhVar;
    }

    @Override // defpackage.lfy
    public final void u1(Integer num) {
        Integer num2 = num;
        znh znhVar = this.a;
        Handler handler = znhVar.a;
        znh.a aVar = znhVar.b;
        handler.removeCallbacks(aVar);
        int iIntValue = num2.intValue();
        if (znhVar.f != null) {
            int i = znhVar.c.L;
            Context context = znhVar.getContext();
            Drawable drawable = null;
            if (context == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i2 = 2131231618;
                if (i == 0 && iIntValue == 1) {
                    drawable = context.getDrawable(i2);
                } else {
                    if (i == 1 && iIntValue == 2) {
                        i2 = 2131231617;
                    } else if ((i == 2 && iIntValue == 1) || (i == 1 && iIntValue == 3)) {
                    }
                    drawable = context.getDrawable(i2);
                }
            }
            if (drawable != null) {
                znhVar.f.setImageDrawable(drawable);
                if ((i != 0 || iIntValue != 1) && ((i == 1 && iIntValue == 2) || (i == 2 && iIntValue == 1))) {
                    znh.c.a(drawable);
                }
                znhVar.c.L = iIntValue;
            }
        }
        int iIntValue2 = num2.intValue();
        TextView textView = znhVar.i;
        if (textView != null) {
            textView.setTextColor(iIntValue2 == 2 ? znhVar.d : znhVar.e);
        }
        handler.postDelayed(aVar, 2000L);
    }
}
