package defpackage;

import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t26 extends s26 {
    @Override // defpackage.u26, q26.b
    public final Set<Set<String>> c() throws rz5 {
        try {
            return this.a.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new rz5(e);
        }
    }
}
