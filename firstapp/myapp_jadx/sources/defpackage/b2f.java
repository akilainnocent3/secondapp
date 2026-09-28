package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingKickPointSelectingCountdownHandlerImpl$startCountdown$4", f = "DoubleOrNothingKickPointSelectingCountdownHandlerImpl.kt", l = {98, HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 2)
public final class b2f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c2f d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2f(long j, c2f c2fVar, long j2, v1b<? super b2f> v1bVar) {
        super(2, v1bVar);
        this.c = j;
        this.d = c2fVar;
        this.e = j2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b2f b2fVar = new b2f(this.c, this.d, this.e, v1bVar);
        b2fVar.b = obj;
        return b2fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b2f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:11:0x0021->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r14.a.emit(r0, r13) == r1) goto L28;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            v5b r0 = (defpackage.v5b) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r13.a
            r3 = 0
            r4 = 2
            r5 = 1
            c2f r6 = r13.d
            if (r2 == 0) goto L1e
            if (r2 == r5) goto L1a
            if (r2 != r4) goto L14
            goto L1e
        L14:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r3
        L1a:
            defpackage.uj50.b(r14)
            goto L6d
        L1e:
            defpackage.uj50.b(r14)
        L21:
            boolean r14 = defpackage.w5b.e(r0)
            if (r14 == 0) goto L80
            long r7 = r13.c
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r9
            r9 = 0
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 >= 0) goto L35
            r7 = r9
        L35:
            float r14 = (float) r7
            long r11 = r13.e
            float r2 = (float) r11
            float r14 = r14 / r2
            r2 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            float r14 = kotlin.ranges.f.d(r14, r2, r11)
            wwd0 r2 = r6.e
        L43:
            java.lang.Object r11 = r2.getValue()
            r12 = r11
            java.lang.Number r12 = (java.lang.Number) r12
            r12.floatValue()
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r14)
            boolean r11 = r2.g(r11, r12)
            if (r11 == 0) goto L43
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 > 0) goto L73
            ku90<kotlin.Unit> r14 = r6.c
            kotlin.Unit r0 = kotlin.Unit.a
            r13.b = r3
            r13.a = r5
            b390 r14 = r14.a
            java.lang.Object r13 = r14.emit(r0, r13)
            if (r13 != r1) goto L6d
            goto L7f
        L6d:
            r6.a()
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        L73:
            long r7 = r6.a
            r13.b = r0
            r13.a = r4
            java.lang.Object r14 = defpackage.hkd.c(r7, r13)
            if (r14 != r1) goto L21
        L7f:
            return r1
        L80:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
