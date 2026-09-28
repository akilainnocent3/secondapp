package com.sportybet.feature.devicemanagement.impl.ui.deviceblockingdialog;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.feature.devicemanagement.impl.ui.deviceblockingdialog.DeviceBlockingAlertDialogActivity;
import defpackage.azm;
import defpackage.bql;
import defpackage.k9j;
import defpackage.op8;
import defpackage.pwx;
import defpackage.rlf;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/devicemanagement/impl/ui/deviceblockingdialog/DeviceBlockingAlertDialogActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lk9j;", "Lrlf;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DeviceBlockingAlertDialogActivity extends bql implements zux, pwx, k9j, rlf {
    public static final /* synthetic */ int c = 0;
    public azm b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final String stringExtra = getIntent().getStringExtra("alert_message");
        zn8.a(this, new op8(-224955271, new Function2() { // from class: pbe
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = DeviceBlockingAlertDialogActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final String str = stringExtra;
                    if (str == null) {
                        aVar.N(-1493461911);
                        aVar.H();
                    } else {
                        aVar.N(-1493461910);
                        final DeviceBlockingAlertDialogActivity deviceBlockingAlertDialogActivity = this;
                        o0z.a(null, null, null, null, null, pp8.b(1617218982, new Function2() { // from class: qbe
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                int i2 = DeviceBlockingAlertDialogActivity.c;
                                int i3 = 0;
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    DeviceBlockingAlertDialogActivity deviceBlockingAlertDialogActivity2 = deviceBlockingAlertDialogActivity;
                                    boolean zA = aVar2.A(deviceBlockingAlertDialogActivity2);
                                    Object objY = aVar2.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zA || objY == c0042a) {
                                        objY = new rbe(deviceBlockingAlertDialogActivity2, i3);
                                        aVar2.r(objY);
                                    }
                                    Function0 function0 = (Function0) objY;
                                    boolean zA2 = aVar2.A(deviceBlockingAlertDialogActivity2);
                                    Object objY2 = aVar2.y();
                                    if (zA2 || objY2 == c0042a) {
                                        objY2 = new sbe(deviceBlockingAlertDialogActivity2, i3);
                                        aVar2.r(objY2);
                                    }
                                    vbe.a(0, aVar2, str, function0, (Function0) objY2);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, aVar), aVar, 196608);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
