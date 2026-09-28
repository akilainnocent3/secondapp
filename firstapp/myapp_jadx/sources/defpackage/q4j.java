package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.chips.FruitHuntChipsViewModel$init$1", f = "FruitHuntChipsViewModel.kt", l = {74, 76}, m = "invokeSuspend", v = 1)
public final class q4j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d4j b;
    public final /* synthetic */ o4j c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4j(v1b v1bVar, d4j d4jVar, o4j o4jVar) {
        super(2, v1bVar);
        this.b = d4jVar;
        this.c = o4jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q4j(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q4j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (kotlin.Unit.a == r0) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            o4j r3 = r7.c
            d4j r4 = r7.b
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L1f
            if (r1 == r6) goto L1b
            if (r1 != r5) goto L15
            defpackage.uj50.b(r8)
            goto L43
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1b:
            defpackage.uj50.b(r8)
            goto L37
        L1f:
            defpackage.uj50.b(r8)
            boolean r8 = r4.a
            if (r8 != 0) goto L37
            wwd0 r8 = r3.b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.a = r6
            r8.getClass()
            r8.k(r2, r1)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r0) goto L37
            goto L42
        L37:
            wwd0 r8 = r3.a
            r7.a = r5
            r8.setValue(r4)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r0) goto L43
        L42:
            return r0
        L43:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
