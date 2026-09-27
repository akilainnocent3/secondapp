package dc;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f78702e = "HardwareConfig";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f78703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @k.j(api = 28)
    public static final boolean f78704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final File f78705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f78706i = 50;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f78707j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f78708k = 500;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f78709l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile d0 f78710m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.a0("this")
    public int f78712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.a0("this")
    public boolean f78713c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f78714d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78711a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f78703f = i10 < 29;
        f78704g = i10 >= 28;
        f78705h = new File("/proc/self/fd");
    }

    @h1
    public d0() {
    }

    public static d0 c() {
        if (f78710m == null) {
            synchronized (d0.class) {
                try {
                    if (f78710m == null) {
                        f78710m = new d0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f78710m;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return f78703f && !this.f78714d.get();
    }

    public void b() {
        pc.o.b();
        this.f78714d.set(false);
    }

    public final int d() {
        if (f()) {
            return 500;
        }
        return this.f78711a;
    }

    public final synchronized boolean e() {
        try {
            boolean z10 = true;
            int i10 = this.f78712b + 1;
            this.f78712b = i10;
            if (i10 >= 50) {
                this.f78712b = 0;
                int length = f78705h.list().length;
                long jD = d();
                if (length >= jD) {
                    z10 = false;
                }
                this.f78713c = z10;
                if (!z10 && Log.isLoggable(x.f78842f, 5)) {
                    Log.w(x.f78842f, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jD);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78713c;
    }

    public boolean g(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable(f78702e, 2)) {
                Log.v(f78702e, "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f78704g) {
            if (Log.isLoggable(f78702e, 2)) {
                Log.v(f78702e, "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable(f78702e, 2)) {
                Log.v(f78702e, "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable(f78702e, 2)) {
                Log.v(f78702e, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable(f78702e, 2)) {
                Log.v(f78702e, "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (e()) {
            return true;
        }
        if (Log.isLoggable(f78702e, 2)) {
            Log.v(f78702e, "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    public boolean h(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zG = g(i10, i11, z10, z11);
        if (zG) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zG;
    }

    public void i() {
        pc.o.b();
        this.f78714d.set(true);
    }
}
