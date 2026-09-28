package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchViewModel$onOutcomeClick$1$1", f = "SearchViewModel.kt", l = {502, 504, 506}, m = "invokeSuspend", v = 2)
public final class i280 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Event b;
    public final /* synthetic */ Market c;
    public final /* synthetic */ Outcome d;
    public final /* synthetic */ l280 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i280(Event event, Market market, Outcome outcome, l280 l280Var, v1b<? super i280> v1bVar) {
        super(2, v1bVar);
        this.b = event;
        this.c = market;
        this.d = outcome;
        this.e = l280Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i280(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i280) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            goto L17
        L10:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L17:
            defpackage.uj50.b(r10)
            goto L6b
        L1b:
            defpackage.uj50.b(r10)
            com.sportybet.plugin.realsports.betslip.Selection r10 = new com.sportybet.plugin.realsports.betslip.Selection
            com.sportybet.plugin.realsports.data.Event r1 = r9.b
            com.sportybet.plugin.realsports.data.Market r5 = r9.c
            com.sportybet.plugin.realsports.data.Outcome r6 = r9.d
            r10.<init>(r1, r5, r6)
            boolean r7 = defpackage.iu2.l()
            l280 r8 = r9.e
            if (r7 == 0) goto L3e
            b390 r10 = r8.P
            p080$c r1 = p080.c.a
            r9.a = r4
            java.lang.Object r9 = r10.emit(r1, r9)
            if (r9 != r0) goto L6b
            goto L6a
        L3e:
            boolean r10 = defpackage.iu2.f(r10)
            if (r10 != 0) goto L5e
            boolean r10 = defpackage.iu2.g(r1)
            if (r10 == 0) goto L4b
            goto L5e
        L4b:
            boolean r10 = defpackage.iu2.h(r1, r5, r6)
            if (r10 == 0) goto L6b
            b390 r10 = r8.P
            p080$b r1 = p080.b.a
            r9.a = r2
            java.lang.Object r9 = r10.emit(r1, r9)
            if (r9 != r0) goto L6b
            goto L6a
        L5e:
            b390 r10 = r8.P
            p080$a r1 = p080.a.a
            r9.a = r3
            java.lang.Object r9 = r10.emit(r1, r9)
            if (r9 != r0) goto L6b
        L6a:
            return r0
        L6b:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i280.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
