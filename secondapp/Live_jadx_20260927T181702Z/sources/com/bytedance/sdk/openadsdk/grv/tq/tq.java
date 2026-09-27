package com.bytedance.sdk.openadsdk.grv.tq;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.kub;
import f2.h0;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class tq {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final hv.hww f37200hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final AtomicBoolean f37201hv;
    protected WeakReference<View> hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final Integer f37202ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private volatile boolean f37203rs = false;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected final AtomicBoolean f37204sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected kub f37205tq;
    private final int vgm;
    private final AtomicLong vy;

    public tq(Integer num, View view, kub kubVar, int i10, hv.hww hwwVar) {
        this.f37202ok = num;
        this.vgm = i10;
        this.f37205tq = kubVar;
        this.f37200hu = hwwVar;
        hww(view);
        this.f37204sd = new AtomicBoolean(false);
        this.vy = new AtomicLong(-1L);
        this.f37201hv = new AtomicBoolean(false);
    }

    public static tq hww(boolean z10, Integer num, View view, kub kubVar, hv.hww hwwVar) {
        return z10 ? new ok(num, view, kubVar, hwwVar) : new sd(num, view, kubVar, hwwVar);
    }

    public void ed() {
        this.f37204sd.set(false);
        ok();
    }

    public abstract int hu();

    public hww hv() {
        WeakReference<View> weakReference = this.hww;
        if (weakReference == null) {
            return new hww(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new hww(0, 0, 0.0f) : new hww(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void nod() {
        this.f37203rs = true;
        vgm.tq(this);
    }

    public boolean ny() {
        return this.f37204sd.get();
    }

    public void ok() {
        this.vy.set(-1L);
    }

    public boolean rs() {
        return this.f37201hv.get();
    }

    public abstract boolean sd();

    public int tq() {
        if (rs()) {
            return 1;
        }
        WeakReference<View> weakReference = this.hww;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.f37203rs) {
            return 3;
        }
        if (vhb().equals(view.getTag(h0.f82387t))) {
            return (vhb().equals(view.getTag(h0.f82387t)) && sd()) ? 1 : 2;
        }
        nod();
        hv.tq(vhb());
        return 3;
    }

    public abstract void tq(int i10);

    public void vgm() {
        if (rs()) {
            return;
        }
        if (!this.f37204sd.get()) {
            ok();
        } else if (!this.vy.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.vy.get() >= this.vgm) {
            vy();
        }
    }

    public Integer vhb() {
        return this.f37202ok;
    }

    public void vy() {
        if (this.f37201hv.compareAndSet(false, true)) {
            vy.hww(this.f37205tq, hv(), this.f37200hu);
        }
    }

    public void hww() {
        if (this.f37204sd.compareAndSet(false, true)) {
            vgm.hww(this);
        }
    }

    public void hww(int i10) {
        if (i10 == 4) {
            hww();
            return;
        }
        if (i10 == 8) {
            ed();
        } else if (i10 == 9) {
            vy();
        } else {
            tq(i10);
        }
    }

    public void hww(View view) {
        if (view != null) {
            view.setTag(h0.f82387t, vhb());
        }
        this.hww = new WeakReference<>(view);
    }
}
