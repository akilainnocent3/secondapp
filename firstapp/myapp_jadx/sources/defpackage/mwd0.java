package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class mwd0 implements q490 {
    public final long a;
    public final long b;

    @c0d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<myh<? super o490>, Integer, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ int c;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super o490> myhVar, Integer num, v1b<? super Unit> v1bVar) {
            int iIntValue = num.intValue();
            a aVar = mwd0.this.new a(v1bVar);
            aVar.b = myhVar;
            aVar.c = iIntValue;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005f  */
        /* JADX WARN: Code duplicated, block: B:30:0x006c A[PHI: r0
          0x006c: PHI (r0v5 myh) = (r0v4 myh), (r0v8 myh) binds: [B:28:0x0069, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x0077 A[PHI: r0
          0x0077: PHI (r0v6 myh) = (r0v4 myh), (r0v5 myh), (r0v9 myh) binds: [B:26:0x005d, B:31:0x0074, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if (r13.emit(r0, r12) == r3) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        
            if (r0.emit(r13, r12) == r3) goto L35;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                mwd0 r0 = defpackage.mwd0.this
                long r1 = r0.b
                y5b r3 = defpackage.y5b.a
                int r4 = r12.a
                r5 = 0
                r6 = 5
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 1
                if (r4 == 0) goto L37
                if (r4 == r10) goto L33
                if (r4 == r9) goto L2d
                if (r4 == r8) goto L27
                if (r4 == r7) goto L21
                if (r4 != r6) goto L1b
                goto L33
            L1b:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r5
            L21:
                myh r0 = r12.b
                defpackage.uj50.b(r13)
                goto L77
            L27:
                myh r0 = r12.b
                defpackage.uj50.b(r13)
                goto L6c
            L2d:
                myh r0 = r12.b
                defpackage.uj50.b(r13)
                goto L59
            L33:
                defpackage.uj50.b(r13)
                goto L84
            L37:
                defpackage.uj50.b(r13)
                myh r13 = r12.b
                int r4 = r12.c
                if (r4 <= 0) goto L4b
                o490 r0 = defpackage.o490.a
                r12.a = r10
                java.lang.Object r12 = r13.emit(r0, r12)
                if (r12 != r3) goto L84
                goto L83
            L4b:
                long r10 = r0.a
                r12.b = r13
                r12.a = r9
                java.lang.Object r0 = defpackage.hkd.b(r10, r12)
                if (r0 != r3) goto L58
                goto L83
            L58:
                r0 = r13
            L59:
                r9 = 0
                int r13 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r13 <= 0) goto L77
                o490 r13 = defpackage.o490.b
                r12.b = r0
                r12.a = r8
                java.lang.Object r13 = r0.emit(r13, r12)
                if (r13 != r3) goto L6c
                goto L83
            L6c:
                r12.b = r0
                r12.a = r7
                java.lang.Object r13 = defpackage.hkd.b(r1, r12)
                if (r13 != r3) goto L77
                goto L83
            L77:
                o490 r13 = defpackage.o490.c
                r12.b = r5
                r12.a = r6
                java.lang.Object r12 = r0.emit(r13, r12)
                if (r12 != r3) goto L84
            L83:
                return r3
            L84:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: mwd0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<o490, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o490 o490Var, v1b<? super Boolean> v1bVar) {
            return ((b) create(o490Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(((o490) this.a) != o490.a);
        }
    }

    public mwd0(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            kb5.a(d020.a(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        kb5.a(d020.a(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.q490
    public final lyh<o490> a(uwd0<Integer> uwd0Var) {
        return uzh.b(new f0i(r0i.f(uwd0Var, new a(null)), new b(2, null)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mwd0)) {
            return false;
        }
        mwd0 mwd0Var = (mwd0) obj;
        return this.a == mwd0Var.a && this.b == mwd0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        ngs ngsVar = new ngs(2);
        long j = this.a;
        if (j > 0) {
            ngsVar.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            ngsVar.add("replayExpiration=" + j2 + "ms");
        }
        return j26.a(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.a0(kotlin.collections.a.a(ngsVar), null, null, null, null, 63), ')');
    }
}
