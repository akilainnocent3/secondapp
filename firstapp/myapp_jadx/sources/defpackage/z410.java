package defpackage;

import com.sportygames.pingpong.remote.models.UserInfoResponseSocket;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.views.PingPongFragment$observeUserInfo$1$12", f = "PingPongFragment.kt", l = {4802, 4804}, m = "invokeSuspend", v = 1)
public final class z410 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m410 b;
    public final /* synthetic */ zp40 c;
    public final /* synthetic */ UserInfoResponseSocket d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z410(m410 m410Var, zp40 zp40Var, UserInfoResponseSocket userInfoResponseSocket, v1b<? super z410> v1bVar) {
        super(2, v1bVar);
        this.b = m410Var;
        this.c = zp40Var;
        this.d = userInfoResponseSocket;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z410(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z410) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r1.o1(1, r4, r5, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r1.x1(1, r4, r5, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L14:
            defpackage.uj50.b(r8)
            goto L3f
        L18:
            defpackage.uj50.b(r8)
            m410 r1 = r7.b
            boolean r8 = r1.h0
            zp40 r4 = r7.c
            double r4 = r4.a
            r6 = r3
            r3 = r4
            com.sportygames.pingpong.remote.models.UserInfoResponseSocket r5 = r7.d
            if (r8 == 0) goto L34
            r7.a = r6
            r2 = 1
            r6 = r7
            java.lang.Object r7 = r1.o1(r2, r3, r5, r6)
            if (r7 != r0) goto L3f
            goto L3e
        L34:
            r6 = r7
            r6.a = r2
            r2 = 1
            java.lang.Object r7 = r1.x1(r2, r3, r5, r6)
            if (r7 != r0) goto L3f
        L3e:
            return r0
        L3f:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z410.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
