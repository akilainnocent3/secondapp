package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.data.LNDrawRepository$addNumber$1", f = "LNDrawRepository.kt", l = {109, 108}, m = "invokeSuspend", v = 2)
public final class s6q extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a7q d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ List<Integer> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6q(a7q a7qVar, String str, String str2, List<Integer> list, v1b<? super s6q> v1bVar) {
        super(2, v1bVar);
        this.d = a7qVar;
        this.e = str;
        this.f = str2;
        this.i = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s6q s6qVar = new s6q(this.d, this.e, this.f, this.i, v1bVar);
        s6qVar.c = obj;
        return s6qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
        return ((s6q) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r10)
            goto L4d
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L1b:
            myh r0 = r9.a
            defpackage.uj50.b(r10)
            goto L40
        L21:
            defpackage.uj50.b(r10)
            a7q r10 = r9.d
            c5u r10 = r10.a
            com.sportybet.feature.luckynumber.placebet.data.data.LNAddMyNumberDTO r2 = new com.sportybet.feature.luckynumber.placebet.data.data.LNAddMyNumberDTO
            java.lang.String r6 = r9.f
            java.util.List<java.lang.Integer> r7 = r9.i
            java.lang.String r8 = r9.e
            r2.<init>(r8, r6, r7)
            r9.c = r5
            r9.a = r0
            r9.b = r4
            java.lang.Object r10 = r10.n(r2, r9)
            if (r10 != r1) goto L40
            goto L4c
        L40:
            r9.c = r5
            r9.a = r5
            r9.b = r3
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r1) goto L4d
        L4c:
            return r1
        L4d:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
