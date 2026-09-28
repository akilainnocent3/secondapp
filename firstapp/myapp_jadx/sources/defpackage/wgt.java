package defpackage;

import android.content.Intent;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertActivity;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.b;
import com.sporty.android.platform.features.security.newdevicelogin.securityaction.SecurityActionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertActivity$collectLoginAlertEffect$$inlined$collectWithLifecycle$default$1", f = "LoginAlertActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class wgt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LoginAlertActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ LoginAlertActivity d;

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertActivity$collectLoginAlertEffect$$inlined$collectWithLifecycle$default$1$1", f = "LoginAlertActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ LoginAlertActivity d;

        /* JADX INFO: renamed from: wgt$a$a, reason: collision with other inner class name */
        public static final class C1247a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ LoginAlertActivity b;

            public C1247a(v5b v5bVar, LoginAlertActivity loginAlertActivity) {
                this.b = loginAlertActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                b bVar = (b) t;
                boolean z = bVar instanceof b.C0210b;
                LoginAlertActivity loginAlertActivity = this.b;
                if (z) {
                    int i = SecurityActionActivity.f;
                    LastLoginDeviceInfo lastLoginDeviceInfo = ((b.C0210b) bVar).a;
                    lastLoginDeviceInfo.getClass();
                    Intent intent = new Intent(loginAlertActivity, (Class<?>) SecurityActionActivity.class);
                    intent.putExtra("device_info_from_popup", lastLoginDeviceInfo);
                    loginAlertActivity.startActivity(intent);
                    loginAlertActivity.finish();
                } else {
                    if (!Intrinsics.g(bVar, b.a.a)) {
                        uhc.a();
                        return null;
                    }
                    loginAlertActivity.finish();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, LoginAlertActivity loginAlertActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = loginAlertActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1247a c1247a = new C1247a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1247a, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgt(LoginAlertActivity loginAlertActivity, lyh lyhVar, v1b v1bVar, LoginAlertActivity loginAlertActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = loginAlertActivity;
        this.c = lyhVar;
        this.d = loginAlertActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new wgt(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wgt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(LxHElgWAiSeM.yoPsRFmR);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
