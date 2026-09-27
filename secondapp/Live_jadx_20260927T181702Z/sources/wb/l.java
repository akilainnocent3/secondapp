package wb;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class l implements e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f142664k = "LruBitmapPool";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Bitmap.Config f142665l = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f142666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f142667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f142668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f142669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f142670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f142671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f142672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f142673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f142674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f142675j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Bitmap> f142676a = Collections.synchronizedSet(new HashSet());

        @Override // wb.l.a
        public void a(Bitmap bitmap) {
            if (!this.f142676a.contains(bitmap)) {
                this.f142676a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + C4235d4.j.f61462e);
        }

        @Override // wb.l.a
        public void b(Bitmap bitmap) {
            if (!this.f142676a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f142676a.remove(bitmap);
        }
    }

    public l(long j10, m mVar, Set<Bitmap.Config> set) {
        this.f142668c = j10;
        this.f142670e = j10;
        this.f142666a = mVar;
        this.f142667b = set;
        this.f142669d = new b();
    }

    @TargetApi(26)
    public static void g(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    public static Bitmap h(int i10, int i11, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f142665l;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @TargetApi(26)
    public static Set<Bitmap.Config> n() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static m o() {
        return new q();
    }

    @TargetApi(19)
    public static void r(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void t(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        r(bitmap);
    }

    @Override // wb.e
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable(f142664k, 3)) {
            Log.d(f142664k, "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            u(getMaxSize() / 2);
        }
    }

    @Override // wb.e
    public void b() {
        if (Log.isLoggable(f142664k, 3)) {
            Log.d(f142664k, "clearMemory");
        }
        u(0L);
    }

    @Override // wb.e
    public synchronized void c(float f10) {
        this.f142670e = Math.round(this.f142668c * f10);
        k();
    }

    @Override // wb.e
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f142666a.b(bitmap) <= this.f142670e && this.f142667b.contains(bitmap.getConfig())) {
                int iB = this.f142666a.b(bitmap);
                this.f142666a.d(bitmap);
                this.f142669d.a(bitmap);
                this.f142674i++;
                this.f142671f += (long) iB;
                if (Log.isLoggable(f142664k, 2)) {
                    Log.v(f142664k, "Put bitmap in pool=" + this.f142666a.c(bitmap));
                }
                i();
                k();
                return;
            }
            if (Log.isLoggable(f142664k, 2)) {
                Log.v(f142664k, "Reject bitmap from pool, bitmap: " + this.f142666a.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f142667b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // wb.e
    @NonNull
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapP = p(i10, i11, config);
        if (bitmapP == null) {
            return h(i10, i11, config);
        }
        bitmapP.eraseColor(0);
        return bitmapP;
    }

    @Override // wb.e
    @NonNull
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapP = p(i10, i11, config);
        return bitmapP == null ? h(i10, i11, config) : bitmapP;
    }

    @Override // wb.e
    public long getMaxSize() {
        return this.f142670e;
    }

    public final void i() {
        if (Log.isLoggable(f142664k, 2)) {
            j();
        }
    }

    public final void j() {
        Log.v(f142664k, "Hits=" + this.f142672g + ", misses=" + this.f142673h + ", puts=" + this.f142674i + ", evictions=" + this.f142675j + ", currentSize=" + this.f142671f + ", maxSize=" + this.f142670e + "\nStrategy=" + this.f142666a);
    }

    public final void k() {
        u(this.f142670e);
    }

    public long l() {
        return this.f142675j;
    }

    public long m() {
        return this.f142671f;
    }

    @Nullable
    public final synchronized Bitmap p(int i10, int i11, @Nullable Bitmap.Config config) {
        Bitmap bitmapE;
        try {
            g(config);
            bitmapE = this.f142666a.e(i10, i11, config != null ? config : f142665l);
            if (bitmapE == null) {
                if (Log.isLoggable(f142664k, 3)) {
                    Log.d(f142664k, "Missing bitmap=" + this.f142666a.a(i10, i11, config));
                }
                this.f142673h++;
            } else {
                this.f142672g++;
                this.f142671f -= (long) this.f142666a.b(bitmapE);
                this.f142669d.b(bitmapE);
                t(bitmapE);
            }
            if (Log.isLoggable(f142664k, 2)) {
                Log.v(f142664k, "Get bitmap=" + this.f142666a.a(i10, i11, config));
            }
            i();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapE;
    }

    public long q() {
        return this.f142672g;
    }

    public long s() {
        return this.f142673h;
    }

    public final synchronized void u(long j10) {
        while (this.f142671f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f142666a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable(f142664k, 5)) {
                        Log.w(f142664k, "Size mismatch, resetting");
                        j();
                    }
                    this.f142671f = 0L;
                    return;
                }
                this.f142669d.b(bitmapRemoveLast);
                this.f142671f -= (long) this.f142666a.b(bitmapRemoveLast);
                this.f142675j++;
                if (Log.isLoggable(f142664k, 3)) {
                    Log.d(f142664k, "Evicting bitmap=" + this.f142666a.c(bitmapRemoveLast));
                }
                i();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l(long j10) {
        this(j10, o(), n());
    }

    public l(long j10, Set<Bitmap.Config> set) {
        this(j10, o(), set);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements a {
        @Override // wb.l.a
        public void a(Bitmap bitmap) {
        }

        @Override // wb.l.a
        public void b(Bitmap bitmap) {
        }
    }
}
