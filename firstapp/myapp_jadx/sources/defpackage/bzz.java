package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.UpdateNicknameResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updateNickname$1", f = "PatronRepositoryImpl.kt", l = {551, 551}, m = "invokeSuspend", v = 2)
public final class bzz extends tje0 implements Function2<myh<? super BaseResponse<UpdateNicknameResponse>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nyz d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzz(v1b v1bVar, nyz nyzVar, String str) {
        super(2, v1bVar);
        this.d = nyzVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bzz bzzVar = new bzz(v1bVar, this.d, this.e);
        bzzVar.c = obj;
        return bzzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<UpdateNicknameResponse>> myhVar, v1b<? super Unit> v1bVar) {
        return ((bzz) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
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
            goto L46
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
            nyz r7 = r6.d
            xxz r7 = r7.a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.String r4 = r6.e
            java.lang.Object r7 = r7.e0(r4, r2, r6)
            if (r7 != r1) goto L39
            goto L45
        L39:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L46
        L45:
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
