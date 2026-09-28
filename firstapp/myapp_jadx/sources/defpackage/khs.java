package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.list.viewmodel.ListCustomCodeViewModel$onCreateNewCustomCode$1", f = "ListCustomCodeViewModel.kt", l = {93, 95}, m = "invokeSuspend", v = 2)
public final class khs extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lhs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khs(lhs lhsVar, v1b<? super khs> v1bVar) {
        super(2, v1bVar);
        this.b = lhsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new khs(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((khs) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L14:
            defpackage.uj50.b(r6)
            goto L48
        L18:
            defpackage.uj50.b(r6)
            lhs r6 = r5.b
            v340 r1 = r6.b
            uwd0<T> r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            hhs r1 = (defpackage.hhs) r1
            java.util.List<gdc> r1 = r1.b
            int r1 = r1.size()
            b390 r6 = r6.c
            r4 = 5
            if (r1 < r4) goto L3d
            ghs$d r1 = ghs.d.a
            r5.a = r3
            java.lang.Object r5 = r6.emit(r1, r5)
            if (r5 != r0) goto L48
            goto L47
        L3d:
            ghs$b r1 = ghs.b.a
            r5.a = r2
            java.lang.Object r5 = r6.emit(r1, r5)
            if (r5 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
