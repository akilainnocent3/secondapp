package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$onClickChangeAvatar$1", f = "ProfileViewModel.kt", l = {251, 253}, m = "invokeSuspend", v = 2)
public final class x130 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a230 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x130(a230 a230Var, v1b<? super x130> v1bVar) {
        super(2, v1bVar);
        this.b = a230Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x130(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x130) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r6.a.putBoolean("key_avatar_new", r1, r5) == r0) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            a230 r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r6)
            goto L46
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L2b
        L1d:
            defpackage.uj50.b(r6)
            uo1 r6 = r2.b
            r5.a = r4
            java.lang.Enum r6 = r6.d(r5)
            if (r6 != r0) goto L2b
            goto L45
        L2b:
            krf0 r6 = (defpackage.krf0) r6
            if (r6 == 0) goto L32
            boolean r6 = r6.w
            goto L33
        L32:
            r6 = 0
        L33:
            if (r6 == 0) goto L46
            m2l r6 = r2.c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.a = r3
            zed r6 = r6.a
            java.lang.String r2 = "key_avatar_new"
            java.lang.Object r5 = r6.putBoolean(r2, r1, r5)
            if (r5 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x130.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
