package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter$hidePop$1", f = "BetSlipFooter.kt", l = {2026, 2029, 2037, 2038, 2047, 2048, 2049, 2051, 2061, 2062, 2067}, m = "invokeSuspend", v = 2)
public final class h33 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ BetSlipFooter b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h33(BetSlipFooter betSlipFooter, v1b<? super h33> v1bVar) {
        super(2, v1bVar);
        this.b = betSlipFooter;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h33(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h33) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0115 A[PHI: r11
      0x0115: PHI (r11v49 java.lang.Object) = (r11v48 java.lang.Object), (r11v0 java.lang.Object) binds: [B:41:0x0111, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0132  */
    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r11.a.putInt("first_time_bet_slip", r0, r10) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        if (r11 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012f, code lost:
    
        if (r11.a.putInt("first_time_bet_slip", r0, r10) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
    
        if (r11.a.putInt("first_time_bet_slip", r0, r10) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
    
        if (r11 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019b, code lost:
    
        if (r11 == r2) goto L61;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h33.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
