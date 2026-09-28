package defpackage;

import android.accounts.Account;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ksy implements i8 {
    public final uqm a;
    public final yqm b;
    public final dsy c;
    public final v5b d;
    public final wwd0 e;
    public final v340 f;
    public final Object i;
    public final AtomicLong v;
    public final wwd0 w;
    public final wwd0 y;

    @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentCoordinator$1", f = "OneUpExperimentCoordinator.kt", l = {62}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: ksy$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0782a extends pf implements gaj<ex, c, v1b<? super b>, Object> {
            public static final C0782a v = new C0782a(3, b.class, "<init>", "<init>(Lcom/sporty/android/core/antest/domain/AnTestAccountCacheState;Lcom/sportybet/plugin/realsports/oneuppromo/experiment/OneUpExperimentCoordinator$SessionBarrier;)V", 4);

            @Override // defpackage.gaj
            public final Object invoke(ex exVar, c cVar, v1b<? super b> v1bVar) {
                return new b(exVar, cVar);
            }
        }

        public static final /* synthetic */ class b extends saj implements Function2<b, v1b<? super Unit>, Object> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b bVar, v1b<? super Unit> v1bVar) {
                return ((ksy) this.receiver).f(bVar, v1bVar);
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ksy.this.new a(v1bVar);
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
                ksy ksyVar = ksy.this;
                n1i n1iVar = new n1i(ksyVar.b.e(), ksyVar.y, C0782a.v);
                b bVar = new b(2, ksyVar, ksy.class, "participateIfReady", "participateIfReady(Lcom/sportybet/plugin/realsports/oneuppromo/experiment/OneUpExperimentCoordinator$ReadySession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                this.a = 1;
                if (kzh.b(n1iVar, bVar, this) == y5bVar) {
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

    public static final class b {
        public final ex a;
        public final c b;

        public b(ex exVar, c cVar) {
            exVar.getClass();
            this.a = exVar;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            c cVar = this.b;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public final String toString() {
            return "ReadySession(cacheState=" + this.a + ", barrier=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c {
        public final String a;
        public final m9p b;

        public c(String str, m9p m9pVar) {
            this.a = str;
            this.b = m9pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return QQWMbKFOuTf.KnrnJKvv + this.a + ", clearJob=" + this.b + ")";
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentCoordinator", f = "OneUpExperimentCoordinator.kt", l = {104, 109, 115}, m = "participateIfReady", v = 2)
    public static final class d extends x1b {
        public b a;
        public c b;
        public String c;
        public ksy d;
        public c e;
        public String f;
        public /* synthetic */ Object i;
        public int w;

        public d(v1b<? super d> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            return ksy.this.f(null, this);
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentCoordinator$participateIfReady$result$1", f = "OneUpExperimentCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<lk50<? extends rsy>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(2, v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends rsy> lk50Var, v1b<? super Boolean> v1bVar) {
            return ((e) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!Intrinsics.g(lk50Var, lk50.b.a));
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentCoordinator$resetSession$1$clearJob$1", f = "OneUpExperimentCoordinator.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ksy.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                dsy dsyVar = ksy.this.c;
                this.a = 1;
                if (dsyVar.a(this) == y5bVar) {
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

    public ksy(uqm uqmVar, yqm yqmVar, dsy dsyVar, @ApplicationScope v5b v5bVar) {
        uqmVar.getClass();
        yqmVar.getClass();
        dsyVar.getClass();
        v5bVar.getClass();
        this.a = uqmVar;
        this.b = yqmVar;
        this.c = dsyVar;
        this.d = v5bVar;
        wwd0 wwd0VarA = xwd0.a(new qsy(0));
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        this.i = new Object();
        this.v = new AtomicLong(0L);
        this.w = xwd0.a(new osy(new psy(0L, null), true));
        this.y = xwd0.a(null);
        uqmVar.addAccountChangeListener(this);
        Account account = uqmVar.getAccount();
        g(account, account == null);
        ej5.c(v5bVar, null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(psy psyVar, x1b x1bVar) {
        lsy lsyVar;
        qsy qsyVar;
        if (x1bVar instanceof lsy) {
            lsyVar = (lsy) x1bVar;
            int i = lsyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lsyVar.d = i - Integer.MIN_VALUE;
            } else {
                lsyVar = new lsy(this, x1bVar);
            }
        } else {
            lsyVar = new lsy(this, x1bVar);
        }
        Object objB = lsyVar.b;
        y5b y5bVar = y5b.a;
        int i2 = lsyVar.d;
        Object obj = null;
        if (i2 == 0) {
            uj50.b(objB);
            wwd0 wwd0Var = this.w;
            msy msyVar = new msy(psyVar, null);
            lsyVar.a = psyVar;
            lsyVar.d = 1;
            objB = s0i.b(wwd0Var, msyVar, lsyVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            psyVar = lsyVar.a;
            uj50.b(objB);
        }
        osy osyVar = (osy) objB;
        synchronized (this.i) {
            try {
                Object value = this.e.getValue();
                if (osyVar.a.equals(psyVar) && Intrinsics.g(this.w.getValue(), osyVar)) {
                    obj = value;
                }
                qsyVar = (qsy) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qsyVar;
    }

    public final psy b() {
        return ((osy) this.w.getValue()).a;
    }

    public final boolean c(qsy qsyVar) {
        boolean z;
        String str;
        qsyVar.getClass();
        synchronized (this.i) {
            try {
                Long l = qsyVar.d;
                z = false;
                if (l != null) {
                    long jLongValue = l.longValue();
                    Account account = this.a.getAccount();
                    if (account != null && (str = account.name) != null) {
                        ex value = this.b.e().getValue();
                        if (qsyVar.b && Intrinsics.g(this.e.getValue(), qsyVar) && value.a == jLongValue && Intrinsics.g(value.b, str)) {
                            c cVar = (c) this.y.getValue();
                            if (Intrinsics.g(cVar != null ? cVar.a : null, str)) {
                                z = true;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean d(c cVar, String str) {
        boolean zE;
        synchronized (this.i) {
            zE = e(cVar, str);
        }
        return zE;
    }

    public final boolean e(c cVar, String str) {
        c cVar2 = (c) this.y.getValue();
        if ((cVar2 != null ? cVar2.b : null) != cVar.b || !Intrinsics.g(cVar2.a, str)) {
            return false;
        }
        Account account = this.a.getAccount();
        return Intrinsics.g(account != null ? account.name : null, str);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9 A[Catch: all -> 0x0114, TRY_LEAVE, TryCatch #0 {, blocks: (B:59:0x00f3, B:61:0x00f9), top: B:72:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(b bVar, v1b<? super Unit> v1bVar) {
        d dVar;
        String str;
        b bVar2;
        String str2;
        c cVar;
        b bVar3;
        String str3;
        b bVar4;
        c cVar2;
        lk50 lk50Var;
        ksy ksyVar;
        c cVar3;
        qsy qsyVar;
        if (v1bVar instanceof d) {
            dVar = (d) v1bVar;
            int i = dVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.w = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(v1bVar);
            }
        } else {
            dVar = new d(v1bVar);
        }
        d dVar2 = dVar;
        Object objB = dVar2.i;
        y5b y5bVar = y5b.a;
        int i2 = dVar2.w;
        if (i2 == 0) {
            uj50.b(objB);
            c cVar4 = bVar.b;
            if (cVar4 == null) {
                return Unit.a;
            }
            if (!Intrinsics.g(bVar.a.b, cVar4.a)) {
                return Unit.a;
            }
            Account account = this.a.getAccount();
            if (account == null || (str = account.name) == null) {
                return Unit.a;
            }
            if (!str.equals(bVar.a.b)) {
                return Unit.a;
            }
            m9p m9pVar = cVar4.b;
            dVar2.a = bVar;
            dVar2.b = cVar4;
            dVar2.c = str;
            dVar2.w = 1;
            if (m9pVar.join(dVar2) != y5bVar) {
                bVar2 = bVar;
                str2 = str;
                cVar = cVar4;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            str2 = dVar2.c;
            cVar = dVar2.b;
            bVar2 = dVar2.a;
            uj50.b(objB);
        } else {
            if (i2 == 2) {
                str2 = dVar2.c;
                cVar = dVar2.b;
                bVar3 = dVar2.a;
                uj50.b(objB);
                str3 = str2;
                bVar4 = bVar3;
                cVar2 = cVar;
                lk50Var = (lk50) objB;
                if (!d(cVar2, str3)) {
                    return Unit.a;
                }
                long j = bVar4.a.a;
                dVar2.a = null;
                dVar2.b = null;
                dVar2.c = null;
                dVar2.d = this;
                dVar2.e = cVar2;
                dVar2.f = str3;
                dVar2.w = 3;
                objB = h(lk50Var, cVar2, str3, j, dVar2);
                if (objB != y5bVar) {
                    ksyVar = this;
                    cVar3 = cVar2;
                }
                return y5bVar;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = dVar2.f;
            cVar3 = dVar2.e;
            ksy ksyVar2 = dVar2.d;
            uj50.b(objB);
            str3 = str4;
            ksyVar = ksyVar2;
        }
        qsyVar = (qsy) objB;
        synchronized (ksyVar.i) {
            if (ksyVar.e(cVar3, str3)) {
                ksyVar.e.setValue(qsyVar);
                wwd0 wwd0Var = ksyVar.w;
                osy osyVar = new osy(((osy) wwd0Var.getValue()).a, true);
                wwd0Var.getClass();
                wwd0Var.k(null, osyVar);
            }
        }
        return Unit.a;
        if (!d(cVar, str2)) {
            return Unit.a;
        }
        yzh yzhVarJ = this.b.j(z76.s);
        e eVar = new e(2, null);
        dVar2.a = bVar2;
        dVar2.b = cVar;
        dVar2.c = str2;
        dVar2.w = 2;
        objB = s0i.b(yzhVarJ, eVar, dVar2);
        if (objB != y5bVar) {
            bVar3 = bVar2;
            str3 = str2;
            bVar4 = bVar3;
            cVar2 = cVar;
            lk50Var = (lk50) objB;
            if (!d(cVar2, str3)) {
                return Unit.a;
            }
            long j2 = bVar4.a.a;
            dVar2.a = null;
            dVar2.b = null;
            dVar2.c = null;
            dVar2.d = this;
            dVar2.e = cVar2;
            dVar2.f = str3;
            dVar2.w = 3;
            objB = h(lk50Var, cVar2, str3, j2, dVar2);
            if (objB != y5bVar) {
                ksyVar = this;
                cVar3 = cVar2;
                qsyVar = (qsy) objB;
                synchronized (ksyVar.i) {
                    if (ksyVar.e(cVar3, str3)) {
                        ksyVar.e.setValue(qsyVar);
                        wwd0 wwd0Var2 = ksyVar.w;
                        osy osyVar2 = new osy(((osy) wwd0Var2.getValue()).a, true);
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, osyVar2);
                    }
                    return Unit.a;
                }
            }
        }
        return y5bVar;
    }

    public final void g(Account account, boolean z) {
        m9p m9pVarA;
        synchronized (this.i) {
            try {
                wwd0 wwd0Var = this.e;
                qsy qsyVar = new qsy(0);
                wwd0Var.getClass();
                wwd0Var.k(null, qsyVar);
                wwd0 wwd0Var2 = this.w;
                osy osyVar = new osy(new psy(this.v.incrementAndGet(), account != null ? account.name : null), account == null);
                wwd0Var2.getClass();
                wwd0Var2.k(null, osyVar);
                if (z) {
                    m9pVarA = ej5.c(this.d, null, null, new f(null), 3);
                } else {
                    m9pVarA = i9p.a();
                    m9pVarA.R(Unit.a);
                }
                wwd0 wwd0Var3 = this.y;
                c cVar = new c(account != null ? account.name : null, m9pVarA);
                wwd0Var3.getClass();
                wwd0Var3.k(null, cVar);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(lk50 lk50Var, c cVar, String str, long j, x1b x1bVar) {
        nsy nsyVar;
        x66<rsy> x66Var;
        String str2;
        c cVar2;
        String str3;
        long j2;
        Object objA;
        Object objL;
        c cVar3;
        lk50 lk50Var2;
        String str4;
        long j3;
        long j4;
        lk50 lk50Var3;
        lk50 lk50Var4 = lk50Var;
        if (x1bVar instanceof nsy) {
            nsyVar = (nsy) x1bVar;
            int i = nsyVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsyVar.w = i - Integer.MIN_VALUE;
            } else {
                nsyVar = new nsy(this, x1bVar);
            }
        } else {
            nsyVar = new nsy(this, x1bVar);
        }
        Object objH = nsyVar.i;
        y5b y5bVar = y5b.a;
        int i2 = nsyVar.w;
        yqm yqmVar = this.b;
        if (i2 == 0) {
            uj50.b(objH);
            if (!(lk50Var4 instanceof lk50.c)) {
                return new qsy(0);
            }
            x66Var = z76.s;
            str2 = x66Var.a;
            lyh lyhVarD = yqmVar.d(x66Var);
            nsyVar.a = lk50Var4;
            cVar2 = cVar;
            nsyVar.b = cVar2;
            str3 = str;
            nsyVar.c = str3;
            nsyVar.d = x66Var;
            nsyVar.e = str2;
            j2 = j;
            nsyVar.f = j2;
            nsyVar.w = 1;
            objA = s0i.a(lyhVarD, nsyVar);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            long j5 = nsyVar.f;
            String str5 = nsyVar.e;
            x66Var = nsyVar.d;
            String str6 = nsyVar.c;
            c cVar4 = nsyVar.b;
            lk50 lk50Var5 = nsyVar.a;
            uj50.b(objH);
            str2 = str5;
            lk50Var4 = lk50Var5;
            objA = objH;
            str3 = str6;
            cVar2 = cVar4;
            j2 = j5;
        } else {
            if (i2 == 2) {
                j3 = nsyVar.f;
                String str7 = nsyVar.e;
                String str8 = nsyVar.c;
                c cVar5 = nsyVar.b;
                lk50Var2 = nsyVar.a;
                uj50.b(objH);
                str2 = str7;
                str4 = str8;
                objL = objH;
                cVar3 = cVar5;
                boolean zBooleanValue = ((Boolean) objL).booleanValue();
                if (d(cVar3, str4) || !zBooleanValue) {
                    return new qsy(0);
                }
                nsyVar.a = lk50Var2;
                nsyVar.b = cVar3;
                nsyVar.c = str4;
                nsyVar.d = null;
                nsyVar.e = null;
                nsyVar.f = j3;
                nsyVar.w = 3;
                objH = yqmVar.h(str2, nsyVar);
                if (objH != y5bVar) {
                    j4 = j3;
                    lk50Var3 = lk50Var2;
                }
                return y5bVar;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = nsyVar.f;
            str4 = nsyVar.c;
            cVar3 = nsyVar.b;
            lk50Var3 = nsyVar.a;
            uj50.b(objH);
        }
        boolean zBooleanValue2 = ((Boolean) objH).booleanValue();
        if (d(cVar3, str4)) {
            return new qsy((rsy) ((lk50.c) lk50Var3).a, true, zBooleanValue2 ? esy.b : esy.a, new Long(j4));
        }
        return new qsy(0);
        rsy rsyVar = (rsy) objA;
        if (rsyVar != null) {
            return !d(cVar2, str3) ? new qsy(0) : new qsy(rsyVar, true, esy.c, new Long(j2));
        }
        nsyVar.a = lk50Var4;
        nsyVar.b = cVar2;
        nsyVar.c = str3;
        nsyVar.d = null;
        nsyVar.e = str2;
        nsyVar.f = j2;
        nsyVar.w = 2;
        objL = yqmVar.l(x66Var, nsyVar);
        if (objL != y5bVar) {
            cVar3 = cVar2;
            long j6 = j2;
            lk50Var2 = lk50Var4;
            str4 = str3;
            j3 = j6;
            boolean zBooleanValue3 = ((Boolean) objL).booleanValue();
            if (d(cVar3, str4)) {
            }
            return new qsy(0);
        }
        return y5bVar;
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        g(account, true);
    }
}
