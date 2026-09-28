package defpackage;

import android.content.Context;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class aph implements zoh {
    public final Context a;
    public final k650 b;
    public final wsm c;
    public final yi5 d;
    public final ysm e;
    public final v5b f;
    public final k5b g;

    @c0d(c = "com.sportybet.di.FirebaseAppInitializerImpl$initialize$1", f = "FirebaseModule.kt", l = {93}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return aph.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            aph aphVar = aph.this;
            if (i == 0) {
                uj50.b(obj);
                ysm ysmVar = aphVar.e;
                this.a = 1;
                obj = ysmVar.d(this);
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
            aphVar.c.a(((ysm.a) obj).a);
            return Unit.a;
        }
    }

    public aph(Context context, k650 k650Var, wsm wsmVar, yi5 yi5Var, ysm ysmVar, v5b v5bVar, k5b k5bVar) {
        this.a = context;
        this.b = k650Var;
        this.c = wsmVar;
        this.d = yi5Var;
        this.e = ysmVar;
        this.f = v5bVar;
        this.g = k5bVar;
    }

    @Override // defpackage.zoh
    public final void b() {
        Context context = this.a;
        synchronized (yoh.k) {
            try {
                if (yoh.l.containsKey("[DEFAULT]")) {
                    yoh.c();
                } else {
                    iqh iqhVarA = iqh.a(context);
                    if (iqhVarA == null) {
                        Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    } else {
                        yoh.f(context, iqhVarA);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.e();
        this.c.c(this.d.a().g());
        ej5.c(this.f, this.g, null, new a(null), 2);
    }
}
