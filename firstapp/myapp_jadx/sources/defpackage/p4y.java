package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.NotificationSettingsViewModel$switchAllNotificationSettings$1", f = "NotificationSettingsViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class p4y extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r4y c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4y(r4y r4yVar, boolean z, v1b<? super p4y> v1bVar) {
        super(2, v1bVar);
        this.c = r4yVar;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p4y p4yVar = new p4y(this.c, this.d, v1bVar);
        p4yVar.b = obj;
        return p4yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p4y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        r4y r4yVar = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                boolean z = this.d;
                zi50.a aVar = zi50.b;
                qa30 qa30Var = r4yVar.a;
                this.b = null;
                this.a = 1;
                if (qa30Var.c(z, this) == y5bVar) {
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
            SprThrowable sprThrowable = thA instanceof SprThrowable ? (SprThrowable) thA : null;
            r4yVar.x1(sprThrowable != null ? sprThrowable.b() : null);
        }
        return Unit.a;
    }
}
