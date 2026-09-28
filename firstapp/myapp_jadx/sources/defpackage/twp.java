package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.addnumber.LNAddNumberViewModel$updateNumber$1", f = "LNAddNumberViewModel.kt", l = {240, 244, 248}, m = "invokeSuspend", v = 2)
public final class twp extends tje0 implements Function2<xwq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nwp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twp(nwp nwpVar, v1b<? super twp> v1bVar) {
        super(2, v1bVar);
        this.c = nwpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        twp twpVar = new twp(this.c, v1bVar);
        twpVar.b = obj;
        return twpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xwq xwqVar, v1b<? super Unit> v1bVar) {
        return ((twp) create(xwqVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (kotlin.Unit.a == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (kotlin.Unit.a == r3) goto L36;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
