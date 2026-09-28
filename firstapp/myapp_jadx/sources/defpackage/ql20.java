package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.OutrightDisplayData;
import com.sportybet.plugin.realsports.data.OutrightTournament;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.UpcomingEventTypes;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.PreMatchSportActivity$collectData$1$8", f = "PreMatchSportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ql20 extends tje0 implements Function2<lk50<? extends List<? extends OutrightDisplayData>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreMatchSportActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql20(PreMatchSportActivity preMatchSportActivity, v1b<? super ql20> v1bVar) {
        super(2, v1bVar);
        this.b = preMatchSportActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ql20 ql20Var = new ql20(this.b, v1bVar);
        ql20Var.a = obj;
        return ql20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends OutrightDisplayData>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ql20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        PreMatchSportActivity preMatchSportActivity = this.b;
        hjd0 hjd0Var = preMatchSportActivity.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LoadingView loadingView = hjd0Var.M;
        RecyclerView recyclerView = hjd0Var.N;
        preMatchSportActivity.J1();
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            if (preMatchSportActivity.K1(UpcomingEventTypes.OUTRIGHT.getValue()) && !hjd0Var.I.c) {
                hjd0 hjd0Var2 = preMatchSportActivity.b;
                if (hjd0Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                hjd0Var2.J.scrollTo(0, 0);
            }
        } else if (!(lk50Var instanceof lk50.a)) {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            if (j8l.a(preMatchSportActivity.Q.a) != 0) {
                preMatchSportActivity.Q.k();
            }
            if (preMatchSportActivity.K1(UpcomingEventTypes.OUTRIGHT.getValue()) && ((List) ((lk50.c) lk50Var).a).isEmpty()) {
                loadingView.G(R.string.common_functions__no_game);
                recyclerView.setVisibility(8);
            } else {
                for (OutrightDisplayData outrightDisplayData : (Iterable) ((lk50.c) lk50Var).a) {
                    if (outrightDisplayData.getViewType() == R.layout.spr_outright_category) {
                        vyg vygVar = new vyg(new j2p(outrightDisplayData), outrightDisplayData.isExpanded());
                        Iterator<T> it = outrightDisplayData.getTournaments().iterator();
                        while (it.hasNext()) {
                            vygVar.m(new m3p((OutrightTournament) it.next(), new hl20(preMatchSportActivity)));
                        }
                        preMatchSportActivity.Q.i(vygVar);
                    }
                }
                if (preMatchSportActivity.K1(UpcomingEventTypes.OUTRIGHT.getValue())) {
                    if (!Intrinsics.g(recyclerView.getAdapter(), preMatchSportActivity.Q)) {
                        recyclerView.setAdapter(preMatchSportActivity.Q);
                    }
                    loadingView.E();
                    recyclerView.setVisibility(0);
                }
            }
        } else if (preMatchSportActivity.K1(UpcomingEventTypes.OUTRIGHT.getValue())) {
            hjd0 hjd0Var3 = preMatchSportActivity.b;
            if (hjd0Var3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            hjd0Var3.J.scrollTo(0, 0);
            loadingView.I();
            recyclerView.setVisibility(8);
        }
        return Unit.a;
    }
}
