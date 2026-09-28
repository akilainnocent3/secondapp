package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamMatchesViewModel$onLoadMore$2", f = "TeamMatchesViewModel.kt", l = {159, 187}, m = "invokeSuspend", v = 2)
public final class j7f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o7v b;
    public final /* synthetic */ h7f0 c;
    public final /* synthetic */ f7f0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7f0(o7v o7vVar, h7f0 h7f0Var, f7f0 f7f0Var, v1b<? super j7f0> v1bVar) {
        super(2, v1bVar);
        this.b = o7vVar;
        this.c = h7f0Var;
        this.d = f7f0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j7f0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j7f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r12 == r0) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j7f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
