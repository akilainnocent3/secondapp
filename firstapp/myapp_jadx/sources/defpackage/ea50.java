package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ea50<TranscodeType> extends m52<ea50<TranscodeType>> {
    public final Context L;
    public final xa50 M;
    public final Class<TranscodeType> N;
    public final wzk O;
    public ytg0<?, ? super TranscodeType> P;
    public Object Q;
    public ArrayList R;
    public ea50<TranscodeType> S;
    public ea50<TranscodeType> T;
    public Float U;
    public final boolean V = true;
    public boolean W;
    public boolean X;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[lw20.values().length];
            b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new hb50().e(hre.c).q(lw20.d).x(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ea50(com.bumptech.glide.a aVar, xa50 xa50Var, Class<TranscodeType> cls, Context context) {
        hb50 hb50Var;
        this.M = xa50Var;
        this.N = cls;
        this.L = context;
        ox0 ox0Var = xa50Var.a.c.e;
        ytg0<?, ? super TranscodeType> ytg0Var = (ytg0) ox0Var.get(cls);
        if (ytg0Var == null) {
            for (Map.Entry entry : (ox0.a) ox0Var.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ytg0Var = (ytg0) entry.getValue();
                }
            }
        }
        this.P = ytg0Var == null ? wzk.i : ytg0Var;
        this.O = aVar.c;
        Iterator<wa50<Object>> it = xa50Var.w.iterator();
        while (it.hasNext()) {
            E((wa50) it.next());
        }
        synchronized (xa50Var) {
            hb50Var = xa50Var.y;
        }
        a(hb50Var);
    }

    public final ea50<TranscodeType> E(wa50<TranscodeType> wa50Var) {
        if (this.I) {
            return c().E(wa50Var);
        }
        if (wa50Var != null) {
            ArrayList arrayList = this.R;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.R = arrayList;
            }
            arrayList.add(wa50Var);
        }
        t();
        return this;
    }

    @Override // defpackage.m52
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final ea50<TranscodeType> a(m52<?> m52Var) {
        gm20.b(m52Var);
        return (ea50) super.a(m52Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    public final ca50 H(int i, int i2, m52 m52Var, lw20 lw20Var, ha50 ha50Var, wa50 wa50Var, d5f0 d5f0Var, ytg0 ytg0Var, Object obj, Executor executor) {
        ha50 scgVar;
        ha50 ha50Var2;
        ea50<TranscodeType> ea50Var;
        ca50 ca50VarQ;
        vpf0 vpf0Var;
        int i3;
        int i4;
        ea50<TranscodeType> ea50Var2;
        if (this.T != null) {
            scgVar = new scg(obj, ha50Var);
            ha50Var2 = scgVar;
        } else {
            scgVar = ha50Var;
            ha50Var2 = null;
        }
        ea50<TranscodeType> ea50Var3 = this.S;
        if (ea50Var3 == null) {
            if (this.U != null) {
                vpf0Var = new vpf0(obj, scgVar);
                pv90 pv90VarQ = Q(i, i2, m52Var, lw20Var, vpf0Var, wa50Var, d5f0Var, ytg0Var, obj, executor);
                pv90 pv90VarQ2 = Q(i, i2, m52Var.clone().w(this.U.floatValue()), K(lw20Var), vpf0Var, wa50Var, d5f0Var, ytg0Var, obj, executor);
                vpf0Var.c = pv90VarQ;
                vpf0Var.d = pv90VarQ2;
                ea50Var = this;
            } else {
                m52Var = m52Var;
                ea50Var = this;
                ca50VarQ = ea50Var.Q(i, i2, m52Var, lw20Var, scgVar, wa50Var, d5f0Var, ytg0Var, obj, executor);
            }
            if (ha50Var2 == null) {
                return ca50VarQ;
            }
            ea50<TranscodeType> ea50Var4 = ea50Var.T;
            i3 = ea50Var4.z;
            i4 = ea50Var4.y;
            if (erh0.i(i, i2)) {
                ea50Var2 = ea50Var.T;
                if (!erh0.i(ea50Var2.z, ea50Var2.y)) {
                    i3 = m52Var.z;
                    i4 = m52Var.y;
                }
            }
            ea50<TranscodeType> ea50Var5 = ea50Var.T;
            scg scgVar2 = ha50Var2;
            ca50 ca50VarH = ea50Var5.H(i3, i4, ea50Var5, ea50Var5.d, scgVar2, wa50Var, d5f0Var, ea50Var5.P, obj, executor);
            scgVar2.c = ca50VarQ;
            scgVar2.d = ca50VarH;
            return scgVar2;
        }
        if (this.X) {
            ib5.a("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            return null;
        }
        ytg0 ytg0Var2 = ea50Var3.V ? ytg0Var : ea50Var3.P;
        lw20 lw20VarK = m52.l(ea50Var3.a, 8) ? this.S.d : K(lw20Var);
        ea50<TranscodeType> ea50Var6 = this.S;
        int i5 = ea50Var6.z;
        int i6 = ea50Var6.y;
        if (erh0.i(i, i2)) {
            ea50<TranscodeType> ea50Var7 = this.S;
            if (!erh0.i(ea50Var7.z, ea50Var7.y)) {
                i5 = m52Var.z;
                i6 = m52Var.y;
            }
        }
        vpf0Var = new vpf0(obj, scgVar);
        pv90 pv90VarQ3 = Q(i, i2, m52Var, lw20Var, vpf0Var, wa50Var, d5f0Var, ytg0Var, obj, executor);
        this.X = true;
        ea50<TranscodeType> ea50Var8 = this.S;
        ca50 ca50VarH2 = ea50Var8.H(i5, i6, ea50Var8, lw20VarK, vpf0Var, wa50Var, d5f0Var, ytg0Var2, obj, executor);
        this.X = false;
        vpf0Var.c = pv90VarQ3;
        vpf0Var.d = ca50VarH2;
        ea50Var = this;
        ca50VarQ = vpf0Var;
        if (ha50Var2 == null) {
            return ca50VarQ;
        }
        ea50<TranscodeType> ea50Var9 = ea50Var.T;
        i3 = ea50Var9.z;
        i4 = ea50Var9.y;
        if (erh0.i(i, i2)) {
            ea50Var2 = ea50Var.T;
            if (!erh0.i(ea50Var2.z, ea50Var2.y)) {
                i3 = m52Var.z;
                i4 = m52Var.y;
            }
        }
        ea50<TranscodeType> ea50Var10 = ea50Var.T;
        scg scgVar3 = ha50Var2;
        ca50 ca50VarH3 = ea50Var10.H(i3, i4, ea50Var10, ea50Var10.d, scgVar3, wa50Var, d5f0Var, ea50Var10.P, obj, executor);
        scgVar3.c = ca50VarQ;
        scgVar3.d = ca50VarH3;
        return scgVar3;
    }

    @Override // defpackage.m52
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ea50<TranscodeType> clone() {
        ea50<TranscodeType> ea50Var = (ea50) super.clone();
        ea50Var.P = ea50Var.P.clone();
        if (ea50Var.R != null) {
            ea50Var.R = new ArrayList(ea50Var.R);
        }
        ea50<TranscodeType> ea50Var2 = ea50Var.S;
        if (ea50Var2 != null) {
            ea50Var.S = ea50Var2.c();
        }
        ea50<TranscodeType> ea50Var3 = ea50Var.T;
        if (ea50Var3 != null) {
            ea50Var.T = ea50Var3.c();
        }
        return ea50Var;
    }

    public final ea50<TranscodeType> J(ea50<TranscodeType> ea50Var) {
        if (this.I) {
            return c().J(ea50Var);
        }
        this.T = ea50Var;
        t();
        return this;
    }

    public final lw20 K(lw20 lw20Var) {
        int iOrdinal = lw20Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return lw20.a;
        }
        if (iOrdinal == 2) {
            return lw20.b;
        }
        if (iOrdinal == 3) {
            return lw20.c;
        }
        hoc.a(this.d, "unknown priority: ");
        return null;
    }

    public final d5f0 L(d5f0 d5f0Var, ta50 ta50Var, m52 m52Var, Executor executor) {
        gm20.b(d5f0Var);
        if (!this.W) {
            hb5.a("You must call #load() before calling #into()");
            return null;
        }
        Object obj = new Object();
        ytg0<?, ? super TranscodeType> ytg0Var = this.P;
        ca50 ca50VarH = H(m52Var.z, m52Var.y, m52Var, m52Var.d, null, ta50Var, d5f0Var, ytg0Var, obj, executor);
        ca50 ca50VarA = d5f0Var.a();
        if (ca50VarH.f(ca50VarA) && (m52Var.w || !ca50VarA.c())) {
            gm20.c(ca50VarA, "Argument must not be null");
            if (!ca50VarA.isRunning()) {
                ca50VarA.k();
            }
            return d5f0Var;
        }
        this.M.n(d5f0Var);
        d5f0Var.j(ca50VarH);
        xa50 xa50Var = this.M;
        synchronized (xa50Var) {
            xa50Var.f.a.add(d5f0Var);
            kb50 kb50Var = xa50Var.d;
            kb50Var.a.add(ca50VarH);
            if (kb50Var.c) {
                ca50VarH.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                kb50Var.b.add(ca50VarH);
            } else {
                ca50VarH.k();
            }
        }
        return d5f0Var;
    }

    public final s9i0<ImageView, TranscodeType> M(ImageView imageView) {
        m52 m52VarM;
        s9i0<ImageView, TranscodeType> fdfVar;
        erh0.a();
        gm20.b(imageView);
        if (!m52.l(this.a, 2048) && this.C && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    m52VarM = c().m(x6f.c, new gv6());
                    break;
                case 2:
                    m52VarM = c().s(x6f.b, new hv6(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    m52VarM = c().s(x6f.a, new nth(), false);
                    break;
                case 6:
                    m52VarM = c().s(x6f.b, new hv6(), false);
                    break;
                default:
                    m52VarM = this;
                    break;
            }
        } else {
            m52VarM = this;
        }
        j4d j4dVar = this.O.c;
        Class<TranscodeType> cls = this.N;
        if (Bitmap.class.equals(cls)) {
            fdfVar = new re4(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                zqh0.a(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)");
                return null;
            }
            fdfVar = new fdf(imageView);
        }
        L(fdfVar, null, m52VarM, fug.a);
        return fdfVar;
    }

    public final ea50<TranscodeType> N(wa50<TranscodeType> wa50Var) {
        if (this.I) {
            return c().N(wa50Var);
        }
        this.R = null;
        return E(wa50Var);
    }

    public final ea50<TranscodeType> O(Integer num) {
        PackageInfo packageInfo;
        ea50<TranscodeType> ea50VarP = P(num);
        Context context = this.L;
        ea50<TranscodeType> ea50VarY = ea50VarP.y(context.getTheme());
        ConcurrentHashMap concurrentHashMap = av0.a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = av0.a;
        nlp nlpVar = (nlp) concurrentHashMap2.get(packageName);
        if (nlpVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            acy acyVar = new acy(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            nlp nlpVar2 = (nlp) concurrentHashMap2.putIfAbsent(packageName, acyVar);
            nlpVar = nlpVar2 == null ? acyVar : nlpVar2;
        }
        return ea50VarY.v(new qa0(context.getResources().getConfiguration().uiMode & 48, nlpVar));
    }

    public final ea50<TranscodeType> P(Object obj) {
        if (this.I) {
            return c().P(obj);
        }
        this.Q = obj;
        this.W = true;
        t();
        return this;
    }

    public final pv90 Q(int i, int i2, m52 m52Var, lw20 lw20Var, ha50 ha50Var, wa50 wa50Var, d5f0 d5f0Var, ytg0 ytg0Var, Object obj, Executor executor) {
        Object obj2 = this.Q;
        ArrayList arrayList = this.R;
        wzk wzkVar = this.O;
        n6g n6gVar = wzkVar.f;
        ytg0Var.getClass();
        return new pv90(this.L, wzkVar, obj, obj2, this.N, m52Var, i, i2, lw20Var, d5f0Var, wa50Var, arrayList, ha50Var, n6gVar, executor);
    }

    @Deprecated
    public final ea50 R() {
        if (this.I) {
            return c().R();
        }
        this.U = Float.valueOf(0.1f);
        t();
        return this;
    }

    public final ea50<TranscodeType> S(ea50<TranscodeType> ea50Var) {
        if (this.I) {
            return c().S(ea50Var);
        }
        this.S = ea50Var;
        t();
        return this;
    }

    @Override // defpackage.m52
    public final boolean equals(Object obj) {
        if (!(obj instanceof ea50)) {
            return false;
        }
        ea50 ea50Var = (ea50) obj;
        return super.equals(ea50Var) && Objects.equals(this.N, ea50Var.N) && this.P.equals(ea50Var.P) && Objects.equals(this.Q, ea50Var.Q) && Objects.equals(this.R, ea50Var.R) && Objects.equals(this.S, ea50Var.S) && Objects.equals(this.T, ea50Var.T) && Objects.equals(this.U, ea50Var.U) && this.V == ea50Var.V && this.W == ea50Var.W;
    }

    @Override // defpackage.m52
    public final int hashCode() {
        return erh0.g(this.W ? 1 : 0, erh0.g(this.V ? 1 : 0, erh0.h(erh0.h(erh0.h(erh0.h(erh0.h(erh0.h(erh0.h(super.hashCode(), this.N), this.P), this.Q), this.R), this.S), this.T), this.U)));
    }
}
