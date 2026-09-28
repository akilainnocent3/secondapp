package defpackage;

import android.os.Handler;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class boh implements lfy<CharSequence> {
    public final /* synthetic */ znh a;

    public boh(znh znhVar) {
        this.a = znhVar;
    }

    @Override // defpackage.lfy
    public final void u1(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        znh znhVar = this.a;
        Handler handler = znhVar.a;
        znh.a aVar = znhVar.b;
        handler.removeCallbacks(aVar);
        TextView textView = znhVar.i;
        if (textView != null) {
            textView.setText(charSequence2);
        }
        handler.postDelayed(aVar, 2000L);
    }
}
