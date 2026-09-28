package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.remote.entity.SocialFollowData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$searchForNickName$1", f = "SocialRepositoryImpl.kt", l = {316, 316}, m = "invokeSuspend", v = 2)
public final class bha0 extends tje0 implements Function2<myh<? super BaseResponse<List<? extends SocialFollowData>>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xga0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bha0(xga0 xga0Var, int i, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.d = xga0Var;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bha0 bha0Var = new bha0(this.d, this.e, this.f, v1bVar);
        bha0Var.c = obj;
        return bha0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<List<? extends SocialFollowData>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((bha0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r8)
            goto L48
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            myh r0 = r7.a
            defpackage.uj50.b(r8)
            goto L3b
        L21:
            defpackage.uj50.b(r8)
            xga0 r8 = r7.d
            x7a0 r8 = r8.b
            r7.c = r5
            r7.a = r0
            r7.b = r4
            int r2 = r7.e
            r4 = 20
            java.lang.String r6 = r7.f
            java.lang.Object r8 = r8.l(r2, r4, r6, r7)
            if (r8 != r1) goto L3b
            goto L47
        L3b:
            r7.c = r5
            r7.a = r5
            r7.b = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L48
        L47:
            return r1
        L48:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bha0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
