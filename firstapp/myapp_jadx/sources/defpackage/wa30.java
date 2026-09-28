package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.notification.NotificationSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.push.PushRepositoryImpl$switchSingleNotificationSetting$2", f = "PushRepositoryImpl.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class wa30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public lk50.c a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ra30 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa30(ra30 ra30Var, boolean z, int i, boolean z2, v1b<? super wa30> v1bVar) {
        super(2, v1bVar);
        this.d = ra30Var;
        this.e = z;
        this.f = i;
        this.i = z2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wa30 wa30Var = new wa30(this.d, this.e, this.f, this.i, v1bVar);
        wa30Var.c = obj;
        return wa30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wa30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        final int i;
        final boolean z;
        Throwable th;
        lk50 lk50Var;
        Object bVar;
        Object value2;
        ra30 ra30Var = this.d;
        wwd0 wwd0Var = ra30Var.d;
        y5b y5bVar = y5b.a;
        int i2 = this.b;
        if (i2 == 0) {
            uj50.b(obj);
            lk50 lk50Var2 = (lk50) wwd0Var.getValue();
            if (!(lk50Var2 instanceof lk50.c)) {
                return Unit.a;
            }
            do {
                value = wwd0Var.getValue();
                i = this.f;
                z = this.i;
            } while (!wwd0Var.g(value, bm50.l(lk50Var2, new Function1() { // from class: va30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    List<NotificationSetting> list = (List) obj2;
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    for (NotificationSetting notificationSettingCopy$default : list) {
                        if (notificationSettingCopy$default.getNotificationType() == i) {
                            notificationSettingCopy$default = NotificationSetting.copy$default(notificationSettingCopy$default, z, 0, null, false, 14, null);
                        }
                        arrayList.add(notificationSettingCopy$default);
                    }
                    return arrayList;
                }
            })));
            if (!this.e) {
                return Unit.a;
            }
            try {
                zi50.a aVar = zi50.b;
                ha30 ha30Var = ra30Var.a;
                this.c = null;
                this.a = (lk50.c) lk50Var2;
                this.b = 1;
                Object objD = ha30Var.d(z, i, this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                obj = objD;
                lk50Var = lk50Var2;
            } catch (Throwable th2) {
                th = th2;
                lk50Var = lk50Var2;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lk50Var = this.a;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        n52.c((BaseResponse) obj);
        bVar = Unit.a;
        zi50.a aVar4 = zi50.b;
        if (zi50.a(bVar) != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, lk50Var));
        }
        uj50.b(bVar);
        return Unit.a;
    }
}
