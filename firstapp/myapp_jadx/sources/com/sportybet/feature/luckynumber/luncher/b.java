package com.sportybet.feature.luckynumber.luncher;

import defpackage.c0d;
import defpackage.k650;
import defpackage.l5u;
import defpackage.myh;
import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.luncher.LNLuncherViewModel$state$1", f = "LNLuncherViewModel.kt", l = {50, 51, 69}, m = "invokeSuspend", v = 2)
public final class b extends tje0 implements Function2<myh<? super a>, v1b<? super Unit>, Object> {
    public String a;
    public l5u b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ c e;
    public final /* synthetic */ k650 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, k650 k650Var, v1b<? super b> v1bVar) {
        super(2, v1bVar);
        this.e = cVar;
        this.f = k650Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b bVar = new b(this.e, this.f, v1bVar);
        bVar.d = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super a> myhVar, v1b<? super Unit> v1bVar) {
        return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x008f, B:36:0x00b9, B:47:0x00e2, B:49:0x00ea, B:50:0x00f4, B:41:0x00c2, B:42:0x00c6, B:44:0x00cc, B:46:0x00d8), top: B:63:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x008f, B:36:0x00b9, B:47:0x00e2, B:49:0x00ea, B:50:0x00f4, B:41:0x00c2, B:42:0x00c6, B:44:0x00cc, B:46:0x00d8), top: B:63:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x008f, B:36:0x00b9, B:47:0x00e2, B:49:0x00ea, B:50:0x00f4, B:41:0x00c2, B:42:0x00c6, B:44:0x00cc, B:46:0x00d8), top: B:63:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x008f, B:36:0x00b9, B:47:0x00e2, B:49:0x00ea, B:50:0x00f4, B:41:0x00c2, B:42:0x00c6, B:44:0x00cc, B:46:0x00d8), top: B:63:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:0: B:42:0x00c6->B:66:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        if (r0.emit((com.sportybet.feature.luckynumber.luncher.a) r2, r12) == r1) goto L60;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.luckynumber.luncher.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
