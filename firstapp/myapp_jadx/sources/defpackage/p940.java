package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.FeaturedResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getFeaturedMatch$1", f = "RealSportsRepoImpl.kt", l = {178, 178}, m = "invokeSuspend", v = 2)
public final class p940 extends tje0 implements Function2<myh<? super BaseResponse<List<? extends FeaturedResponse>>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l940 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p940(l940 l940Var, v1b<? super p940> v1bVar) {
        super(2, v1bVar);
        this.d = l940Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p940 p940Var = new p940(this.d, v1bVar);
        p940Var.c = obj;
        return p940Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<List<? extends FeaturedResponse>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((p940) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L18;
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
            goto L4b
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L35
        L21:
            defpackage.uj50.b(r7)
            l940 r7 = r6.d
            z7h r7 = r7.f
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.Object r7 = r7.e(r6)
            if (r7 != r1) goto L35
            goto L4a
        L35:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            if (r7 != 0) goto L3e
            com.sporty.android.common.network.data.BaseResponse r7 = new com.sporty.android.common.network.data.BaseResponse
            r7.<init>()
        L3e:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L4b
        L4a:
            return r1
        L4b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p940.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
