package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.speedybingo.data.dto.SBUserInfoDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.data.repo.SpeedyBingoRepositoryImpl$userInfo$1", f = "SpeedyBingoRepositoryImpl.kt", l = {55, 55}, m = "invokeSuspend", v = 1)
public final class rua0 extends tje0 implements Function2<myh<? super HTTPResponse<SBUserInfoDTO>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sua0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rua0(sua0 sua0Var, v1b<? super rua0> v1bVar) {
        super(2, v1bVar);
        this.d = sua0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rua0 rua0Var = new rua0(this.d, v1bVar);
        rua0Var.c = obj;
        return rua0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super HTTPResponse<SBUserInfoDTO>> myhVar, v1b<? super Unit> v1bVar) {
        return ((rua0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
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
            goto L42
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L35
        L21:
            defpackage.uj50.b(r7)
            sua0 r7 = r6.d
            cua0 r7 = r7.a
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r1) goto L35
            goto L41
        L35:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L42
        L41:
            return r1
        L42:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rua0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
