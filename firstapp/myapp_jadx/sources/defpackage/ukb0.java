package defpackage;

import com.sporty.android.book.domain.entity.SportEventCount;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.data.repository.SportyBookRepositoryImpl$getSportEventCounts$1", f = "SportyBookRepositoryImpl.kt", l = {54, 61}, m = "invokeSuspend", v = 2)
public final class ukb0 extends tje0 implements Function2<myh<? super List<? extends SportEventCount>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pkb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukb0(pkb0 pkb0Var, v1b<? super ukb0> v1bVar) {
        super(2, v1bVar);
        this.c = pkb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ukb0 ukb0Var = new ukb0(this.c, v1bVar);
        ukb0Var.b = obj;
        return ukb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends SportEventCount>> myhVar, v1b<? super Unit> v1bVar) {
        return ((ukb0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            r14 = this;
            java.lang.Object r0 = r14.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r14.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r15)
            goto L66
        L15:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r14)
            return r5
        L1b:
            defpackage.uj50.b(r15)
            r13 = r14
            goto L4e
        L20:
            defpackage.uj50.b(r15)
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            pkb0 r2 = r14.c
            jkb0 r6 = r2.a
            r15.getClass()
            defpackage.yt5.e(r15)
            long r7 = r15.getTimeInMillis()
            defpackage.yt5.e(r15)
            long r9 = r15.getTimeInMillis()
            r11 = 86399999(0x5265bff, double:4.26872713E-316)
            long r9 = r9 + r11
            r14.b = r0
            r14.a = r4
            r11 = 1
            r12 = 1
            r13 = r14
            java.lang.Object r15 = r6.o(r7, r9, r11, r12, r13)
            if (r15 != r1) goto L4e
            goto L65
        L4e:
            com.sporty.android.common.network.data.BaseResponse r15 = (com.sporty.android.common.network.data.BaseResponse) r15
            boolean r14 = r15.hasData()
            if (r14 == 0) goto L69
            T r14 = r15.data
            r14.getClass()
            r13.b = r5
            r13.a = r3
            java.lang.Object r14 = r0.emit(r14, r13)
            if (r14 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        L69:
            java.lang.Exception r14 = new java.lang.Exception
            java.lang.String r15 = r15.message
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
