package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$1", f = "LNLobbyViewModel.kt", l = {293, 295}, m = "invokeSuspend", v = 2)
public final class kpq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ spq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpq(v1b v1bVar, spq spqVar) {
        super(2, v1bVar);
        this.b = spqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kpq(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kpq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r8.g(r7, r3) == r2) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            spq r0 = r7.b
            j5u r1 = r0.v
            y5b r2 = defpackage.y5b.a
            int r3 = r7.a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L20
            if (r3 == r6) goto L1c
            if (r3 != r5) goto L15
            defpackage.uj50.b(r8)
            goto L62
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1c:
            defpackage.uj50.b(r8)
            goto L36
        L20:
            defpackage.uj50.b(r8)
            rkd r8 = r1.b
            ohp<java.lang.Object>[] r3 = defpackage.j5u.e
            r3 = r3[r4]
            wm20 r8 = r8.a(r1, r3)
            r7.a = r6
            java.lang.Object r8 = r8.f(r7)
            if (r8 != r2) goto L36
            goto L61
        L36:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.Intrinsics.g(r8, r3)
            if (r8 != 0) goto L62
            ku90<lmq> r8 = r0.z
            nvp$c r0 = new nvp$c
            k8r r6 = defpackage.k8r.INSTANCE
            r0.<init>(r6)
            lmq$b r6 = new lmq$b
            r6.<init>(r0)
            r8.a(r6)
            rkd r8 = r1.b
            ohp<java.lang.Object>[] r0 = defpackage.j5u.e
            r0 = r0[r4]
            wm20 r8 = r8.a(r1, r0)
            r7.a = r5
            java.lang.Object r7 = r8.g(r7, r3)
            if (r7 != r2) goto L62
        L61:
            return r2
        L62:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
