package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.promotion.PromotionRepositoryImpl$getGiftGroupList$1", f = "PromotionRepositoryImpl.kt", l = {119, 119}, m = "invokeSuspend", v = 2)
public final class l530 extends tje0 implements Function2<myh<? super BaseResponse<List<? extends GiftGroup>>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j530 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Integer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l530(j530 j530Var, int i, Integer num, v1b v1bVar) {
        super(2, v1bVar);
        this.d = j530Var;
        this.e = i;
        this.f = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l530 l530Var = new l530(this.d, this.e, this.f, v1bVar);
        l530Var.c = obj;
        return l530Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<List<? extends GiftGroup>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((l530) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.emit(r13, r11) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r12.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r13)
            goto L4a
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r5
        L1b:
            myh r0 = r12.a
            defpackage.uj50.b(r13)
            r11 = r12
            goto L3d
        L22:
            defpackage.uj50.b(r13)
            j530 r13 = r12.d
            x430 r6 = r13.a
            r12.c = r5
            r12.a = r0
            r12.b = r4
            r7 = 1
            int r8 = r12.e
            java.lang.Integer r9 = r12.f
            r10 = 1
            r11 = r12
            java.lang.Object r13 = r6.g(r7, r8, r9, r10, r11)
            if (r13 != r1) goto L3d
            goto L49
        L3d:
            r11.c = r5
            r11.a = r5
            r11.b = r3
            java.lang.Object r12 = r0.emit(r13, r11)
            if (r12 != r1) goto L4a
        L49:
            return r1
        L4a:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l530.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
