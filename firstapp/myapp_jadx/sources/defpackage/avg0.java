package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.session.SessionManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class avg0 implements tt0.b {
    public static final p80 G = p80.d();
    public static final avg0 H = new avg0();
    public o040 A;
    public tt0 B;
    public wu0.b C;
    public String D;
    public String E;
    public final ConcurrentHashMap a;
    public yoh d;
    public rqh e;
    public sph f;
    public n730<pug0> i;
    public nvh v;
    public Context y;
    public bpa z;
    public final ConcurrentLinkedQueue<wb00> b = new ConcurrentLinkedQueue<>();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public boolean F = false;
    public final ThreadPoolExecutor w = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public avg0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(od00 od00Var) {
        if (od00Var.d()) {
            xig0 xig0VarE = od00Var.e();
            long jQ = xig0VarE.q();
            Locale locale = Locale.ENGLISH;
            return tx5.a("trace metric: ", xig0VarE.getName(), " (duration: ", new DecimalFormat("#.####").format(jQ / 1000.0d), "ms)");
        }
        if (od00Var.b()) {
            cox coxVarC = od00Var.c();
            long jR = coxVarC.A() ? coxVarC.r() : 0L;
            String strValueOf = coxVarC.w() ? String.valueOf(coxVarC.m()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return uf80.a(ux5.a("network request trace: ", coxVarC.t(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jR / 1000.0d), "ms)");
        }
        if (!od00Var.a()) {
            return "log";
        }
        pyj pyjVarF = od00Var.f();
        Locale locale3 = Locale.ENGLISH;
        return zk1.a(pyjVarF.j(), ")", zug0.a("gauges (hasMetadata: ", ", cpuGaugeCount: ", ", memoryGaugeCount: ", pyjVarF.k(), pyjVarF.n()));
    }

    public final void b(nd00 nd00Var) {
        if (nd00Var.d()) {
            this.B.b("_fstec");
        } else if (nd00Var.b()) {
            this.B.b("_fsntc");
        }
    }

    public final void c(final xig0 xig0Var, final zu0 zu0Var) {
        this.w.execute(new Runnable() { // from class: vug0
            @Override // java.lang.Runnable
            public final void run() {
                nd00.b bVarJ = nd00.j();
                bVarJ.j(xig0Var);
                this.a.d(bVarJ, zu0Var);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x0308  */
    /* JADX WARN: Code duplicated, block: B:142:0x0342  */
    /* JADX WARN: Code duplicated, block: B:144:0x034c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0367  */
    /* JADX WARN: Code duplicated, block: B:156:0x0382  */
    /* JADX WARN: Code duplicated, block: B:158:0x0388  */
    /* JADX WARN: Code duplicated, block: B:162:0x0394 A[Catch: all -> 0x039c, TRY_LEAVE, TryCatch #4 {, blocks: (B:160:0x0390, B:162:0x0394), top: B:235:0x0390 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:172:0x03da  */
    /* JADX WARN: Code duplicated, block: B:174:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:177:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:179:0x0407  */
    /* JADX WARN: Code duplicated, block: B:183:0x040f  */
    /* JADX WARN: Code duplicated, block: B:185:0x041d  */
    /* JADX WARN: Code duplicated, block: B:190:0x043e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0469  */
    /* JADX WARN: Code duplicated, block: B:202:0x0477  */
    /* JADX WARN: Code duplicated, block: B:204:0x047f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0485  */
    /* JADX WARN: Code duplicated, block: B:207:0x048c  */
    /* JADX WARN: Code duplicated, block: B:209:0x048f  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:216:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:221:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:223:0x0505  */
    /* JADX WARN: Code duplicated, block: B:224:0x051a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0523  */
    /* JADX WARN: Code duplicated, block: B:228:0x0535  */
    /* JADX WARN: Code duplicated, block: B:235:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    public final void d(nd00.b bVar, zu0 zu0Var) {
        o040 o040Var;
        boolean z;
        boolean zB;
        bpa bpaVar;
        qpa qpaVar;
        k2z<Double> k2zVar;
        k2z<Double> k2zVarB;
        mpa mpaVar;
        k2z<Double> k2zVar2;
        k2z<Double> k2zVarB2;
        double dDoubleValue;
        cqa cqaVar;
        double dDoubleValue2;
        p80 p80Var;
        nvh nvhVar;
        p80 p80Var2;
        lug0<nd00> lug0Var;
        pug0 pug0Var;
        String name;
        boolean zStartsWith;
        String str;
        String str2;
        String strA;
        String str3;
        boolean z2 = true;
        if (!this.c.get()) {
            ConcurrentHashMap concurrentHashMap = this.a;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int iIntValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int iIntValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int iIntValue3 = num3.intValue();
            if (bVar.d() && iIntValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            } else if (bVar.b() && iIntValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            } else {
                if (!bVar.a() || iIntValue3 <= 0) {
                    G.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", a(bVar), num, num2, num3);
                    return;
                }
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
            }
            G.b("Transport is not initialized yet, %s will be queued for to be dispatched later", a(bVar));
            this.b.add(new wb00(bVar, zu0Var));
            return;
        }
        p80 p80Var3 = G;
        if (this.z.o() && (!this.C.g() || this.F)) {
            try {
                str3 = (String) Tasks.await(this.f.getId(), RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                p80Var3.c("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                str3 = null;
            } catch (ExecutionException e2) {
                p80Var3.c("Unable to retrieve Installation Id: %s", e2.getMessage());
                str3 = null;
            } catch (TimeoutException e3) {
                p80Var3.c("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                str3 = null;
            }
            if (TextUtils.isEmpty(str3)) {
                p80Var3.f("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            } else {
                this.C.j(str3);
            }
        }
        wu0.b bVarMo13clone = this.C;
        bVarMo13clone.k(zu0Var);
        if (bVar.d() || bVar.b()) {
            bVarMo13clone = bVarMo13clone.mo13clone();
            if (this.e == null && this.c.get()) {
                p80 p80Var4 = rqh.e;
                this.e = (rqh) yoh.c().b(rqh.class);
            }
            rqh rqhVar = this.e;
            bVarMo13clone.h(rqhVar != null ? new HashMap(rqhVar.a) : Collections.EMPTY_MAP);
        }
        bVar.g(bVarMo13clone);
        nd00 nd00VarBuild = bVar.build();
        if (!this.z.o()) {
            G.e("Performance collection is not enabled, dropping %s", a(nd00VarBuild));
        } else if (nd00VarBuild.h().k()) {
            Context context = this.y;
            Pattern pattern = pd00.a;
            ArrayList arrayList = new ArrayList();
            if (nd00VarBuild.d()) {
                arrayList.add(new qqh(nd00VarBuild.e()));
            }
            if (nd00VarBuild.b()) {
                arrayList.add(new nqh(nd00VarBuild.c(), context));
            }
            if (nd00VarBuild.i()) {
                arrayList.add(new jqh(nd00VarBuild.h()));
            }
            if (nd00VarBuild.a()) {
                arrayList.add(new lqh(nd00VarBuild.f()));
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (!((pd00) obj).a()) {
                        }
                    } else {
                        o040 o040Var2 = this.A;
                        o040Var2.getClass();
                        double dDoubleValue3 = 1.0d;
                        if (nd00VarBuild.d()) {
                            bpa bpaVar2 = o040Var2.a;
                            bpaVar2.getClass();
                            synchronized (cqa.class) {
                                cqaVar = cqa.b;
                                if (cqaVar == null) {
                                    cqaVar = new cqa();
                                    cqa.b = cqaVar;
                                }
                            }
                            k2z<Double> k2zVar3 = bpaVar2.a.getDouble("fpr_vc_trace_sampling_rate");
                            if (k2zVar3.b() && bpa.p(k2zVar3.a().doubleValue())) {
                                bpaVar2.c.d(k2zVar3.a().doubleValue(), "com.google.firebase.perf.TraceSamplingRate");
                                dDoubleValue2 = k2zVar3.a().doubleValue();
                            } else {
                                k2z<Double> k2zVarB3 = bpaVar2.b(cqaVar);
                                if (k2zVarB3.b() && bpa.p(k2zVarB3.a().doubleValue())) {
                                    dDoubleValue2 = k2zVarB3.a().doubleValue();
                                } else {
                                    dDoubleValue2 = bpaVar2.a.isLastFetchFailed() ? 0.001d : 1.0d;
                                }
                            }
                            if (o040Var2.b >= dDoubleValue2 && !o040.a(nd00VarBuild.e().r())) {
                                b(nd00VarBuild);
                                G.e("Event dropped due to device sampling - %s", a(nd00VarBuild));
                            } else if (!nd00VarBuild.d() && nd00VarBuild.e().getName().startsWith("_st_") && nd00VarBuild.e().l()) {
                                bpa bpaVar3 = o040Var2.a;
                                bpaVar3.getClass();
                                synchronized (mpa.class) {
                                    mpaVar = mpa.b;
                                    if (mpaVar == null) {
                                        mpaVar = new mpa();
                                        mpa.b = mpaVar;
                                    }
                                }
                                k2z<Double> k2zVarI = bpaVar3.i(mpaVar);
                                if (k2zVarI.b()) {
                                    dDoubleValue = k2zVarI.a().doubleValue() / 100.0d;
                                    if (!bpa.p(dDoubleValue)) {
                                        k2zVar2 = bpaVar3.a.getDouble("fpr_vc_fragment_sampling_rate");
                                        if (k2zVar2.b() || !bpa.p(k2zVar2.a().doubleValue())) {
                                            k2zVarB2 = bpaVar3.b(mpaVar);
                                            if (k2zVarB2.b() || !bpa.p(k2zVarB2.a().doubleValue())) {
                                                dDoubleValue = 0.0d;
                                            } else {
                                                dDoubleValue = k2zVarB2.a().doubleValue();
                                            }
                                        } else {
                                            bpaVar3.c.d(k2zVar2.a().doubleValue(), "com.google.firebase.perf.FragmentSamplingRate");
                                            dDoubleValue = k2zVar2.a().doubleValue();
                                        }
                                    }
                                } else {
                                    k2zVar2 = bpaVar3.a.getDouble("fpr_vc_fragment_sampling_rate");
                                    if (k2zVar2.b()) {
                                        k2zVarB2 = bpaVar3.b(mpaVar);
                                        if (k2zVarB2.b()) {
                                            dDoubleValue = 0.0d;
                                        } else {
                                            dDoubleValue = 0.0d;
                                        }
                                    } else {
                                        k2zVarB2 = bpaVar3.b(mpaVar);
                                        if (k2zVarB2.b()) {
                                            dDoubleValue = 0.0d;
                                        } else {
                                            dDoubleValue = 0.0d;
                                        }
                                    }
                                }
                                if (o040Var2.c >= dDoubleValue && !o040.a(nd00VarBuild.e().r())) {
                                    b(nd00VarBuild);
                                    G.e("Event dropped due to device sampling - %s", a(nd00VarBuild));
                                } else {
                                    if (nd00VarBuild.b()) {
                                        bpaVar = o040Var2.a;
                                        bpaVar.getClass();
                                        synchronized (qpa.class) {
                                            qpaVar = qpa.b;
                                            if (qpaVar == null) {
                                                qpaVar = new qpa();
                                                qpa.b = qpaVar;
                                            }
                                            k2zVar = bpaVar.a.getDouble("fpr_vc_network_request_sampling_rate");
                                            if (k2zVar.b()) {
                                                k2zVarB = bpaVar.b(qpaVar);
                                                if (!k2zVarB.b()) {
                                                    if (bpaVar.a.isLastFetchFailed()) {
                                                        dDoubleValue3 = 0.001d;
                                                    }
                                                } else if (bpaVar.a.isLastFetchFailed()) {
                                                    dDoubleValue3 = 0.001d;
                                                }
                                            } else {
                                                k2zVarB = bpaVar.b(qpaVar);
                                                if (!k2zVarB.b()) {
                                                    if (bpaVar.a.isLastFetchFailed()) {
                                                        dDoubleValue3 = 0.001d;
                                                    }
                                                } else if (bpaVar.a.isLastFetchFailed()) {
                                                    dDoubleValue3 = 0.001d;
                                                }
                                            }
                                            if (o040Var2.b >= dDoubleValue3) {
                                                b(nd00VarBuild);
                                                G.e("Event dropped due to device sampling - %s", a(nd00VarBuild));
                                            }
                                        }
                                    }
                                    o040Var = this.A;
                                    o040Var.getClass();
                                    if (nd00VarBuild.d()) {
                                        if (nd00VarBuild.b()) {
                                            zB = o040Var.e.b();
                                        } else if (nd00VarBuild.d()) {
                                            zB = o040Var.d.b();
                                        } else {
                                            z = true;
                                        }
                                        z = !zB;
                                    } else {
                                        if (nd00VarBuild.b()) {
                                            zB = o040Var.e.b();
                                        } else if (nd00VarBuild.d()) {
                                            zB = o040Var.d.b();
                                        } else {
                                            z = true;
                                        }
                                        z = !zB;
                                    }
                                    if (z) {
                                        b(nd00VarBuild);
                                        G.e("Rate limited (per device) - %s", a(nd00VarBuild));
                                    }
                                }
                            } else {
                                if (nd00VarBuild.b()) {
                                    bpaVar = o040Var2.a;
                                    bpaVar.getClass();
                                    synchronized (qpa.class) {
                                        qpaVar = qpa.b;
                                        if (qpaVar == null) {
                                            qpaVar = new qpa();
                                            qpa.b = qpaVar;
                                        }
                                    }
                                    k2zVar = bpaVar.a.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (k2zVar.b() || !bpa.p(k2zVar.a().doubleValue())) {
                                        k2zVarB = bpaVar.b(qpaVar);
                                        if (!k2zVarB.b() && bpa.p(k2zVarB.a().doubleValue())) {
                                            dDoubleValue3 = k2zVarB.a().doubleValue();
                                        } else if (bpaVar.a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    } else {
                                        bpaVar.c.d(k2zVar.a().doubleValue(), "com.google.firebase.perf.NetworkRequestSamplingRate");
                                        dDoubleValue3 = k2zVar.a().doubleValue();
                                    }
                                    if (o040Var2.b >= dDoubleValue3 && !o040.a(nd00VarBuild.c().n())) {
                                        b(nd00VarBuild);
                                        G.e("Event dropped due to device sampling - %s", a(nd00VarBuild));
                                    }
                                }
                                o040Var = this.A;
                                o040Var.getClass();
                                if ((nd00VarBuild.d() || (!(nd00VarBuild.e().getName().equals("_fs") || nd00VarBuild.e().getName().equals("_bs")) || nd00VarBuild.e().m() <= 0)) && !nd00VarBuild.a()) {
                                    if (nd00VarBuild.b()) {
                                        zB = o040Var.e.b();
                                    } else if (nd00VarBuild.d()) {
                                        zB = o040Var.d.b();
                                    } else {
                                        z = true;
                                    }
                                    z = !zB;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    b(nd00VarBuild);
                                    G.e("Rate limited (per device) - %s", a(nd00VarBuild));
                                }
                            }
                        } else if (!nd00VarBuild.d()) {
                            if (nd00VarBuild.b()) {
                                bpaVar = o040Var2.a;
                                bpaVar.getClass();
                                synchronized (qpa.class) {
                                    qpaVar = qpa.b;
                                    if (qpaVar == null) {
                                        qpaVar = new qpa();
                                        qpa.b = qpaVar;
                                    }
                                    k2zVar = bpaVar.a.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (k2zVar.b()) {
                                        k2zVarB = bpaVar.b(qpaVar);
                                        if (!k2zVarB.b()) {
                                            if (bpaVar.a.isLastFetchFailed()) {
                                                dDoubleValue3 = 0.001d;
                                            }
                                        } else if (bpaVar.a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    } else {
                                        k2zVarB = bpaVar.b(qpaVar);
                                        if (!k2zVarB.b()) {
                                            if (bpaVar.a.isLastFetchFailed()) {
                                                dDoubleValue3 = 0.001d;
                                            }
                                        } else if (bpaVar.a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    }
                                    if (o040Var2.b >= dDoubleValue3) {
                                        b(nd00VarBuild);
                                        G.e("Event dropped due to device sampling - %s", a(nd00VarBuild));
                                    }
                                }
                            }
                            o040Var = this.A;
                            o040Var.getClass();
                            if (nd00VarBuild.d()) {
                                if (nd00VarBuild.b()) {
                                    zB = o040Var.e.b();
                                } else if (nd00VarBuild.d()) {
                                    zB = o040Var.d.b();
                                } else {
                                    z = true;
                                }
                                z = !zB;
                            } else {
                                if (nd00VarBuild.b()) {
                                    zB = o040Var.e.b();
                                } else if (nd00VarBuild.d()) {
                                    zB = o040Var.d.b();
                                } else {
                                    z = true;
                                }
                                z = !zB;
                            }
                            if (z) {
                                b(nd00VarBuild);
                                G.e("Rate limited (per device) - %s", a(nd00VarBuild));
                            }
                        } else {
                            if (nd00VarBuild.b()) {
                                bpaVar = o040Var2.a;
                                bpaVar.getClass();
                                synchronized (qpa.class) {
                                    qpaVar = qpa.b;
                                    if (qpaVar == null) {
                                        qpaVar = new qpa();
                                        qpa.b = qpaVar;
                                    }
                                    k2zVar = bpaVar.a.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (k2zVar.b()) {
                                        k2zVarB = bpaVar.b(qpaVar);
                                        if (!k2zVarB.b()) {
                                            if (bpaVar.a.isLastFetchFailed()) {
                                                dDoubleValue3 = 0.001d;
                                            }
                                        } else if (bpaVar.a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    } else {
                                        k2zVarB = bpaVar.b(qpaVar);
                                        if (!k2zVarB.b()) {
                                            if (bpaVar.a.isLastFetchFailed()) {
                                                dDoubleValue3 = 0.001d;
                                            }
                                        } else if (bpaVar.a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    }
                                    if (o040Var2.b >= dDoubleValue3) {
                                        b(nd00VarBuild);
                                        G.e("Event dropped due to device sampling - %s", a(nd00VarBuild));
                                    }
                                }
                            }
                            o040Var = this.A;
                            o040Var.getClass();
                            if (nd00VarBuild.d()) {
                                if (nd00VarBuild.b()) {
                                    zB = o040Var.e.b();
                                } else if (nd00VarBuild.d()) {
                                    zB = o040Var.d.b();
                                } else {
                                    z = true;
                                }
                                z = !zB;
                            } else {
                                if (nd00VarBuild.b()) {
                                    zB = o040Var.e.b();
                                } else if (nd00VarBuild.d()) {
                                    zB = o040Var.d.b();
                                } else {
                                    z = true;
                                }
                                z = !zB;
                            }
                            if (z) {
                                b(nd00VarBuild);
                                G.e("Rate limited (per device) - %s", a(nd00VarBuild));
                            }
                        }
                    }
                    if (z2) {
                        p80Var = G;
                        if (nd00VarBuild.d()) {
                            String strA2 = a(nd00VarBuild);
                            name = nd00VarBuild.e().getName();
                            zStartsWith = name.startsWith("_st_");
                            str = this.E;
                            str2 = this.D;
                            if (zStartsWith) {
                                strA = lx5.a(qva.a(str, str2), "/troubleshooting/trace/SCREEN_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                            } else {
                                strA = lx5.a(qva.a(str, str2), "/troubleshooting/trace/DURATION_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                            }
                            p80Var.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strA2, strA);
                        } else {
                            p80Var.e("Logging %s", a(nd00VarBuild));
                        }
                        nvhVar = this.v;
                        p80Var2 = nvh.d;
                        if (nvhVar.c == null) {
                            pug0Var = nvhVar.b.get();
                            if (pug0Var != null) {
                                nvhVar.c = pug0Var.a(nvhVar.a, new j4g("proto"), new mvh());
                            } else {
                                p80Var2.f("Flg TransportFactory is not available at the moment");
                            }
                        }
                        lug0Var = nvhVar.c;
                        if (lug0Var != null) {
                            ((rug0) lug0Var).a(new ei1(nd00VarBuild, kw20.a, null), new wtc());
                        } else {
                            p80Var2.f("Unable to dispatch event because Flg Transport is not available");
                        }
                        SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                    }
                }
            }
            p80.d().a("No validators found for PerfMetric.");
            G.g("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", a(nd00VarBuild));
        } else {
            G.g("App Instance ID is null or empty, dropping %s", a(nd00VarBuild));
        }
        z2 = false;
        if (z2) {
            p80Var = G;
            if (nd00VarBuild.d()) {
                String strA3 = a(nd00VarBuild);
                name = nd00VarBuild.e().getName();
                zStartsWith = name.startsWith("_st_");
                str = this.E;
                str2 = this.D;
                if (zStartsWith) {
                    strA = lx5.a(qva.a(str, str2), "/troubleshooting/trace/SCREEN_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                } else {
                    strA = lx5.a(qva.a(str, str2), "/troubleshooting/trace/DURATION_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                }
                p80Var.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strA3, strA);
            } else {
                p80Var.e("Logging %s", a(nd00VarBuild));
            }
            nvhVar = this.v;
            p80Var2 = nvh.d;
            if (nvhVar.c == null) {
                pug0Var = nvhVar.b.get();
                if (pug0Var != null) {
                    nvhVar.c = pug0Var.a(nvhVar.a, new j4g("proto"), new mvh());
                } else {
                    p80Var2.f("Flg TransportFactory is not available at the moment");
                }
            }
            lug0Var = nvhVar.c;
            if (lug0Var != null) {
                ((rug0) lug0Var).a(new ei1(nd00VarBuild, kw20.a, null), new wtc());
            } else {
                p80Var2.f("Unable to dispatch event because Flg Transport is not available");
            }
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    @Override // tt0.b
    public final void onUpdateAppState(zu0 zu0Var) {
        this.F = zu0Var == zu0.FOREGROUND;
        if (this.c.get()) {
            this.w.execute(new Runnable() { // from class: tug0
                @Override // java.lang.Runnable
                public final void run() {
                    avg0 avg0Var = this.a;
                    o040 o040Var = avg0Var.A;
                    boolean z = avg0Var.F;
                    o040Var.d.a(z);
                    o040Var.e.a(z);
                }
            });
        }
    }
}
