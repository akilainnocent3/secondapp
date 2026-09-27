package yads;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mg0 implements kz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f152446a;

    public final void a(Dialog dialog) {
        this.f152446a = dialog;
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yads.y54
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                mg0.a(this.f158150b, dialogInterface);
            }
        });
    }

    @Override // yads.kz
    public final void e() {
        Dialog dialog = this.f152446a;
        if (dialog != null) {
            ng0.a(dialog);
        }
    }

    public static final void a(mg0 mg0Var, DialogInterface dialogInterface) {
        Dialog dialog = mg0Var.f152446a;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        mg0Var.f152446a = null;
    }
}
