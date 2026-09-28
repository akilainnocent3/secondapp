package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$progressBetSuccessUseCase$1", f = "ShowMissionViewModel.kt", l = {205, 212}, m = "invokeSuspend", v = 2)
public final class qa90 extends tje0 implements Function2<myh<? super krv>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nsv c;
    public final /* synthetic */ sa90 d;
    public final /* synthetic */ Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa90(nsv nsvVar, sa90 sa90Var, Integer num, v1b<? super qa90> v1bVar) {
        super(2, v1bVar);
        this.c = nsvVar;
        this.d = sa90Var;
        this.e = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qa90 qa90Var = new qa90(this.c, this.d, this.e, v1bVar);
        qa90Var.b = obj;
        return qa90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super krv> myhVar, v1b<? super Unit> v1bVar) {
        return ((qa90) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x031d, code lost:
    
        if (r1.emit(r3, r34) == r2) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x032c, code lost:
    
        if (r1.emit(r3, r34) == r2) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x032e, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
