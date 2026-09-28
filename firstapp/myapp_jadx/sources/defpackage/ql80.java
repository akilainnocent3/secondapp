package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsFragment$renderDeviceManagementState$1", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ql80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ hl80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql80(v1b v1bVar, hl80 hl80Var) {
        super(2, v1bVar);
        this.a = hl80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ql80(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ql80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = hl80.N;
        final hl80 hl80Var = this.a;
        hl80Var.r0(hl80Var.m0().J, R.string.device_management__feature_hint, new Function0() { // from class: pl80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ohp<Object>[] ohpVarArr2 = hl80.N;
                nm80 nm80VarP0 = hl80Var.p0();
                ej5.c(o8i0.d(nm80VarP0), null, null, new hm80(nm80VarP0, null), 3);
                return Unit.a;
            }
        });
        return Unit.a;
    }
}
