package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.domain.usecase.hint.GetShouldShowDeviceManagementHintInProfileUseCaseImpl$invoke$5", f = "GetShouldShowDeviceManagementHintInProfileUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vdk extends tje0 implements gaj<Boolean, Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        vdk vdkVar = new vdk(3, v1bVar);
        vdkVar.a = zBooleanValue;
        vdkVar.b = zBooleanValue2;
        return vdkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(z && z2);
    }
}
