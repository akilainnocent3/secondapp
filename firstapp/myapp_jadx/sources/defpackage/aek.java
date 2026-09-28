package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.domain.usecase.hint.GetShouldShowDeviceManagementHintInSettingsUseCaseImpl$invoke$4", f = "GetShouldShowDeviceManagementHintInSettingsUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aek extends tje0 implements gaj<Boolean, Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        aek aekVar = new aek(3, v1bVar);
        aekVar.a = zBooleanValue;
        aekVar.b = zBooleanValue2;
        return aekVar.invokeSuspend(Unit.a);
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
