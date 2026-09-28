package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$onHowToPlayClick$1", f = "BonusCupViewModel.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS, 105}, m = "invokeSuspend", v = 1)
public final class jq4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qq4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq4(qq4 qq4Var, v1b v1bVar, boolean z) {
        super(2, v1bVar);
        this.b = z;
        this.c = qq4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jq4(this.c, v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jq4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (kotlin.Unit.a == r0) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            qq4 r3 = r7.c
            boolean r4 = r7.b
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L1f
            if (r1 == r6) goto L1b
            if (r1 != r5) goto L15
            defpackage.uj50.b(r8)
            goto L43
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1b:
            defpackage.uj50.b(r8)
            goto L2f
        L1f:
            defpackage.uj50.b(r8)
            if (r4 != 0) goto L2f
            rrm r8 = r3.d
            r7.a = r6
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L2f
            goto L42
        L2f:
            wwd0 r8 = r3.H
            ulm r1 = new ulm
            r1.<init>(r4)
            r7.a = r5
            r8.getClass()
            r8.k(r2, r1)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r0) goto L43
        L42:
            return r0
        L43:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
