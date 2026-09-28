package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixPendingDepositsUseCase$invoke$2$1", f = "GetPixPendingDepositsUseCase.kt", l = {48, 50, 69, 70}, m = "invokeSuspend", v = 2)
public final class jbk extends tje0 implements Function2<v5b, v1b<? super ebk.a>, Object> {
    public ojd a;
    public ojd b;
    public pjd c;
    public Map d;
    public List e;
    public int f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ ebk w;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbk(ebk ebkVar, int i, v1b<? super jbk> v1bVar) {
        super(2, v1bVar);
        this.w = ebkVar;
        this.y = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jbk jbkVar = new jbk(this.w, this.y, v1bVar);
        jbkVar.v = obj;
        return jbkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ebk.a> v1bVar) {
        return ((jbk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x0109 A[PHI: r1 r3 r9
      0x0109: PHI (r1v9 java.lang.Object) = (r1v8 java.lang.Object), (r1v17 java.lang.Object) binds: [B:36:0x0106, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r3v6 ojd) = (r3v5 ojd), (r3v9 ojd) binds: [B:36:0x0106, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r9v5 java.util.List) = (r9v11 java.util.List), (r9v8 java.util.List) binds: [B:36:0x0106, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0123, code lost:
    
        if (r0 == r2) goto L40;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
