package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class iot extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean h0;
    public static final List<String> i0;
    public static final ThreadPoolExecutor j0;
    public String A;
    public final lot B;
    public boolean C;
    public boolean D;
    public wma E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public v750 L;
    public boolean M;
    public final Matrix N;
    public Bitmap O;
    public Canvas P;
    public Rect Q;
    public RectF R;
    public klr S;
    public Rect T;
    public Rect U;
    public RectF V;
    public RectF W;
    public Matrix X;
    public final float[] Y;
    public Matrix Z;
    public xmt a;
    public boolean a0;
    public final bpt b;
    public b11 b0;
    public final boolean c;
    public final Semaphore c0;
    public boolean d;
    public Handler d0;
    public boolean e;
    public ynt e0;
    public b f;
    public final eot f0;
    public float g0;
    public final ArrayList<a> i;
    public b8n v;
    public String w;
    public c8i y;
    public Map<String, Typeface> z;

    public interface a {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("NONE", 0);
            a = bVar;
            b bVar2 = new b("PLAY", 1);
            b = bVar2;
            b bVar3 = new b("RESUME", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    static {
        h0 = Build.VERSION.SDK_INT <= 25;
        i0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        j0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new apt());
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [eot] */
    public iot() {
        bpt bptVar = new bpt();
        bptVar.d = 1.0f;
        bptVar.e = false;
        bptVar.f = 0L;
        bptVar.i = 0.0f;
        bptVar.v = 0.0f;
        bptVar.w = 0;
        bptVar.y = -2.1474836E9f;
        bptVar.z = 2.1474836E9f;
        bptVar.B = false;
        bptVar.C = false;
        this.b = bptVar;
        this.c = true;
        this.d = false;
        this.e = false;
        this.f = b.a;
        this.i = new ArrayList<>();
        this.B = new lot();
        this.C = false;
        this.D = true;
        this.F = 255;
        this.K = false;
        this.L = v750.a;
        this.M = false;
        this.N = new Matrix();
        this.Y = new float[9];
        this.a0 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: dot
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                iot iotVar = this.a;
                b11 b11Var = iotVar.b0;
                if (b11Var == null) {
                    b11Var = b11.a;
                }
                if (b11Var == b11.b) {
                    iotVar.invalidateSelf();
                    return;
                }
                wma wmaVar = iotVar.E;
                if (wmaVar != null) {
                    wmaVar.t(iotVar.b.d());
                }
            }
        };
        this.c0 = new Semaphore(1);
        this.f0 = new Runnable() { // from class: eot
            /* JADX WARN: Type inference failed for: r2v3, types: [ynt] */
            @Override // java.lang.Runnable
            public final void run() {
                final iot iotVar = this.a;
                Semaphore semaphore = iotVar.c0;
                wma wmaVar = iotVar.E;
                if (wmaVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    wmaVar.t(iotVar.b.d());
                    if (iot.h0 && iotVar.a0) {
                        Handler handler = iotVar.d0;
                        if (handler == null) {
                            handler = new Handler(Looper.getMainLooper());
                            iotVar.d0 = handler;
                            iotVar.e0 = new Runnable() { // from class: ynt
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Drawable drawable = iotVar;
                                    Drawable.Callback callback = drawable.getCallback();
                                    if (callback != null) {
                                        callback.invalidateDrawable(drawable);
                                    }
                                }
                            };
                        }
                        handler.post(iotVar.e0);
                    }
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
            }
        };
        this.g0 = -3.4028235E38f;
        bptVar.addUpdateListener(animatorUpdateListener);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean j(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final <T> void a(final rmp rmpVar, final T t, final cpt<T> cptVar) {
        wma wmaVar = this.E;
        if (wmaVar == null) {
            this.i.add(new a() { // from class: wnt
                @Override // iot.a
                public final void run() {
                    this.a.a(rmpVar, t, cptVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (rmpVar == rmp.c) {
            wmaVar.i(cptVar, t);
        } else {
            smp smpVar = rmpVar.b;
            if (smpVar != null) {
                smpVar.i(cptVar, t);
            } else {
                ArrayList arrayList = new ArrayList();
                this.E.c(rmpVar, 0, arrayList, new rmp(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((rmp) arrayList.get(i)).b.i(cptVar, t);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t == vot.C) {
                y(this.b.d());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    public final boolean b(Context context) {
        xp40 xp40Var;
        if (this.d) {
            return true;
        }
        if (!this.c) {
            return false;
        }
        xp40 xp40Var2 = xp40.a;
        if (context != null) {
            Matrix matrix = srh0.a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                xp40Var = xp40Var2;
            } else {
                xp40Var = xp40.b;
            }
        } else {
            xp40Var = xp40Var2;
        }
        return xp40Var == xp40Var2;
    }

    public final void c() {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            return;
        }
        hep.a aVar = err.a;
        Rect rect = xmtVar.k;
        List list = Collections.EMPTY_LIST;
        wma wmaVar = new wma(this, new drr(list, xmtVar, "__container", -1L, drr.a.a, -1L, null, list, new qe0(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, drr.b.a, null, false, null, null, zup.a), xmtVar.j, xmtVar);
        this.E = wmaVar;
        if (this.H) {
            wmaVar.s(true);
        }
        this.E.L = this.D;
    }

    public final void d() {
        bpt bptVar = this.b;
        if (bptVar.B) {
            bptVar.cancel();
            if (!isVisible()) {
                this.f = b.a;
            }
        }
        this.a = null;
        this.E = null;
        this.v = null;
        this.g0 = -3.4028235E38f;
        bptVar.A = null;
        bptVar.y = -2.1474836E9f;
        bptVar.z = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        wma wmaVar = this.E;
        if (wmaVar == null) {
            return;
        }
        b11 b11Var = this.b0;
        if (b11Var == null) {
            b11Var = b11.a;
        }
        boolean z = b11Var == b11.b;
        eot eotVar = this.f0;
        ThreadPoolExecutor threadPoolExecutor = j0;
        bpt bptVar = this.b;
        Semaphore semaphore = this.c0;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (wmaVar.K == bptVar.d()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (wmaVar.K != bptVar.d()) {
                        threadPoolExecutor.execute(eotVar);
                    }
                }
                throw th;
            }
        }
        if (z && z()) {
            y(bptVar.d());
        }
        boolean z2 = this.e;
        boolean z3 = this.M;
        if (z2) {
            try {
                if (z3) {
                    m(canvas, wmaVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                lgt.a.getClass();
            }
        } else if (z3) {
            m(canvas, wmaVar);
        } else {
            g(canvas);
        }
        this.a0 = false;
        if (z) {
            semaphore.release();
            if (wmaVar.K == bptVar.d()) {
                return;
            }
            threadPoolExecutor.execute(eotVar);
        }
    }

    public final void e() {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            return;
        }
        v750 v750Var = this.L;
        int i = Build.VERSION.SDK_INT;
        boolean z = xmtVar.o;
        int i2 = xmtVar.p;
        int iOrdinal = v750Var.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.M = z2;
    }

    public final void g(Canvas canvas) {
        wma wmaVar = this.E;
        xmt xmtVar = this.a;
        if (wmaVar == null || xmtVar == null) {
            return;
        }
        Matrix matrix = this.N;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / xmtVar.k.width();
            float fHeight = bounds.height() / xmtVar.k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        wmaVar.j(canvas, matrix, this.F, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.F;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            return -1;
        }
        return xmtVar.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            return -1;
        }
        return xmtVar.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(boolean z) {
        HashSet<kot> hashSet = this.B.a;
        kot kotVar = kot.MergePathsApi19;
        boolean zAdd = z ? hashSet.add(kotVar) : hashSet.remove(kotVar);
        if (this.a == null || !zAdd) {
            return;
        }
        c();
    }

    public final Context i() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.a0) {
            return;
        }
        this.a0 = true;
        if ((!h0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        bpt bptVar = this.b;
        if (bptVar == null) {
            return false;
        }
        return bptVar.B;
    }

    public final void k() {
        this.i.clear();
        bpt bptVar = this.b;
        bptVar.h(true);
        Iterator it = bptVar.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(bptVar);
        }
        if (isVisible()) {
            return;
        }
        this.f = b.a;
    }

    public final void l() {
        if (this.E == null) {
            this.i.add(new a() { // from class: fot
                @Override // iot.a
                public final void run() {
                    this.a.l();
                }
            });
            return;
        }
        e();
        boolean zB = b(i());
        b bVar = b.a;
        bpt bptVar = this.b;
        if (zB || bptVar.getRepeatCount() == 0) {
            if (isVisible()) {
                bptVar.B = true;
                bptVar.b(bptVar.g());
                bptVar.i((int) (bptVar.g() ? bptVar.e() : bptVar.f()));
                bptVar.f = 0L;
                bptVar.w = 0;
                if (bptVar.B) {
                    bptVar.h(false);
                    Choreographer.getInstance().postFrameCallback(bptVar);
                }
                this.f = bVar;
            } else {
                this.f = b.b;
            }
        }
        if (b(i())) {
            return;
        }
        Iterator<String> it = i0.iterator();
        opu opuVarD = null;
        while (it.hasNext()) {
            opuVarD = this.a.d(it.next());
            if (opuVarD != null) {
                break;
            }
        }
        if (opuVarD != null) {
            p((int) opuVarD.b);
        } else {
            p((int) (bptVar.d < 0.0f ? bptVar.f() : bptVar.e()));
        }
        bptVar.h(true);
        bptVar.a(bptVar.g());
        if (isVisible()) {
            return;
        }
        this.f = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d3  */
    public final void m(Canvas canvas, wma wmaVar) {
        boolean z;
        if (this.a == null || wmaVar == null) {
            return;
        }
        if (this.P == null) {
            this.P = new Canvas();
            this.W = new RectF();
            this.X = new Matrix();
            this.Z = new Matrix();
            this.Q = new Rect();
            this.R = new RectF();
            this.S = new klr();
            this.T = new Rect();
            this.U = new Rect();
            this.V = new RectF();
        }
        canvas.getMatrix(this.X);
        canvas.getClipBounds(this.Q);
        Rect rect = this.Q;
        this.R.set(rect.left, rect.top, rect.right, rect.bottom);
        this.X.mapRect(this.R);
        f(this.Q, this.R);
        boolean z2 = this.D;
        RectF rectF = this.W;
        if (z2) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            wmaVar.f(rectF, null, false);
        }
        this.X.mapRect(this.W);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.W;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF3 = this.W;
            Rect rect2 = this.Q;
            rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        RectF rectF4 = this.W;
        if (!j(rectF4.left) || !j(rectF4.top) || !j(rectF4.right) || !j(rectF4.bottom)) {
            lgt.b("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.W.width());
        int iCeil2 = (int) Math.ceil(this.W.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            lgt.b("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ((long) iCeil) * ((long) iCeil2);
        if (j > 50000000) {
            lgt.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
            return;
        }
        Bitmap bitmap = this.O;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.O.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.O = bitmapCreateBitmap;
            this.P.setBitmap(bitmapCreateBitmap);
            this.a0 = true;
        } else if (this.O.getWidth() > iCeil || this.O.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.O, 0, 0, iCeil, iCeil2);
            this.O = bitmapCreateBitmap2;
            this.P.setBitmap(bitmapCreateBitmap2);
            this.a0 = true;
        }
        if (this.a0) {
            Matrix matrix = this.X;
            float[] fArr = this.Y;
            matrix.getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            Matrix matrix2 = this.X;
            Matrix matrix3 = this.N;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF5 = this.W;
            matrix3.postTranslate(-rectF5.left, -rectF5.top);
            matrix3.postScale(1.0f / f, 1.0f / f2);
            this.O.eraseColor(0);
            this.P.setMatrix(srh0.a);
            this.P.scale(f, f2);
            wmaVar.j(this.P, matrix3, this.F, null);
            this.X.invert(this.Z);
            this.Z.mapRect(this.V, this.W);
            f(this.U, this.V);
        }
        this.T.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.O, this.T, this.U, this.S);
    }

    public final void n() {
        if (this.E == null) {
            this.i.add(new a() { // from class: znt
                @Override // iot.a
                public final void run() {
                    this.a.n();
                }
            });
            return;
        }
        e();
        boolean zB = b(i());
        b bVar = b.a;
        bpt bptVar = this.b;
        if (zB || bptVar.getRepeatCount() == 0) {
            if (isVisible()) {
                bptVar.B = true;
                bptVar.h(false);
                Choreographer.getInstance().postFrameCallback(bptVar);
                bptVar.f = 0L;
                if (bptVar.g() && bptVar.v == bptVar.f()) {
                    bptVar.i(bptVar.e());
                } else if (!bptVar.g() && bptVar.v == bptVar.e()) {
                    bptVar.i(bptVar.f());
                }
                Iterator it = bptVar.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(bptVar);
                }
                this.f = bVar;
            } else {
                this.f = b.c;
            }
        }
        if (b(i())) {
            return;
        }
        p((int) (bptVar.d < 0.0f ? bptVar.f() : bptVar.e()));
        bptVar.h(true);
        bptVar.a(bptVar.g());
        if (isVisible()) {
            return;
        }
        this.f = bVar;
    }

    public final boolean o(xmt xmtVar) {
        if (this.a == xmtVar) {
            return false;
        }
        this.a0 = true;
        d();
        this.a = xmtVar;
        c();
        bpt bptVar = this.b;
        boolean z = bptVar.A == null;
        bptVar.A = xmtVar;
        if (z) {
            bptVar.j(Math.max(bptVar.y, xmtVar.l), Math.min(bptVar.z, xmtVar.m));
        } else {
            bptVar.j((int) xmtVar.l, (int) xmtVar.m);
        }
        float f = bptVar.v;
        bptVar.v = 0.0f;
        bptVar.i = 0.0f;
        bptVar.i((int) f);
        bptVar.c();
        y(bptVar.getAnimatedFraction());
        ArrayList<a> arrayList = this.i;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        xmtVar.a.a = this.G;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void p(final int i) {
        if (this.a != null) {
            this.b.i(i);
        } else {
            this.i.add(new a() { // from class: rnt
                @Override // iot.a
                public final void run() {
                    this.a.p(i);
                }
            });
        }
    }

    public final void q(final int i) {
        if (this.a == null) {
            this.i.add(new a() { // from class: unt
                @Override // iot.a
                public final void run() {
                    this.a.q(i);
                }
            });
        } else {
            bpt bptVar = this.b;
            bptVar.j(bptVar.y, i + 0.99f);
        }
    }

    public final void r(final String str) {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            this.i.add(new a() { // from class: bot
                @Override // iot.a
                public final void run() {
                    this.a.r(str);
                }
            });
            return;
        }
        opu opuVarD = xmtVar.d(str);
        if (opuVarD != null) {
            q((int) (opuVarD.b + opuVarD.c));
        } else {
            hb5.a(tug.a("Cannot find marker with name ", str, "."));
        }
    }

    public final void s(final int i, final int i2) {
        if (this.a == null) {
            this.i.add(new a() { // from class: tnt
                @Override // iot.a
                public final void run() {
                    this.a.s(i, i2);
                }
            });
        } else {
            this.b.j(i, i2 + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.F = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        lgt.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        b bVar = b.c;
        if (z) {
            b bVar2 = this.f;
            if (bVar2 == b.b) {
                l();
                return visible;
            }
            if (bVar2 == bVar) {
                n();
                return visible;
            }
        } else {
            if (this.b.B) {
                k();
                this.f = bVar;
                return visible;
            }
            if (zIsVisible) {
                this.f = b.a;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.clear();
        bpt bptVar = this.b;
        bptVar.h(true);
        bptVar.a(bptVar.g());
        if (isVisible()) {
            return;
        }
        this.f = b.a;
    }

    public final void t(final String str) {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            this.i.add(new a() { // from class: qnt
                @Override // iot.a
                public final void run() {
                    this.a.t(str);
                }
            });
            return;
        }
        opu opuVarD = xmtVar.d(str);
        if (opuVarD == null) {
            hb5.a(tug.a("Cannot find marker with name ", str, "."));
        } else {
            int i = (int) opuVarD.b;
            s(i, ((int) opuVarD.c) + i);
        }
    }

    public final void u(final String str, final String str2, final boolean z) {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            this.i.add(new a() { // from class: aot
                @Override // iot.a
                public final void run() {
                    this.a.u(str, str2, z);
                }
            });
            return;
        }
        opu opuVarD = xmtVar.d(str);
        if (opuVarD == null) {
            hb5.a(tug.a("Cannot find marker with name ", str, "."));
            return;
        }
        int i = (int) opuVarD.b;
        opu opuVarD2 = this.a.d(str2);
        if (opuVarD2 != null) {
            s(i, (int) (opuVarD2.b + (z ? 1.0f : 0.0f)));
        } else {
            hb5.a(tug.a("Cannot find marker with name ", str2, "."));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(final float f, final float f2) {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            this.i.add(new a() { // from class: snt
                @Override // iot.a
                public final void run() {
                    this.a.v(f, f2);
                }
            });
        } else {
            int iF = (int) rqv.f(xmtVar.l, xmtVar.m, f);
            xmt xmtVar2 = this.a;
            s(iF, (int) rqv.f(xmtVar2.l, xmtVar2.m, f2));
        }
    }

    public final void w(final int i) {
        if (this.a == null) {
            this.i.add(new a() { // from class: vnt
                @Override // iot.a
                public final void run() {
                    this.a.w(i);
                }
            });
        } else {
            bpt bptVar = this.b;
            bptVar.j(i, (int) bptVar.z);
        }
    }

    public final void x(final String str) {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            this.i.add(new a() { // from class: cot
                @Override // iot.a
                public final void run() {
                    this.a.x(str);
                }
            });
            return;
        }
        opu opuVarD = xmtVar.d(str);
        if (opuVarD != null) {
            w((int) opuVarD.b);
        } else {
            hb5.a(tug.a("Cannot find marker with name ", str, "."));
        }
    }

    public final void y(final float f) {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            this.i.add(new a() { // from class: hot
                @Override // iot.a
                public final void run() {
                    this.a.y(f);
                }
            });
        } else {
            this.b.i(rqv.f(xmtVar.l, xmtVar.m, f));
        }
    }

    public final boolean z() {
        xmt xmtVar = this.a;
        if (xmtVar == null) {
            return false;
        }
        float f = this.g0;
        float fD = this.b.d();
        this.g0 = fD;
        return Math.abs(fD - f) * xmtVar.b() >= 50.0f;
    }
}
