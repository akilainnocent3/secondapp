package defpackage;

import com.sportybet.feature.devicemanagement.impl.ui.deviceblockingdialog.DeviceBlockingAlertDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rbe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rbe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DeviceBlockingAlertDialogActivity deviceBlockingAlertDialogActivity = (DeviceBlockingAlertDialogActivity) obj;
                azm azmVar = deviceBlockingAlertDialogActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.CONTACT_US);
                deviceBlockingAlertDialogActivity.finish();
                return Unit.a;
            default:
                u6j u6jVar = (u6j) obj;
                u6jVar.t0().D1(0);
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    djhVar.v.v.setVisibility(4);
                }
                djh djhVar2 = u6jVar.b;
                if (djhVar2 != null) {
                    djhVar2.v.i.setVisibility(4);
                }
                return Unit.a;
        }
    }
}
