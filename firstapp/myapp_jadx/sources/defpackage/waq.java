package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.data.LNFeatureMatchRepository$getFeatureMatchCards$1", f = "LNFeatureMatchRepository.kt", l = {18, 21}, m = "invokeSuspend", v = 2)
public final class waq extends tje0 implements Function2<myh<? super BaseResponse<z7q>>, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xaq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public waq(xaq xaqVar, v1b<? super waq> v1bVar) {
        super(2, v1bVar);
        this.d = xaqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        waq waqVar = new waq(this.d, v1bVar);
        waqVar.c = obj;
        return waqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<z7q>> myhVar, v1b<? super Unit> v1bVar) {
        return ((waq) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x018d, code lost:
    
        if (r2.emit(r15, r46) == r3) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.waq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
