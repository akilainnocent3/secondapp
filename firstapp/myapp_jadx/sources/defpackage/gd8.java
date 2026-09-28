package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class gd8 extends d {
    public WeakReference<b> a = new WeakReference<>(null);
    public WeakReference<a> b = new WeakReference<>(null);

    public interface a {
        androidx.appcompat.app.b a(e eVar);
    }

    public interface b {
        void onCancel();
    }

    public static gd8 j0(a aVar) {
        gd8 gd8Var = new gd8();
        gd8Var.setCancelable(false);
        gd8Var.a = new WeakReference<>(null);
        gd8Var.b = new WeakReference<>(aVar);
        return gd8Var;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.a.get() != null) {
            this.a.get().onCancel();
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.b.get() == null) {
            super.onCreateDialog(bundle);
        }
        return this.b.get() != null ? this.b.get().a(getActivity()) : new Dialog(getActivity(), getTheme());
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (getDialog() != null) {
            Window window = getDialog().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
        }
    }
}
