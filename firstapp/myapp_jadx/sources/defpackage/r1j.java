package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r1j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ r1j(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<GiftItem> list;
        xi60 xi60Var;
        xi60 xi60Var2;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                final n2j n2jVar = (n2j) fragment;
                if (n2jVar.d0 == null && n2jVar.b0 && (list = n2jVar.c0) != null && !list.isEmpty()) {
                    GameDetails gameDetails = n2jVar.c;
                    wz.a("FBGIconClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                    if (n2jVar.d0 == null) {
                        n2jVar.d0 = new xi60();
                    }
                    e activity = n2jVar.getActivity();
                    if (activity != null && (xi60Var = n2jVar.d0) != null && !xi60Var.isAdded() && (xi60Var2 = n2jVar.d0) != null) {
                        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        xi60Var2.q0(supportFragmentManager, new Function0() { // from class: b2j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                xi60 xi60Var3;
                                n2j n2jVar2 = n2jVar;
                                List<GiftItem> list2 = n2jVar2.c0;
                                if (list2 != null && (xi60Var3 = n2jVar2.d0) != null) {
                                    xi60Var3.r0(list2, n2jVar2.t0().W.getMaxAmount(), n2jVar2.t0().W.getMinAmount(), 0.0d);
                                }
                                return Unit.a;
                            }
                        }, new gaj() { // from class: c2j
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                GiftItem giftItem = (GiftItem) obj;
                                Double d = (Double) obj2;
                                double dDoubleValue = d.doubleValue();
                                ((Boolean) obj3).getClass();
                                giftItem.getClass();
                                n2j n2jVar2 = n2jVar;
                                n2jVar2.Y = true;
                                wwd0 wwd0Var = n2jVar2.t0().B;
                                Boolean bool = Boolean.FALSE;
                                wwd0Var.getClass();
                                wwd0Var.k(null, bool);
                                n2jVar2.t0().a = giftItem;
                                n2jVar2.t0().b = d;
                                djh djhVar = n2jVar2.b;
                                if (djhVar != null) {
                                    djhVar.f.d.setVisibility(0);
                                }
                                djh djhVar2 = n2jVar2.b;
                                if (djhVar2 != null) {
                                    djhVar2.f.f.setVisibility(0);
                                }
                                djh djhVar3 = n2jVar2.b;
                                if (djhVar3 != null) {
                                    djhVar3.f.i.setVisibility(0);
                                }
                                djh djhVar4 = n2jVar2.b;
                                if (djhVar4 != null) {
                                    djhVar4.f.e.setVisibility(8);
                                }
                                djh djhVar5 = n2jVar2.b;
                                if (djhVar5 != null) {
                                    djhVar5.f.b.setVisibility(4);
                                }
                                op5 op5Var = op5.a;
                                String currency = giftItem.getCurrency();
                                op5Var.getClass();
                                String strI = op5.i(currency);
                                TreeMap treeMap = pw.a;
                                String strA = tug.a(strI, " ", pw.d(dDoubleValue));
                                djh djhVar6 = n2jVar2.b;
                                if (djhVar6 != null) {
                                    djhVar6.f.i.setText(strA);
                                }
                                xi60 xi60Var3 = n2jVar2.d0;
                                if (xi60Var3 != null) {
                                    xi60Var3.dismiss();
                                }
                                n2jVar2.t0().D1(4);
                                n2jVar2.m0();
                                n2jVar2.d0 = null;
                                return Unit.a;
                            }
                        }, new v6e(n2jVar, 1));
                    }
                }
                return Unit.a;
            default:
                uca0 uca0Var = (uca0) fragment;
                iym iymVar = uca0Var.y;
                if (iymVar == null) {
                    Intrinsics.n("openTelemetryLogger");
                    throw null;
                }
                iymVar.d(AnalyticsEvent.SOCIAL_CODE_HUB_CLICKED);
                uqm uqmVar = uca0Var.i;
                if (uqmVar == null) {
                    Intrinsics.n("accountHelper");
                    throw null;
                }
                Bundle bundleA = uqmVar.isLogin() ? mll0.a("tab_selection", "FOLLOWING_CODES") : null;
                azm azmVar = uca0Var.f;
                if (azmVar != null) {
                    azmVar.e(wae.CODE_HUB, bundleA);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
        }
    }
}
