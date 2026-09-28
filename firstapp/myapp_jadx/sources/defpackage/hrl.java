package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hrl extends fq0 implements j1k {
    private volatile uc componentManager;
    private final Object componentManagerLock;
    private boolean injected;

    public class a implements aoy {
        public a() {
        }

        @Override // defpackage.aoy
        public final void onContextAvailable(Context context) {
            hrl.this.inject();
        }
    }

    public hrl() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolders() {
        componentManager().c();
    }

    @Override // defpackage.j1k
    public final uc componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.componentManager;
    }

    public uc createComponentManager() {
        return new uc(this);
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.rn8, defpackage.iel
    public r8i0.c getDefaultViewModelProviderFactory() {
        return ejd.a(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((t1k) generatedComponent()).O((r1k) this);
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolders();
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        componentManager().a();
    }

    public hrl(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}
