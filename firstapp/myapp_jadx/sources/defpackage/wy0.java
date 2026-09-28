package defpackage;

import com.appsflyer.internal.y;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class wy0 implements uy0, fjt, yoy {
    public final pr10 a;
    public final uqm b;
    public final psm c;
    public final k5b d;
    public final wwd0 e;

    @c0d(c = "com.sporty.android.core.data.repository.assets.AssetsInfoRepositoryImpl$getAssetsInfo$1", f = "AssetsInfoRepositoryImpl.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super AssetsInfo>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return wy0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super AssetsInfo> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Exception {
            Object value;
            wy0 wy0Var = wy0.this;
            psm psmVar = wy0Var.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            String str = null;
            if (i == 0) {
                uj50.b(obj);
                if (!wy0Var.b.isLogin()) {
                    wwd0 wwd0Var = wy0Var.e;
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, lk50.b.a));
                    y.a("This operation is not allowed for users who are not logged in.");
                    return null;
                }
                boolean zR = psmVar.r();
                String strB = psmVar.B();
                pr10 pr10Var = wy0Var.a;
                if (zR && strB.length() > 0) {
                    str = strB;
                }
                this.a = 1;
                obj = pr10Var.b(str, this);
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
            return (AssetsInfo) n52.b((BaseResponse) obj);
        }
    }

    public wy0(pr10 pr10Var, uqm uqmVar, psm psmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        pr10Var.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        this.a = pr10Var;
        this.b = uqmVar;
        this.c = psmVar;
        this.d = k5bVar;
        uqmVar.addLogoutEventListener(this);
        uqmVar.setOnRefreshAssetListener(this);
        this.e = xwd0.a(lk50.b.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.uy0
    public final Object a(x1b x1bVar) {
        yy0 yy0Var;
        if (x1bVar instanceof yy0) {
            yy0Var = (yy0) x1bVar;
            int i = yy0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yy0Var.c = i - Integer.MIN_VALUE;
            } else {
                yy0Var = new yy0(this, x1bVar);
            }
        } else {
            yy0Var = new yy0(this, x1bVar);
        }
        Object obj = yy0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = yy0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            lyh<lk50<AssetsInfo>> lyhVarH = h(pu0.c.a);
            yy0Var.c = 1;
            if (s0i.c(lyhVarH, yy0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uy0
    public final AssetsInfo c() {
        lk50 lk50Var = (lk50) this.e.getValue();
        if (lk50Var instanceof lk50.c) {
            return (AssetsInfo) ((lk50.c) lk50Var).a;
        }
        return null;
    }

    @Override // defpackage.uy0
    public final void d(Long l) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bm50.l((lk50) value, new vy0(l, 0))));
    }

    @Override // defpackage.yoy
    public final void e() {
        g();
    }

    @Override // defpackage.uy0
    public final Object f(tje0 tje0Var) {
        return ej5.d(this.d, new xy0(this, null), tje0Var);
    }

    @Override // defpackage.uy0
    public final void g() {
        kzh.d(h(pu0.c.a), w5b.a(this.d));
    }

    @Override // defpackage.uy0
    public final lyh<lk50<AssetsInfo>> h(pu0 pu0Var) {
        pu0Var.getClass();
        return ozh.c(su0.a(this.e, pu0Var, new a(null)), this.d);
    }

    @Override // defpackage.fjt
    public final void p() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.g("AssetsRepo: clearUserCachedData()", new Object[0]);
        try {
            this.e.setValue(lk50.b.a);
        } catch (Exception e) {
            itf0.a.b(e);
        }
    }
}
