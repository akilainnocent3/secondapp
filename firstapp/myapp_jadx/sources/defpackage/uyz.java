package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.profile.UserInfoProperty;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$modifyUserInfo$1", f = "PatronRepositoryImpl.kt", l = {647, 647}, m = "invokeSuspend", v = 2)
public final class uyz extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nyz d;
    public final /* synthetic */ UserInfoProperty e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyz(nyz nyzVar, UserInfoProperty userInfoProperty, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.d = nyzVar;
        this.e = userInfoProperty;
        this.f = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uyz uyzVar = new uyz(this.d, this.e, this.f, v1bVar);
        uyzVar.c = obj;
        return uyzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
        return ((uyz) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r0.emit(r13, r11) == r1) goto L19;
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
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r13)
            goto L53
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r5
        L1b:
            myh r0 = r12.a
            defpackage.uj50.b(r13)
            r11 = r12
            goto L46
        L22:
            defpackage.uj50.b(r13)
            nyz r13 = r12.d
            xxz r6 = r13.a
            com.sporty.android.core.model.profile.UserInfoProperty r13 = r12.e
            if (r13 == 0) goto L33
            java.lang.String r13 = r13.getValue()
            r7 = r13
            goto L34
        L33:
            r7 = r5
        L34:
            r12.c = r5
            r12.a = r0
            r12.b = r4
            java.lang.String r8 = r12.f
            r9 = 0
            r10 = 0
            r11 = r12
            java.lang.Object r13 = r6.b1(r7, r8, r9, r10, r11)
            if (r13 != r1) goto L46
            goto L52
        L46:
            r11.c = r5
            r11.a = r5
            r11.b = r3
            java.lang.Object r12 = r0.emit(r13, r11)
            if (r12 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
