package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment$progressBarVisibility$1$1", f = "EvenOddFragment.kt", l = {3200, 3204, 3208}, m = "invokeSuspend", v = 1)
public final class mgg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public fgg a;
    public jhg b;
    public jhg c;
    public jhg d;
    public int e;
    public int f;
    public int i;
    public final /* synthetic */ fgg v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgg(fgg fggVar, v1b<? super mgg> v1bVar) {
        super(2, v1bVar);
        this.v = fggVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mgg(this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mgg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (r7.J0(r11, r4, r10) == r0) goto L29;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
