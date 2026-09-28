package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ut0 implements tt0.b {
    private final WeakReference<tt0.b> appStateCallback;
    private final tt0 appStateMonitor;
    private zu0 currentAppState;
    private boolean isRegisteredForAppState;

    public ut0(tt0 tt0Var) {
        this.isRegisteredForAppState = false;
        this.currentAppState = zu0.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = tt0Var;
        this.appStateCallback = new WeakReference<>(this);
    }

    public zu0 getAppState() {
        return this.currentAppState;
    }

    public WeakReference<tt0.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.v.addAndGet(i);
    }

    @Override // tt0.b
    public void onUpdateAppState(zu0 zu0Var) {
        zu0 zu0Var2 = this.currentAppState;
        zu0 zu0Var3 = zu0.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (zu0Var2 == zu0Var3) {
            this.currentAppState = zu0Var;
        } else {
            if (zu0Var2 == zu0Var || zu0Var == zu0Var3) {
                return;
            }
            this.currentAppState = zu0.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        tt0 tt0Var = this.appStateMonitor;
        this.currentAppState = tt0Var.C;
        WeakReference<tt0.b> weakReference = this.appStateCallback;
        synchronized (tt0Var.f) {
            tt0Var.f.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            tt0 tt0Var = this.appStateMonitor;
            WeakReference<tt0.b> weakReference = this.appStateCallback;
            synchronized (tt0Var.f) {
                tt0Var.f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }

    public ut0() {
        this(tt0.a());
    }
}
