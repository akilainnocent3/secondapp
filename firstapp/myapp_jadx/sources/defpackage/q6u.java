package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$getStream$1", f = "LuckyNumberRepository.kt", l = {148, 173}, m = "invokeSuspend", v = 2)
public final class q6u extends tje0 implements Function2<myh<? super uf00<? extends esq>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i6u c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6u(i6u i6uVar, String str, v1b<? super q6u> v1bVar) {
        super(2, v1bVar);
        this.c = i6uVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q6u q6uVar = new q6u(this.c, this.d, v1bVar);
        q6uVar.b = obj;
        return q6uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super uf00<? extends esq>> myhVar, v1b<? super Unit> v1bVar) {
        return ((q6u) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q6u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
