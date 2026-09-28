package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData;
import com.sportybet.plugin.realsports.prematch.data.TournamentTitleData;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.PreMatchSportActivity$collectData$1$9", f = "PreMatchSportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class sl20 extends tje0 implements Function2<x1k0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yp40 b;
    public final /* synthetic */ PreMatchSportActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl20(yp40 yp40Var, PreMatchSportActivity preMatchSportActivity, v1b<? super sl20> v1bVar) {
        super(2, v1bVar);
        this.b = yp40Var;
        this.c = preMatchSportActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sl20 sl20Var = new sl20(this.b, this.c, v1bVar);
        sl20Var.a = obj;
        return sl20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1k0 x1k0Var, v1b<? super Unit> v1bVar) {
        return ((sl20) create(x1k0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        x1k0 x1k0Var = (x1k0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        PreMatchSportActivity preMatchSportActivity = this.c;
        int i = 0;
        ezj0 ezj0VarA = dzj0.a(x1k0Var, new g7b(preMatchSportActivity, 1 == true ? 1 : 0), new rl20(preMatchSportActivity, i), false);
        boolean z = ezj0VarA != null;
        yp40 yp40Var = this.b;
        if (z && !yp40Var.a) {
            rdd0 rdd0Var = preMatchSportActivity.b0;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(s2k0.t.a, k00.d);
        }
        yp40Var.a = z;
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        tf20 tf20Var = preMatchSportActivity.H1().r;
        if (tf20Var != null && !Intrinsics.g(tf20Var.D, ezj0VarA)) {
            tf20Var.D = ezj0VarA;
            List<T> list = tf20Var.a.f;
            list.getClass();
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                if (((PreMatchSectionData) obj2) instanceof TournamentTitleData) {
                    tf20Var.notifyItemChanged(i, tf20.G);
                }
                i = i2;
            }
        }
        return Unit.a;
    }
}
