package com.google.firebase.perf.session.gauges;

import android.content.Context;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import defpackage.avg0;
import defpackage.bpa;
import defpackage.d16;
import defpackage.k2z;
import defpackage.kyj;
import defpackage.lyj;
import defpackage.m8b;
import defpackage.myj;
import defpackage.nyj;
import defpackage.oyj;
import defpackage.p80;
import defpackage.pyj;
import defpackage.upa;
import defpackage.utr;
import defpackage.uug0;
import defpackage.vpa;
import defpackage.xpa;
import defpackage.xrh0;
import defpackage.ypa;
import defpackage.zlv;
import defpackage.zu0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private zu0 applicationProcessState;
    private final bpa configResolver;
    private final utr<m8b> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final utr<ScheduledExecutorService> gaugeManagerExecutor;
    private oyj gaugeMetadataManager;
    private final utr<zlv> memoryGaugeCollector;
    private String sessionId;
    private final avg0 transportManager;
    private static final p80 logger = p80.d();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new utr(new kyj()), avg0.H, bpa.e(), null, new utr(new lyj()), new utr(new myj()));
    }

    private static void collectGaugeMetricOnce(final m8b m8bVar, final zlv zlvVar, final Timer timer) {
        synchronized (m8bVar) {
            try {
                m8bVar.b.schedule(new Runnable() { // from class: l8b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Timer timer2 = timer;
                        m8b m8bVar2 = m8bVar;
                        n8b n8bVarB = m8bVar2.b(timer2);
                        if (n8bVarB != null) {
                            m8bVar2.a.add(n8bVarB);
                        }
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                m8b.g.f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        synchronized (zlvVar) {
            try {
                zlvVar.a.schedule(new Runnable() { // from class: ylv
                    @Override // java.lang.Runnable
                    public final void run() {
                        Timer timer2 = timer;
                        zlv zlvVar2 = zlvVar;
                        u80 u80VarB = zlvVar2.b(timer2);
                        if (u80VarB != null) {
                            zlvVar2.b.add(u80VarB);
                        }
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                zlv.f.f("Unable to collect Memory Metric: " + e2.getMessage());
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(zu0 zu0Var) {
        vpa vpaVar;
        long jLongValue;
        upa upaVar;
        int iOrdinal = zu0Var.ordinal();
        if (iOrdinal == 1) {
            bpa bpaVar = this.configResolver;
            bpaVar.getClass();
            synchronized (vpa.class) {
                vpaVar = vpa.b;
                if (vpaVar == null) {
                    vpaVar = new vpa();
                    vpa.b = vpaVar;
                }
            }
            k2z<Long> k2zVarJ = bpaVar.j(vpaVar);
            if (k2zVarJ.b() && bpa.n(k2zVarJ.a().longValue())) {
                jLongValue = k2zVarJ.a().longValue();
            } else {
                k2z<Long> k2zVar = bpaVar.a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (k2zVar.b() && bpa.n(k2zVar.a().longValue())) {
                    bpaVar.c.e(k2zVar.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = k2zVar.a().longValue();
                } else {
                    k2z<Long> k2zVarC = bpaVar.c(vpaVar);
                    if (k2zVarC.b() && bpa.n(k2zVarC.a().longValue())) {
                        jLongValue = k2zVarC.a().longValue();
                    } else {
                        jLongValue = bpaVar.a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            bpa bpaVar2 = this.configResolver;
            bpaVar2.getClass();
            synchronized (upa.class) {
                upaVar = upa.b;
                if (upaVar == null) {
                    upaVar = new upa();
                    upa.b = upaVar;
                }
            }
            k2z<Long> k2zVarJ2 = bpaVar2.j(upaVar);
            if (k2zVarJ2.b() && bpa.n(k2zVarJ2.a().longValue())) {
                jLongValue = k2zVarJ2.a().longValue();
            } else {
                k2z<Long> k2zVar2 = bpaVar2.a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (k2zVar2.b() && bpa.n(k2zVar2.a().longValue())) {
                    bpaVar2.c.e(k2zVar2.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = k2zVar2.a().longValue();
                } else {
                    k2z<Long> k2zVarC2 = bpaVar2.c(upaVar);
                    jLongValue = (k2zVarC2.b() && bpa.n(k2zVarC2.a().longValue())) ? k2zVarC2.a().longValue() : 0L;
                }
            }
        }
        p80 p80Var = m8b.g;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    private nyj getGaugeMetadata() {
        nyj.b bVarJ = nyj.j();
        bVarJ.g(xrh0.b((d16.a(5) * this.gaugeMetadataManager.c.totalMem) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
        bVarJ.h(xrh0.b((d16.a(5) * this.gaugeMetadataManager.a.maxMemory()) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
        bVarJ.i(xrh0.b((d16.a(3) * ((long) this.gaugeMetadataManager.b.getMemoryClass())) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
        return bVarJ.build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(zu0 zu0Var) {
        ypa ypaVar;
        long jLongValue;
        xpa xpaVar;
        int iOrdinal = zu0Var.ordinal();
        if (iOrdinal == 1) {
            bpa bpaVar = this.configResolver;
            bpaVar.getClass();
            synchronized (ypa.class) {
                ypaVar = ypa.b;
                if (ypaVar == null) {
                    ypaVar = new ypa();
                    ypa.b = ypaVar;
                }
            }
            k2z<Long> k2zVarJ = bpaVar.j(ypaVar);
            if (k2zVarJ.b() && bpa.n(k2zVarJ.a().longValue())) {
                jLongValue = k2zVarJ.a().longValue();
            } else {
                k2z<Long> k2zVar = bpaVar.a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (k2zVar.b() && bpa.n(k2zVar.a().longValue())) {
                    bpaVar.c.e(k2zVar.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = k2zVar.a().longValue();
                } else {
                    k2z<Long> k2zVarC = bpaVar.c(ypaVar);
                    if (k2zVarC.b() && bpa.n(k2zVarC.a().longValue())) {
                        jLongValue = k2zVarC.a().longValue();
                    } else {
                        jLongValue = bpaVar.a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            bpa bpaVar2 = this.configResolver;
            bpaVar2.getClass();
            synchronized (xpa.class) {
                xpaVar = xpa.b;
                if (xpaVar == null) {
                    xpaVar = new xpa();
                    xpa.b = xpaVar;
                }
            }
            k2z<Long> k2zVarJ2 = bpaVar2.j(xpaVar);
            if (k2zVarJ2.b() && bpa.n(k2zVarJ2.a().longValue())) {
                jLongValue = k2zVarJ2.a().longValue();
            } else {
                k2z<Long> k2zVar2 = bpaVar2.a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (k2zVar2.b() && bpa.n(k2zVar2.a().longValue())) {
                    bpaVar2.c.e(k2zVar2.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = k2zVar2.a().longValue();
                } else {
                    k2z<Long> k2zVarC2 = bpaVar2.c(xpaVar);
                    jLongValue = (k2zVarC2.b() && bpa.n(k2zVarC2.a().longValue())) ? k2zVarC2.a().longValue() : 0L;
                }
            }
        }
        p80 p80Var = zlv.f;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m8b lambda$new$0() {
        return new m8b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zlv lambda$new$1() {
        return new zlv();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        m8b m8bVar = this.cpuGaugeCollector.get();
        long j2 = m8bVar.d;
        if (j2 == INVALID_GAUGE_COLLECTION_FREQUENCY || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = m8bVar.e;
        if (scheduledFuture == null) {
            m8bVar.a(j, timer);
            return true;
        }
        if (m8bVar.f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            m8bVar.e = null;
            m8bVar.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        m8bVar.a(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        zlv zlvVar = this.memoryGaugeCollector.get();
        p80 p80Var = zlv.f;
        if (j <= 0) {
            zlvVar.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = zlvVar.d;
        if (scheduledFuture == null) {
            zlvVar.a(j, timer);
            return true;
        }
        if (zlvVar.e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            zlvVar.d = null;
            zlvVar.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        zlvVar.a(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, zu0 zu0Var) {
        pyj.b bVarP = pyj.p();
        while (!this.cpuGaugeCollector.get().a.isEmpty()) {
            bVarP.h(this.cpuGaugeCollector.get().a.poll());
        }
        while (!this.memoryGaugeCollector.get().b.isEmpty()) {
            bVarP.g(this.memoryGaugeCollector.get().b.poll());
        }
        bVarP.j(str);
        avg0 avg0Var = this.transportManager;
        avg0Var.w.execute(new uug0(avg0Var, bVarP.build(), zu0Var));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new oyj(context);
    }

    public boolean logGaugeMetadata(String str, zu0 zu0Var) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        pyj.b bVarP = pyj.p();
        bVarP.j(str);
        bVarP.i(getGaugeMetadata());
        pyj pyjVarBuild = bVarP.build();
        avg0 avg0Var = this.transportManager;
        avg0Var.w.execute(new uug0(avg0Var, pyjVarBuild, zu0Var));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, final zu0 zu0Var) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(zu0Var, perfSession.b);
        if (jStartCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String str = perfSession.a;
        this.sessionId = str;
        this.applicationProcessState = zu0Var;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: jyj
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$startCollectingGauges$2(str, zu0Var);
                }
            }, j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final zu0 zu0Var = this.applicationProcessState;
        m8b m8bVar = this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = m8bVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            m8bVar.e = null;
            m8bVar.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        zlv zlvVar = this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = zlvVar.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            zlvVar.d = null;
            zlvVar.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: iyj
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$stopCollectingGauges$3(str, zu0Var);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = zu0.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(utr<ScheduledExecutorService> utrVar, avg0 avg0Var, bpa bpaVar, oyj oyjVar, utr<m8b> utrVar2, utr<zlv> utrVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = zu0.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = utrVar;
        this.transportManager = avg0Var;
        this.configResolver = bpaVar;
        this.gaugeMetadataManager = oyjVar;
        this.cpuGaugeCollector = utrVar2;
        this.memoryGaugeCollector = utrVar3;
    }

    private long startCollectingGauges(zu0 zu0Var, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(zu0Var);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(zu0Var);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }
}
