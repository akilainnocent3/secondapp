package com.bytedance.sdk.component.hv.sd;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.hv.hnv;
import com.bytedance.sdk.component.hv.khx;
import com.bytedance.sdk.component.hv.mrs;
import com.bytedance.sdk.component.hv.nod;
import com.bytedance.sdk.component.hv.ok;
import com.bytedance.sdk.component.hv.rs;
import com.bytedance.sdk.component.hv.vhb;
import com.bytedance.sdk.component.hv.wgt;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements rs {
    private int aed;
    private com.bytedance.sdk.component.hv.sd.hww aeg;
    private boolean blh;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private int f34719bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private volatile boolean f34720ed;
    private com.bytedance.sdk.component.hv.tq grv;
    private com.bytedance.sdk.component.hv.vgm hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private ImageView.ScaleType f34721hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private wgt f34722hv;
    Future<?> hww;
    private Queue<com.bytedance.sdk.component.hv.hv.rs> jpb;
    private boolean khx;
    private hu kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private int f34723kv;
    private final Handler mrs;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    private boolean f34724mw;
    private ok nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private WeakReference<ImageView> f34725ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f34726ok;
    private boolean omn;
    private khx oxu;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f34727rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f34728sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34729tq;
    private Bitmap.Config vgm;
    private int vhb;
    private String vy;
    private boolean weu;
    private mrs wgt;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    private ExecutorService f34730za;
    private int zvy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww implements wgt {

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private wgt f34731tq;

        public hww(wgt wgtVar) {
            this.f34731tq = wgtVar;
        }

        @Override // com.bytedance.sdk.component.hv.wgt
        public void hww(final vhb vhbVar) {
            Bitmap bitmapHww;
            final ImageView imageView = (ImageView) sd.this.f34725ny.get();
            if (imageView != null && sd.this.vhb != 3 && hww(imageView) && (vhbVar.tq() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) vhbVar.tq();
                sd.this.mrs.post(new Runnable() { // from class: com.bytedance.sdk.component.hv.sd.sd.hww.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (sd.this.nod != null && (vhbVar.tq() instanceof Bitmap) && (bitmapHww = sd.this.nod.hww((Bitmap) vhbVar.tq())) != null) {
                    vhbVar.hww(bitmapHww);
                }
            } catch (Throwable unused) {
            }
            if (sd.this.f34719bs == 5) {
                sd.this.mrs.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.hv.sd.sd.hww.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (hww.this.f34731tq != null) {
                            hww.this.f34731tq.hww(vhbVar);
                        }
                    }
                });
                return;
            }
            wgt wgtVar = this.f34731tq;
            if (wgtVar != null) {
                wgtVar.hww(vhbVar);
            }
        }

        private boolean hww(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(sd.this.f34728sd)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.hv.wgt
        public void hww(final int i10, final String str, final Throwable th2) {
            if (sd.this.f34719bs == 5) {
                sd.this.mrs.post(new Runnable() { // from class: com.bytedance.sdk.component.hv.sd.sd.hww.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (hww.this.f34731tq != null) {
                            hww.this.f34731tq.hww(i10, str, th2);
                        }
                    }
                });
                return;
            }
            wgt wgtVar = this.f34731tq;
            if (wgtVar != null) {
                wgtVar.hww(i10, str, th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq implements nod {

        /* JADX INFO: renamed from: bs, reason: collision with root package name */
        private ok f34737bs;

        /* JADX INFO: renamed from: ed, reason: collision with root package name */
        private boolean f34738ed;
        private ExecutorService hnv;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private Bitmap.Config f34739hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private ImageView.ScaleType f34740hv;
        private wgt hww;
        private int jpb;
        private String khx;
        private khx kub;

        /* JADX INFO: renamed from: kv, reason: collision with root package name */
        private boolean f34741kv;
        private int mrs;

        /* JADX INFO: renamed from: ny, reason: collision with root package name */
        private boolean f34742ny;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private int f34743ok;
        private boolean omn;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private String f34745sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private ImageView f34746tq;
        private int vgm;
        private mrs vhb;
        private String vy;
        private com.bytedance.sdk.component.hv.tq weu;
        private hu wgt;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private int f34744rs = 1;
        private int nod = 5;

        public tq(hu huVar) {
            this.wgt = huVar;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hv(int i10) {
            this.mrs = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(String str) {
            this.f34745sd = str;
            return this;
        }

        public nod sd(String str) {
            this.vy = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod tq(int i10) {
            this.f34743ok = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod vy(int i10) {
            this.jpb = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(ImageView.ScaleType scaleType) {
            this.f34740hv = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod sd(int i10) {
            this.f34744rs = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod tq(String str) {
            this.khx = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(Bitmap.Config config) {
            this.f34739hu = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(int i10) {
            this.vgm = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(mrs mrsVar) {
            this.vhb = mrsVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(boolean z10) {
            this.f34738ed = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public rs hww(wgt wgtVar, int i10) {
            this.nod = i10;
            return hww(wgtVar);
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public rs hww(wgt wgtVar) {
            this.hww = wgtVar;
            return new sd(this).kub();
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public rs hww(ImageView imageView) {
            this.f34746tq = imageView;
            return new sd(this).kub();
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(ok okVar) {
            this.f34737bs = okVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rs kub() {
        try {
            if (this.kub == null) {
                wgt wgtVar = this.f34722hv;
                if (wgtVar != null) {
                    wgtVar.hww(1005, "not init !", null);
                    return this;
                }
            } else {
                String strHww = hww();
                if (TextUtils.isEmpty(strHww)) {
                    wgt wgtVar2 = this.f34722hv;
                    if (wgtVar2 != null) {
                        wgtVar2.hww(2000, "url is empty", null);
                        return this;
                    }
                } else {
                    hnv hnvVarHv = this.kub.hv();
                    if (!strHww.startsWith("http://") && !strHww.startsWith("https://") && hnvVarHv != null) {
                        hnvVarHv.hww(1006, "url is not validate ".concat(strHww));
                    }
                    ExecutorService executorServiceVgm = this.f34730za == null ? this.kub.vgm() : null;
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.hv.sd.sd.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.hv.hv.rs rsVar;
                            while (!sd.this.f34720ed && (rsVar = (com.bytedance.sdk.component.hv.hv.rs) sd.this.jpb.poll()) != null) {
                                try {
                                    if (sd.this.wgt != null) {
                                        sd.this.wgt.hww(rsVar.hww(), sd.this);
                                    }
                                    rsVar.hww(sd.this);
                                    if (sd.this.wgt != null) {
                                        sd.this.wgt.tq(rsVar.hww(), sd.this);
                                    }
                                } catch (Throwable th2) {
                                    sd.this.hww(2000, th2.getMessage(), th2);
                                    if (sd.this.wgt != null) {
                                        sd.this.wgt.tq("exception", sd.this);
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (sd.this.f34720ed) {
                                sd.this.hww(1003, "canceled", null);
                            }
                        }
                    };
                    if (this.blh) {
                        runnable.run();
                        return this;
                    }
                    ExecutorService executorService = this.f34730za;
                    if (executorService != null) {
                        this.hww = executorService.submit(runnable);
                        return this;
                    }
                    if (executorServiceVgm != null) {
                        this.hww = executorServiceVgm.submit(runnable);
                    }
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public int bs() {
        return this.f34723kv;
    }

    public boolean ed() {
        return this.khx;
    }

    public khx hnv() {
        return this.oxu;
    }

    public hu jpb() {
        return this.kub;
    }

    public boolean khx() {
        return this.weu;
    }

    public String kv() {
        return nod() + ny();
    }

    public com.bytedance.sdk.component.hv.tq mrs() {
        return this.grv;
    }

    public int ny() {
        return this.vhb;
    }

    public boolean omn() {
        return this.f34724mw;
    }

    public Bitmap.Config vhb() {
        return this.vgm;
    }

    public boolean weu() {
        return this.omn;
    }

    public com.bytedance.sdk.component.hv.vgm wgt() {
        return this.hnv;
    }

    private sd(tq tqVar) {
        this.jpb = new LinkedBlockingQueue();
        this.mrs = new Handler(Looper.getMainLooper());
        this.omn = true;
        this.f34729tq = tqVar.vy;
        this.f34722hv = new hww(tqVar.hww);
        this.f34725ny = new WeakReference<>(tqVar.f34746tq);
        this.f34721hu = tqVar.f34740hv;
        this.vgm = tqVar.f34739hu;
        this.f34726ok = tqVar.vgm;
        this.f34727rs = tqVar.f34743ok;
        this.vhb = tqVar.f34744rs;
        this.f34719bs = tqVar.nod;
        this.wgt = tqVar.vhb;
        this.grv = hww(tqVar);
        if (!TextUtils.isEmpty(tqVar.f34745sd)) {
            tq(tqVar.f34745sd);
            hww(tqVar.f34745sd);
        }
        this.khx = tqVar.f34742ny;
        this.weu = tqVar.f34738ed;
        this.kub = tqVar.wgt;
        this.nod = tqVar.f34737bs;
        this.zvy = tqVar.mrs;
        this.aed = tqVar.jpb;
        this.f34730za = tqVar.hnv;
        this.f34724mw = tqVar.omn;
        this.blh = tqVar.f34741kv;
        this.oxu = tqVar.kub;
        this.jpb.add(new com.bytedance.sdk.component.hv.hv.sd());
    }

    public int hu() {
        return this.aed;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public Bitmap.Config hv() {
        return this.vgm;
    }

    public String nod() {
        return this.f34728sd;
    }

    public wgt ok() {
        return this.f34722hv;
    }

    public String rs() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public int sd() {
        return this.f34727rs;
    }

    public void tq(String str) {
        WeakReference<ImageView> weakReference = this.f34725ny;
        if (weakReference != null && weakReference.get() != null) {
            this.f34725ny.get().setTag(1094453505, str);
        }
        this.f34728sd = str;
    }

    public int vgm() {
        return this.zvy;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public ImageView.ScaleType vy() {
        return this.f34721hu;
    }

    private com.bytedance.sdk.component.hv.tq hww(tq tqVar) {
        if (tqVar.weu != null) {
            return tqVar.weu;
        }
        if (!TextUtils.isEmpty(tqVar.khx)) {
            return com.bytedance.sdk.component.hv.sd.hww.hww.hww(new File(tqVar.khx));
        }
        return com.bytedance.sdk.component.hv.sd.hww.hww.nod();
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public int tq() {
        return this.f34726ok;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public String hww() {
        return this.f34729tq;
    }

    public void hww(String str) {
        this.vy = str;
    }

    public void hww(boolean z10) {
        this.omn = z10;
    }

    public void hww(com.bytedance.sdk.component.hv.vgm vgmVar) {
        this.hnv = vgmVar;
    }

    public void hww(int i10) {
        this.f34723kv = i10;
    }

    public void hww(com.bytedance.sdk.component.hv.sd.hww hwwVar) {
        this.aeg = hwwVar;
    }

    public boolean hww(com.bytedance.sdk.component.hv.hv.rs rsVar) {
        if (this.f34720ed) {
            return false;
        }
        return this.jpb.add(rsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(int i10, String str, Throwable th2) {
        new com.bytedance.sdk.component.hv.hv.ok(i10, str, th2).hww(this);
        this.jpb.clear();
    }
}
