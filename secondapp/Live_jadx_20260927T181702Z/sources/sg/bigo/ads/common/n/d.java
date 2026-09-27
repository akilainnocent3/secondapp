package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<sg.bigo.ads.common.n.a> f133163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HandlerThread f133164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f133165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HandlerThread f133166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f133167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static HandlerThread f133168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f133169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static b f133170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static b f133171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final WeakHashMap<Object, a> f133172j = new WeakHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f133173k = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f133187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Integer f133188b;

        public a(Runnable runnable, Integer num) {
            this.f133187a = runnable;
            this.f133188b = num;
        }
    }

    static {
        t.a();
    }

    public static void a(int i10, Runnable runnable) {
        b(i10, runnable, 0L);
    }

    private static synchronized void b(int i10, final Runnable runnable, long j10) {
        final b bVar;
        if (runnable == null) {
            return;
        }
        try {
            if (f133170h == null) {
                j();
            }
            if (i10 == 0) {
                if (f133164b == null) {
                    g();
                }
                bVar = f133165c;
            } else if (i10 == 1) {
                if (f133166d == null) {
                    h();
                }
                bVar = f133167e;
            } else if (i10 != 3) {
                bVar = f133170h;
            } else {
                if (f133168f == null) {
                    i();
                }
                bVar = f133169g;
            }
            if (bVar == null) {
                return;
            }
            final Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = f133170h.getLooper();
            }
            final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.common.n.d.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Runnable f133175b = null;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f133176c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable3 = d.f133171i != null ? new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.f133170h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    sg.bigo.ads.common.t.a.a(0, "ThreadManager", "这里使用了ThreadManager.post函数运行了一个超过30s的任务");
                                }
                            });
                        }
                    } : null;
                    if (d.f133171i != null) {
                        d.f133171i.postDelayed(runnable3, 30000L);
                    }
                    synchronized (d.f133172j) {
                        d.f133172j.remove(runnable);
                    }
                    if (d.f133173k) {
                        runnable.run();
                    } else {
                        try {
                            runnable.run();
                        } catch (Throwable th2) {
                            sg.bigo.ads.common.t.a.a(2, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th2));
                            List<sg.bigo.ads.common.n.a> list = d.f133163a;
                            if (list != null) {
                                Iterator<sg.bigo.ads.common.n.a> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next().a(th2);
                                }
                            }
                        }
                    }
                    if (d.f133171i != null) {
                        d.f133171i.removeCallbacks(runnable3);
                    }
                    if (this.f133175b != null) {
                        if (this.f133176c || looperMyLooper == d.f133170h.getLooper()) {
                            d.f133170h.post(this.f133175b);
                        } else {
                            new Handler(looperMyLooper).post(this.f133175b);
                        }
                    }
                }
            };
            Runnable runnable3 = new Runnable() { // from class: sg.bigo.ads.common.n.d.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Runnable f133180a = null;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f133181b = false;

                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f133180a == null) {
                        runnable2.run();
                    } else if (this.f133181b || looperMyLooper == d.f133170h.getLooper()) {
                        d.f133170h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2.this.f133180a.run();
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                bVar.post(runnable2);
                            }
                        });
                    } else {
                        new Handler(looperMyLooper).post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2.this.f133180a.run();
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                bVar.post(runnable2);
                            }
                        });
                    }
                }
            };
            WeakHashMap<Object, a> weakHashMap = f133172j;
            synchronized (weakHashMap) {
                weakHashMap.put(runnable, new a(runnable3, Integer.valueOf(i10)));
            }
            bVar.postDelayed(runnable3, j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void g() {
        if (f133164b == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
            f133164b = handlerThread;
            handlerThread.start();
            f133165c = new b("BGAd-Background", f133164b.getLooper());
        }
    }

    private static synchronized void h() {
        if (f133166d == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
            f133166d = handlerThread;
            handlerThread.start();
            f133167e = new b("BGAd-Work", f133166d.getLooper());
        }
    }

    private static synchronized void i() {
        if (f133168f == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
            f133168f = handlerThread;
            handlerThread.start();
            f133169g = new b("BGAd-Normal", f133168f.getLooper());
        }
    }

    private static synchronized void j() {
        if (f133170h == null) {
            f133170h = new b("BGAd-Background.Main + 38", Looper.getMainLooper());
        }
    }

    public static void a(int i10, Runnable runnable, long j10) {
        b(i10, runnable, j10);
    }

    public static void b(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            b(2, runnable, 0L);
        }
    }

    public static synchronized void a(Runnable runnable) {
        b bVar;
        if (runnable == null) {
            return;
        }
        try {
            WeakHashMap<Object, a> weakHashMap = f133172j;
            a aVar = weakHashMap.get(runnable);
            if (aVar == null) {
                return;
            }
            Runnable runnable2 = aVar.f133187a;
            if (runnable2 != null) {
                int iIntValue = aVar.f133188b.intValue();
                if (iIntValue == 0) {
                    bVar = f133165c;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    throw th;
                }
                if (iIntValue == 1) {
                    bVar = f133167e;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    throw th;
                }
                if (iIntValue == 2) {
                    bVar = f133170h;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    throw th;
                }
                if (iIntValue == 3) {
                    bVar = f133169g;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                } else if (iIntValue == 1024) {
                    runnable2.run();
                }
                synchronized (weakHashMap) {
                    weakHashMap.remove(runnable);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static synchronized void a(@NonNull sg.bigo.ads.common.n.a aVar) {
        try {
            if (f133163a == null) {
                f133163a = new ArrayList();
            }
            f133163a.add(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean a() {
        return f133166d == Thread.currentThread();
    }
}
