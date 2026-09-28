package defpackage;

import android.telephony.TelephonyManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tth0 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object systemService = ((ith0) this.receiver).a.getSystemService("phone");
        systemService.getClass();
        return Boolean.valueOf("android".equalsIgnoreCase(((TelephonyManager) systemService).getNetworkOperatorName()));
    }
}
