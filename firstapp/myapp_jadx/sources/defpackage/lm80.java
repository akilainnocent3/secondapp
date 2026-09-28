package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsViewModel$updateMultiFactorAuthIconStatus$1", f = "SettingsViewModel.kt", l = {197}, m = "invokeSuspend", v = 2)
public final class lm80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nm80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm80(nm80 nm80Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = nm80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lm80 lm80Var = new lm80(this.c, v1bVar);
        lm80Var.b = obj;
        return lm80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lm80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                nm80 nm80Var = this.c;
                zi50.a aVar = zi50.b;
                m2l m2lVar = nm80Var.d;
                Boolean bool = Boolean.FALSE;
                this.b = null;
                this.a = 1;
                if (m2lVar.a.putBoolean("show_multi_factor_icon", bool, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
        return Unit.a;
    }
}
