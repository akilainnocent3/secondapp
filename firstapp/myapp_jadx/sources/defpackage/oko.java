package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$getBuildAndGoGameList$1", f = "InstantWinRepoImpl.kt", l = {524, 525, 527}, m = "invokeSuspend", v = 2)
public final class oko extends tje0 implements Function2<myh<? super Round>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fko c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oko(fko fkoVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = fkoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oko okoVar = new oko(this.c, v1bVar);
        okoVar.b = obj;
        return okoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Round> myhVar, v1b<? super Unit> v1bVar) {
        return ((oko) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L26
            if (r2 == r6) goto L22
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L18
            defpackage.uj50.b(r9)
            goto L65
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L1e:
            defpackage.uj50.b(r9)
            goto L58
        L22:
            defpackage.uj50.b(r9)
            goto L46
        L26:
            defpackage.uj50.b(r9)
            fko r9 = r8.c
            uqm r2 = r9.a
            boolean r2 = r2.isLogin()
            s8o r9 = r9.b
            java.lang.String r7 = "sr:sport:1-1"
            if (r2 == 0) goto L49
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r2 = defpackage.fko.M(r7)
            r8.b = r0
            r8.a = r6
            java.lang.Object r9 = r9.n(r7, r2, r8)
            if (r9 != r1) goto L46
            goto L64
        L46:
            com.sportybet.android.instantwin.newtork.model.response.Round r9 = (com.sportybet.android.instantwin.newtork.model.response.Round) r9
            goto L5a
        L49:
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r2 = defpackage.fko.M(r7)
            r8.b = r0
            r8.a = r5
            java.lang.Object r9 = r9.z(r7, r2, r8)
            if (r9 != r1) goto L58
            goto L64
        L58:
            com.sportybet.android.instantwin.newtork.model.response.Round r9 = (com.sportybet.android.instantwin.newtork.model.response.Round) r9
        L5a:
            r8.b = r3
            r8.a = r4
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oko.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
