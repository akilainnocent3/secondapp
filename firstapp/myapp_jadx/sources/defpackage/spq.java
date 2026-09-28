package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lspq;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class spq extends j8i0 {
    public final wwd0 A;
    public final wwd0 B;
    public final v340 C;
    public final v340 D;
    public final wwd0 E;
    public final t340 F;
    public final t340 G;
    public final wwd0 H;
    public final wwd0 I;
    public final t340 J;
    public final v340 K;
    public final t340 L;
    public final wwd0 M;
    public final t340 N;
    public final t340 O;
    public final ku90<Unit> P;
    public final wwd0 Q;
    public final wwd0 R;
    public final v340 S;
    public boolean T;
    public final v7k a;
    public final j7q b;
    public final fjr c;
    public final i6u d;
    public final drq e;
    public final mgb0 f;
    public final rdd0 i;
    public final j5u v;
    public final odd w;
    public final i8r y;
    public final ku90<lmq> z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ipq.values().length];
            try {
                iArr[ipq.Favorites.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ipq.Countries.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ipq.NextDraw.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[fpq.values().length];
            try {
                iArr2[fpq.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[fpq.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public spq(vu60 vu60Var, v7k v7kVar, b8k b8kVar, j7q j7qVar, nnb nnbVar, icq icqVar, i3k i3kVar, fjr fjrVar, i6u i6uVar, drq drqVar, mgb0 mgb0Var, rdd0 rdd0Var, j5u j5uVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        vu60Var.getClass();
        j7qVar.getClass();
        fjrVar.getClass();
        i6uVar.getClass();
        drqVar.getClass();
        mgb0Var.getClass();
        rdd0Var.getClass();
        this.a = v7kVar;
        this.b = j7qVar;
        this.c = fjrVar;
        this.d = i6uVar;
        this.e = drqVar;
        this.f = mgb0Var;
        this.i = rdd0Var;
        this.v = j5uVar;
        this.w = oddVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.y = (i8r) fnf.a(vu60Var, jq40.a(i8r.class), o2gVar);
        this.z = new ku90<>();
        wwd0 wwd0VarA = xwd0.a(-1L);
        this.A = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(lk50.b.a);
        this.B = wwd0VarA2;
        v340 v340VarA1 = A1(new sqq(wwd0VarA2), new kmq(0));
        this.C = v340VarA1;
        l1i l1iVarA = b8kVar.a();
        n1a0 n1a0Var = n1a0.c;
        this.D = A1(l1iVarA, n1a0Var);
        wwd0 wwd0VarA3 = xwd0.a(n1a0Var);
        this.E = wwd0VarA3;
        this.F = z1(new pqq(z1(new n1i(wwd0VarA3, b8kVar.a(), new dqq(3, null))), this));
        ts5 ts5Var = i6uVar.k;
        ArrayList arrayList = new ArrayList(1);
        ss5 ss5Var = new ss5[]{ts5Var}[0];
        arrayList.add(uzh.b(r0i.e(new yzh(new hqq(ss5Var.a()), new gqq(3, null)), new iqq(ss5Var.b()))));
        this.G = z1(r0i.f(uzh.b(r0i.f(new eqq(wwd0VarA), new fqq(null, arrayList))), new uqq(null, this)));
        this.H = xwd0.a(fpq.b);
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.I = wwd0VarA4;
        this.J = z1(r0i.f(new tqq(wwd0VarA2), new mqq(null, this)));
        this.K = A1(new n1i(new f1i(wwd0VarA4), v340VarA1, new kqq(3, null)), n1a0Var);
        this.L = z1(new f1i(r0i.f(wwd0VarA2, new g3k(null, i3kVar))));
        xf00 xf00Var = xf00.i;
        xf00Var.getClass();
        this.M = xwd0.a(xf00Var);
        ss5[] ss5VarArr = {i6uVar.i, ts5Var};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            ss5 ss5Var2 = ss5VarArr[i];
            arrayList2.add(uzh.b(r0i.e(new yzh(new hqq(ss5Var2.a()), new gqq(3, null)), new iqq(ss5Var2.b()))));
        }
        t340 t340VarZ1 = z1(r0i.f(uzh.b(r0i.f(new eqq(this.A), new fqq(null, arrayList2))), new vqq(null, this)));
        t340 t340VarZ2 = z1(r0i.f(this.f.isLoginFlow(), new nqq(null, nnbVar, b8kVar, this)));
        this.N = t340VarZ2;
        t340 t340VarZ3 = z1(r1i.b(this.J, t340VarZ1, this.G, t340VarZ2, new aqq(5, null)));
        this.O = t340VarZ3;
        t340 t340VarZ4 = z1(r0i.f(this.B, new oqq(null, this)));
        ku90<Unit> ku90Var = new ku90<>();
        this.P = ku90Var;
        wwd0 wwd0VarA5 = xwd0.a(null);
        this.Q = wwd0VarA5;
        v340 v340VarA2 = A1(r1i.a(this.H, t340VarZ4, A1(new rqq(icqVar.a(z1(new qqq(new f1i(wwd0VarA5))), ku90Var, null)), b7r.b.a), new xqq(4, null)), gsq.b.a);
        wwd0 wwd0VarA6 = xwd0.a(y5q.a.a);
        this.R = wwd0VarA6;
        this.S = A1(r1i.b(v340VarA2, this.B, wwd0VarA6, new n1i(this.f.isLoginFlow(), this.C, new lqq(3, null)), new wqq(5, null)), new epq(null, 15));
        ej5.c(o8i0.d(this), this.w, null, new kpq(null, this), 2);
        djr.a(this.i, new cjr.o(this.y.a));
        ej5.c(o8i0.d(this), this.w, null, new lpq(b8kVar, this, null), 2);
        kzh.d(new g1i(this.H, new mpq(null, this)), o8i0.d(this));
        ej5.c(o8i0.d(this), this.w, null, new npq(null, this), 2);
        kzh.d(ozh.c(new g1i(t340VarZ3, new opq(null, this)), this.w), o8i0.d(this));
        kzh.d(ozh.c(new g1i(v340VarA2, new ppq(null, this)), this.w), o8i0.d(this));
        kzh.d(ozh.c(new g1i(this.H, new qpq(null, this)), this.w), o8i0.d(this));
        kzh.d(ozh.c(new g1i(this.I, new rpq(null, this)), this.w), o8i0.d(this));
    }

    public final v340 A1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.w), o8i0.d(this), q490.a.a, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2 A[PHI: r8 r9
      0x00d2: PHI (r8v7 kmq) = (r8v1 kmq), (r8v14 kmq) binds: [B:39:0x00ce, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r9v15 java.lang.Object) = (r9v11 java.lang.Object), (r9v1 java.lang.Object) binds: [B:39:0x00ce, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f A[PHI: r9
      0x012f: PHI (r9v24 java.lang.Object) = (r9v14 java.lang.Object), (r9v1 java.lang.Object) binds: [B:61:0x012b, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:78:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0197, code lost:
    
        if (kotlin.Unit.a == r1) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(defpackage.kmq r8, defpackage.x1b r9) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spq.x1(kmq, x1b):java.lang.Object");
    }

    public final void y1() {
        wwd0 wwd0Var;
        Object value;
        ArrayList arrayList;
        do {
            wwd0Var = this.E;
            value = wwd0Var.getValue();
            Iterable iterable = (Iterable) this.D.a.getValue();
            arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((erq) it.next()).a);
            }
        } while (!wwd0Var.g(value, a4h.f(arrayList)));
    }

    public final t340 z1(lyh lyhVar) {
        return e1i.d(lyhVar, o8i0.d(this), q490.a.a, 1);
    }
}
