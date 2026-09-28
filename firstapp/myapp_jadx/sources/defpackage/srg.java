package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchCacheEventMeta$1", f = "EventUseCase.kt", l = {80, 82}, m = "invokeSuspend", v = 2)
public final class srg extends tje0 implements Function2<myh<? super aqg>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ csg c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srg(csg csgVar, String str, String str2, int i, v1b<? super srg> v1bVar) {
        super(2, v1bVar);
        this.c = csgVar;
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        srg srgVar = new srg(this.c, this.d, this.e, this.f, v1bVar);
        srgVar.b = obj;
        return srgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super aqg> myhVar, v1b<? super Unit> v1bVar) {
        return ((srg) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r8)
            goto L51
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            defpackage.uj50.b(r8)
            zi50 r8 = (defpackage.zi50) r8
            java.lang.Object r8 = r8.a
            goto L3b
        L23:
            defpackage.uj50.b(r8)
            csg r8 = r7.c
            kmg r8 = r8.d
            r7.b = r0
            r7.a = r4
            int r2 = r7.f
            java.lang.String r4 = r7.d
            java.lang.String r6 = r7.e
            java.lang.Object r8 = r8.d(r2, r7, r4, r6)
            if (r8 != r1) goto L3b
            goto L50
        L3b:
            zi50$a r2 = defpackage.zi50.b
            boolean r2 = r8 instanceof zi50.b
            if (r2 == 0) goto L42
            r8 = r5
        L42:
            aqg r8 = (defpackage.aqg) r8
            if (r8 == 0) goto L51
            r7.b = r5
            r7.a = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L51
        L50:
            return r1
        L51:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
