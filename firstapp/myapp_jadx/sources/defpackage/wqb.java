package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.crash.repository.CrashRepository$previousMultiplier$2", f = "CrashRepository.kt", l = {46}, m = "invokeSuspend", v = 1)
public final class wqb extends tje0 implements Function1<v1b<? super HTTPResponse<PreviousMultiplierResponse>>, Object> {
    public int a;
    public final /* synthetic */ zqb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqb(zqb zqbVar, v1b<? super wqb> v1bVar) {
        super(1, v1bVar);
        this.b = zqbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new wqb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<PreviousMultiplierResponse>> v1bVar) {
        return ((wqb) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a(qUnCRF.SoHGnzrgl);
            return null;
        }
        uj50.b(obj);
        dpb dpbVarA = this.b.a.a();
        this.a = 1;
        Object objPreviousMultiplier = dpbVarA.previousMultiplier(this);
        return objPreviousMultiplier == y5bVar ? y5bVar : objPreviousMultiplier;
    }
}
