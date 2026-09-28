package defpackage;

import com.sportybet.android.transaction.domain.model.LastDayRangeSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$preCheckStateFlow$1", f = "TxListViewModel.kt", l = {92, 93, 95}, m = "invokeSuspend", v = 2)
public final class x7h0 extends tje0 implements Function2<myh<? super o7h0.a>, v1b<? super Unit>, Object> {
    public LastDayRangeSetting a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o7h0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7h0(v1b v1bVar, o7h0 o7h0Var) {
        super(2, v1bVar);
        this.d = o7h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        x7h0 x7h0Var = new x7h0(v1bVar, this.d);
        x7h0Var.c = obj;
        return x7h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super o7h0.a> myhVar, v1b<? super Unit> v1bVar) {
        return ((x7h0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r0.emit(r4, r8) == r1) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.b
            r3 = 0
            o7h0 r4 = r8.d
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L2e
            if (r2 == r7) goto L2a
            if (r2 == r6) goto L24
            if (r2 != r5) goto L1e
            com.sportybet.android.transaction.domain.model.LastDayRangeSetting r8 = r8.a
            o7h0$a r8 = (o7h0.a) r8
            defpackage.uj50.b(r9)
            goto L68
        L1e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L24:
            com.sportybet.android.transaction.domain.model.LastDayRangeSetting r2 = r8.a
            defpackage.uj50.b(r9)
            goto L50
        L2a:
            defpackage.uj50.b(r9)
            goto L3e
        L2e:
            defpackage.uj50.b(r9)
            e6h0 r9 = r4.b
            r8.c = r0
            r8.b = r7
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r1) goto L3e
            goto L67
        L3e:
            r2 = r9
            com.sportybet.android.transaction.domain.model.LastDayRangeSetting r2 = (com.sportybet.android.transaction.domain.model.LastDayRangeSetting) r2
            k6k r9 = r4.e
            r8.c = r0
            r8.a = r2
            r8.b = r6
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r1) goto L50
            goto L67
        L50:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            o7h0$a r4 = new o7h0$a
            r4.<init>(r2, r9)
            r8.c = r3
            r8.a = r3
            r8.b = r5
            java.lang.Object r8 = r0.emit(r4, r8)
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
