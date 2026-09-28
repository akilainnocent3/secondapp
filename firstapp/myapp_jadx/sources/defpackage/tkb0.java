package defpackage;

import com.sporty.android.book.data.entity.RelatedBetRequest;
import com.sporty.android.book.domain.entity.RelatedBet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.data.repository.SportyBookRepositoryImpl$getRelatedBets$1", f = "SportyBookRepositoryImpl.kt", l = {96, 98}, m = "invokeSuspend", v = 2)
public final class tkb0 extends tje0 implements Function2<myh<? super List<? extends RelatedBet>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pkb0 c;
    public final /* synthetic */ RelatedBetRequest d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkb0(pkb0 pkb0Var, RelatedBetRequest relatedBetRequest, v1b<? super tkb0> v1bVar) {
        super(2, v1bVar);
        this.c = pkb0Var;
        this.d = relatedBetRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tkb0 tkb0Var = new tkb0(this.c, this.d, v1bVar);
        tkb0Var.b = obj;
        return tkb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends RelatedBet>> myhVar, v1b<? super Unit> v1bVar) {
        return ((tkb0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r0.emit(r2, r8) == r1) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L1f
            if (r2 == r3) goto L1b
            if (r2 != r5) goto L15
            defpackage.uj50.b(r9)
            goto L72
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r4
        L1b:
            defpackage.uj50.b(r9)
            goto L33
        L1f:
            defpackage.uj50.b(r9)
            pkb0 r9 = r8.c
            jkb0 r9 = r9.a
            r8.b = r0
            r8.a = r3
            com.sporty.android.book.data.entity.RelatedBetRequest r2 = r8.d
            java.lang.Object r9 = r9.h(r2, r8)
            if (r9 != r1) goto L33
            goto L71
        L33:
            com.sporty.android.common.network.data.BaseResponse r9 = (com.sporty.android.common.network.data.BaseResponse) r9
            boolean r2 = r9.hasData()
            if (r2 == 0) goto L75
            T r9 = r9.data
            r9.getClass()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.l48.r(r9, r3)
            r2.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
        L51:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r9.next()
            com.sporty.android.book.domain.entity.Event r3 = (com.sporty.android.book.domain.entity.Event) r3
            com.sporty.android.book.domain.entity.RelatedBet r6 = new com.sporty.android.book.domain.entity.RelatedBet
            r7 = 0
            r6.<init>(r3, r7, r5, r4)
            r2.add(r6)
            goto L51
        L67:
            r8.b = r4
            r8.a = r5
            java.lang.Object r8 = r0.emit(r2, r8)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L75:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = r9.message
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
