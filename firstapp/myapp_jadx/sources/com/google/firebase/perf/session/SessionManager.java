package com.google.firebase.perf.session;

import android.content.Context;
import com.google.firebase.perf.session.gauges.GaugeManager;
import defpackage.hf80;
import defpackage.tt0;
import defpackage.ut0;
import defpackage.zu0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class SessionManager extends ut0 {
    private static final SessionManager instance = new SessionManager();
    private final tt0 appStateMonitor;
    private final Set<WeakReference<hf80>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.g(UUID.randomUUID().toString()), tt0.a());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.c) {
            this.gaugeManager.logGaugeMetadata(perfSession.a, zu0.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(zu0 zu0Var) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.c) {
            this.gaugeManager.logGaugeMetadata(perfSession.a, zu0Var);
        }
    }

    private void startOrStopCollectingGauges(zu0 zu0Var) {
        PerfSession perfSession = this.perfSession;
        boolean z = perfSession.c;
        GaugeManager gaugeManager = this.gaugeManager;
        if (z) {
            gaugeManager.startCollectingGauges(perfSession, zu0Var);
        } else {
            gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        zu0 zu0Var = zu0.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(zu0Var);
        startOrStopCollectingGauges(zu0Var);
    }

    @Override // defpackage.ut0, tt0.b
    public void onUpdateAppState(zu0 zu0Var) {
        super.onUpdateAppState(zu0Var);
        if (this.appStateMonitor.E) {
            return;
        }
        if (zu0Var == zu0.FOREGROUND) {
            updatePerfSession(PerfSession.g(UUID.randomUUID().toString()));
        } else if (this.perfSession.h()) {
            updatePerfSession(PerfSession.g(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(zu0Var);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<hf80> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final PerfSession perfSession = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: sg80
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$setApplicationContext$0(context, perfSession);
            }
        });
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.h()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<hf80> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.a == this.perfSession.a) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<hf80>> it = this.clients.iterator();
                while (it.hasNext()) {
                    hf80 hf80Var = it.next().get();
                    if (hf80Var != null) {
                        hf80Var.a(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.C);
        startOrStopCollectingGauges(this.appStateMonitor.C);
    }

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, tt0 tt0Var) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = tt0Var;
        registerForAppState();
    }
}
