package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class xqo implements DialogInterface.OnClickListener {
    public final /* synthetic */ yqo a;

    public xqo(yqo yqoVar) {
        this.a = yqoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        yqo yqoVar = this.a;
        yqoVar.a.b0();
        tlo tloVar = yqoVar.b;
        tloVar.d();
        tloVar.f().h = 0;
        tloVar.e(false);
        tloVar.p(false);
        Runnable runnable = yqoVar.c;
        if (runnable != null) {
            runnable.run();
        } else {
            yqoVar.d.finish();
        }
    }
}
