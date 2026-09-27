package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f65565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f65566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f65567c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f65571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HandlerThread f65572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f65573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f65574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f65575k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f65577m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f65568d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f65569e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f65570f = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f65576l = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f65575k != null) {
                c.this.f65575k.a("播放超时：从创建到第一帧播放超过 " + c.this.f65566b + "ms");
            }
            c.this.h();
        }
    }

    public c(int i10, String str) {
        this.f65565a = 3;
        this.f65577m = str;
        this.f65566b = i10 > 0 ? i10 : 3000L;
        this.f65565a = i10 / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f65572h = handlerThread;
            handlerThread.start();
            this.f65571g = new Handler(this.f65572h.getLooper());
            d();
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f65571g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    private void d() {
        this.f65573i = new a();
        this.f65574j = new b();
    }

    public boolean e() {
        return this.f65568d;
    }

    public void f() {
        Runnable runnable;
        if (!this.f65568d || this.f65570f) {
            return;
        }
        this.f65570f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f65567c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f65571g;
        if (handler != null && (runnable = this.f65574j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f65566b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        h();
    }

    public void g() {
        Runnable runnable;
        if (this.f65571g == null) {
            h();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f65575k;
            if (aVar != null) {
                aVar.a(" playerHandler 异常 ");
            }
        }
        if (this.f65568d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f65568d = true;
        this.f65569e = false;
        this.f65570f = false;
        this.f65576l = 0;
        this.f65567c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f65566b + "ms");
        Handler handler = this.f65571g;
        if (handler != null && (runnable = this.f65574j) != null) {
            handler.postDelayed(runnable, this.f65566b);
        }
        a();
    }

    public void h() {
        if (this.f65568d) {
            this.f65568d = false;
            Handler handler = this.f65571g;
            if (handler != null) {
                Runnable runnable = this.f65573i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f65574j;
                if (runnable2 != null) {
                    this.f65571g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f65568d || this.f65569e || TextUtils.isEmpty(this.f65577m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                this.f65576l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.f65576l);
                if (this.f65576l >= this.f65565a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f65571g;
                if (handler == null || (runnable2 = this.f65573i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f65569e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strC);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f65575k;
            if (aVar != null) {
                aVar.b(strC);
            }
            Handler handler2 = this.f65571g;
            if (handler2 == null || (runnable3 = this.f65573i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "检查本地地址异常：" + e10.getMessage());
            Handler handler3 = this.f65571g;
            if (handler3 == null || (runnable = this.f65573i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    private String c() {
        try {
            if (this.f65577m.startsWith(AdPayload.FILE_SCHEME) || this.f65577m.startsWith(to.c.userBaseDel)) {
                File file = new File(this.f65577m.replace(AdPayload.FILE_SCHEME, ""));
                if (file.exists() && file.isFile()) {
                    return this.f65577m;
                }
            }
            if (this.f65577m.startsWith("http")) {
                com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(this.f65577m);
                String strA = bVarE != null ? bVarE.a() : "";
                File file2 = new File(strA.replace(AdPayload.FILE_SCHEME, ""));
                if (file2.exists() && file2.isFile()) {
                    return strA;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "获取本地视频地址异常：" + e10.getMessage());
            return null;
        }
    }

    public void b() {
        try {
            h();
            Handler handler = this.f65571g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f65571g = null;
            }
            HandlerThread handlerThread = this.f65572h;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f65572h.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f65572h = null;
                }
                this.f65573i = null;
                this.f65574j = null;
                this.f65575k = null;
                this.f65568d = false;
                this.f65569e = false;
                this.f65570f = false;
                this.f65576l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f65572h = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorPlayerTimeout", "销毁MonitorPlayerTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.f65575k = aVar;
    }
}
