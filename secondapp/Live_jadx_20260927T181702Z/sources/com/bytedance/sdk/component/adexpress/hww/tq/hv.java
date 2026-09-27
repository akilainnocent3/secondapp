package com.bytedance.sdk.component.adexpress.hww.tq;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.hnv;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv extends sd {
    private static File hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile hv f34432tq;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private AtomicBoolean f34436sd = new AtomicBoolean(true);
    private AtomicBoolean vy = new AtomicBoolean(false);

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34434hv = false;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private AtomicBoolean f34433hu = new AtomicBoolean(false);
    private AtomicInteger vgm = new AtomicInteger(0);

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private AtomicLong f34435ok = new AtomicLong();

    private hv() {
        nod();
    }

    private void nod() {
        com.bytedance.sdk.component.adexpress.vy.vy.tq(new com.bytedance.sdk.component.ok.ok("init") { // from class: com.bytedance.sdk.component.adexpress.hww.tq.hv.1
            @Override // java.lang.Runnable
            public void run() {
                ok.hww();
                hv.this.f34436sd.set(false);
                hv.this.vy();
                hv.this.vgm();
                if (com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd() == null || !hnv.hww(com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().tq()) || com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().vy();
            }
        }, 10);
    }

    public static File ok() {
        if (hww == null) {
            try {
                File file = new File(new File(vy.hww(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                hww = file;
            } catch (Throwable unused) {
            }
        }
        return hww;
    }

    public static hv tq() {
        if (f34432tq == null) {
            synchronized (hv.class) {
                try {
                    if (f34432tq == null) {
                        f34432tq = new hv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34432tq;
    }

    private void vhb() {
        if (this.vgm.getAndSet(0) <= 0 || System.currentTimeMillis() - this.f34435ok.get() <= 600000) {
            return;
        }
        vgm();
    }

    public com.bytedance.sdk.component.adexpress.hww.sd.hww hu() {
        return ok.tq();
    }

    public boolean hv() {
        return this.f34434hv;
    }

    public void rs() {
        this.f34433hu.set(true);
        this.f34434hv = false;
        this.vy.set(false);
    }

    public void sd() {
        nod();
    }

    public void vgm() {
        hww(false);
    }

    public void vy() {
        com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVarTq = ok.tq();
        if (hwwVarTq == null || !hwwVarTq.ok()) {
            return;
        }
        boolean zHww = hww(hwwVarTq);
        if (!zHww) {
            ok.vy();
        }
        this.f34434hv = zHww;
    }

    public boolean hww(com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVar) {
        if (hwwVar == null) {
            return false;
        }
        return hww(hwwVar.hww()) || hww(hwwVar.hv()) || hww(hwwVar.hu());
    }

    @Override // com.bytedance.sdk.component.adexpress.hww.tq.sd
    public File hww() {
        return ok();
    }

    public void hww(boolean z10) {
        List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> listHww;
        boolean z11;
        if (this.f34436sd.get()) {
            return;
        }
        try {
            if (this.vy.get()) {
                if (z10) {
                    this.vgm.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z12 = true;
            this.vy.set(true);
            com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVarHv = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().hv();
            com.bytedance.sdk.component.adexpress.hww.sd.hww hwwVarTq = ok.tq();
            if (hwwVarHv != null && hwwVarHv.ok()) {
                if (!ok.tq(hwwVarHv)) {
                    this.vy.set(false);
                    this.f34435ok.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd() != null) {
                    com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().sd().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hww.tq.hv.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.hv.hv.hww().tq();
                        }
                    });
                }
                ok.hww(hwwVarHv);
                boolean zHww = (hwwVarHv.hv() == null || TextUtils.isEmpty(hwwVarHv.hv().hww())) ? false : hww(hwwVarHv.hv().hww());
                if (hwwVarHv.hww().size() != 0) {
                    listHww = hww(hwwVarHv, hwwVarTq);
                    z11 = listHww != null;
                } else {
                    listHww = null;
                    z11 = zHww;
                }
                if (!zHww) {
                    List<com.bytedance.sdk.component.adexpress.hww.sd.hww.C0319hww> listTq = tq(hwwVarHv, hwwVarTq);
                    if (listHww == null || listTq == null) {
                        listHww = listTq;
                    } else {
                        listHww.addAll(listTq);
                    }
                    if (listTq == null) {
                        z12 = false;
                    }
                    if (listTq == null) {
                        this.vy.set(false);
                    }
                    z11 = z12;
                }
                if (z11 && hww(hwwVarHv)) {
                    ok.hww(hwwVarHv);
                    ok.sd();
                    tq(listHww);
                }
                vy();
                this.vy.set(false);
                this.f34435ok.set(System.currentTimeMillis());
                vhb();
                return;
            }
            this.vy.set(false);
            hww(109);
        } catch (Throwable unused) {
        }
    }

    public void tq(boolean z10) {
        this.f34433hu.set(z10);
    }
}
