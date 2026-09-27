package o5;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import java.io.IOException;
import u4.l1;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class o implements y.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f118783g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f118784h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f118785i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f118786j = "DMCodecAdapterFactory";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Context f118787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final zi.u0<HandlerThread> f118788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final zi.u0<HandlerThread> f118789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f118790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f118791f;

    @Deprecated
    public o() {
        this.f118790e = 0;
        this.f118791f = true;
        this.f118787b = null;
        this.f118788c = null;
        this.f118789d = null;
    }

    @Override // o5.y.b
    public y a(y.a aVar) throws IOException {
        zi.u0<HandlerThread> u0Var;
        int i10 = this.f118790e;
        if (i10 != 1 && (i10 != 0 || !e())) {
            return new c1.b().a(aVar);
        }
        int iN = l1.n(aVar.f118805c.f13642p);
        x4.d0.h("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + b2.W0(iN));
        zi.u0<HandlerThread> u0Var2 = this.f118788c;
        g.b bVar = (u0Var2 == null || (u0Var = this.f118789d) == null) ? new g.b(iN) : new g.b(u0Var2, u0Var);
        bVar.e(this.f118791f);
        return bVar.a(aVar);
    }

    @qj.a
    @x4.t
    public o b(boolean z10) {
        this.f118791f = z10;
        return this;
    }

    @qj.a
    public o c() {
        this.f118790e = 2;
        return this;
    }

    @qj.a
    public o d() {
        this.f118790e = 1;
        return this;
    }

    public final boolean e() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f118787b;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    public o(Context context) {
        this(context, null, null);
    }

    public o(Context context, @Nullable zi.u0<HandlerThread> u0Var, @Nullable zi.u0<HandlerThread> u0Var2) {
        this.f118787b = context;
        this.f118790e = 0;
        this.f118791f = true;
        this.f118788c = u0Var;
        this.f118789d = u0Var2;
    }
}
