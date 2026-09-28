package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onConfirmJoinRoomClicked$1", f = "PiggyBashViewModel.kt", l = {401, 402, 403, 409, 415}, m = "invokeSuspend", v = 1)
public final class dy00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ double e;
    public final /* synthetic */ ap20 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy00(vx00 vx00Var, long j, boolean z, double d, ap20 ap20Var, v1b<? super dy00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
        this.c = j;
        this.d = z;
        this.e = d;
        this.f = ap20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dy00(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dy00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0116 A[PHI: r0
      0x0116: PHI (r0v3 java.lang.Object) = (r0v2 java.lang.Object), (r0v11 java.lang.Object) binds: [B:57:0x0113, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x012a  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0127, code lost:
    
        if (kotlin.Unit.a == r9) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
    
        if (kotlin.Unit.a == r9) goto L68;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
