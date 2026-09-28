package defpackage;

import com.sporty.android.book.domain.entity.BetBuilderData;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.data.repository.SportyBookRepositoryImpl$calculateBetBuilderOdds$1", f = "SportyBookRepositoryImpl.kt", l = {136, 144}, m = "invokeSuspend", v = 2)
public final class okb0 extends tje0 implements Function2<myh<? super BetBuilderData>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pkb0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ BigDecimal f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okb0(pkb0 pkb0Var, String str, ArrayList arrayList, BigDecimal bigDecimal, v1b v1bVar) {
        super(2, v1bVar);
        this.c = pkb0Var;
        this.d = str;
        this.e = arrayList;
        this.f = bigDecimal;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        okb0 okb0Var = new okb0(this.c, this.d, this.e, this.f, v1bVar);
        okb0Var.b = obj;
        return okb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BetBuilderData> myhVar, v1b<? super Unit> v1bVar) {
        return ((okb0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws com.sporty.android.book.data.entity.BetBuilderError {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r10)
            goto L54
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r3
        L1b:
            defpackage.uj50.b(r10)
            goto L3c
        L1f:
            defpackage.uj50.b(r10)
            pkb0 r10 = r9.c
            jkb0 r10 = r10.a
            com.sporty.android.book.data.entity.BetBuilderRequest r2 = new com.sporty.android.book.data.entity.BetBuilderRequest
            java.util.ArrayList r6 = r9.e
            java.math.BigDecimal r7 = r9.f
            java.lang.String r8 = r9.d
            r2.<init>(r8, r6, r7)
            r9.b = r0
            r9.a = r5
            java.lang.Object r10 = r10.a(r2, r9)
            if (r10 != r1) goto L3c
            goto L53
        L3c:
            com.sporty.android.common.network.data.BaseResponse r10 = (com.sporty.android.common.network.data.BaseResponse) r10
            boolean r2 = r10.hasData()
            if (r2 == 0) goto L57
            T r10 = r10.data
            r10.getClass()
            r9.b = r3
            r9.a = r4
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L57:
            com.sporty.android.book.data.entity.BetBuilderError r9 = new com.sporty.android.book.data.entity.BetBuilderError
            java.lang.String r0 = r10.message
            r0.getClass()
            int r10 = r10.bizCode
            r9.<init>(r0, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
