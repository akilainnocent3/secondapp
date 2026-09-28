package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyViewModel$trackMissionViewEvents$3", f = "VirtualLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gmi0 extends tje0 implements Function2<List<? extends wwv>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hmi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmi0(v1b v1bVar, hmi0 hmi0Var) {
        super(2, v1bVar);
        this.b = hmi0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gmi0 gmi0Var = new gmi0(v1bVar, this.b);
        gmi0Var.a = obj;
        return gmi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends wwv> list, v1b<? super Unit> v1bVar) {
        return ((gmi0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pdd0 pdd0Var;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (list.contains(wwv.b)) {
            pdd0Var = dwt.b.a;
        } else if (list.contains(wwv.a)) {
            pdd0Var = dwt.d.a;
        } else {
            pdd0Var = list.contains(wwv.e) ? dwt.c.a : null;
        }
        if (pdd0Var != null) {
            this.b.f.a(pdd0Var, k00.d);
        }
        return Unit.a;
    }
}
