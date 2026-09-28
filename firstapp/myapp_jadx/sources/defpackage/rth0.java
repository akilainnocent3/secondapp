package defpackage;

import android.hardware.SensorManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rth0 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object systemService = ((ith0) this.receiver).a.getSystemService("sensor");
        systemService.getClass();
        return Boolean.valueOf(((SensorManager) systemService).getSensorList(-1).isEmpty());
    }
}
