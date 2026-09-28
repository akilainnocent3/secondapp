package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsFragment$collectDeviceManagementIconStatus$1", f = "SettingsFragment.kt", l = {834}, m = "invokeSuspend", v = 2)
public final class il80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hl80 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ hl80 a;

        public a(hl80 hl80Var) {
            this.a = hl80Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            ohp<Object>[] ohpVarArr = hl80.N;
            this.a.m0().c0.setVisibility(zBooleanValue ? 0 : 8);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il80(v1b v1bVar, hl80 hl80Var) {
        super(2, v1bVar);
        this.b = hl80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new il80(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((il80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ohp<Object>[] ohpVarArr = hl80.N;
            hl80 hl80Var = this.b;
            uwd0 uwd0Var = (uwd0) hl80Var.p0().G.invoke("show_device_management_icon");
            a aVar = new a(hl80Var);
            this.a = 1;
            if (uwd0Var.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fkd.a();
        return null;
    }
}
