package defpackage;

import com.sporty.android.core.model.pocket.common.BankAccountNameWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$resolveBankAccountName$1", f = "PocketRepositoryImpl.kt", l = {646, 646}, m = "invokeSuspend", v = 2)
public final class zt10 extends tje0 implements Function2<myh<? super BankAccountNameWrapper>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ms10 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt10(ms10 ms10Var, String str, String str2, v1b<? super zt10> v1bVar) {
        super(2, v1bVar);
        this.d = ms10Var;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zt10 zt10Var = new zt10(this.d, this.e, this.f, v1bVar);
        zt10Var.c = obj;
        return zt10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BankAccountNameWrapper> myhVar, v1b<? super Unit> v1bVar) {
        return ((zt10) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L4c
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L39
        L21:
            defpackage.uj50.b(r7)
            ms10 r7 = r6.d
            pr10 r7 = r7.a
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.String r2 = r6.e
            java.lang.String r4 = r6.f
            java.lang.Object r7 = r7.z(r2, r4, r6)
            if (r7 != r1) goto L39
            goto L4b
        L39:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            java.lang.Object r7 = defpackage.n52.b(r7)
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L4c
        L4b:
            return r1
        L4c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
