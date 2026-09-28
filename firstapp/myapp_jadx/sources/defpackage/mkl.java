package defpackage;

import android.view.View;
import com.sportygames.commons.models.TournamentConfigVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mkl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mkl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ezb0 ezb0Var;
        Long id;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                kkl kklVar = kkl.this;
                kklVar.l(kklVar.y.a, str, kklVar.c);
                kklVar.l(kklVar.y.a, str, kklVar.d);
                kklVar.i();
                k0e0 k0e0Var = kklVar.z.U0;
                if (k0e0Var != null) {
                    k0e0Var.d(true);
                }
                return null;
            default:
                h4g0 h4g0Var = (h4g0) obj2;
                ((View) obj).getClass();
                kyi kyiVar = h4g0Var.a;
                if (kyiVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (kyiVar.d.getVisibility() == 0 && (ezb0Var = h4g0Var.v) != null) {
                    TournamentConfigVO tournamentConfigVO = h4g0Var.b;
                    ezb0Var.invoke(Long.valueOf((tournamentConfigVO == null || (id = tournamentConfigVO.getId()) == null) ? 0L : id.longValue()));
                }
                return Unit.a;
        }
    }
}
