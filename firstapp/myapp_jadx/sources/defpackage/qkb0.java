package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.data.repository.SportyBookRepositoryImpl$getFavoriteTournaments$1", f = "SportyBookRepositoryImpl.kt", l = {68, 70}, m = "invokeSuspend", v = 2)
public final class qkb0 extends tje0 implements Function2<myh<? super List<? extends String>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pkb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb0(pkb0 pkb0Var, v1b<? super qkb0> v1bVar) {
        super(2, v1bVar);
        this.c = pkb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qkb0 qkb0Var = new qkb0(this.c, v1bVar);
        qkb0Var.b = obj;
        return qkb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends String>> myhVar, v1b<? super Unit> v1bVar) {
        return ((qkb0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r7)
            goto L49
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L1b:
            defpackage.uj50.b(r7)
            goto L31
        L1f:
            defpackage.uj50.b(r7)
            pkb0 r7 = r6.c
            jkb0 r7 = r7.a
            r6.b = r0
            r6.a = r5
            java.lang.Object r7 = r7.k(r5, r6)
            if (r7 != r1) goto L31
            goto L48
        L31:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            boolean r2 = r7.hasData()
            if (r2 == 0) goto L4c
            T r7 = r7.data
            r7.getClass()
            r6.b = r3
            r6.a = r4
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L49
        L48:
            return r1
        L49:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L4c:
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = r7.message
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
