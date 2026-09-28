package defpackage;

import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.GiftRepoImpl$fetchGiftGroupList$1", f = "GiftRepoImpl.kt", l = {17, 18, 20}, m = "invokeSuspend", v = 2)
public final class yqk extends tje0 implements Function2<myh<? super List<? extends GiftGroup>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zqk c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqk(zqk zqkVar, int i, Integer num, v1b v1bVar) {
        super(2, v1bVar);
        this.c = zqkVar;
        this.d = i;
        this.e = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yqk yqkVar = new yqk(this.c, this.d, this.e, v1bVar);
        yqkVar.b = obj;
        return yqkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends GiftGroup>> myhVar, v1b<? super Unit> v1bVar) {
        return ((yqk) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r0.emit(r13, r13) == r1) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws com.sporty.android.common.network.data.SprThrowable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r13.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L24
            if (r2 == r5) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            goto L1b
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r6
        L1b:
            defpackage.uj50.b(r14)
            goto L64
        L1f:
            defpackage.uj50.b(r14)
            r12 = r13
            goto L45
        L24:
            defpackage.uj50.b(r14)
            zqk r14 = r13.c
            uqm r2 = r14.a
            boolean r2 = r2.isLogin()
            if (r2 == 0) goto L56
            x430 r7 = r14.b
            r13.b = r0
            r13.a = r5
            r8 = 0
            int r9 = r13.d
            java.lang.Integer r10 = r13.e
            r11 = 1
            r12 = r13
            java.lang.Object r14 = r7.g(r8, r9, r10, r11, r12)
            if (r14 != r1) goto L45
            goto L63
        L45:
            com.sporty.android.common.network.data.BaseResponse r14 = (com.sporty.android.common.network.data.BaseResponse) r14
            java.lang.Object r13 = defpackage.n52.b(r14)
            r12.b = r6
            r12.a = r4
            java.lang.Object r13 = r0.emit(r13, r12)
            if (r13 != r1) goto L64
            goto L63
        L56:
            r12 = r13
            m2g r13 = defpackage.m2g.a
            r12.b = r6
            r12.a = r3
            java.lang.Object r13 = r0.emit(r13, r12)
            if (r13 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
