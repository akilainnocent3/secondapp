package defpackage;

import android.animation.ObjectAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.instantwin.presentation.bethistory2.a;
import com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity;
import com.sportygames.roulette.activities.RouletteActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n3a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n3a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
            case 1:
                u6j u6jVar = (u6j) obj;
                ajh ajhVarL1 = u6jVar.l1();
                ArrayList<ObjectAnimator> arrayList = u6jVar.B0;
                if (ajhVarL1 != null) {
                    ajhVarL1.f.setVisibility(8);
                }
                ajh ajhVarL2 = u6jVar.l1();
                if (ajhVarL2 != null) {
                    ajhVarL2.C.removeAllViews();
                }
                ajh ajhVarL3 = u6jVar.l1();
                if (ajhVarL3 != null) {
                    ajhVarL3.A.b.setVisibility(8);
                }
                ajh ajhVarL4 = u6jVar.l1();
                if (ajhVarL4 != null) {
                    ajhVarL4.B.b.setVisibility(8);
                }
                ajh ajhVarL5 = u6jVar.l1();
                if (ajhVarL5 != null) {
                    ajhVarL5.z.b.setVisibility(8);
                }
                ajh ajhVarL6 = u6jVar.l1();
                if (ajhVarL6 != null) {
                    ajhVarL6.A.c.setVisibility(4);
                }
                ajh ajhVarL7 = u6jVar.l1();
                if (ajhVarL7 != null) {
                    ajhVarL7.B.c.setVisibility(4);
                }
                ajh ajhVarL8 = u6jVar.l1();
                if (ajhVarL8 != null) {
                    ajhVarL8.z.c.setVisibility(4);
                }
                u6jVar.z0();
                u6jVar.C0();
                r750.d(u6jVar.t0(), new jh5(u6jVar, 2));
                try {
                    Iterator<ObjectAnimator> it = arrayList.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        ObjectAnimator next = it.next();
                        next.getClass();
                        ObjectAnimator objectAnimator = next;
                        objectAnimator.removeAllListeners();
                        objectAnimator.cancel();
                    }
                    Unit unit = Unit.a;
                    break;
                } catch (Exception unused) {
                }
                arrayList.clear();
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    djhVar.y.e.setAlpha(0.5f);
                }
                djh djhVar2 = u6jVar.b;
                if (djhVar2 != null) {
                    djhVar2.y.f.setVisibility(8);
                }
                djh djhVar3 = u6jVar.b;
                if (djhVar3 != null) {
                    djhVar3.I.setVisibility(4);
                }
                djh djhVar4 = u6jVar.b;
                if (djhVar4 != null) {
                    djhVar4.H.setVisibility(8);
                }
                u6jVar.j1();
                djh djhVar5 = u6jVar.b;
                if (djhVar5 != null) {
                    e6i0.e(djhVar5.w.C);
                }
                djh djhVar6 = u6jVar.b;
                if (djhVar6 != null) {
                    djhVar6.w.D.setVisibility(8);
                }
                return Unit.a;
            case 2:
                ((Function1) obj).invoke(a.i.e.a);
                return Unit.a;
            case 3:
                int i2 = LiveTournamentActivity.I;
                ((RecyclerView) obj).s0(0);
                return Unit.a;
            case 4:
                RouletteActivity rouletteActivity = ((rx50) obj).a;
                if (rouletteActivity.X.a() > 1) {
                    rouletteActivity.R1();
                    rouletteActivity.L.setVisibility(8);
                }
                rouletteActivity.X = null;
                return null;
            default:
                xea0 xea0Var = (xea0) obj;
                yfx yfxVar = xea0Var.w;
                if (yfxVar != null) {
                    wix.c(yfxVar, xea0Var.getActivity());
                    return Unit.a;
                }
                Intrinsics.n("navController");
                throw null;
        }
    }
}
