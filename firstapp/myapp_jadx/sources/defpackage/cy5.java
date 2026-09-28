package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cy5 implements f16, pya {
    public final /* synthetic */ Object a;

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((yu10) this.a).invoke(obj);
    }

    @Override // defpackage.f16
    public Object get() {
        return ((e16) this.a).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
    }
}
