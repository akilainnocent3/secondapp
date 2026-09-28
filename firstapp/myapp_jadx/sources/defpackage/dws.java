package defpackage;

import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.fragment.LoadCodeFragment$initCodeHubViewModel$1$1", f = "LoadCodeFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dws extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ cwi b;
    public final /* synthetic */ iws c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dws(cwi cwiVar, iws iwsVar, v1b<? super dws> v1bVar) {
        super(2, v1bVar);
        this.b = cwiVar;
        this.c = iwsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dws dwsVar = new dws(this.b, this.c, v1bVar);
        dwsVar.a = obj;
        return dwsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
        return ((dws) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        cwi cwiVar = this.b;
        if (z) {
            LoadingViewNew loadingViewNew = cwiVar.D;
            TextView textView = cwiVar.L;
            ComposeView composeView = cwiVar.E;
            ConstraintLayout constraintLayout = cwiVar.w;
            ConstraintLayout constraintLayout2 = cwiVar.v;
            loadingViewNew.a();
            boolean zBooleanValue = ((Boolean) ((lk50.c) lk50Var).a).booleanValue();
            final iws iwsVar = this.c;
            if (zBooleanValue && iwsVar.i.isLogin()) {
                constraintLayout2.setVisibility(8);
                constraintLayout.setVisibility(8);
                composeView.setVisibility(0);
                textView.setVisibility(0);
                composeView.setContent(new op8(1679987251, new Function2() { // from class: yvs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final iws iwsVar2 = iwsVar;
                            scv.b(null, null, null, pp8.b(-1773114913, new Function2() { // from class: zvs
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar2 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    int i = 0;
                                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        iws iwsVar3 = iwsVar2;
                                        boolean zHasPersonalPage = iwsVar3.i.hasPersonalPage();
                                        Object objY = aVar2.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (objY == c0042a) {
                                            objY = new aws();
                                            aVar2.r(objY);
                                        }
                                        Function0 function0 = (Function0) objY;
                                        Object objY2 = aVar2.y();
                                        if (objY2 == c0042a) {
                                            objY2 = new bws(0);
                                            aVar2.r(objY2);
                                        }
                                        Function0 function1 = (Function0) objY2;
                                        boolean zA = aVar2.A(iwsVar3);
                                        Object objY3 = aVar2.y();
                                        if (zA || objY3 == c0042a) {
                                            objY3 = new cws(iwsVar3, i);
                                            aVar2.r(objY3);
                                        }
                                        gaj gajVar = (gaj) objY3;
                                        g08 g08Var = g08.LOAD_CODE_FROM_CODEHUB;
                                        jrm jrmVar = iwsVar3.C;
                                        if (jrmVar == null) {
                                            Intrinsics.n("betItem");
                                            throw null;
                                        }
                                        yh40.e(false, zHasPersonalPage, function0, function1, gajVar, g08Var, jrmVar, aVar2, 1600566);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar), aVar, 3072, 7);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            } else {
                composeView.setVisibility(8);
                textView.setVisibility(8);
                psm psmVar = iwsVar.B;
                if (psmVar == null) {
                    Intrinsics.n("countryManager");
                    throw null;
                }
                if (psmVar.r()) {
                    constraintLayout2.setVisibility(8);
                    constraintLayout.setVisibility(0);
                } else {
                    constraintLayout.setVisibility(8);
                    constraintLayout2.setVisibility(0);
                }
            }
        } else if (Intrinsics.g(lk50Var, lk50.b.a)) {
            cwiVar.D.d();
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            cwiVar.D.a();
            cwiVar.E.setVisibility(8);
            cwiVar.L.setVisibility(8);
            cwiVar.v.setVisibility(0);
        }
        return Unit.a;
    }
}
