package com.bytedance.sdk.component.hu.hww;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private static ok f34560ed;
    private static volatile com.bytedance.sdk.component.hu.hww.hv.hww nod;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.hu.hww.vy.tq.hww f34561hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.hu.hww.vy.tq.hww f34562hv;
    private volatile Context hww;
    private final AtomicBoolean khx = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private volatile Map<Integer, com.bytedance.sdk.component.hu.hww.tq.sd> f34563ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private volatile boolean f34564ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private volatile hv f34565rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.hu.hww.vy.tq.hww f34566sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.hu.hww.vy.tq.hww f34567tq;
    private volatile com.bytedance.sdk.component.hu.hww.hww.hv vgm;
    private volatile com.bytedance.sdk.component.hu.hww.tq.sd vhb;
    private volatile com.bytedance.sdk.component.hu.hww.vy.tq.hww vy;
    private long weu;

    private ok() {
    }

    public static com.bytedance.sdk.component.hu.hww.hv.hww hv() {
        if (nod == null) {
            synchronized (ok.class) {
                try {
                    if (nod == null) {
                        nod = new com.bytedance.sdk.component.hu.hww.hv.tq();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return nod;
    }

    public static synchronized ok vgm() {
        try {
            if (f34560ed == null) {
                f34560ed = new ok();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f34560ed;
    }

    public long bs() {
        return this.weu * 86400000;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww ed() {
        return this.f34566sd;
    }

    public Context hu() {
        return this.hww;
    }

    public boolean hww() {
        return this.khx.get();
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww khx() {
        return this.vy;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww nod() {
        return this.f34561hu;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww ny() {
        return this.f34567tq;
    }

    public com.bytedance.sdk.component.hu.hww.tq.sd ok() {
        return this.vhb;
    }

    public void rs() {
        com.bytedance.sdk.component.hu.hww.tq.vy.hww.tq();
    }

    public Map<Integer, com.bytedance.sdk.component.hu.hww.tq.sd> sd() {
        return this.f34563ny;
    }

    public boolean tq() {
        return this.f34564ok;
    }

    public void vhb() {
        com.bytedance.sdk.component.hu.hww.tq.vy.hww.sd();
    }

    public com.bytedance.sdk.component.hu.hww.hww.hv vy() {
        return this.vgm;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww weu() {
        return this.f34562hv;
    }

    public hv wgt() {
        return this.f34565rs;
    }

    public void hww(boolean z10) {
        this.khx.set(z10);
    }

    public void sd(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        this.f34566sd = hwwVar;
    }

    public void tq(boolean z10) {
        this.f34564ok = z10;
    }

    public void vy(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        this.vy = hwwVar;
    }

    public void hww(com.bytedance.sdk.component.hu.hww.hww.hv hvVar) {
        this.vgm = hvVar;
    }

    public void tq(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        this.f34567tq = hwwVar;
    }

    public void hww(Context context) {
        this.hww = context;
    }

    public void hww(com.bytedance.sdk.component.hu.hww.tq.sd sdVar) {
        this.vhb = sdVar;
    }

    public void hww(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        this.f34561hu = hwwVar;
    }

    public void hv(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        this.f34562hv = hwwVar;
    }

    public void hww(com.bytedance.sdk.component.hu.hww.vy.hww hwwVar) {
        if (hwwVar == null) {
            return;
        }
        hwwVar.hww(System.currentTimeMillis());
        com.bytedance.sdk.component.hu.hww.tq.vy.hww.hww(hwwVar, hwwVar.vy());
    }

    public void hww(String str, boolean z10) {
        com.bytedance.sdk.component.hu.hww.hu.hww.hww().hww(str, z10);
    }

    public void hww(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.hu.hww.hu.hww.hww().hww(str, list, z10, map, i10, str2);
    }

    public void hww(hv hvVar) {
        this.f34565rs = hvVar;
    }

    public void hww(long j10) {
        this.weu = j10;
    }
}
