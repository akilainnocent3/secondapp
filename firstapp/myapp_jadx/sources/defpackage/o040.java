package defpackage;

import android.content.Context;
import com.google.firebase.perf.util.Timer;
import com.google.protobuf.Internal;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class o040 {
    public final bpa a;
    public final double b;
    public final double c;
    public final a d;
    public final a e;

    public static class a {
        public static final long i;
        public n040 b;
        public final n040 e;
        public final n040 f;
        public final long g;
        public final long h;
        public long c = 500;
        public double d = 500.0d;
        public Timer a = new Timer();

        static {
            p80.d();
            i = 1000000L;
        }

        public a(n040 n040Var, ts7 ts7Var, bpa bpaVar, String str) {
            ppa ppaVar;
            long jLongValue;
            opa opaVar;
            long jLongValue2;
            aqa aqaVar;
            bqa bqaVar;
            this.b = n040Var;
            long jK = str == "Trace" ? bpaVar.k() : bpaVar.k();
            if (str == "Trace") {
                synchronized (bqa.class) {
                    bqaVar = bqa.b;
                    if (bqaVar == null) {
                        bqaVar = new bqa();
                        bqa.b = bqaVar;
                    }
                }
                k2z<Long> k2zVar = bpaVar.a.getLong("fpr_rl_trace_event_count_fg");
                if (k2zVar.b() && bpa.l(k2zVar.a().longValue())) {
                    bpaVar.c.e(k2zVar.a().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                    jLongValue = k2zVar.a().longValue();
                } else {
                    k2z<Long> k2zVarC = bpaVar.c(bqaVar);
                    jLongValue = (k2zVarC.b() && bpa.l(k2zVarC.a().longValue())) ? k2zVarC.a().longValue() : 300L;
                }
            } else {
                synchronized (ppa.class) {
                    ppaVar = ppa.b;
                    if (ppaVar == null) {
                        ppaVar = new ppa();
                        ppa.b = ppaVar;
                    }
                }
                k2z<Long> k2zVar2 = bpaVar.a.getLong("fpr_rl_network_event_count_fg");
                if (k2zVar2.b() && bpa.l(k2zVar2.a().longValue())) {
                    bpaVar.c.e(k2zVar2.a().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    jLongValue = k2zVar2.a().longValue();
                } else {
                    k2z<Long> k2zVarC2 = bpaVar.c(ppaVar);
                    jLongValue = (k2zVarC2.b() && bpa.l(k2zVarC2.a().longValue())) ? k2zVarC2.a().longValue() : 700L;
                }
            }
            long j = jLongValue;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.e = new n040(j, jK, timeUnit);
            this.g = j;
            long jK2 = str == "Trace" ? bpaVar.k() : bpaVar.k();
            if (str == "Trace") {
                synchronized (aqa.class) {
                    aqaVar = aqa.b;
                    if (aqaVar == null) {
                        aqaVar = new aqa();
                        aqa.b = aqaVar;
                    }
                }
                k2z<Long> k2zVar3 = bpaVar.a.getLong("fpr_rl_trace_event_count_bg");
                if (k2zVar3.b() && bpa.l(k2zVar3.a().longValue())) {
                    bpaVar.c.e(k2zVar3.a().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                    jLongValue2 = k2zVar3.a().longValue();
                } else {
                    k2z<Long> k2zVarC3 = bpaVar.c(aqaVar);
                    jLongValue2 = (k2zVarC3.b() && bpa.l(k2zVarC3.a().longValue())) ? k2zVarC3.a().longValue() : 30L;
                }
            } else {
                synchronized (opa.class) {
                    opaVar = opa.b;
                    if (opaVar == null) {
                        opaVar = new opa();
                        opa.b = opaVar;
                    }
                }
                k2z<Long> k2zVar4 = bpaVar.a.getLong("fpr_rl_network_event_count_bg");
                if (k2zVar4.b() && bpa.l(k2zVar4.a().longValue())) {
                    bpaVar.c.e(k2zVar4.a().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                    jLongValue2 = k2zVar4.a().longValue();
                } else {
                    k2z<Long> k2zVarC4 = bpaVar.c(opaVar);
                    jLongValue2 = (k2zVarC4.b() && bpa.l(k2zVarC4.a().longValue())) ? k2zVarC4.a().longValue() : 70L;
                }
            }
            long j2 = jLongValue2;
            this.f = new n040(j2, jK2, timeUnit);
            this.h = j2;
        }

        public final synchronized void a(boolean z) {
            try {
                this.b = z ? this.e : this.f;
                this.c = z ? this.g : this.h;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005a A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:9:0x002a, B:14:0x004f, B:16:0x005a, B:19:0x006b, B:21:0x0073, B:10:0x0032, B:11:0x003a, B:12:0x003d, B:13:0x0046), top: B:29:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0073 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:9:0x002a, B:14:0x004f, B:16:0x005a, B:19:0x006b, B:21:0x0073, B:10:0x0032, B:11:0x003a, B:12:0x003d, B:13:0x0046), top: B:29:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0078, please report this as an issue */
        public final synchronized boolean b() {
            double d;
            double d2;
            double seconds;
            double d3;
            double d4;
            try {
                Timer timer = new Timer();
                Timer timer2 = this.a;
                timer2.getClass();
                double d5 = timer.b - timer2.b;
                n040 n040Var = this.b;
                long j = n040Var.a;
                long j2 = n040Var.b;
                int[] iArr = n040.a.a;
                TimeUnit timeUnit = n040Var.c;
                int i2 = iArr[timeUnit.ordinal()];
                if (i2 == 1) {
                    d = j / j2;
                    d2 = 1.0E9d;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            seconds = j / timeUnit.toSeconds(j2);
                        } else {
                            d = j / j2;
                            d2 = 1000.0d;
                        }
                        d3 = (d5 * seconds) / i;
                        if (d3 > 0.0d) {
                            this.d = Math.min(this.d + d3, this.c);
                            this.a = timer;
                        }
                        d4 = this.d;
                        if (d4 >= 1.0d) {
                            return false;
                        }
                        this.d = d4 - 1.0d;
                        return true;
                    }
                    d = j / j2;
                    d2 = 1000000.0d;
                }
                seconds = d * d2;
                d3 = (d5 * seconds) / i;
                if (d3 > 0.0d) {
                    this.d = Math.min(this.d + d3, this.c);
                    this.a = timer;
                }
                d4 = this.d;
                if (d4 >= 1.0d) {
                    return false;
                }
                this.d = d4 - 1.0d;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o040(Context context, n040 n040Var) {
        ts7 ts7Var = new ts7();
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        bpa bpaVarE = bpa.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            hb5.a("Sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            hb5.a("Fragment sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        this.b = dNextDouble;
        this.c = dNextDouble2;
        this.a = bpaVarE;
        this.d = new a(n040Var, ts7Var, bpaVarE, "Trace");
        this.e = new a(n040Var, ts7Var, bpaVarE, "Network");
        xrh0.a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Internal.ProtobufList protobufList) {
        return protobufList.size() > 0 && ((qd00) protobufList.get(0)).j() > 0 && ((qd00) protobufList.get(0)).i() == dh80.GAUGES_AND_SYSTEM_EVENTS;
    }
}
