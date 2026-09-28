package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.NotificationSettingsViewModel$clickItem$1", f = "NotificationSettingsViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
public final class m4y extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r4y b;
    public final /* synthetic */ t3y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4y(r4y r4yVar, t3y t3yVar, v1b<? super m4y> v1bVar) {
        super(2, v1bVar);
        this.b = r4yVar;
        this.c = t3yVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m4y(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m4y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            qa30 qa30Var = this.b.a;
            String strValueOf = String.valueOf(this.c.a());
            this.a = 1;
            if (qa30Var.a(strValueOf, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
