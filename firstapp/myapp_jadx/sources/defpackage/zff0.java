package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zff0 implements Function1<cmp, Boolean> {
    public final /* synthetic */ k4i a;
    public final /* synthetic */ n6s b;

    public zff0(k4i k4iVar, n6s n6sVar) {
        this.a = k4iVar;
        this.b = n6sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(cmp cmpVar) {
        KeyEvent keyEvent = cmpVar.a;
        InputDevice device = keyEvent.getDevice();
        boolean zC = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && emp.b(keyEvent) == 2 && keyEvent.getSource() != 257) {
            boolean zA = znb0.a(19, keyEvent);
            k4i k4iVar = this.a;
            if (zA) {
                zC = k4iVar.c(5);
            } else if (znb0.a(20, keyEvent)) {
                zC = k4iVar.c(6);
            } else if (znb0.a(21, keyEvent)) {
                zC = k4iVar.c(3);
            } else if (znb0.a(22, keyEvent)) {
                zC = k4iVar.c(4);
            } else if (znb0.a(23, keyEvent)) {
                ooa0 ooa0Var = this.b.c;
                if (ooa0Var != null) {
                    ooa0Var.a();
                }
                zC = true;
            }
        }
        return Boolean.valueOf(zC);
    }
}
