package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.wheelanddeal.model.WDBetHistoryModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.repository.WDRepositoryImpl$getBetHistory$1", f = "WDRepositoryImpl.kt", l = {60, 60}, m = "invokeSuspend", v = 1)
public final class mti0 extends tje0 implements Function2<myh<? super HTTPResponse<WDBetHistoryModel>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lti0 d;
    public final /* synthetic */ Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mti0(lti0 lti0Var, Integer num, v1b v1bVar) {
        super(2, v1bVar);
        this.d = lti0Var;
        this.e = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mti0 mti0Var = new mti0(this.d, this.e, v1bVar);
        mti0Var.c = obj;
        return mti0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super HTTPResponse<WDBetHistoryModel>> myhVar, v1b<? super Unit> v1bVar) {
        return ((mti0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L44
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L37
        L21:
            defpackage.uj50.b(r7)
            lti0 r7 = r6.d
            e6j0 r7 = r7.a
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.Integer r2 = r6.e
            java.lang.Object r7 = r7.e(r2, r5, r6)
            if (r7 != r1) goto L37
            goto L43
        L37:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L44
        L43:
            return r1
        L44:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mti0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
