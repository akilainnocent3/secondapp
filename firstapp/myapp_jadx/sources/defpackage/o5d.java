package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DedicatedAccountBVNVerifyViewModel$verifyBVN$1", f = "DedicatedAccountBVNVerifyViewModel.kt", l = {79, 95, HttpStatusCodesKt.HTTP_EARLY_HINTS, 111}, m = "invokeSuspend", v = 2)
public final class o5d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List<Integer> d;
    public final /* synthetic */ n5d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5d(List<Integer> list, n5d n5dVar, v1b<? super o5d> v1bVar) {
        super(2, v1bVar);
        this.d = list;
        this.e = n5dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o5d o5dVar = new o5d(this.d, this.e, v1bVar);
        o5dVar.c = obj;
        return o5dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o5d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r1, r1, null, r3, null, null, null, null, r8, 218) == r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011d, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r0, r2, null, r3, null, null, null, null, r8, 218) == r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        if (com.sporty.android.common.uievent.b.f(r1, r1, null, r3, null, null, null, null, r8, 218) == r12) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [ijf0, uxs] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [ijf0] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.sporty.android.common_ui.uitext.UiText] */
    /* JADX WARN: Type inference failed for: r3v13 */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
