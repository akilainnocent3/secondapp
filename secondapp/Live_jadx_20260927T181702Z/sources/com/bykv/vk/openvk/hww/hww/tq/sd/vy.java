package com.bykv.vk.openvk.hww.hww.tq.sd;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.component.utils.mw;
import com.bytedance.sdk.component.utils.omn;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalKey;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vy implements com.bykv.vk.openvk.hww.hww.hww.hww, sd.hu, sd.hv, sd.hww, sd.InterfaceC0292sd, sd.tq, sd.vgm, sd.vy, mw.hww {
    private static final SparseIntArray hww = new SparseIntArray();
    private ArrayList<Runnable> aeg;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private boolean f31627ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private SurfaceHolder f31628hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private SurfaceTexture f31629hv;
    private boolean kub;
    private volatile boolean npz;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private boolean f31632ny;

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    private boolean f31634qm;
    private volatile boolean syb;
    private mw wgt;
    private boolean zvy;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final boolean f31638tq = false;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final List<WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww>> f31637sd = new CopyOnWriteArrayList();
    private final hww vy = new hww();
    private int vgm = 0;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f31633ok = 3;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private boolean f31636rs = false;
    private volatile sd nod = null;
    private boolean vhb = false;
    private volatile int khx = 201;
    private long weu = -1;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private boolean f31626bs = false;
    private long jpb = 0;
    private long mrs = Long.MIN_VALUE;
    private long omn = 0;
    private long hnv = 0;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private long f31630kv = 0;
    private int grv = 0;
    private String aed = "0";

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    private com.bykv.vk.openvk.hww.hww.hww.sd.sd f31631mw = null;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    private boolean f31640za = false;
    private CountDownLatch blh = new CountDownLatch(1);
    private volatile int oxu = 200;
    private AtomicBoolean hwp = new AtomicBoolean(false);

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    private Surface f31639yt = null;
    private long rpd = 0;

    /* JADX INFO: renamed from: qt, reason: collision with root package name */
    private long f31635qt = 0;
    private boolean wdz = false;
    private final Runnable gvr = new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.1
        @Override // java.lang.Runnable
        public void run() {
            if (vy.this.nod == null) {
                return;
            }
            long jJpb = vy.this.jpb();
            if (jJpb > 0 && vy.this.hu() && vy.this.mrs != Long.MIN_VALUE) {
                try {
                    if (vy.this.mrs == jJpb) {
                        if (!vy.this.f31626bs && vy.this.omn >= 400) {
                            vy.this.tq(701, 800);
                            vy.this.f31626bs = true;
                        }
                        vy.this.omn += (long) vy.this.oxu;
                    } else {
                        if (vy.this.f31626bs) {
                            vy.this.jpb += vy.this.omn;
                            vy.this.tq(702, 800);
                            long unused = vy.this.jpb;
                            int unused2 = vy.this.vgm;
                        }
                        vy.this.omn = 0L;
                        vy.this.f31626bs = false;
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
            if (vy.this.bs() > 0) {
                if (vy.this.mrs != jJpb) {
                    if (com.bykv.vk.openvk.hww.hww.hww.sd.hv()) {
                        long unused3 = vy.this.mrs;
                    }
                    vy vyVar = vy.this;
                    vyVar.hww(jJpb, vyVar.bs());
                }
                vy.this.mrs = jJpb;
            }
            if (vy.this.tq()) {
                vy vyVar2 = vy.this;
                vyVar2.hww(vyVar2.bs(), vy.this.bs());
            } else if (vy.this.wgt != null) {
                vy.this.wgt.postDelayed(this, vy.this.oxu);
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww implements Runnable {

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private boolean f31647sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private long f31648tq;

        public hww() {
        }

        public void hww(boolean z10) {
            this.f31647sd = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (vy.this.nod != null) {
                try {
                    if (!this.f31647sd) {
                        long jNod = vy.this.nod.nod();
                        vy.this.weu = Math.max(this.f31648tq, jNod);
                    }
                    long unused = vy.this.weu;
                } catch (Throwable th2) {
                    th2.toString();
                }
            }
            if (vy.this.wgt != null) {
                vy.this.wgt.sendEmptyMessageDelayed(100, 0L);
            }
        }

        public void hww(long j10) {
            this.f31648tq = j10;
        }
    }

    public vy() {
        hww("SSMediaPlayerWrapper");
    }

    private void aed() {
        SparseIntArray sparseIntArray = hww;
        sparseIntArray.put(this.grv, sparseIntArray.get(this.grv) + 1);
    }

    private void aeg() {
        if (this.nod == null) {
            return;
        }
        try {
            this.nod.ed();
        } catch (Throwable unused) {
        }
        this.nod.hww((sd.tq) null);
        this.nod.hww((sd.vgm) null);
        this.nod.hww((sd.hww) null);
        this.nod.hww((sd.vy) null);
        this.nod.hww((sd.InterfaceC0292sd) null);
        this.nod.hww((sd.hv) null);
        this.nod.hww((sd.hu) null);
        try {
            this.nod.ny();
        } catch (Throwable unused2) {
        }
    }

    private void blh() {
        ArrayList<Runnable> arrayList = this.aeg;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        za();
    }

    private void grv() {
        mw mwVar = this.wgt;
        if (mwVar == null || mwVar.getLooper() == null) {
            return;
        }
        try {
            this.wgt.post(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.6
                @Override // java.lang.Runnable
                public void run() {
                    if (vy.this.wgt == null || vy.this.wgt.getLooper() == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.component.ok.hww.hww.hww().hww(vy.this.wgt);
                        vy.this.wgt = null;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void hnv() {
        this.jpb = 0L;
        this.vgm = 0;
        this.omn = 0L;
        this.f31626bs = false;
        this.mrs = Long.MIN_VALUE;
    }

    private boolean hww(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    private void kub() {
        tq(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.14
            @Override // java.lang.Runnable
            public void run() {
                if (vy.this.wgt != null) {
                    vy.this.wgt.sendEmptyMessage(104);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kv() {
        mw mwVar = this.wgt;
        if (mwVar != null) {
            mwVar.post(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.10
                @Override // java.lang.Runnable
                public void run() {
                    if (vy.this.nod == null) {
                        try {
                            vy.this.nod = new tq();
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                        if (vy.this.nod == null) {
                            return;
                        }
                        sd unused = vy.this.nod;
                        vy.this.aed = "0";
                        vy.this.nod.hww((sd.hv) vy.this);
                        vy.this.nod.hww((sd.tq) vy.this);
                        vy.this.nod.hww((sd.InterfaceC0292sd) vy.this);
                        vy.this.nod.hww((sd.hww) vy.this);
                        vy.this.nod.hww((sd.hu) vy.this);
                        vy.this.nod.hww((sd.vy) vy.this);
                        vy.this.nod.hww((sd.vgm) vy.this);
                        try {
                            vy.this.nod.sd(false);
                        } catch (Throwable unused2) {
                        }
                        vy.this.vhb = false;
                    }
                }
            });
        }
    }

    private void mw() {
        mw mwVar = this.wgt;
        if (mwVar != null) {
            mwVar.post(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        vy.this.nod.ok();
                        vy.this.khx = 207;
                        vy.this.syb = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void oxu() {
        ArrayList<Runnable> arrayList = this.aeg;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.aeg.clear();
    }

    private void za() {
        if (this.f31632ny) {
            return;
        }
        this.f31632ny = true;
        Iterator it = new ArrayList(this.aeg).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.aeg.clear();
        this.f31632ny = false;
    }

    private void zvy() {
        this.npz = true;
        this.f31636rs = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f31630kv;
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hww(this, jElapsedRealtime);
            }
        }
    }

    public long bs() {
        long j10 = this.hnv;
        if (j10 != 0) {
            return j10;
        }
        if (this.khx == 206 || this.khx == 207) {
            try {
                this.hnv = this.nod.vhb();
            } catch (Throwable unused) {
            }
        }
        return this.hnv;
    }

    public boolean ed() {
        return this.khx == 205;
    }

    public long jpb() {
        if (ok()) {
            return 0L;
        }
        if (this.khx == 206 || this.khx == 207) {
            try {
                return this.nod.nod();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public boolean khx() {
        return this.f31634qm;
    }

    public SurfaceHolder mrs() {
        return this.f31628hu;
    }

    public void ny() {
        if (ok()) {
            return;
        }
        this.f31627ed = true;
        oxu();
        mw mwVar = this.wgt;
        if (mwVar != null) {
            try {
                mwVar.removeCallbacksAndMessages(null);
                if (this.nod != null) {
                    this.wgt.sendEmptyMessage(103);
                }
                grv();
            } catch (Throwable unused) {
                grv();
            }
        }
    }

    public SurfaceTexture omn() {
        return this.f31629hv;
    }

    public long weu() {
        if (this.f31626bs) {
            long j10 = this.omn;
            if (j10 > 0) {
                return this.jpb + j10;
            }
        }
        return this.jpb;
    }

    public int wgt() {
        return this.vgm;
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww
    public boolean hu() {
        mw mwVar;
        return (this.khx == 206 || ((mwVar = this.wgt) != null && mwVar.hasMessages(100))) && !this.syb;
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww
    public int hv() {
        if (this.nod == null || ok()) {
            return 0;
        }
        return this.nod.weu();
    }

    public void nod() {
        if (ok() || this.wgt == null) {
            return;
        }
        this.hwp.set(true);
        this.wgt.post(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.11
            @Override // java.lang.Runnable
            public void run() {
                if (!vy.this.vgm() || vy.this.nod == null) {
                    return;
                }
                try {
                    vy.this.nod.hu();
                    for (WeakReference weakReference : vy.this.f31637sd) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww) weakReference.get()).hv(vy.this);
                        }
                    }
                    vy.this.khx = 206;
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww
    public boolean ok() {
        return this.f31627ed;
    }

    public void rs() {
        if (ok() || this.nod == null) {
            return;
        }
        this.hwp.set(true);
        if (this.khx != 206) {
            hnv();
            this.syb = false;
            this.vy.hww(true);
            tq(0L);
            mw mwVar = this.wgt;
            if (mwVar != null) {
                mwVar.removeCallbacks(this.gvr);
                this.wgt.postDelayed(this.gvr, this.oxu);
            }
        }
        this.blh.countDown();
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww
    public boolean vgm() {
        mw mwVar;
        return ((this.khx != 207 && !this.syb) || (mwVar = this.wgt) == null || mwVar.hasMessages(100)) ? false : true;
    }

    public void vhb() {
        mw mwVar;
        if (ok() || (mwVar = this.wgt) == null) {
            return;
        }
        mwVar.removeMessages(100);
        this.syb = true;
        if (this.wdz) {
            if (!this.f31636rs && !tq(this.f31631mw)) {
                hww(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (vy.this.wgt != null) {
                            vy.this.wgt.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            mw mwVar2 = this.wgt;
            if (mwVar2 != null) {
                mwVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.kub && !tq(this.f31631mw)) {
            hww(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.12
                @Override // java.lang.Runnable
                public void run() {
                    if (vy.this.wgt != null) {
                        vy.this.wgt.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        mw mwVar3 = this.wgt;
        if (mwVar3 != null) {
            mwVar3.sendEmptyMessage(101);
        }
    }

    private void tq(long j10) {
        this.vy.hww(j10);
        if (this.zvy) {
            tq(this.vy);
        } else if (tq(this.f31631mw)) {
            tq(this.vy);
        } else {
            hww(this.vy);
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww
    public boolean sd() {
        return ed() || hu() || vgm();
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww
    public int vy() {
        if (this.nod == null || ok()) {
            return 0;
        }
        return this.nod.khx();
    }

    private void sd(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) throws Throwable {
        sdVar.wgt();
        this.nod.hww(sdVar);
        sdVar.wgt();
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd.hu
    public void sd(sd sdVar) {
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hww((com.bykv.vk.openvk.hww.hww.hww.hww) this, true);
            }
        }
    }

    private boolean tq(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) {
        return sdVar != null && sdVar.vgm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(long j10, long j11) {
        long j12;
        long j13;
        if (!this.npz) {
            zvy();
        }
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference == null || weakReference.get() == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                weakReference.get().hww(this, j12, j13);
            }
            j10 = j12;
            j11 = j13;
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww
    public boolean tq() {
        return this.khx == 209;
    }

    private void tq(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar, File file) {
        try {
            String strHww = com.bykv.vk.openvk.hww.hww.hww.vgm.hww.hww(file);
            if (sdVar.bs().equals(strHww)) {
                hww(file);
                return;
            }
            JSONObject jSONObjectSd = sdVar.sd();
            boolean zTq = sdVar.tq();
            if (jSONObjectSd != null) {
                jSONObjectSd.put("file_hash", sdVar.bs());
                jSONObjectSd.put("file_real_hash", strHww);
                jSONObjectSd.put("is_change_play_type", zTq ? 1 : 0);
                jSONObjectSd.put("error_real_code", 309);
                jSONObjectSd.put("error_real_msg", "md5_not_match");
            }
            if (zTq) {
                boolean zDelete = file.delete();
                if (jSONObjectSd != null) {
                    jSONObjectSd.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    sd(sdVar);
                    return;
                }
            }
            hww(file);
        } catch (Throwable unused) {
        }
    }

    private void hww(String str) {
        this.grv = 0;
        this.wgt = com.bytedance.sdk.component.ok.hww.hww.hww().hww(this, "csj_".concat(String.valueOf(str)));
        this.wdz = true;
        kv();
    }

    public void hww(final boolean z10) {
        if (ok()) {
            return;
        }
        this.zvy = z10;
        if (this.nod != null) {
            this.nod.hww(z10);
            return;
        }
        mw mwVar = this.wgt;
        if (mwVar != null) {
            mwVar.post(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.9
                @Override // java.lang.Runnable
                public void run() {
                    if (vy.this.nod != null) {
                        vy.this.nod.hww(z10);
                    }
                }
            });
        }
    }

    private void tq(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.nod.hww(fileInputStream.getFD());
        fileInputStream.close();
    }

    public void hww(boolean z10, long j10, boolean z11) {
        if (ok()) {
            return;
        }
        kv();
        this.f31640za = z11;
        this.hwp.set(true);
        this.syb = false;
        tq(z11);
        if (z10) {
            this.weu = j10;
            kub();
        } else {
            tq(j10);
        }
        mw mwVar = this.wgt;
        if (mwVar != null) {
            mwVar.removeCallbacks(this.gvr);
            this.wgt.postDelayed(this.gvr, this.oxu);
        }
        this.blh.countDown();
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd.vy
    public boolean tq(sd sdVar, int i10, int i11) {
        if (this.nod != sdVar) {
            return false;
        }
        if (i11 == -1004) {
            com.bykv.vk.openvk.hww.hww.hww.sd.hww hwwVar = new com.bykv.vk.openvk.hww.hww.hww.sd.hww(i10, i11);
            for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().hww(this, hwwVar);
                }
            }
        }
        tq(i10, i11);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tq(int i10, int i11) {
        if (i10 == 701) {
            this.rpd = SystemClock.elapsedRealtime();
            this.vgm++;
            for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().hww(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i10 == 702) {
            if (this.rpd > 0) {
                this.f31635qt += SystemClock.elapsedRealtime() - this.rpd;
                this.rpd = 0L;
            }
            for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference2 : this.f31637sd) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().hww((com.bykv.vk.openvk.hww.hww.hww.hww) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.wdz && i10 == 3) {
            blh();
            zvy();
            tq(this.f31640za);
        } else if (i10 == 805) {
            this.f31634qm = true;
        }
    }

    public void hww(final long j10) {
        if (ok()) {
            return;
        }
        if (this.khx == 207 || this.khx == 206 || this.khx == 209) {
            tq(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.2
                @Override // java.lang.Runnable
                public void run() {
                    if (vy.this.wgt != null) {
                        vy.this.wgt.obtainMessage(106, Long.valueOf(j10)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.hww.hww
    public boolean hww() {
        return this.f31636rs;
    }

    public void hww(final SurfaceTexture surfaceTexture) {
        if (ok()) {
            return;
        }
        this.f31629hv = surfaceTexture;
        hww(true);
        tq(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.3
            @Override // java.lang.Runnable
            public void run() {
                vy.this.kv();
                if (vy.this.wgt != null) {
                    vy.this.wgt.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void hww(final SurfaceHolder surfaceHolder) {
        if (ok()) {
            return;
        }
        this.f31628hu = surfaceHolder;
        hww(true);
        tq(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.4
            @Override // java.lang.Runnable
            public void run() {
                vy.this.kv();
                if (vy.this.wgt != null) {
                    vy.this.wgt.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void hww(final com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) {
        if (ok()) {
            return;
        }
        this.f31631mw = sdVar;
        if (sdVar != null) {
            this.wdz = this.wdz && !sdVar.vgm();
        }
        tq(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.5
            @Override // java.lang.Runnable
            public void run() {
                vy.this.kv();
                if (vy.this.wgt != null) {
                    vy.this.wgt.obtainMessage(SignalKey.EVENT_ID, sdVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd.hv
    public void tq(sd sdVar) {
        if (ok()) {
            return;
        }
        this.khx = 205;
        try {
            com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar2 = this.f31631mw;
            if (sdVar2 != null) {
                float fWeu = sdVar2.weu();
                if (fWeu > 0.0f) {
                    com.bykv.vk.openvk.hww.hww.hww.tq tqVar = new com.bykv.vk.openvk.hww.hww.hww.tq();
                    tqVar.hww(fWeu);
                    this.nod.hww(tqVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.wgt != null) {
            if (this.syb) {
                mw();
            } else {
                mw mwVar = this.wgt;
                mwVar.sendMessage(mwVar.obtainMessage(100, -1, -1));
            }
        }
        hww.delete(this.grv);
        boolean z10 = this.wdz;
        boolean z11 = this.kub;
        if (!z10 && !z11) {
            zvy();
            this.kub = true;
        }
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().tq(this);
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.mw.hww
    public void hww(Message message) {
        int i10 = this.khx;
        int i11 = message.what;
        if (this.nod != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.khx == 205 || this.khx == 207 || this.khx == 209) {
                            this.nod.hu();
                            this.f31630kv = SystemClock.elapsedRealtime();
                            this.khx = 206;
                            if (this.weu > 0) {
                                this.nod.hww(this.weu, this.f31633ok);
                                this.weu = -1L;
                            }
                            if (this.f31631mw != null) {
                                tq(this.f31640za);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.f31626bs) {
                            this.jpb += this.omn;
                        }
                        this.f31626bs = false;
                        this.omn = 0L;
                        this.mrs = Long.MIN_VALUE;
                        if (this.khx == 206 || this.khx == 207 || this.khx == 209) {
                            this.nod.ok();
                            this.khx = 207;
                            this.syb = false;
                            for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().vy(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.nod.ed();
                        this.khx = 201;
                        return;
                    case 103:
                        try {
                            aeg();
                            break;
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference2 : this.f31637sd) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().sd(this);
                            }
                        }
                        this.khx = 203;
                        return;
                    case 104:
                        if (this.khx == 202 || this.khx == 208) {
                            this.nod.rs();
                            return;
                        }
                        break;
                    case 105:
                        if (this.khx == 205 || this.khx == 206 || this.khx == 208 || this.khx == 207 || this.khx == 209) {
                            this.nod.vgm();
                            this.khx = Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        break;
                    case 106:
                        if (this.khx == 206 || this.khx == 207 || this.khx == 209) {
                            this.nod.hww(((Long) message.obj).longValue(), this.f31633ok);
                            return;
                        }
                        break;
                    case SignalKey.EVENT_ID /* 107 */:
                        hnv();
                        if (this.khx == 201 || this.khx == 203) {
                            com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar = (com.bykv.vk.openvk.hww.hww.hww.sd.sd) message.obj;
                            if (TextUtils.isEmpty(sdVar.hv())) {
                                sdVar.hww(com.bykv.vk.openvk.hww.hww.hww.sd.tq());
                            }
                            if (sdVar.grv()) {
                                this.nod.hww(sdVar.wgt());
                                sdVar.wgt();
                            } else {
                                File file = new File(sdVar.hv(), sdVar.bs());
                                if (file.exists()) {
                                    hww(sdVar, file);
                                } else {
                                    sd(sdVar);
                                }
                            }
                            this.khx = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.nod.hww((SurfaceHolder) message.obj);
                        this.nod.tq(true);
                        this.blh.await(1L, TimeUnit.SECONDS);
                        blh();
                        return;
                    case 111:
                        this.f31639yt = new Surface((SurfaceTexture) message.obj);
                        this.nod.hww(this.f31639yt);
                        this.nod.tq(true);
                        this.blh.await(1L, TimeUnit.SECONDS);
                        blh();
                        return;
                }
                this.khx = 200;
                if (this.vhb) {
                    return;
                }
                com.bykv.vk.openvk.hww.hww.hww.sd.hww hwwVar = new com.bykv.vk.openvk.hww.hww.hww.sd.hww(308, i11);
                hwwVar.hww(i10 + "," + i11);
                for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference3 : this.f31637sd) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().hww(this, hwwVar);
                    }
                }
                this.vhb = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void tq(Runnable runnable) {
        if (runnable == null || ok()) {
            return;
        }
        if (!this.f31627ed) {
            runnable.run();
        } else {
            hww(runnable);
        }
    }

    public void tq(final boolean z10) {
        mw mwVar;
        if (ok() || (mwVar = this.wgt) == null) {
            return;
        }
        mwVar.post(new Runnable() { // from class: com.bykv.vk.openvk.hww.hww.tq.sd.vy.8
            @Override // java.lang.Runnable
            public void run() {
                if (vy.this.ok() || vy.this.nod == null) {
                    return;
                }
                try {
                    vy.this.f31640za = z10;
                    vy.this.nod.vy(z10);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void tq(int i10) {
        this.f31633ok = i10;
    }

    private void hww(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar, File file) {
        if (sdVar.hww()) {
            tq(sdVar, file);
        } else {
            hww(file);
        }
    }

    private void hww(File file) {
        file.getAbsolutePath();
        try {
            if (com.bykv.vk.openvk.hww.hww.hww.sd.sd()) {
                tq(file.getAbsolutePath());
            } else {
                this.nod.hww(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd.hww
    public void hww(sd sdVar, int i10) {
        if (this.nod != sdVar) {
            return;
        }
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().tq(this, i10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd.tq
    public void hww(sd sdVar) {
        this.khx = 209;
        hww.delete(this.grv);
        mw mwVar = this.wgt;
        if (mwVar != null) {
            mwVar.removeCallbacks(this.gvr);
        }
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hww(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd.InterfaceC0292sd
    public boolean hww(sd sdVar, int i10, int i11) {
        aed();
        this.khx = 200;
        mw mwVar = this.wgt;
        if (mwVar != null) {
            mwVar.removeCallbacks(this.gvr);
        }
        if (hww(i10, i11)) {
            grv();
        }
        if (!this.hwp.get()) {
            return true;
        }
        this.hwp.set(false);
        com.bykv.vk.openvk.hww.hww.hww.sd.hww hwwVar = new com.bykv.vk.openvk.hww.hww.hww.sd.hww(i10, i11);
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hww(this, hwwVar);
            }
        }
        return true;
    }

    private void hww(Runnable runnable) {
        try {
            if (this.aeg == null) {
                this.aeg = new ArrayList<>();
            }
            this.aeg.add(runnable);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd.vgm
    public void hww(sd sdVar, int i10, int i11, int i12, int i13) {
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hww((com.bykv.vk.openvk.hww.hww.hww.hww) this, i10, i11);
            }
        }
    }

    public void hww(com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww interfaceC0290hww) {
        if (interfaceC0290hww == null) {
            return;
        }
        for (WeakReference<com.bykv.vk.openvk.hww.hww.hww.hww.InterfaceC0290hww> weakReference : this.f31637sd) {
            if (weakReference != null && weakReference.get() == interfaceC0290hww) {
                return;
            }
        }
        this.f31637sd.add(new WeakReference<>(interfaceC0290hww));
    }

    public void hww(int i10) {
        if (ok()) {
            return;
        }
        this.oxu = i10;
    }

    public boolean hww(float f10) {
        PlaybackParams playbackParamsHv;
        if (f10 <= 0.0f) {
            return false;
        }
        try {
            if (this.nod == null || !sd()) {
                return false;
            }
            try {
                playbackParamsHv = this.nod.hv();
            } catch (Throwable th2) {
                omn.sd("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th2.getMessage());
                playbackParamsHv = null;
            }
            if ((playbackParamsHv != null ? playbackParamsHv.getSpeed() : 0.0f) == f10) {
                return true;
            }
            com.bykv.vk.openvk.hww.hww.hww.tq tqVar = new com.bykv.vk.openvk.hww.hww.hww.tq();
            tqVar.hww(f10);
            this.nod.hww(tqVar);
            return true;
        } catch (Throwable th3) {
            omn.hww("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th3);
            return false;
        }
    }
}
