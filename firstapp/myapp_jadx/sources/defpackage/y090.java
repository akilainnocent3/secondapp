package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.ShareImageProviderImpl$generateShareImages$deferred$1$1", f = "ShareImageProviderImpl.kt", l = {67, 67}, m = "invokeSuspend", v = 2)
public final class y090 extends tje0 implements Function2<v5b, v1b<? super c190>, Object> {
    public int a;
    public final /* synthetic */ u090 b;
    public final /* synthetic */ b190 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y090(v1b v1bVar, u090 u090Var, b190 b190Var) {
        super(2, v1bVar);
        this.b = u090Var;
        this.c = b190Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y090(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super c190> v1bVar) {
        return ((y090) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r7)
            goto L44
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L17:
            defpackage.uj50.b(r7)
            goto L33
        L1b:
            defpackage.uj50.b(r7)
            u090 r7 = r6.b
            psm r1 = r7.b
            boolean r1 = r1.F()
            b190 r5 = r6.c
            if (r1 == 0) goto L36
            r6.a = r4
            java.lang.Object r7 = r7.b(r5, r6)
            if (r7 != r0) goto L33
            goto L43
        L33:
            c190 r7 = (defpackage.c190) r7
            return r7
        L36:
            r6.a = r3
            w090 r1 = new w090
            r1.<init>(r2, r7, r5)
            java.lang.Object r7 = defpackage.w5b.d(r1, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            c190 r7 = (defpackage.c190) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y090.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
