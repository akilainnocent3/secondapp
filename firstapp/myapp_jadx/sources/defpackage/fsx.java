package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.feature.kyc.nin.NiNNotificationManager$createNotification$1", f = "NiNNotificationManager.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class fsx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gsx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsx(gsx gsxVar, v1b<? super fsx> v1bVar) {
        super(2, v1bVar);
        this.b = gsxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fsx(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fsx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = this.b.b;
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (m2lVar.a.putBoolean("show_nin_reminding", bool, this) == y5bVar) {
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
