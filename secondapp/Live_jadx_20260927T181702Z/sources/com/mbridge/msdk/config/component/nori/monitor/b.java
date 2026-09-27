package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f65629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f65630b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f65631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HandlerThread f65632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f65633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f65634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f65635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.b f65636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.b f65637i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f65634f != null && !b.this.f65635g.h()) {
                b.this.a();
                b.this.f65634f.d(b.this.f65635g);
            }
            b.this.e();
        }
    }

    public b(long j10) {
        if (this.f65629a < 0) {
            this.f65629a = 30L;
        } else {
            this.f65629a = j10;
        }
    }

    public void d() {
        Runnable runnable;
        if (this.f65630b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f65630b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.f65632d = handlerThread;
            handlerThread.start();
            this.f65631c = new Handler(this.f65632d.getLooper());
            c();
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f65631c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.f65631c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f65634f;
            if (aVar != null) {
                aVar.d(this.f65635g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.f65629a + "ms");
        Handler handler = this.f65631c;
        if (handler == null || (runnable = this.f65633e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.f65629a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.f65630b) {
            this.f65630b = false;
            Handler handler = this.f65631c;
            if (handler != null && (runnable = this.f65633e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    private void c() {
        this.f65633e = new a();
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.f65636h = bVar;
    }

    public void b() {
        try {
            e();
            Handler handler = this.f65631c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f65631c = null;
            }
            HandlerThread handlerThread = this.f65632d;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f65632d.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f65632d = null;
                }
                this.f65633e = null;
                this.f65630b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f65632d = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorNetworkTimeout", "销毁MonitorNetworkTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.f65637i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.f65636h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.f65636h.a();
            }
            if (this.f65637i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.f65637i.a();
            }
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "取消任务时发生异常：" + e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.f65635g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f65634f = aVar;
    }
}
