package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.newCode.viewmodel.NewCustomCodeViewModel$replaceCustomCode$1", f = "NewCustomCodeViewModel.kt", l = {110, 115, 128, 141}, m = "invokeSuspend", v = 2)
public final class bqx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cqx b;
    public final /* synthetic */ gdc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqx(cqx cqxVar, gdc gdcVar, v1b<? super bqx> v1bVar) {
        super(2, v1bVar);
        this.b = cqxVar;
        this.c = gdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bqx(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bqx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r2.emit(r5, r26) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r2.emit(r5, r26) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
    
        if (r2.emit(r3, r26) == r1) goto L28;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
