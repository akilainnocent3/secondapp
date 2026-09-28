package defpackage;

import com.sporty.android.book.domain.entity.FeaturedBetBuilderMarket;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.data.repository.SportyBookRepositoryImpl$getFeaturedBetBuilderMarkets$1", f = "SportyBookRepositoryImpl.kt", l = {164, 165}, m = "invokeSuspend", v = 2)
public final class rkb0 extends tje0 implements Function2<myh<? super List<? extends FeaturedBetBuilderMarket>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pkb0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkb0(pkb0 pkb0Var, String str, v1b<? super rkb0> v1bVar) {
        super(2, v1bVar);
        this.c = pkb0Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rkb0 rkb0Var = new rkb0(this.c, this.d, v1bVar);
        rkb0Var.b = obj;
        return rkb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends FeaturedBetBuilderMarket>> myhVar, v1b<? super Unit> v1bVar) {
        return ((rkb0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
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
            java.lang.Object r0 = r6.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r7)
            goto L46
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L1b:
            defpackage.uj50.b(r7)
            goto L33
        L1f:
            defpackage.uj50.b(r7)
            pkb0 r7 = r6.c
            jkb0 r7 = r7.a
            r6.b = r0
            r6.a = r5
            java.lang.String r2 = r6.d
            java.lang.Object r7 = r7.l(r2, r6)
            if (r7 != r1) goto L33
            goto L45
        L33:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            java.lang.Object r7 = defpackage.n52.b(r7)
            java.util.List r7 = (java.util.List) r7
            r6.b = r3
            r6.a = r4
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L46
        L45:
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
