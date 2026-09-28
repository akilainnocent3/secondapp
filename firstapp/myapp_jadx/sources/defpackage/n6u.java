package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$getLottery$1", f = "LuckyNumberRepository.kt", l = {129, 144}, m = "invokeSuspend", v = 2)
public final class n6u extends tje0 implements Function2<myh<? super a5q>, v1b<? super Unit>, Object> {
    public i6u a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i6u d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6u(i6u i6uVar, String str, v1b<? super n6u> v1bVar) {
        super(2, v1bVar);
        this.d = i6uVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n6u n6uVar = new n6u(this.d, this.e, v1bVar);
        n6uVar.c = obj;
        return n6uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super a5q> myhVar, v1b<? super Unit> v1bVar) {
        return ((n6u) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r1.emit(r17, r23) == r2) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.Object r1 = r0.c
            myh r1 = (defpackage.myh) r1
            y5b r2 = defpackage.y5b.a
            int r3 = r0.b
            r4 = 0
            java.lang.String r5 = r0.e
            i6u r6 = r0.d
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L2f
            if (r3 == r8) goto L26
            if (r3 != r7) goto L20
            i6u r0 = r0.a
            a5q r0 = (defpackage.a5q) r0
            defpackage.uj50.b(r24)
            goto La2
        L20:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r4
        L26:
            i6u r3 = r0.a
            defpackage.uj50.b(r24)
            r8 = r3
            r3 = r24
            goto L42
        L2f:
            defpackage.uj50.b(r24)
            c5u r3 = r6.a
            r0.c = r1
            r0.a = r6
            r0.b = r8
            java.lang.Object r3 = r3.o(r5, r0)
            if (r3 != r2) goto L41
            goto La1
        L41:
            r8 = r6
        L42:
            com.sporty.android.common.network.data.BaseResponse r3 = (com.sporty.android.common.network.data.BaseResponse) r3
            java.lang.Object r3 = defpackage.n52.b(r3)
            com.sportybet.feature.luckynumber.lobby.data.dto.LNCurrentLotteryDTO r3 = (com.sportybet.feature.luckynumber.lobby.data.dto.LNCurrentLotteryDTO) r3
            r8.getClass()
            long r9 = android.os.SystemClock.elapsedRealtime()
            com.sportybet.feature.luckynumber.lobby.data.dto.LNCurrentDrawSummaryDTO r11 = r3.getDrawSummary()
            long r11 = r11.getDrawTime()
            long r13 = r3.getServerTime()
            wwd0 r8 = r8.d
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            long r15 = r8.longValue()
            long r11 = r11 - r13
            r13 = 0
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 >= 0) goto L71
            r11 = r13
        L71:
            long r11 = r11 + r9
            long r21 = r11 - r15
            a5q r17 = new a5q
            com.sportybet.feature.luckynumber.lobby.data.dto.LNCurrentDrawSummaryDTO r8 = r3.getDrawSummary()
            java.lang.String r18 = r8.getId()
            com.sportybet.feature.luckynumber.lobby.data.dto.LNCurrentDrawSummaryDTO r3 = r3.getDrawSummary()
            long r19 = r3.getDrawTime()
            r17.<init>(r18, r19, r21)
            r3 = r17
            ts5<qcn<dsq>> r6 = r6.j
            m6u r8 = new m6u
            r8.<init>()
            r6.g(r8)
            r0.c = r4
            r0.a = r4
            r0.b = r7
            java.lang.Object r0 = r1.emit(r3, r0)
            if (r0 != r2) goto La2
        La1:
            return r2
        La2:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
