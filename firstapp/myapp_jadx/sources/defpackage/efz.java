package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class efz {
    public final boolean a;
    public boolean b = false;

    public efz(yj30 yj30Var) {
        this.a = yj30Var.b(AutoFlashUnderExposedQuirk.class) != null;
    }
}
