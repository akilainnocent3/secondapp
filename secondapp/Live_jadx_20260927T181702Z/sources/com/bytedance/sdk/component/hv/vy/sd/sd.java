package com.bytedance.sdk.component.hv.vy.sd;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import fc.a;
import fc.b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements rs {
    private ExecutorService aed;
    private int aeg;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private int f34801bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private volatile boolean f34802ed;
    private int grv;
    private int hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private ImageView.ScaleType f34803hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private wgt f34804hv;
    Future<?> hww;
    private final Handler jpb;
    private boolean khx;
    private com.bytedance.sdk.component.hv.tq kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private hu f34805kv;
    private boolean mrs;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    private khx f34806mw;
    private ok nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private WeakReference<ImageView> f34807ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f34808ok;
    private com.bytedance.sdk.component.hv.vgm omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f34809rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f34810sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34811tq;
    private Bitmap.Config vgm;
    private int vhb;
    private String vy;
    private boolean weu;
    private mrs wgt;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    private byte[] f34812za;
    private boolean zvy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww implements wgt {

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private wgt f34813tq;

        public hww(wgt wgtVar) {
            this.f34813tq = wgtVar;
        }

        @Override // com.bytedance.sdk.component.hv.wgt
        public void hww(final vhb vhbVar) {
            Bitmap bitmapHww;
            final ImageView imageView = (ImageView) sd.this.f34807ny.get();
            if (imageView != null && sd.this.vhb != 3 && hww(imageView)) {
                Object objTq = vhbVar.tq();
                if (objTq instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) vhbVar.tq();
                    sd.this.jpb.post(new Runnable() { // from class: com.bytedance.sdk.component.hv.vy.sd.sd.hww.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objTq instanceof Drawable) {
                    final Drawable drawable = (Drawable) vhbVar.tq();
                    sd.this.jpb.post(new Runnable() { // from class: com.bytedance.sdk.component.hv.vy.sd.sd.hww.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                                b.a(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (sd.this.nod != null && (vhbVar.tq() instanceof Bitmap) && (bitmapHww = sd.this.nod.hww((Bitmap) vhbVar.tq())) != null) {
                    vhbVar.hww(bitmapHww);
                }
            } catch (Throwable unused) {
            }
            if (sd.this.f34801bs == 5) {
                sd.this.jpb.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.hv.vy.sd.sd.hww.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (hww.this.f34813tq != null) {
                            hww.this.f34813tq.hww(vhbVar);
                        }
                    }
                });
                return;
            }
            wgt wgtVar = this.f34813tq;
            if (wgtVar != null) {
                wgtVar.hww(vhbVar);
            }
        }

        private boolean hww(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(sd.this.f34810sd)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.hv.wgt
        public void hww(final int i10, final String str, final Throwable th2) {
            if (sd.this.f34801bs == 5) {
                sd.this.jpb.post(new Runnable() { // from class: com.bytedance.sdk.component.hv.vy.sd.sd.hww.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (hww.this.f34813tq != null) {
                            hww.this.f34813tq.hww(i10, str, th2);
                        }
                    }
                });
                return;
            }
            wgt wgtVar = this.f34813tq;
            if (wgtVar != null) {
                wgtVar.hww(i10, str, th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq implements nod {

        /* JADX INFO: renamed from: bs, reason: collision with root package name */
        private ok f34821bs;

        /* JADX INFO: renamed from: ed, reason: collision with root package name */
        private boolean f34822ed;
        private boolean hnv;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private Bitmap.Config f34823hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private ImageView.ScaleType f34824hv;
        private wgt hww;
        private int jpb;
        private String khx;

        /* JADX INFO: renamed from: kv, reason: collision with root package name */
        private khx f34825kv;
        private int mrs;

        /* JADX INFO: renamed from: ny, reason: collision with root package name */
        private boolean f34826ny;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private int f34827ok;
        private ExecutorService omn;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private String f34829sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private ImageView f34830tq;
        private int vgm;
        private mrs vhb;
        private String vy;
        private com.bytedance.sdk.component.hv.tq weu;
        private hu wgt;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private int f34828rs = 1;
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
            this.f34829sd = str;
            return this;
        }

        public nod sd(String str) {
            this.vy = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod tq(int i10) {
            this.f34827ok = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod vy(int i10) {
            this.jpb = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(ImageView.ScaleType scaleType) {
            this.f34824hv = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod sd(int i10) {
            this.f34828rs = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod tq(String str) {
            this.khx = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(Bitmap.Config config) {
            this.f34823hu = config;
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
            this.f34822ed = z10;
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
            return new sd(this).hnv();
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public rs hww(ImageView imageView) {
            this.f34830tq = imageView;
            return new sd(this).hnv();
        }

        @Override // com.bytedance.sdk.component.hv.nod
        public nod hww(ok okVar) {
            this.f34821bs = okVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rs hnv() {
        try {
            if (this.f34805kv == null) {
                wgt wgtVar = this.f34804hv;
                if (wgtVar != null) {
                    wgtVar.hww(1005, "not init !", null);
                    return this;
                }
            } else {
                String strHww = hww();
                if (TextUtils.isEmpty(strHww)) {
                    this.f34804hv.hww(2000, "url is empty", null);
                    return this;
                }
                hnv hnvVarHu = this.f34805kv.hu();
                if (!strHww.startsWith("http://") && !strHww.startsWith("https://") && hnvVarHu != null) {
                    hnvVarHu.hww(1006, "url is not validate ".concat(strHww));
                }
                ExecutorService executorServiceHv = this.aed == null ? this.f34805kv.hv() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.hv.vy.sd.sd.1
                    @Override // java.lang.Runnable
                    public void run() {
                        sd sdVar = sd.this;
                        com.bytedance.sdk.component.hv.vy.sd.hww hwwVar = new com.bytedance.sdk.component.hv.vy.sd.hww(sdVar, sdVar.wgt);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.hv.vy.tq.tq());
                            arrayList.add(new com.bytedance.sdk.component.hv.vy.tq.hv());
                            arrayList.add(new com.bytedance.sdk.component.hv.vy.tq.hww());
                            arrayList.add(new com.bytedance.sdk.component.hv.vy.tq.sd());
                            arrayList.add(new com.bytedance.sdk.component.hv.vy.tq.vy());
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (sd.this.f34802ed) {
                                    hwwVar.hww(1003, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.hv.vy.tq.hu huVar = (com.bytedance.sdk.component.hv.vy.tq.hu) arrayList.get(i10);
                                if (sd.this.wgt != null && huVar != null && !"data_intercept".equals(huVar.hww())) {
                                    sd.this.wgt.hww(huVar.hww(), sd.this);
                                }
                                sd sdVar2 = sd.this;
                                boolean zHww = huVar.hww(sdVar2, sdVar2.wgt, hwwVar);
                                if (sd.this.wgt != null && !"data_intercept".equals(huVar.hww())) {
                                    sd.this.wgt.tq(huVar.hww(), sd.this);
                                }
                                if (!zHww) {
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            hwwVar.hww(2000, th2.getMessage(), th2);
                        }
                    }
                };
                if (this.zvy) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.aed;
                if (executorService != null) {
                    this.hww = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceHv != null) {
                    this.hww = executorServiceHv.submit(runnable);
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public hu bs() {
        return this.f34805kv;
    }

    public boolean ed() {
        return this.mrs;
    }

    public com.bytedance.sdk.component.hv.tq jpb() {
        return this.kub;
    }

    public byte[] khx() {
        return this.f34812za;
    }

    public khx mrs() {
        return this.f34806mw;
    }

    public String nod() {
        return this.f34810sd;
    }

    public int ny() {
        return this.vhb;
    }

    public String omn() {
        return nod() + ny();
    }

    public Bitmap.Config vhb() {
        return this.vgm;
    }

    public com.bytedance.sdk.component.hv.vgm weu() {
        return this.omn;
    }

    public int wgt() {
        return this.hnv;
    }

    private sd(tq tqVar) {
        this.jpb = new Handler(Looper.getMainLooper());
        this.mrs = true;
        this.f34812za = null;
        this.f34811tq = tqVar.vy;
        this.f34804hv = new hww(tqVar.hww);
        this.f34807ny = new WeakReference<>(tqVar.f34830tq);
        this.f34803hu = tqVar.f34824hv;
        this.vgm = tqVar.f34823hu;
        this.f34808ok = tqVar.vgm;
        this.f34809rs = tqVar.f34827ok;
        this.vhb = tqVar.f34828rs;
        this.f34801bs = tqVar.nod;
        this.wgt = tqVar.vhb;
        this.kub = hww(tqVar);
        if (!TextUtils.isEmpty(tqVar.f34829sd)) {
            tq(tqVar.f34829sd);
            hww(tqVar.f34829sd);
        }
        this.khx = tqVar.f34826ny;
        this.weu = tqVar.f34822ed;
        this.f34805kv = tqVar.wgt;
        this.nod = tqVar.f34821bs;
        this.grv = tqVar.mrs;
        this.aeg = tqVar.jpb;
        this.aed = tqVar.omn;
        this.zvy = tqVar.hnv;
        this.f34806mw = tqVar.f34825kv;
    }

    private com.bytedance.sdk.component.hv.tq hww(tq tqVar) {
        if (tqVar.weu != null) {
            return tqVar.weu;
        }
        return !TextUtils.isEmpty(tqVar.khx) ? com.bytedance.sdk.component.hv.vy.sd.hww.tq.hww(new File(tqVar.khx)) : com.bytedance.sdk.component.hv.vy.sd.hww.tq.nod();
    }

    public int hu() {
        return this.aeg;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public Bitmap.Config hv() {
        return this.vgm;
    }

    public wgt ok() {
        return this.f34804hv;
    }

    public String rs() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public int sd() {
        return this.f34809rs;
    }

    public void tq(String str) {
        WeakReference<ImageView> weakReference = this.f34807ny;
        if (weakReference != null && weakReference.get() != null) {
            this.f34807ny.get().setTag(1094453505, str);
        }
        this.f34810sd = str;
    }

    public int vgm() {
        return this.grv;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public ImageView.ScaleType vy() {
        return this.f34803hu;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public int tq() {
        return this.f34808ok;
    }

    @Override // com.bytedance.sdk.component.hv.rs
    public String hww() {
        return this.f34811tq;
    }

    public void hww(String str) {
        this.vy = str;
    }

    public void hww(boolean z10) {
        this.mrs = z10;
    }

    public void hww(byte[] bArr) {
        this.f34812za = bArr;
    }

    public void hww(int i10) {
        this.hnv = i10;
    }
}
