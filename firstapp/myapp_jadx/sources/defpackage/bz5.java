package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import kotlin.Unit;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz5 implements fy5.f.a, pya {
    public final /* synthetic */ int a;

    @Override // fy5.f.a
    public boolean a(TotalCaptureResult totalCaptureResult) {
        return fy5.b(totalCaptureResult, true);
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                Unit unit = Unit.a;
                break;
            default:
                StompClient.lambda$connect$5((Throwable) obj);
                break;
        }
    }

    public /* synthetic */ bz5(int i) {
        this.a = i;
    }
}
