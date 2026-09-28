package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment$progressBarVisibility$1$1", f = "RushFragment.kt", l = {4592, 4596, 4600, 4604, 4608, 4609, 4613, 4617}, m = "invokeSuspend", v = 1)
public final class y560 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public l560 a;
    public eo80 b;
    public eo80 c;
    public eo80 d;
    public int e;
    public int f;
    public int i;
    public final /* synthetic */ l560 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y560(l560 l560Var, v1b<? super y560> v1bVar) {
        super(2, v1bVar);
        this.v = l560Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y560(this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y560) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0107 A[PHI: r1 r5 r6 r7 r8
      0x0107: PHI (r1v7 int) = (r1v5 int), (r1v8 int) binds: [B:23:0x0103, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r5v4 int) = (r5v2 int), (r5v6 int) binds: [B:23:0x0103, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r6v3 eo80) = (r6v1 eo80), (r6v5 eo80) binds: [B:23:0x0103, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r7v4 eo80) = (r7v2 eo80), (r7v6 eo80) binds: [B:23:0x0103, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r8v5 l560) = (r8v1 l560), (r8v8 l560) binds: [B:23:0x0103, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0126  */
    /* JADX WARN: Code duplicated, block: B:32:0x014a  */
    /* JADX WARN: Code duplicated, block: B:36:0x016f A[PHI: r1 r2 r3 r5 r6
      0x016f: PHI (r1v13 int) = (r1v11 int), (r1v14 int) binds: [B:34:0x016c, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r2v6 int) = (r2v4 int), (r2v7 int) binds: [B:34:0x016c, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r3v5 eo80) = (r3v3 eo80), (r3v6 eo80) binds: [B:34:0x016c, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r5v12 eo80) = (r5v10 eo80), (r5v13 eo80) binds: [B:34:0x016c, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r6v13 l560) = (r6v9 l560), (r6v16 l560) binds: [B:34:0x016c, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0191 A[PHI: r1 r2 r3 r5 r6
      0x0191: PHI (r1v15 int) = (r1v13 int), (r1v16 int) binds: [B:37:0x018e, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r2v8 int) = (r2v6 int), (r2v9 int) binds: [B:37:0x018e, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r3v7 eo80) = (r3v5 eo80), (r3v8 eo80) binds: [B:37:0x018e, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r5v14 eo80) = (r5v12 eo80), (r5v15 eo80) binds: [B:37:0x018e, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r6v17 l560) = (r6v13 l560), (r6v20 l560) binds: [B:37:0x018e, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x01b3 A[PHI: r1 r2 r3 r5 r6
      0x01b3: PHI (r1v17 int) = (r1v15 int), (r1v19 int) binds: [B:40:0x01b0, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r2v10 int) = (r2v8 int), (r2v11 int) binds: [B:40:0x01b0, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r3v9 eo80) = (r3v7 eo80), (r3v12 eo80) binds: [B:40:0x01b0, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r5v16 eo80) = (r5v14 eo80), (r5v17 eo80) binds: [B:40:0x01b0, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r6v21 l560) = (r6v17 l560), (r6v24 l560) binds: [B:40:0x01b0, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d3, code lost:
    
        if (r6.a1(r12, r3, r11) == r0) goto L44;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y560.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
