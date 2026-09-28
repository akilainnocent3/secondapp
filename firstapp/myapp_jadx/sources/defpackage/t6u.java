package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$requiredLobbyEnabledFlow$1", f = "LuckyNumberRepository.kt", l = {241, 242}, m = "invokeSuspend", v = 2)
public final class t6u extends tje0 implements Function2<myh<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i6u c;
    public final /* synthetic */ Function2<myh<Object>, v1b<? super Unit>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t6u(i6u i6uVar, Function2<? super myh<Object>, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super t6u> v1bVar) {
        super(2, v1bVar);
        this.c = i6uVar;
        this.d = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t6u t6uVar = new t6u(this.c, this.d, v1bVar);
        t6uVar.b = obj;
        return t6uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        return ((t6u) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r6.d.invoke(r0, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
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
            goto L3c
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L1b:
            defpackage.uj50.b(r7)
            goto L2f
        L1f:
            defpackage.uj50.b(r7)
            r6.b = r0
            r6.a = r5
            i6u r7 = r6.c
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r1) goto L2f
            goto L3b
        L2f:
            r6.b = r3
            r6.a = r4
            kotlin.jvm.functions.Function2<myh<java.lang.Object>, v1b<? super kotlin.Unit>, java.lang.Object> r7 = r6.d
            java.lang.Object r6 = r7.invoke(r0, r6)
            if (r6 != r1) goto L3c
        L3b:
            return r1
        L3c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
