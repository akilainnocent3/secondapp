package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GooglePlayIntegrityVerifier$launchVerificationIfNeeded$1", f = "GooglePlayIntegrityVerifier.kt", l = {61, 67, 73, 74}, m = "invokeSuspend", v = 2)
public final class h5l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public sxo a;
    public int b;
    public final /* synthetic */ j5l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5l(j5l j5lVar, v1b<? super h5l> v1bVar) {
        super(2, v1bVar);
        this.c = j5lVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h5l(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h5l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5 A[PHI: r1 r11
      0x00b5: PHI (r1v4 sxo) = (r1v3 sxo), (r1v6 sxo) binds: [B:40:0x00b2, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r11v19 java.lang.Object) = (r11v17 java.lang.Object), (r11v0 java.lang.Object) binds: [B:40:0x00b2, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r0.h(r1, r10) == r2) goto L46;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
