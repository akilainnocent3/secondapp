package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.otp.PreRegisterResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.repository.patron.RegisterRepoImpl$preRegister$1", f = "RegisterRepoImpl.kt", l = {32, 32}, m = "invokeSuspend", v = 2)
public final class qu40 extends tje0 implements Function2<myh<? super BaseResponse<PreRegisterResponse>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Map<String, Object> d;
    public final /* synthetic */ pu40 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu40(Map<String, ? extends Object> map, pu40 pu40Var, String str, String str2, String str3, v1b<? super qu40> v1bVar) {
        super(2, v1bVar);
        this.d = map;
        this.e = pu40Var;
        this.f = str;
        this.i = str2;
        this.v = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qu40 qu40Var = new qu40(this.d, this.e, this.f, this.i, this.v, v1bVar);
        qu40Var.c = obj;
        return qu40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<PreRegisterResponse>> myhVar, v1b<? super Unit> v1bVar) {
        return ((qu40) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r0.emit(r13, r11) == r1) goto L29;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r12.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L16
            defpackage.uj50.b(r13)
            goto L8c
        L16:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r5
        L1c:
            myh r0 = r12.a
            defpackage.uj50.b(r13)
            r11 = r12
            goto L7f
        L23:
            defpackage.uj50.b(r13)
            java.util.Map<java.lang.String, java.lang.Object> r13 = r12.d
            if (r13 == 0) goto L5d
            java.util.ArrayList r13 = defpackage.psp.a(r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r6 = r13.size()
            r7 = 0
            r8 = r7
        L39:
            if (r8 >= r6) goto L54
            java.lang.Object r9 = r13.get(r8)
            int r8 = r8 + 1
            int r10 = r7 + 1
            if (r7 < 0) goto L50
            com.sportybet.android.account.international.data.model.KycFieldRequest r9 = (com.sportybet.android.account.international.data.model.KycFieldRequest) r9
            java.util.List r7 = r9.toFormUrlEncodedMap(r7)
            r2.addAll(r7)
            r7 = r10
            goto L39
        L50:
            kotlin.collections.b.q()
            throw r5
        L54:
            java.util.Map r13 = defpackage.kpu.k(r2)
            if (r13 != 0) goto L5b
            goto L5d
        L5b:
            r10 = r13
            goto L63
        L5d:
            o2g r13 = defpackage.o2g.a
            r13.getClass()
            goto L5b
        L63:
            pu40 r13 = r12.e
            xxz r6 = r13.a
            java.lang.String r13 = r12.v
            java.lang.String r9 = defpackage.uel.c(r13)
            r12.c = r5
            r12.a = r0
            r12.b = r4
            java.lang.String r7 = r12.f
            java.lang.String r8 = r12.i
            r11 = r12
            java.lang.Object r13 = r6.g(r7, r8, r9, r10, r11)
            if (r13 != r1) goto L7f
            goto L8b
        L7f:
            r11.c = r5
            r11.a = r5
            r11.b = r3
            java.lang.Object r12 = r0.emit(r13, r11)
            if (r12 != r1) goto L8c
        L8b:
            return r1
        L8c:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
