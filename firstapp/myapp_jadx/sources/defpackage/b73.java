package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.OutcomesRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$fetchOutcomesData$1", f = "BetSlipViewModel.kt", l = {1171, 1192, 1195}, m = "invokeSuspend", v = 2)
public final class b73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ OutcomesRequest A;
    public Object a;
    public q73 b;
    public aak c;
    public OutcomesRequest d;
    public Throwable e;
    public long f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ q73 w;
    public final /* synthetic */ aak y;
    public final /* synthetic */ List<Selection> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b73(q73 q73Var, aak aakVar, List<? extends Selection> list, OutcomesRequest outcomesRequest, v1b<? super b73> v1bVar) {
        super(2, v1bVar);
        this.w = q73Var;
        this.y = aakVar;
        this.z = list;
        this.A = outcomesRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b73 b73Var = new b73(this.w, this.y, this.z, this.A, v1bVar);
        b73Var.v = obj;
        return b73Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:
    
        if (r8.a.emit(r2, r24) == r10) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
