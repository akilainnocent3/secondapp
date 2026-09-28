package defpackage;

import com.sporty.android.core.model.notification.NotificationSetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.NotificationSettingsViewModel$fetchNotificationSettings$1", f = "NotificationSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n4y extends tje0 implements Function2<lk50<? extends List<? extends NotificationSetting>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ r4y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4y(r4y r4yVar, v1b<? super n4y> v1bVar) {
        super(2, v1bVar);
        this.b = r4yVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n4y n4yVar = new n4y(this.b, v1bVar);
        n4yVar.a = obj;
        return n4yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends NotificationSetting>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((n4y) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.a) {
            this.b.x1(((lk50.a) lk50Var).b);
        }
        return Unit.a;
    }
}
