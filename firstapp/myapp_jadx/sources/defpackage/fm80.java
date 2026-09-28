package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsViewModel$checkDeviceManagementFeatureEnabled$2", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fm80 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ nm80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm80(nm80 nm80Var, v1b<? super fm80> v1bVar) {
        super(2, v1bVar);
        this.b = nm80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fm80 fm80Var = new fm80(this.b, v1bVar);
        fm80Var.a = ((Boolean) obj).booleanValue();
        return fm80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((fm80) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        boolean z2 = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.D;
        do {
            value = wwd0Var.getValue();
            bm80 bm80Var = (bm80) value;
            z = bm80Var.a;
            bm80Var.getClass();
        } while (!wwd0Var.g(value, new bm80(z, z2)));
        return Unit.a;
    }
}
