package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.win.PersonalSocketUseCase$promotionSubscribe$1", f = "PersonalSocketUseCase.kt", l = {81, 89, 94, 96, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 2)
public final class rq00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public mq00 a;
    public String b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public long i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ mq00 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq00(mq00 mq00Var, boolean z, v1b<? super rq00> v1bVar) {
        super(2, v1bVar);
        this.y = mq00Var;
        this.z = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rq00 rq00Var = new rq00(this.y, this.z, v1bVar);
        rq00Var.w = obj;
        return rq00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rq00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:47:0x013b  */
    /* JADX WARN: Code duplicated, block: B:50:0x014a A[Catch: all -> 0x019d, TryCatch #0 {all -> 0x019d, blocks: (B:10:0x0028, B:58:0x0198, B:15:0x003d, B:55:0x0174, B:18:0x004e, B:50:0x014a, B:21:0x005f, B:44:0x00fb, B:24:0x006f, B:31:0x00a6, B:36:0x00b5, B:38:0x00b9, B:40:0x00c3, B:27:0x0081), top: B:63:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x016b  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0174 A[Catch: all -> 0x019d, PHI: r1 r5 r8 r10 r14 r18
      0x0174: PHI (r1v6 mq00) = (r1v5 mq00), (r1v9 mq00) binds: [B:49:0x0148, B:54:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r5v9 long) = (r5v7 long), (r5v11 long) binds: [B:49:0x0148, B:54:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r8v7 long) = (r8v6 long), (r8v8 long) binds: [B:49:0x0148, B:54:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r10v6 long) = (r10v5 long), (r10v7 long) binds: [B:49:0x0148, B:54:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r14v8 long) = (r14v7 long), (r14v9 long) binds: [B:49:0x0148, B:54:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r18v2 java.lang.String) = (r7v0 java.lang.String), (r18v3 java.lang.String) binds: [B:49:0x0148, B:54:0x0170] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x019d, blocks: (B:10:0x0028, B:58:0x0198, B:15:0x003d, B:55:0x0174, B:18:0x004e, B:50:0x014a, B:21:0x005f, B:44:0x00fb, B:24:0x006f, B:31:0x00a6, B:36:0x00b5, B:38:0x00b9, B:40:0x00c3, B:27:0x0081), top: B:63:0x0018 }] */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0195, code lost:
    
        if (r1.a.putLong(r18, r3, r21) == r2) goto L57;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
