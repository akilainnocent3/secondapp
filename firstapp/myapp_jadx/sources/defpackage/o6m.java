package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o6m extends fq0 implements j1k {
    public volatile uc a;
    public final Object b = new Object();
    public boolean c = false;

    public o6m() {
        addOnContextAvailableListener(new n6m(this));
    }

    @Override // defpackage.j1k
    public final uc componentManager() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new uc(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.rn8, defpackage.iel
    public final r8i0.c getDefaultViewModelProviderFactory() {
        return ejd.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        componentManager().c();
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        componentManager().a();
    }
}
