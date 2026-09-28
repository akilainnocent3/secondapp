package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementScreenKt$DeviceManagementRoute$2$1", f = "DeviceManagementScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jhe extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ phe a;
    public final /* synthetic */ h0s<eie> b;
    public final /* synthetic */ vu60 c;
    public final /* synthetic */ ytw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhe(phe pheVar, h0s h0sVar, vu60 vu60Var, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = pheVar;
        this.b = h0sVar;
        this.c = vu60Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jhe(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jhe) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        UiText uiText = (UiText) this.d.getValue();
        if (uiText != null && !uiText.equals(vch0.a)) {
            this.a.x1(new afe.i(uiText));
            this.b.f();
            vu60 vu60Var = this.c;
            bv60 bv60Var = vu60Var.b;
            bv60Var.getClass();
            bv60Var.a.remove("password_success");
            bv60Var.c.remove("password_success");
            bv60Var.d.remove("password_success");
            vu60.a aVar = (vu60.a) vu60Var.a.remove("password_success");
            if (aVar != null) {
                aVar.m = null;
            }
        }
        return Unit.a;
    }
}
