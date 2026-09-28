package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.e;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
public final class do90 {
    public final ln90 a;
    public final rdd0 b;
    public final y8j c;
    public jvd0 j;
    public final wwd0 m;
    public final wwd0 n;
    public final wwd0 o;
    public final wwd0 p;
    public final b390 d = d390.b(0, 1, null, 5);
    public final b390 e = d390.b(0, 1, null, 5);
    public final wwd0 f = xwd0.a(hug0.b);
    public final wwd0 g = xwd0.a(null);
    public final wwd0 h = xwd0.a(null);
    public final wwd0 i = xwd0.a(m2g.a);
    public final tuw k = uuw.a();
    public final wwd0 l = xwd0.a("");

    @c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl", f = "SimulationSettlementHandlerImpl.kt", l = {157, 158, 162, 171, 177, 179, 184}, m = "getTicketResult", v = 2)
    public static final class a extends x1b {
        public String a;
        public Object b;
        public /* synthetic */ Object c;
        public final /* synthetic */ do90 d;
        public int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, do90 do90Var) {
            super(v1bVar);
            this.d = do90Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.b(null, this);
        }
    }

    public do90(ln90 ln90Var, lo90 lo90Var, cq90 cq90Var, rdd0 rdd0Var, y8j y8jVar) {
        this.a = ln90Var;
        this.b = rdd0Var;
        this.c = y8jVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.m = xwd0.a(o2gVar);
        this.n = xwd0.a(t3g.a);
        this.o = xwd0.a(null);
        this.p = xwd0.a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a(long j, long j2, long j3, List list) {
        ArrayList arrayListH0 = CollectionsKt.H0(CollectionsKt.q0(CollectionsKt.t0(kotlin.collections.a.d(f.m(new e(j, j2), j3)), list.size())), list);
        ArrayList arrayList = new ArrayList();
        int size = arrayListH0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListH0.get(i2);
            i2++;
            Pair pair = (Pair) obj;
            if (((h6f0) pair.b).a.a() && ((h6f0) pair.b).b > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(Long.valueOf(((Number) ((Pair) obj2).a).longValue()));
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayListH0.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayListH0.get(i4);
            i4++;
            Pair pair2 = (Pair) obj3;
            if (!((h6f0) pair2.b).a.a() && ((h6f0) pair2.b).b > 0) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(l48.r(arrayList3, 10));
        int size4 = arrayList3.size();
        while (i < size4) {
            Object obj4 = arrayList3.get(i);
            i++;
            arrayList4.add(Long.valueOf(((Number) ((Pair) obj4).a).longValue()));
        }
        return new Pair(arrayList2, arrayList4);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079 A[PHI: r6
      0x0079: PHI (r6v4 java.lang.Object) = (r6v2 java.lang.Object), (r6v12 java.lang.Object) binds: [B:23:0x0075, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3 A[PHI: r6
      0x00b3: PHI (r6v13 java.lang.Object) = (r6v9 java.lang.Object), (r6v14 java.lang.Object) binds: [B:38:0x00b0, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        if (r5.emit(r2, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, defpackage.v1b<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do90.b(java.lang.String, v1b):java.lang.Object");
    }

    public final void c() {
        wwd0 wwd0Var;
        Object value;
        jvd0 jvd0Var = this.j;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.j = null;
        this.e.a(vm90.c.a);
        do {
            wwd0Var = this.o;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }
}
