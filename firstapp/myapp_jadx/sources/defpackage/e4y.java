package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.NotificationSettingsScreenKt$NotificationSettingsRoute$1$1", f = "NotificationSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e4y extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ r4y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4y(r4y r4yVar, v1b<? super e4y> v1bVar) {
        super(2, v1bVar);
        this.a = r4yVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e4y(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e4y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        r4y r4yVar = this.a;
        kzh.d(new g1i(r4yVar.a.e(pu0.c.a), new n4y(r4yVar, null)), o8i0.d(r4yVar));
        return Unit.a;
    }
}
