package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$changeOddsRange$1", f = "MultiMakerViewModel.kt", l = {609, 610}, m = "invokeSuspend", v = 2)
public final class riw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public float b;
    public float c;
    public int d;
    public final /* synthetic */ tjw e;
    public final /* synthetic */ mhw f;
    public final /* synthetic */ lhw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public riw(tjw tjwVar, mhw mhwVar, lhw lhwVar, v1b<? super riw> v1bVar) {
        super(2, v1bVar);
        this.e = tjwVar;
        this.f = mhwVar;
        this.i = lhwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new riw(this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((riw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if (r1.join(r19) == r4) goto L57;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.riw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
