package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$onResumeGameClick$1", f = "BonusCupViewModel.kt", l = {113, 115}, m = "invokeSuspend", v = 1)
public final class kq4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qq4 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq4(qq4 qq4Var, v1b v1bVar, boolean z) {
        super(2, v1bVar);
        this.b = qq4Var;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kq4(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kq4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r8.a(r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r8.j(r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return r0;
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
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L14:
            defpackage.uj50.b(r8)
            goto L44
        L18:
            defpackage.uj50.b(r8)
            qq4 r8 = r7.b
            et7 r1 = defpackage.o8i0.d(r8)
            up4 r5 = new up4
            r5.<init>(r8, r2)
            r6 = 3
            defpackage.ej5.c(r1, r2, r2, r5, r6)
            boolean r1 = r7.c
            if (r1 == 0) goto L39
            uym r8 = r8.e
            r7.a = r4
            java.lang.Object r7 = r8.a(r7)
            if (r7 != r0) goto L44
            goto L43
        L39:
            rrm r8 = r8.d
            r7.a = r3
            java.lang.Object r7 = r8.j(r7)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
