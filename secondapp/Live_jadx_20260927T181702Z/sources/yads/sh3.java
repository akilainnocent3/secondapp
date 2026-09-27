package yads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sh3 implements qh3, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f155439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ph3 f155440b;

    public sh3(DisplayManager displayManager) {
        this.f155439a = displayManager;
    }

    public static sh3 a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new sh3(displayManager);
        }
        return null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        ph3 ph3Var = this.f155440b;
        if (ph3Var == null || i10 != 0) {
            return;
        }
        ph3Var.a(this.f155439a.getDisplay(0));
    }

    @Override // yads.qh3
    public final void a(ph3 ph3Var) {
        this.f155440b = ph3Var;
        this.f155439a.registerDisplayListener(this, ib3.a((Handler.Callback) null));
        ph3Var.a(this.f155439a.getDisplay(0));
    }

    @Override // yads.qh3
    public final void a() {
        this.f155439a.unregisterDisplayListener(this);
        this.f155440b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
