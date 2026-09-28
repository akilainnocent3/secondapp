package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public final class sw5 implements z16 {
    public final CameraManager a;

    public sw5(Context context) {
        this.a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // defpackage.z16
    public final rw5 a(String str) {
        return new rw5(this.a, str);
    }
}
