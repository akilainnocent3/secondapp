package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class zp6 implements wp6 {
    public final cg a;
    public final dq6 b;
    public final j1b c;
    public List<CashoutMetricsPayload.Metric> d;
    public List<CashoutMetricsPayload.Metric> e;
    public boolean f;
    public long g;
    public jvd0 h;
    public long i;

    @c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutMetricsManagerImpl$endMetricsLoggingCycle$2", f = "CashoutMetricsManagerImpl.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = zp6.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            zp6 zp6Var = zp6.this;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    zi50.a aVar = zi50.b;
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_CASHOUT_METRICS);
                    aVar2.g("Metrics to send:\n".concat(vp6.a(zp6Var.d)), new Object[0]);
                    dq6 dq6Var = zp6Var.b;
                    CashoutMetricsPayload cashoutMetricsPayload = new CashoutMetricsPayload(zp6Var.d);
                    this.b = null;
                    this.a = 1;
                    aVar2.q(MyLog.TAG_CASHOUT_METRICS);
                    aVar2.g("Cashout event post", new Object[0]);
                    if (dq6Var.e.get().a(cashoutMetricsPayload, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                bVar = Unit.a;
                zi50.a aVar3 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar4 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar5 = itf0.a;
                aVar5.q(MyLog.TAG_CASHOUT_METRICS);
                aVar5.p(thA, "Post cashout metrics failed with exception.", new Object[0]);
            }
            if (!(bVar instanceof zi50.b)) {
                itf0.a aVar6 = itf0.a;
                aVar6.q(MyLog.TAG_CASHOUT_METRICS);
                aVar6.g("Send metrics successfully.", new Object[0]);
                zp6Var.d = m2g.a;
                zp6Var.i = System.currentTimeMillis();
            }
            return Unit.a;
        }
    }

    public zp6(cg cgVar, dq6 dq6Var, j1b j1bVar, qqe0 qqe0Var) {
        this.a = cgVar;
        this.b = dq6Var;
        this.c = j1bVar;
        m2g m2gVar = m2g.a;
        this.d = m2gVar;
        this.e = m2gVar;
    }

    @Override // defpackage.wp6
    public final jvd0 a() {
        return ej5.c(this.c, null, null, new aq6(this, null), 3);
    }

    @Override // defpackage.wp6
    public final void b(String str, String str2, String str3, boolean z) {
        int i;
        str.getClass();
        str3.getClass();
        itf0.a aVar = itf0.a;
        StringBuilder sbA = ce7.a(aVar, MyLog.TAG_CASHOUT_METRICS, "Adding metric: betId=", str, ", metricsType=");
        hxa.c(sbA, str2, ", metricsInfo=", str3, ", forceNewEntry=");
        sbA.append(z);
        aVar.g(sbA.toString(), new Object[0]);
        if (this.g == 0 || !this.f) {
            aVar.q(MyLog.TAG_CASHOUT_METRICS);
            aVar.g("Cashout metrics disabled, abort add metric process. (cashoutMetricsDuration=" + this.g + ", shouldSendCashoutMetrics=" + this.f + ")", new Object[0]);
            return;
        }
        List<CashoutMetricsPayload.Metric> list = this.e;
        psm psmVar = this.a.a;
        if (!StringsKt.U(str) && !StringsKt.U(str2)) {
            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
            CashoutMetricsPayload.Metric metric = null;
            if (list != null) {
                ListIterator<CashoutMetricsPayload.Metric> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    CashoutMetricsPayload.Metric metricPrevious = listIterator.previous();
                    if (Intrinsics.g(metricPrevious.getKeyValueMap().getBetId(), str)) {
                        metric = metricPrevious;
                        break;
                    }
                }
                metric = metric;
            }
            if (metric == null) {
                arrayList.add(CashoutMetricsPayload.Metric.INSTANCE.newMetric(str, str2, str3, psmVar.getCountryCode(), "1.82.2", System.currentTimeMillis()));
                list = arrayList;
            } else {
                int iIndexOf = list.indexOf(metric);
                if (z || !Intrinsics.g(metric.getKeyValueMap().getType(), str2)) {
                    CashoutMetricsPayload.Metric metric2 = metric;
                    arrayList.set(iIndexOf, CashoutMetricsPayload.Metric.copy$default(metric2, null, null, CashoutMetricsPayload.Metric.KeyValueMap.copy$default(metric2.getKeyValueMap(), null, null, 0L, Long.valueOf(System.currentTimeMillis()), null, null, null, null, 247, null), 3, null));
                    i = 0;
                    arrayList.add(CashoutMetricsPayload.Metric.INSTANCE.newMetric(str, str2, str3, psmVar.getCountryCode(), "1.82.2", System.currentTimeMillis()));
                    list = arrayList;
                } else {
                    arrayList.set(iIndexOf, CashoutMetricsPayload.Metric.copy$default(metric, null, null, CashoutMetricsPayload.Metric.KeyValueMap.copy$default(metric.getKeyValueMap(), null, null, 0L, null, null, null, null, str3, 127, null), 3, null));
                    i = 0;
                    list = arrayList;
                }
            }
            this.e = list;
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_CASHOUT_METRICS);
            aVar2.g("Metric added, metrics after adding:\n".concat(vp6.a(this.e)), new Object[i]);
        }
        if (list == null) {
            list = m2g.a;
        }
        i = 0;
        this.e = list;
        itf0.a aVar3 = itf0.a;
        aVar3.q(MyLog.TAG_CASHOUT_METRICS);
        aVar3.g("Metric added, metrics after adding:\n".concat(vp6.a(this.e)), new Object[i]);
    }

    @Override // defpackage.wp6
    public final void c(String str) {
        str.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT_METRICS);
        aVar.g("Deleting metrics with betId=".concat(str), new Object[0]);
        ArrayList arrayListC0 = CollectionsKt.C0(this.e);
        final xp6 xp6Var = new xp6(str, 0);
        arrayListC0.removeIf(new Predicate() { // from class: yp6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) xp6Var.invoke(obj)).booleanValue();
            }
        });
        this.e = arrayListC0;
        aVar.q(MyLog.TAG_CASHOUT_METRICS);
        aVar.g("Metric deleted, metrics after deleting:\n".concat(vp6.a(this.e)), new Object[0]);
    }

    @Override // defpackage.wp6
    public final synchronized c9p d(boolean z) {
        jvd0 jvd0Var;
        try {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_METRICS);
            aVar.g("Called endMetricsLoggingCycle(forceSendRemainMetrics=" + z + ")", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.i;
            boolean z2 = j < this.g && !z;
            List<CashoutMetricsPayload.Metric> list = this.d;
            List<CashoutMetricsPayload.Metric> list2 = this.e;
            ArrayList arrayList = new ArrayList(l48.r(list2, 10));
            for (CashoutMetricsPayload.Metric metricCopy$default : list2) {
                if (metricCopy$default.getKeyValueMap().getEndTime() == null) {
                    metricCopy$default = CashoutMetricsPayload.Metric.copy$default(metricCopy$default, null, null, CashoutMetricsPayload.Metric.KeyValueMap.copy$default(metricCopy$default.getKeyValueMap(), null, null, 0L, Long.valueOf(jCurrentTimeMillis), null, null, null, null, 247, null), 3, null);
                }
                arrayList.add(metricCopy$default);
            }
            ArrayList arrayListI0 = CollectionsKt.i0(arrayList, list);
            this.d = arrayListI0;
            this.e = m2g.a;
            if (!arrayListI0.isEmpty()) {
                if (!(this.g == 0 || !this.f) && !z2 && ((jvd0Var = this.h) == null || !jvd0Var.isActive())) {
                    jvd0 jvd0VarC = ej5.c(this.c, null, null, new a(null), 3);
                    this.h = jvd0VarC;
                    return jvd0VarC;
                }
            }
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_CASHOUT_METRICS);
            aVar2.g("Skip metrics posting, unsendMetricsCount=" + this.e.size() + ", cashoutMetricsDuration=" + this.g + ", lastPostDuration=" + j + ", shouldSendCashoutMetrics=" + this.f + ", postMetricsJob=" + this.h, new Object[0]);
            return this.h;
        } catch (Throwable th) {
            throw th;
        }
    }
}
