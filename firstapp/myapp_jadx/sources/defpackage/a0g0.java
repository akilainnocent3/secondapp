package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.b;

/* JADX INFO: loaded from: classes.dex */
public final class a0g0 implements View.OnClickListener {
    public final zb a;
    public final /* synthetic */ b b;

    public a0g0(b bVar) {
        this.b = bVar;
        Context context = bVar.a.getContext();
        CharSequence charSequence = bVar.h;
        zb zbVar = new zb();
        zbVar.e = 4096;
        zbVar.g = 4096;
        zbVar.l = null;
        zbVar.m = null;
        zbVar.n = false;
        zbVar.o = false;
        zbVar.p = 16;
        zbVar.i = context;
        zbVar.a = charSequence;
        this.a = zbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.b;
        Window.Callback callback = bVar.k;
        if (callback == null || !bVar.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
