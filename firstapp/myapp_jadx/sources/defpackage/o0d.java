package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.SocketPushManager;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class o0d implements n0d {
    public final /* synthetic */ ysm a;
    public final /* synthetic */ yi5 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ y8j d;
    public final /* synthetic */ mgb0 e;
    public final /* synthetic */ fbh0 f;
    public final /* synthetic */ v5b g;
    public final /* synthetic */ u350 h;

    @c0d(c = "com.sportybet.android.inject.debugscreen.DebugScreenFeatureDependenciesModule$provideDebugScreenFeatureDependencies$1$debugScreenData$1", f = "DebugScreenFeatureDependenciesModule.kt", l = {71}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;
        public final /* synthetic */ mgb0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mgb0 mgb0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = mgb0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object userId = this.b.getUserId(this);
                return userId == y5bVar ? y5bVar : userId;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public o0d(ysm ysmVar, yi5 yi5Var, Context context, y8j y8jVar, mgb0 mgb0Var, fbh0 fbh0Var, v5b v5bVar, u350 u350Var) {
        this.a = ysmVar;
        this.b = yi5Var;
        this.c = context;
        this.d = y8jVar;
        this.e = mgb0Var;
        this.f = fbh0Var;
        this.g = v5bVar;
        this.h = u350Var;
    }

    @Override // defpackage.n0d
    public final void a(Context context, String str) {
        context.getClass();
        ej5.c(this.g, null, null, new p0d(this.h, context, str, null), 3);
    }

    @Override // defpackage.n0d
    public final boolean b(String str) {
        return this.f.e(str);
    }

    @Override // defpackage.n0d
    public final l0d c() {
        soh.c.getClass();
        String str = soh.e;
        ysm ysmVar = this.a;
        String str2 = ysmVar.a().a;
        String str3 = ysmVar.a().b;
        yi5 yi5Var = this.b;
        boolean zF = yi5Var.a().f();
        Context context = this.c;
        String strB = sn5.b(context, R.string.account_manager_account_type, new Object[0]);
        String address = SocketPushManager.getInstance().getAddress();
        address.getClass();
        return new l0d(str, str2, str3, zF, strB, address, SocketPushManager.getInstance().getStatus(), "FullStory SDK excluded from this build", ui8.a(context), yi5Var, (String) dj5.a(e.a, new a(this.e, null)));
    }
}
