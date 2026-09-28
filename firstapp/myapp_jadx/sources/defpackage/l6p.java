package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l6p implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fbh0 fbh0VarC = sh8.c();
        String strA = o7d.a(wae.DEPOSIT);
        dag dagVar = dag.INSUFFICIENT_BALANCE;
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_ENTRANCE", dagVar);
        fbh0VarC.c(strA, bundle);
    }
}
