package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.chips.FruitHuntChipsViewModel$handleAction$1$1", f = "FruitHuntChipsViewModel.kt", l = {87, 88, 90, 91, 94}, m = "invokeSuspend", v = 1)
public final class p4j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public o4j a;
    public int b;
    public int c;
    public final /* synthetic */ o4j d;
    public final /* synthetic */ j0j e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4j(o4j o4jVar, j0j j0jVar, v1b<? super p4j> v1bVar) {
        super(2, v1bVar);
        this.d = o4jVar;
        this.e = j0jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p4j(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p4j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (kotlin.Unit.a == r0) goto L35;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
