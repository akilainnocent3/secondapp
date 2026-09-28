package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsViewModel$setDeviceManagementHintInProfileShown$1", f = "SettingsViewModel.kt", l = {133}, m = "invokeSuspend", v = 2)
public final class hm80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nm80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm80(nm80 nm80Var, v1b<? super hm80> v1bVar) {
        super(2, v1bVar);
        this.c = nm80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hm80 hm80Var = new hm80(this.c, v1bVar);
        hm80Var.b = obj;
        return hm80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hm80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                nm80 nm80Var = this.c;
                zi50.a aVar = zi50.b;
                vh80 vh80Var = nm80Var.i;
                this.b = null;
                this.a = 1;
                if (vh80Var.a.c(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.d(a320.a("Set device management hint shown failed: ", thA), new Object[0]);
        }
        return Unit.a;
    }
}
