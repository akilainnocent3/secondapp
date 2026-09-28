package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes7.dex */
public final class jsx implements DialogInterface.OnDismissListener {
    public final /* synthetic */ hsx a;

    public jsx(hsx hsxVar) {
        this.a = hsxVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        hsx.c cVar = this.a.y;
        if (cVar != null) {
            cVar.onDismiss();
        }
    }
}
