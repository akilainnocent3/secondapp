package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.business.CommonRepositoryImpl$getRecommendData$1", f = "CommonRepositoryImpl.kt", l = {16, 17}, m = "invokeSuspend", v = 1)
public final class lh8 extends tje0 implements Function2<myh<? super List<? extends CommonGameDetails>>, v1b<? super Unit>, Object> {
    public mh8 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mh8 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh8(mh8 mh8Var, String str, v1b<? super lh8> v1bVar) {
        super(2, v1bVar);
        this.d = mh8Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lh8 lh8Var = new lh8(this.d, this.e, v1bVar);
        lh8Var.c = obj;
        return lh8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends CommonGameDetails>> myhVar, v1b<? super Unit> v1bVar) {
        return ((lh8) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r8 == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r8)
            goto L58
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1b:
            mh8 r2 = r7.a
            defpackage.uj50.b(r8)
            goto L3d
        L21:
            defpackage.uj50.b(r8)
            mh8 r8 = r7.d
            java.util.List<com.sportygames.common.business.CommonGameDetails> r8 = r8.b
            if (r8 != 0) goto L47
            mh8 r2 = r7.d
            ca8 r8 = r2.a
            java.lang.String r6 = r7.e
            r7.c = r0
            r7.a = r2
            r7.b = r5
            java.lang.Object r8 = r8.exitRecommendation(r6, r7)
            if (r8 != r1) goto L3d
            goto L57
        L3d:
            com.sportygames.common.framework.network.HTTPResponse r8 = (com.sportygames.common.framework.network.HTTPResponse) r8
            java.lang.Object r8 = defpackage.em50.b(r8)
            java.util.List r8 = (java.util.List) r8
            r2.b = r8
        L47:
            mh8 r8 = r7.d
            java.util.List<com.sportygames.common.business.CommonGameDetails> r8 = r8.b
            r7.c = r3
            r7.a = r3
            r7.b = r4
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
