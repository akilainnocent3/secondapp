package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend")
public final class twr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public goh a;
    public int b;
    public final /* synthetic */ owr c;
    public final /* synthetic */ goh<iwo> d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twr(owr owrVar, goh<iwo> gohVar, long j, v1b<? super twr> v1bVar) {
        super(2, v1bVar);
        this.c = owrVar;
        this.d = gohVar;
        this.e = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new twr(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((twr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (defpackage.wd0.a(r1, r2, r3, null, r5, r11, 4) == r8) goto L29;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            owr r0 = r11.c
            wd0<iwo, jj0> r1 = r0.o
            y5b r8 = defpackage.y5b.a
            int r2 = r11.b
            r3 = 0
            long r4 = r11.e
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L23
            if (r2 == r7) goto L1d
            if (r2 != r6) goto L17
            defpackage.uj50.b(r12)     // Catch: java.util.concurrent.CancellationException -> L85
            goto L79
        L17:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r3
        L1d:
            goh r2 = r11.a
            defpackage.uj50.b(r12)     // Catch: java.util.concurrent.CancellationException -> L85
            goto L4d
        L23:
            defpackage.uj50.b(r12)
            boolean r12 = r1.e()     // Catch: java.util.concurrent.CancellationException -> L85
            goh<iwo> r2 = r11.d
            if (r12 == 0) goto L37
            boolean r12 = r2 instanceof defpackage.fkd0     // Catch: java.util.concurrent.CancellationException -> L85
            if (r12 == 0) goto L35
            fkd0 r2 = (defpackage.fkd0) r2     // Catch: java.util.concurrent.CancellationException -> L85
            goto L37
        L35:
            fkd0<iwo> r2 = defpackage.vwr.a     // Catch: java.util.concurrent.CancellationException -> L85
        L37:
            boolean r12 = r1.e()     // Catch: java.util.concurrent.CancellationException -> L85
            if (r12 != 0) goto L52
            iwo r12 = new iwo     // Catch: java.util.concurrent.CancellationException -> L85
            r12.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L85
            r11.a = r2     // Catch: java.util.concurrent.CancellationException -> L85
            r11.b = r7     // Catch: java.util.concurrent.CancellationException -> L85
            java.lang.Object r12 = r1.f(r11, r12)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r12 != r8) goto L4d
            goto L78
        L4d:
            mdn r12 = r0.c     // Catch: java.util.concurrent.CancellationException -> L85
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L85
        L52:
            java.lang.Object r12 = r1.d()     // Catch: java.util.concurrent.CancellationException -> L85
            iwo r12 = (defpackage.iwo) r12     // Catch: java.util.concurrent.CancellationException -> L85
            long r9 = r12.a     // Catch: java.util.concurrent.CancellationException -> L85
            long r4 = defpackage.iwo.c(r9, r4)     // Catch: java.util.concurrent.CancellationException -> L85
            r12 = r3
            r3 = r2
            iwo r2 = new iwo     // Catch: java.util.concurrent.CancellationException -> L85
            r2.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L85
            r9 = r4
            swr r5 = new swr     // Catch: java.util.concurrent.CancellationException -> L85
            r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L85
            r11.a = r12     // Catch: java.util.concurrent.CancellationException -> L85
            r11.b = r6     // Catch: java.util.concurrent.CancellationException -> L85
            r4 = 0
            r7 = 4
            r6 = r11
            java.lang.Object r11 = defpackage.wd0.a(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r11 != r8) goto L79
        L78:
            return r8
        L79:
            ytw r11 = r0.h     // Catch: java.util.concurrent.CancellationException -> L85
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch: java.util.concurrent.CancellationException -> L85
            x5a0 r11 = (defpackage.x5a0) r11     // Catch: java.util.concurrent.CancellationException -> L85
            r11.setValue(r12)     // Catch: java.util.concurrent.CancellationException -> L85
            r11 = 0
            r0.g = r11     // Catch: java.util.concurrent.CancellationException -> L85
        L85:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
