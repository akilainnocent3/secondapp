package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4176a extends Thread {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f60487l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final InterfaceC4194b f60488m = new C0544a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final InterfaceC4524t9 f60489n = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f60493d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4194b f60490a = f60488m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4524t9 f60491b = f60489n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f60492c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60494e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60495f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f60496g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f60497h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60498i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f60499j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f60500k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements InterfaceC4524t9 {
        @Override // com.ironsource.InterfaceC4524t9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4176a c4176a = C4176a.this;
            c4176a.f60497h = (c4176a.f60497h + 1) % Integer.MAX_VALUE;
        }
    }

    public C4176a(int i10) {
        this.f60493d = i10;
    }

    public C4176a c() {
        this.f60494e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f60499j < this.f60498i) {
            int i11 = this.f60497h;
            this.f60492c.post(this.f60500k);
            try {
                Thread.sleep(this.f60493d);
                if (this.f60497h != i11) {
                    this.f60499j = 0;
                } else if (this.f60496g || !Debug.isDebuggerConnected()) {
                    this.f60499j++;
                    this.f60490a.a();
                    String str = C4485r4.f63448l;
                    if (str != null && !str.trim().isEmpty()) {
                        new P5(C4485r4.f63448l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.f60497h != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f60497h;
                }
            } catch (InterruptedException e10) {
                this.f60491b.a(e10);
                return;
            }
        }
        if (this.f60499j >= this.f60498i) {
            this.f60490a.b();
        }
    }

    public void a(int i10) {
        this.f60498i = i10;
    }

    public int b() {
        return this.f60498i;
    }

    public int a() {
        return this.f60499j;
    }

    public C4176a b(boolean z10) {
        this.f60495f = z10;
        return this;
    }

    public C4176a a(InterfaceC4194b interfaceC4194b) {
        if (interfaceC4194b == null) {
            this.f60490a = f60488m;
            return this;
        }
        this.f60490a = interfaceC4194b;
        return this;
    }

    public C4176a a(InterfaceC4524t9 interfaceC4524t9) {
        if (interfaceC4524t9 == null) {
            this.f60491b = f60489n;
            return this;
        }
        this.f60491b = interfaceC4524t9;
        return this;
    }

    public C4176a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f60494e = str;
        return this;
    }

    public C4176a a(boolean z10) {
        this.f60496g = z10;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0544a implements InterfaceC4194b {
        @Override // com.ironsource.InterfaceC4194b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }

        @Override // com.ironsource.InterfaceC4194b
        public void a() {
        }
    }
}
