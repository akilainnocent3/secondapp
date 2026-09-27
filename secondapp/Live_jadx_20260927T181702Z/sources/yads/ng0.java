package yads;

import android.app.Activity;
import android.app.Dialog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ng0 {
    public static final void a(Dialog dialog) {
        Activity ownerActivity = dialog.getOwnerActivity();
        boolean z10 = ownerActivity == null || !(ownerActivity.isFinishing() || ownerActivity.isDestroyed());
        if (dialog.isShowing() && z10) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
                boolean z11 = ad1.f146762a;
            }
        }
    }
}
