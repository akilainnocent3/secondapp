package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class l0i implements myh<Object> {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ myh b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
    public static final class a extends x1b {
        public l0i a;
        public /* synthetic */ Object b;
        public int c;
        public Object e;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return l0i.this.emit(null, this);
        }
    }

    public l0i(myh myhVar, Function2 function2) {
        this.a = function2;
        this.b = myhVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L23;
     */
    @Override // defpackage.myh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, defpackage.v1b<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof l0i.a
            if (r0 == 0) goto L13
            r0 = r8
            l0i$a r0 = (l0i.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            l0i$a r0 = new l0i$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            l0i r6 = r0.a
            defpackage.uj50.b(r8)
            goto L65
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L33:
            java.lang.Object r7 = r0.e
            l0i r6 = r0.a
            defpackage.uj50.b(r8)
            goto L4d
        L3b:
            defpackage.uj50.b(r8)
            r0.a = r6
            r0.e = r7
            r0.c = r5
            kotlin.jvm.functions.Function2 r8 = r6.a
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L4d
            goto L63
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L64
            myh r8 = r6.b
            r0.a = r6
            r0.e = r3
            r0.c = r4
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L65
        L63:
            return r1
        L64:
            r5 = 0
        L65:
            if (r5 == 0) goto L6a
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L6a:
            t1 r7 = new t1
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0i.emit(java.lang.Object, v1b):java.lang.Object");
    }
}
