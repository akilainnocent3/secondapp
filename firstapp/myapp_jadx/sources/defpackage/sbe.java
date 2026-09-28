package defpackage;

import com.sportybet.feature.devicemanagement.impl.ui.deviceblockingdialog.DeviceBlockingAlertDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sbe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sbe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = DeviceBlockingAlertDialogActivity.c;
                ((DeviceBlockingAlertDialogActivity) obj).finish();
                return Unit.a;
            default:
                yfx yfxVar = (yfx) obj;
                return new yix(yfxVar.a, yfxVar.b.t);
        }
    }
}
