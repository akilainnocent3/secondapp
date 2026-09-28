package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pv90<R> implements ca50, gx90 {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;
    public final String a;
    public final vxd0.a b;
    public final Object c;
    public final wa50<R> d;
    public final ha50 e;
    public final Context f;
    public final wzk g;
    public final Object h;
    public final Class<R> i;
    public final m52<?> j;
    public final int k;
    public final int l;
    public final lw20 m;
    public final d5f0<R> n;
    public final List<wa50<R>> o;
    public final swx.a p;
    public final Executor q;
    public qg50<R> r;
    public n6g.d s;
    public long t;
    public volatile n6g u;
    public a v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public int z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a(PBBetHistoryItemDTO.STATUS_PENDING, 0);
            a = aVar;
            a aVar2 = new a("RUNNING", 1);
            b = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            c = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            d = aVar4;
            a aVar5 = new a("FAILED", 4);
            e = aVar5;
            a aVar6 = new a("CLEARED", 5);
            f = aVar6;
            i = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    public pv90(Context context, wzk wzkVar, Object obj, Object obj2, Class cls, m52 m52Var, int i, int i2, lw20 lw20Var, d5f0 d5f0Var, wa50 wa50Var, ArrayList arrayList, ha50 ha50Var, n6g n6gVar, Executor executor) {
        swx.a aVar = swx.a;
        this.a = D ? String.valueOf(hashCode()) : null;
        this.b = new vxd0.a();
        this.c = obj;
        this.f = context;
        this.g = wzkVar;
        this.h = obj2;
        this.i = cls;
        this.j = m52Var;
        this.k = i;
        this.l = i2;
        this.m = lw20Var;
        this.n = d5f0Var;
        this.d = wa50Var;
        this.o = arrayList;
        this.e = ha50Var;
        this.u = n6gVar;
        this.p = aVar;
        this.q = executor;
        this.v = a.a;
        if (this.C == null && wzkVar.g.a.containsKey(vzk.c.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.ca50
    public final void a() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ca50
    public final boolean b() {
        boolean z;
        synchronized (this.c) {
            z = this.v == a.d;
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.v == a.d;
        }
        return z;
    }

    @Override // defpackage.ca50
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                a aVar = this.v;
                a aVar2 = a.f;
                if (aVar == aVar2) {
                    return;
                }
                g();
                qg50<R> qg50Var = this.r;
                if (qg50Var != null) {
                    this.r = null;
                } else {
                    qg50Var = null;
                }
                ha50 ha50Var = this.e;
                if (ha50Var == null || ha50Var.d(this)) {
                    this.n.h(h());
                }
                this.v = aVar2;
                if (qg50Var != null) {
                    this.u.getClass();
                    n6g.f(qg50Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gx90
    public final void d(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = D;
                    if (z) {
                        i("Got onSizeReady in " + agt.a(this.t));
                    }
                    if (this.v != a.c) {
                        return;
                    }
                    a aVar = a.b;
                    this.v = aVar;
                    float f = this.j.b;
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * f);
                    }
                    this.z = iRound;
                    this.A = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                    if (z) {
                        i("finished setup for calling load in " + agt.a(this.t));
                    }
                    n6g n6gVar = this.u;
                    wzk wzkVar = this.g;
                    Object obj3 = this.h;
                    m52<?> m52Var = this.j;
                    try {
                        try {
                            try {
                                try {
                                    this.s = n6gVar.b(wzkVar, obj3, m52Var.A, this.z, this.A, m52Var.F, this.i, this.m, m52Var.c, m52Var.E, m52Var.B, m52Var.J, m52Var.D, m52Var.w, m52Var.K, this, this.q);
                                    if (this.v != aVar) {
                                        this.s = null;
                                    }
                                    if (z) {
                                        i("finished onSizeReady in " + agt.a(this.t));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    @Override // defpackage.ca50
    public final boolean e() {
        boolean z;
        synchronized (this.c) {
            z = this.v == a.f;
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean f(ca50 ca50Var) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        m52<?> m52Var;
        lw20 lw20Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        m52<?> m52Var2;
        lw20 lw20Var2;
        int size2;
        boolean zA;
        boolean zK;
        if (ca50Var instanceof pv90) {
            synchronized (this.c) {
                try {
                    i = this.k;
                    i2 = this.l;
                    obj = this.h;
                    cls = this.i;
                    m52Var = this.j;
                    lw20Var = this.m;
                    List<wa50<R>> list = this.o;
                    size = list != null ? list.size() : 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            pv90 pv90Var = (pv90) ca50Var;
            synchronized (pv90Var.c) {
                try {
                    i3 = pv90Var.k;
                    i4 = pv90Var.l;
                    obj2 = pv90Var.h;
                    cls2 = pv90Var.i;
                    m52Var2 = pv90Var.j;
                    lw20Var2 = pv90Var.m;
                    List<wa50<R>> list2 = pv90Var.o;
                    size2 = list2 != null ? list2.size() : 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i == i3 && i2 == i4) {
                if (obj == null) {
                    zA = obj2 == null;
                } else {
                    zA = obj instanceof f2w ? ((f2w) obj).a() : obj.equals(obj2);
                }
                if (zA && cls.equals(cls2)) {
                    if (m52Var == null) {
                        zK = m52Var2 == null;
                    } else {
                        zK = m52Var.k(m52Var2);
                    }
                    if (zK && lw20Var == lw20Var2 && size == size2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void g() {
        if (this.B) {
            ib5.a("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.b.a();
        this.n.d(this);
        n6g.d dVar = this.s;
        if (dVar != null) {
            synchronized (n6g.this) {
                dVar.a.h(dVar.b);
            }
            this.s = null;
        }
    }

    public final Drawable h() {
        int i;
        Drawable drawable = this.x;
        if (drawable != null) {
            return drawable;
        }
        m52<?> m52Var = this.j;
        Drawable drawable2 = m52Var.i;
        this.x = drawable2;
        if (drawable2 != null || (i = m52Var.v) <= 0) {
            return drawable2;
        }
        Resources.Theme theme = m52Var.H;
        Context context = this.f;
        if (theme == null) {
            theme = context.getTheme();
        }
        Drawable drawableA = cdf.a(context, context, i, theme);
        this.x = drawableA;
        return drawableA;
    }

    public final void i(String str) {
        StringBuilder sbB = mq0.b(str, " this: ");
        sbB.append(this.a);
        Log.v("GlideRequest", sbB.toString());
    }

    @Override // defpackage.ca50
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            try {
                a aVar = this.v;
                z = aVar == a.b || aVar == a.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    public final void j(xzk xzkVar, int i) {
        boolean zL;
        boolean z;
        int i2;
        this.b.a();
        synchronized (this.c) {
            try {
                xzkVar.getClass();
                this.g.getClass();
                if (4 <= i) {
                    Log.w("Glide", "Load failed for [" + this.h + "] with dimensions [" + this.z + "x" + this.A + "]", xzkVar);
                    xzkVar.d();
                }
                Drawable drawableH = null;
                this.s = null;
                this.v = a.e;
                ha50 ha50Var = this.e;
                if (ha50Var != null) {
                    ha50Var.g(this);
                }
                boolean z2 = true;
                this.B = true;
                try {
                    List<wa50<R>> list = this.o;
                    if (list != null) {
                        zL = false;
                        for (wa50<R> wa50Var : list) {
                            Object obj = this.h;
                            d5f0<R> d5f0Var = this.n;
                            ha50 ha50Var2 = this.e;
                            zL |= wa50Var.l(xzkVar, obj, d5f0Var, ha50Var2 == null || !ha50Var2.getRoot().b());
                        }
                    } else {
                        zL = false;
                    }
                    wa50<R> wa50Var2 = this.d;
                    if (wa50Var2 != null) {
                        Object obj2 = this.h;
                        d5f0<R> d5f0Var2 = this.n;
                        ha50 ha50Var3 = this.e;
                        if (wa50Var2.l(xzkVar, obj2, d5f0Var2, ha50Var3 == null || !ha50Var3.getRoot().b())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!(z | zL)) {
                        ha50 ha50Var4 = this.e;
                        if (ha50Var4 != null && !ha50Var4.i(this)) {
                            z2 = false;
                        }
                        if (z2) {
                            if (this.h == null) {
                                Drawable drawable = this.y;
                                if (drawable == null) {
                                    this.j.getClass();
                                    this.y = null;
                                } else {
                                    drawableH = drawable;
                                }
                            }
                            if (drawableH == null) {
                                Drawable drawableA = this.w;
                                if (drawableA == null) {
                                    m52<?> m52Var = this.j;
                                    drawableH = m52Var.e;
                                    this.w = drawableH;
                                    if (drawableH == null && (i2 = m52Var.f) > 0) {
                                        Context context = this.f;
                                        Resources.Theme theme = m52Var.H;
                                        if (theme == null) {
                                            theme = context.getTheme();
                                        }
                                        drawableA = cdf.a(context, context, i2, theme);
                                        this.w = drawableA;
                                        drawableH = drawableA;
                                    }
                                } else {
                                    drawableH = drawableA;
                                }
                            }
                            if (drawableH == null) {
                                drawableH = h();
                            }
                            this.n.m(drawableH);
                        }
                    }
                    this.B = false;
                } catch (Throwable th) {
                    this.B = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.ca50
    public final void k() {
        synchronized (this.c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                int i = agt.b;
                this.t = SystemClock.elapsedRealtimeNanos();
                if (this.h == null) {
                    if (erh0.i(this.k, this.l)) {
                        this.z = this.k;
                        this.A = this.l;
                    }
                    Drawable drawable = this.y;
                    if (drawable == null) {
                        this.j.getClass();
                        drawable = null;
                        this.y = null;
                    }
                    j(new xzk("Received null model"), drawable == null ? 5 : 3);
                    return;
                }
                a aVar = this.v;
                if (aVar == a.b) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.d) {
                    l(this.r, cqc.e, false);
                    return;
                }
                List<wa50<R>> list = this.o;
                if (list != null) {
                    for (wa50<R> wa50Var : list) {
                    }
                }
                a aVar2 = a.c;
                this.v = aVar2;
                if (erh0.i(this.k, this.l)) {
                    d(this.k, this.l);
                } else {
                    this.n.i(this);
                }
                a aVar3 = this.v;
                if (aVar3 == a.b || aVar3 == aVar2) {
                    ha50 ha50Var = this.e;
                    if (ha50Var == null || ha50Var.i(this)) {
                        this.n.g(h());
                    }
                }
                if (D) {
                    i("finished run method in " + agt.a(this.t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(qg50<?> qg50Var, cqc cqcVar, boolean z) {
        this.b.a();
        qg50<?> qg50Var2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.s = null;
                    if (qg50Var == null) {
                        j(new xzk("Expected to receive a Resource<R> with an object of " + this.i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = qg50Var.get();
                    try {
                        if (obj == null || !this.i.isAssignableFrom(obj.getClass())) {
                            this.r = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.i);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(qg50Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            j(new xzk(sb.toString()), 5);
                        } else {
                            ha50 ha50Var = this.e;
                            if (ha50Var == null || ha50Var.j(this)) {
                                m(qg50Var, obj, cqcVar, z);
                                return;
                            } else {
                                this.r = null;
                                this.v = a.d;
                            }
                        }
                        this.u.getClass();
                        n6g.f(qg50Var);
                    } catch (Throwable th) {
                        qg50Var2 = qg50Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (qg50Var2 != null) {
                this.u.getClass();
                n6g.f(qg50Var2);
            }
            throw th3;
        }
    }

    public final void m(qg50<R> qg50Var, R r, cqc cqcVar, boolean z) {
        boolean z2;
        boolean z3 = true;
        ha50 ha50Var = this.e;
        boolean z4 = ha50Var == null || !ha50Var.getRoot().b();
        this.v = a.d;
        this.r = qg50Var;
        this.g.getClass();
        if (ha50Var != null) {
            ha50Var.h(this);
        }
        this.B = true;
        try {
            List<wa50<R>> list = this.o;
            if (list != null) {
                z2 = false;
                for (wa50<R> wa50Var : list) {
                    R r2 = r;
                    cqc cqcVar2 = cqcVar;
                    boolean zF = wa50Var.f(r2, this.h, this.n, cqcVar2, z4) | z2;
                    if (wa50Var instanceof yzg) {
                        zF |= ((yzg) wa50Var).a();
                    }
                    z2 = zF;
                    r = r2;
                    cqcVar = cqcVar2;
                }
            } else {
                z2 = false;
            }
            R r3 = r;
            cqc cqcVar3 = cqcVar;
            wa50<R> wa50Var2 = this.d;
            if (wa50Var2 == null || !wa50Var2.f(r3, this.h, this.n, cqcVar3, z4)) {
                z3 = false;
            }
            if (!(z2 | z3)) {
                this.p.getClass();
                this.n.e(r3);
            }
        } finally {
            this.B = false;
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.c) {
            obj = this.h;
            cls = this.i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
