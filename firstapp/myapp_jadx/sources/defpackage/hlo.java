package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$userCheck$2", f = "InstantWinRepoImpl.kt", l = {509, 510}, m = "invokeSuspend", v = 2)
public final class hlo extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fko c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlo(fko fkoVar, String str, String str2, v1b<? super hlo> v1bVar) {
        super(2, v1bVar);
        this.c = fkoVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hlo hloVar = new hlo(this.c, this.d, this.e, v1bVar);
        hloVar.b = obj;
        return hloVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((hlo) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0.emit((kotlin.Unit) r7, r6) == r1) goto L15;
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
            goto L46
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L1b:
            defpackage.uj50.b(r7)
            goto L39
        L1f:
            defpackage.uj50.b(r7)
            fko r7 = r6.c
            s8o r7 = r7.b
            java.lang.String r2 = r6.e
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r2 = defpackage.fko.M(r2)
            r6.b = r0
            r6.a = r5
            java.lang.String r5 = r6.d
            java.lang.Object r7 = r7.b(r5, r2, r6)
            if (r7 != r1) goto L39
            goto L45
        L39:
            kotlin.Unit r7 = (kotlin.Unit) r7
            r6.b = r3
            r6.a = r4
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L46
        L45:
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
