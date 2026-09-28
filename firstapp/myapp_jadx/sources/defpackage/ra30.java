package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.notification.NotificationSetting;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ra30 implements qa30 {
    public final ha30 a;
    public final k5b b;
    public final m2l c;
    public final wwd0 d;

    @c0d(c = "com.sporty.android.core.data.repository.push.PushRepositoryImpl$getNotificationSettings$1", f = "PushRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super List<? extends NotificationSetting>>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return ra30.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super List<? extends NotificationSetting>> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ha30 ha30Var = ra30.this.a;
                this.a = 1;
                obj = ha30Var.e(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            List list = (List) n52.b((BaseResponse) obj);
            return list == null ? m2g.a : list;
        }
    }

    public ra30(ha30 ha30Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, m2l m2lVar) {
        ha30Var.getClass();
        m2lVar.getClass();
        this.a = ha30Var;
        this.b = k5bVar;
        this.c = m2lVar;
        this.d = xwd0.a(lk50.b.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qa30
    public final Object a(String str, x1b x1bVar) {
        sa30 sa30Var;
        if (x1bVar instanceof sa30) {
            sa30Var = (sa30) x1bVar;
            int i = sa30Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa30Var.d = i - Integer.MIN_VALUE;
            } else {
                sa30Var = new sa30(this, x1bVar);
            }
        } else {
            sa30Var = new sa30(this, x1bVar);
        }
        Object objD = sa30Var.b;
        y5b y5bVar = y5b.a;
        int i2 = sa30Var.d;
        m2l m2lVar = this.c;
        if (i2 == 0) {
            uj50.b(objD);
            sa30Var.a = str;
            sa30Var.d = 1;
            objD = m2lVar.a.d("push_notification_seen_item", sa30Var);
            if (objD != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objD);
                return objD;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = sa30Var.a;
        uj50.b(objD);
        Set set = (Set) objD;
        if (set == null) {
            set = t3g.a;
        }
        if (set.contains(str)) {
            return Unit.a;
        }
        LinkedHashSet linkedHashSetF = yi80.f(set, str);
        sa30Var.a = null;
        sa30Var.d = 2;
        Object objI = m2lVar.a.i("push_notification_seen_item", linkedHashSetF, sa30Var);
        return objI == y5bVar ? y5bVar : objI;
    }

    @Override // defpackage.qa30
    public final Object c(boolean z, p4y p4yVar) {
        Object objD = ej5.d(this.b, new ua30(this, z, null), p4yVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.qa30
    public final Object d(boolean z, int i, boolean z2, tje0 tje0Var) {
        Object objD = ej5.d(this.b, new wa30(this, z2, i, z, null), tje0Var);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.qa30
    public final lyh<lk50<List<NotificationSetting>>> e(pu0 pu0Var) {
        pu0Var.getClass();
        return ozh.c(su0.a(this.d, pu0Var, new a(null)), this.b);
    }

    @Override // defpackage.qa30
    public final zed.i0 f() {
        t3g t3gVar = t3g.a;
        m2l m2lVar = this.c;
        m2lVar.getClass();
        t3gVar.getClass();
        return (zed.i0) m2lVar.a.e("push_notification_seen_item", t3gVar);
    }
}
