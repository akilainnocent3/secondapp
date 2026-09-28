package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ytf0 implements lit, fjt, wtf0 {
    public final uqm a;
    public final ptf0 b;
    public final j1b c;
    public final d4w d;
    public final hb90 e;
    public final psm f;
    public final wwd0 i;
    public jvd0 v;
    public boolean w;
    public jvd0 y;

    @c0d(c = "com.sportybet.feature.timeAlert.manager.TimeAlertManagerImpl$onLogin$2", f = "TimeAlertManagerImpl.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: ytf0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.timeAlert.manager.TimeAlertManagerImpl$onLogin$2$1", f = "TimeAlertManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1363a extends tje0 implements Function2<ztf0, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ ytf0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1363a(ytf0 ytf0Var, v1b<? super C1363a> v1bVar) {
                super(2, v1bVar);
                this.b = ytf0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1363a c1363a = new C1363a(this.b, v1bVar);
                c1363a.a = obj;
                return c1363a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ztf0 ztf0Var, v1b<? super Unit> v1bVar) {
                return ((C1363a) create(ztf0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                ztf0 ztf0Var = (ztf0) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                Integer num = ztf0Var.a;
                Integer num2 = ztf0Var.a;
                boolean z = ztf0Var.d;
                Integer num3 = ztf0Var.b;
                ytf0 ytf0Var = this.b;
                if (num != null && num3 != null && num3.intValue() >= num.intValue() && z) {
                    jvd0 jvd0Var = ytf0Var.y;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    ytf0Var.e.a.e(o7d.a(wae.REACHED_TIME_ALERT));
                } else if (num2 == null || !z || (num3 != null && num3.intValue() >= num2.intValue() && z)) {
                    jvd0 jvd0Var2 = ytf0Var.y;
                    if (jvd0Var2 != null) {
                        jvd0Var2.cancel((CancellationException) null);
                    }
                } else if (num2 != null && z && ((num3 == null || num3.intValue() < num2.intValue() || !z) && num2 != null)) {
                    int iIntValue = num2.intValue();
                    d4w d4wVar = ytf0Var.d;
                    j1b j1bVar = ytf0Var.c;
                    ytf0Var.y = ej5.c(j1bVar, null, null, new c4w(iIntValue, d4wVar, j1bVar, null), 3);
                }
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ytf0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ytf0 ytf0Var = ytf0.this;
                v340 v340VarE = e1i.e(new n1i(uzh.b(new qtf0(vtf0.b.a(ytf0Var.b.a, vtf0.a[0]).k())), ytf0Var.i, new xtf0(3, null)), ytf0Var.c, q490.a.b, new ztf0(0));
                C1363a c1363a = new C1363a(ytf0Var, null);
                this.a = 1;
                if (kzh.b(v340VarE, c1363a, this) == y5bVar) {
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

    public ytf0(uqm uqmVar, ptf0 ptf0Var, j1b j1bVar, d4w d4wVar, hb90 hb90Var, psm psmVar) {
        uqmVar.getClass();
        psmVar.getClass();
        this.a = uqmVar;
        this.b = ptf0Var;
        this.c = j1bVar;
        this.d = d4wVar;
        this.e = hb90Var;
        this.f = psmVar;
        this.i = xwd0.a(new ztf0(0));
    }

    @Override // defpackage.wtf0
    public final void a() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ztf0.a((ztf0) value, null, null, false, false, 7)));
    }

    @Override // defpackage.wtf0
    public final void b() {
        wwd0 wwd0Var;
        Object value;
        if (!this.w) {
            uqm uqmVar = this.a;
            uqmVar.addLoginEventListener(this);
            uqmVar.addLogoutEventListener(this);
            if (uqmVar.isLogin()) {
                onLogin();
            }
            this.w = true;
        }
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ztf0.a((ztf0) value, null, null, false, true, 7)));
    }

    @Override // defpackage.wtf0
    public final boolean c() {
        return this.f.W();
    }

    @Override // defpackage.lit
    public final void onLogin() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ztf0.a((ztf0) value, null, null, true, false, 11)));
        jvd0 jvd0Var = this.v;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.v = ej5.c(this.c, null, null, new a(null), 3);
    }

    @Override // defpackage.fjt
    public final void p() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ztf0.a((ztf0) value, null, null, false, false, 11)));
        jvd0 jvd0Var = this.y;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        jvd0 jvd0Var2 = this.v;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
    }
}
