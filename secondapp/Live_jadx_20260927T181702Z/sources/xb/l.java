package xb;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f144794e = "MemorySizeCalculator";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @h1
    public static final int f144795f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f144796g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f144797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f144799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f144800d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @h1
        public static final int f144801i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f144802j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final float f144803k = 0.4f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final float f144804l = 0.33f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f144805m = 4194304;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f144806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ActivityManager f144807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f144808c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f144810e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f144809d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f144811f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f144812g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f144813h = 4194304;

        static {
            f144802j = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f144810e = f144802j;
            this.f144806a = context;
            this.f144807b = (ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f6970r);
            this.f144808c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !l.e(this.f144807b)) {
                return;
            }
            this.f144810e = 0.0f;
        }

        public l a() {
            return new l(this);
        }

        @h1
        public a b(ActivityManager activityManager) {
            this.f144807b = activityManager;
            return this;
        }

        public a c(int i10) {
            this.f144813h = i10;
            return this;
        }

        public a d(float f10) {
            pc.m.b(f10 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f144810e = f10;
            return this;
        }

        public a e(float f10) {
            pc.m.b(f10 >= 0.0f && f10 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f144812g = f10;
            return this;
        }

        public a f(float f10) {
            pc.m.b(f10 >= 0.0f && f10 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f144811f = f10;
            return this;
        }

        public a g(float f10) {
            pc.m.b(f10 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f144809d = f10;
            return this;
        }

        @h1
        public a h(c cVar) {
            this.f144808c = cVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f144814a;

        public b(DisplayMetrics displayMetrics) {
            this.f144814a = displayMetrics;
        }

        @Override // xb.l.c
        public int a() {
            return this.f144814a.heightPixels;
        }

        @Override // xb.l.c
        public int b() {
            return this.f144814a.widthPixels;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        int a();

        int b();
    }

    public l(a aVar) {
        this.f144799c = aVar.f144806a;
        int i10 = e(aVar.f144807b) ? aVar.f144813h / 2 : aVar.f144813h;
        this.f144800d = i10;
        int iC = c(aVar.f144807b, aVar.f144811f, aVar.f144812g);
        float fB = aVar.f144808c.b() * aVar.f144808c.a() * 4;
        int iRound = Math.round(aVar.f144810e * fB);
        int iRound2 = Math.round(fB * aVar.f144809d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f144798b = iRound2;
            this.f144797a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f144810e;
            float f12 = aVar.f144809d;
            float f13 = f10 / (f11 + f12);
            this.f144798b = Math.round(f12 * f13);
            this.f144797a = Math.round(f13 * aVar.f144810e);
        }
        if (Log.isLoggable(f144794e, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f144798b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f144797a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f144807b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f144807b));
            Log.d(f144794e, sb2.toString());
        }
    }

    public static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.f144800d;
    }

    public int b() {
        return this.f144797a;
    }

    public int d() {
        return this.f144798b;
    }

    public final String f(int i10) {
        return Formatter.formatFileSize(this.f144799c, i10);
    }
}
