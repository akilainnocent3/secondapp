package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$addMyNumber$2", f = "LNPlaceBetViewModel.kt", l = {707, 713, 738}, m = "invokeSuspend", v = 2)
public final class h2r extends tje0 implements Function2<xwq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f2r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2r(v1b v1bVar, f2r f2rVar) {
        super(2, v1bVar);
        this.c = f2rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h2r h2rVar = new h2r(v1bVar, this.c);
        h2rVar.b = obj;
        return h2rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xwq xwqVar, v1b<? super Unit> v1bVar) {
        return ((h2r) create(xwqVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        if (kotlin.Unit.a == r3) goto L49;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
