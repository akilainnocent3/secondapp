package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md f39198a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends rr.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f39199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f39200c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f39202e;

        public a(or.f fVar) {
            super(fVar);
        }

        @Override // rr.a
        public final Object invokeSuspend(Object obj) {
            this.f39200c = obj;
            this.f39202e |= Integer.MIN_VALUE;
            Object objA = hj.this.a(null, this);
            return objA == qr.d.l() ? objA : dr.i1.a(objA);
        }
    }

    public hj(md networkClient) {
        kotlin.jvm.internal.m0.p(networkClient, "networkClient");
        this.f39198a = networkClient;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002f, B:26:0x0056, B:28:0x005e, B:30:0x0064, B:35:0x006e, B:36:0x0073, B:37:0x0080, B:38:0x0081, B:39:0x009f), top: B:60:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0064 A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002f, B:26:0x0056, B:28:0x005e, B:30:0x0064, B:35:0x006e, B:36:0x0073, B:37:0x0080, B:38:0x0081, B:39:0x009f), top: B:60:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002f, B:26:0x0056, B:28:0x005e, B:30:0x0064, B:35:0x006e, B:36:0x0073, B:37:0x0080, B:38:0x0081, B:39:0x009f), top: B:60:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002f, B:26:0x0056, B:28:0x005e, B:30:0x0064, B:35:0x006e, B:36:0x0073, B:37:0x0080, B:38:0x0081, B:39:0x009f), top: B:60:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[Catch: all -> 0x00d1, TryCatch #1 {all -> 0x00d1, blocks: (B:48:0x00b8, B:50:0x00d0, B:53:0x00d4, B:54:0x00f8), top: B:59:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4 A[Catch: all -> 0x00d1, TryCatch #1 {all -> 0x00d1, blocks: (B:48:0x00b8, B:50:0x00d0, B:53:0x00d4, B:54:0x00f8), top: B:59:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x0081, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00d4, please report this as an issue */
    public final Object a(String str, or.f fVar) {
        a aVar;
        Throwable th2;
        Object objB;
        Throwable thE;
        qd qdVar;
        String strA;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f39202e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f39202e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f39200c;
        Object objL = qr.d.l();
        int i11 = aVar2.f39202e;
        if (i11 == 0) {
            dr.j1.n(objA);
            try {
                dr.i1.a aVar3 = dr.i1.f79460c;
                md mdVar = this.f39198a;
                aVar2.f39199b = str;
                aVar2.f39202e = 1;
                try {
                    objA = md.a.a(mdVar, str, null, aVar2, 2, null);
                    if (objA == objL) {
                        return objL;
                    }
                    str = str;
                    qdVar = (qd) objA;
                    if (qdVar.f()) {
                        throw new gj("Failed to fetch VAST. HTTP response code: " + qdVar.e(), rr.b.f(301));
                    }
                    strA = qdVar.a();
                    if (strA != null) {
                        if (strA.length() > 0) {
                            strA = null;
                        }
                        if (strA != null) {
                            objB = dr.i1.b(strA);
                        }
                    }
                    throw new gj("Received empty VAST response.", rr.b.f(303));
                } catch (Throwable th3) {
                    th2 = th3;
                    str = str;
                    dr.i1.a aVar4 = dr.i1.f79460c;
                    objB = dr.i1.b(dr.j1.a(th2));
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                dr.i1.a aVar5 = dr.i1.f79460c;
                objB = dr.i1.b(dr.j1.a(th2));
                thE = dr.i1.e(objB);
                if (thE == null) {
                    return objB;
                }
                try {
                    dr.i1.a aVar6 = dr.i1.f79460c;
                    sb.b("Error fetching VAST from URL: " + str, thE);
                    if (thE instanceof gj) {
                        throw thE;
                    }
                    throw new gj("Error fetching VAST from URL: " + str + ". " + thE.getMessage(), rr.b.f(301));
                } catch (Throwable th5) {
                    dr.i1.a aVar7 = dr.i1.f79460c;
                    return dr.i1.b(dr.j1.a(th5));
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f39199b;
            try {
                dr.j1.n(objA);
                qdVar = (qd) objA;
                if (qdVar.f()) {
                    throw new gj("Failed to fetch VAST. HTTP response code: " + qdVar.e(), rr.b.f(301));
                }
                strA = qdVar.a();
                if (strA != null) {
                    if (strA.length() > 0) {
                        strA = null;
                    }
                    if (strA != null) {
                        objB = dr.i1.b(strA);
                    }
                }
                throw new gj("Received empty VAST response.", rr.b.f(303));
            } catch (Throwable th6) {
                th = th6;
                th2 = th;
                dr.i1.a aVar8 = dr.i1.f79460c;
                objB = dr.i1.b(dr.j1.a(th2));
            }
        }
        thE = dr.i1.e(objB);
        if (thE == null) {
            return objB;
        }
        dr.i1.a aVar9 = dr.i1.f79460c;
        sb.b("Error fetching VAST from URL: " + str, thE);
        if (thE instanceof gj) {
            throw thE;
        }
        throw new gj("Error fetching VAST from URL: " + str + ". " + thE.getMessage(), rr.b.f(301));
    }
}
