package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$getBetBuilderConfig$1", f = "InstantWinRepoImpl.kt", l = {86, 85}, m = "invokeSuspend", v = 2)
public final class mko extends tje0 implements Function2<myh<? super BetBuilderConfig>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fko d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mko(fko fkoVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.d = fkoVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mko mkoVar = new mko(this.d, this.e, v1bVar);
        mkoVar.c = obj;
        return mkoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BetBuilderConfig> myhVar, v1b<? super Unit> v1bVar) {
        return ((mko) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
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
            goto L4a
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            myh r0 = r7.a
            defpackage.uj50.b(r8)
            goto L3d
        L21:
            defpackage.uj50.b(r8)
            fko r8 = r7.d
            s8o r8 = r8.b
            java.lang.String r2 = r7.e
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r6 = defpackage.fko.M(r2)
            r7.c = r5
            r7.a = r0
            r7.b = r4
            r4 = 16
            java.lang.Object r8 = r8.C(r2, r4, r6, r7)
            if (r8 != r1) goto L3d
            goto L49
        L3d:
            r7.c = r5
            r7.a = r5
            r7.b = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L4a
        L49:
            return r1
        L4a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mko.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
