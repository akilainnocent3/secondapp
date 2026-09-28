package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class dzh implements lyh<Object> {
    public final /* synthetic */ Function1 a;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", l = {109, 109}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public myh d;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return dzh.this.collect(null, this);
        }
    }

    public dzh(Function1 function1) {
        this.a = function1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L21;
     */
    @Override // defpackage.lyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.myh<? super java.lang.Object> r7, defpackage.v1b<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dzh.a
            if (r0 == 0) goto L13
            r0 = r8
            dzh$a r0 = (dzh.a) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dzh$a r0 = new dzh$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r8)
            goto L52
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            myh r7 = r0.d
            defpackage.uj50.b(r8)
            goto L47
        L37:
            defpackage.uj50.b(r8)
            r0.d = r7
            r0.b = r5
            kotlin.jvm.functions.Function1 r6 = r6.a
            java.lang.Object r8 = r6.invoke(r0)
            if (r8 != r1) goto L47
            goto L51
        L47:
            r0.d = r3
            r0.b = r4
            java.lang.Object r6 = r7.emit(r8, r0)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzh.collect(myh, v1b):java.lang.Object");
    }
}
