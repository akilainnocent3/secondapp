package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {232, 98}, m = "invokeSuspend")
public final class fnz extends tje0 implements gaj<myh<? super p1k>, Integer, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ enz d;
    public final /* synthetic */ kxs e;
    public tuw f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnz(v1b v1bVar, enz enzVar, kxs kxsVar) {
        super(3, v1bVar);
        this.d = enzVar;
        this.e = kxsVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super p1k> myhVar, Integer num, v1b<? super Unit> v1bVar) {
        fnz fnzVar = new fnz(v1bVar, this.d, this.e);
        fnzVar.b = myhVar;
        fnzVar.c = num;
        return fnzVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        if (defpackage.kzh.c(r9, r0, r11) == r1) goto L34;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kxs r0 = r11.e
            y5b r1 = defpackage.y5b.a
            int r2 = r11.a
            enz r3 = r11.d
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L2a
            if (r2 == r5) goto L1c
            if (r2 != r4) goto L16
            defpackage.uj50.b(r12)
            goto Lb3
        L16:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r6
        L1c:
            int r2 = r11.i
            tuw r7 = r11.f
            java.lang.Object r8 = r11.c
            onz$a r8 = (onz.a) r8
            myh r9 = r11.b
            defpackage.uj50.b(r12)
            goto L4c
        L2a:
            defpackage.uj50.b(r12)
            myh r9 = r11.b
            java.lang.Object r12 = r11.c
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            onz$a<Key, Value> r8 = r3.j
            tuw r7 = r8.a
            r11.b = r9
            r11.c = r8
            r11.f = r7
            r11.i = r2
            r11.a = r5
            java.lang.Object r12 = r7.d(r11)
            if (r12 != r1) goto L4c
            goto Lb2
        L4c:
            onz<Key, Value> r12 = r8.b     // Catch: java.lang.Throwable -> L68
            tsw r12 = r12.l     // Catch: java.lang.Throwable -> L68
            hxs r8 = r12.a(r0)     // Catch: java.lang.Throwable -> L68
            hxs$c r10 = hxs.c.b     // Catch: java.lang.Throwable -> L68
            boolean r8 = kotlin.jvm.internal.Intrinsics.g(r8, r10)     // Catch: java.lang.Throwable -> L68
            r10 = 0
            if (r8 == 0) goto L6a
            p1k[] r12 = new defpackage.p1k[r10]     // Catch: java.lang.Throwable -> L68
            fzh r0 = new fzh     // Catch: java.lang.Throwable -> L68
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L68
            r7.f(r6)
            goto La4
        L68:
            r11 = move-exception
            goto Lb6
        L6a:
            hxs r8 = r12.a(r0)     // Catch: java.lang.Throwable -> L68
            boolean r8 = r8 instanceof hxs.a     // Catch: java.lang.Throwable -> L68
            if (r8 != 0) goto L77
            hxs$c r8 = hxs.c.c     // Catch: java.lang.Throwable -> L68
            r12.c(r0, r8)     // Catch: java.lang.Throwable -> L68
        L77:
            kotlin.Unit r12 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L68
            r7.f(r6)
            x8m r12 = r3.g
            x8m$b r12 = r12.a
            int r0 = r0.ordinal()
            if (r0 == r5) goto L94
            if (r0 != r4) goto L8d
            x8m$a r12 = r12.b
            b390 r12 = r12.b
            goto L98
        L8d:
            java.lang.String r12 = "invalid load type for hints"
            defpackage.hb5.a(r12)
            r12 = r6
            goto L98
        L94:
            x8m$a r12 = r12.a
            b390 r12 = r12.b
        L98:
            if (r2 != 0) goto L9b
            r5 = r10
        L9b:
            d0i r12 = defpackage.fc4.a(r12, r5)
            inz r0 = new inz
            r0.<init>(r12, r2)
        La4:
            r11.b = r6
            r11.c = r6
            r11.f = r6
            r11.a = r4
            java.lang.Object r11 = defpackage.kzh.c(r9, r0, r11)
            if (r11 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        Lb6:
            r7.f(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
