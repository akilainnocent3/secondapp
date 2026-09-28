package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementScreenKt$DeviceManagementScreen$6$1", f = "DeviceManagementScreen.kt", l = {243}, m = "invokeSuspend", v = 2)
public final class lhe extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ v3a0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1<afe, Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lhe(v3a0 v3a0Var, String str, Function1<? super afe, Unit> function1, v1b<? super lhe> v1bVar) {
        super(2, v1bVar);
        this.b = v3a0Var;
        this.c = str;
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lhe(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lhe) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lhe lheVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            lheVar = this;
            if (v3a0.b(this.b, this.c, null, false, null, lheVar, 14) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            lheVar = this;
        }
        lheVar.d.invoke(afe.g.a);
        return Unit.a;
    }
}
