package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes7.dex */
public final class isx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ hsx a;

    public isx(hsx hsxVar) {
        this.a = hsxVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a.getWindow().setSoftInputMode(3);
    }
}
