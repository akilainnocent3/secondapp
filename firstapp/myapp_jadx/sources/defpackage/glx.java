package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class glx {
    public llx a;
    public llx b;
    public Function0<? extends v5b> c = new a();
    public v5b d;

    public static final class a extends qlr implements Function0<v5b> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v5b invoke() {
            return glx.this.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, long r11, defpackage.x1b r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.hlx
            if (r0 == 0) goto L14
            r0 = r13
            hlx r0 = (defpackage.hlx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            hlx r0 = new hlx
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.a
            y5b r1 = defpackage.y5b.a
            int r2 = r13.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.uj50.b(r0)
            goto L7b
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L33:
            defpackage.uj50.b(r0)
            goto L5b
        L37:
            defpackage.uj50.b(r0)
            llx r0 = r8.a
            if (r0 == 0) goto L49
            boolean r2 = r0.C
            if (r2 == 0) goto L49
            hvg0 r0 = defpackage.obl0.a(r0)
            llx r0 = (defpackage.llx) r0
            goto L4a
        L49:
            r0 = r3
        L4a:
            r6 = 0
            if (r0 != 0) goto L60
            llx r8 = r8.b
            if (r8 == 0) goto L7f
            r13.c = r5
            java.lang.Object r0 = r8.X1(r9, r11, r13)
            if (r0 != r1) goto L5b
            goto L7a
        L5b:
            exh0 r0 = (defpackage.exh0) r0
            long r6 = r0.a
            goto L7f
        L60:
            llx r8 = r8.a
            if (r8 == 0) goto L6f
            boolean r0 = r8.C
            if (r0 == 0) goto L6f
            hvg0 r8 = defpackage.obl0.a(r8)
            r3 = r8
            llx r3 = (defpackage.llx) r3
        L6f:
            r8 = r3
            if (r8 == 0) goto L7f
            r13.c = r4
            java.lang.Object r0 = r8.X1(r9, r11, r13)
            if (r0 != r1) goto L7b
        L7a:
            return r1
        L7b:
            exh0 r0 = (defpackage.exh0) r0
            long r6 = r0.a
        L7f:
            exh0 r8 = new exh0
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glx.a(long, long, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, x1b x1bVar) {
        ilx ilxVar;
        long j2;
        if (x1bVar instanceof ilx) {
            ilxVar = (ilx) x1bVar;
            int i = ilxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilxVar.c = i - Integer.MIN_VALUE;
            } else {
                ilxVar = new ilx(this, x1bVar);
            }
        } else {
            ilxVar = new ilx(this, x1bVar);
        }
        Object objK1 = ilxVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ilxVar.c;
        llx llxVar = null;
        if (i2 == 0) {
            uj50.b(objK1);
            llx llxVar2 = this.a;
            if (llxVar2 != null && llxVar2.C) {
                llxVar = (llx) obl0.a(llxVar2);
            }
            if (llxVar != null) {
                ilxVar.c = 1;
                objK1 = llxVar.k1(j, ilxVar);
                if (objK1 == y5bVar) {
                    return y5bVar;
                }
            } else {
                j2 = 0;
            }
            return new exh0(j2);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objK1);
        j2 = ((exh0) objK1).a;
        return new exh0(j2);
    }

    public final v5b c() {
        v5b v5bVarInvoke = this.c.invoke();
        if (v5bVarInvoke != null) {
            return v5bVarInvoke;
        }
        ib5.a("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
