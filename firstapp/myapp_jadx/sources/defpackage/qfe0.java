package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;

/* JADX INFO: loaded from: classes4.dex */
public class qfe0 extends d {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    public AlertDialog c;

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            return alertDialog;
        }
        Context context = getContext();
        hm20.h(context);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).create();
        this.c = alertDialogCreate;
        return alertDialogCreate;
    }
}
