package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsvg;", "Landroidx/fragment/app/Fragment;", "Lxjj;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class svg extends Fragment implements xjj {
    public nwg b;
    public List<GameDetails> c;
    public String e;
    public float f;
    public String i;
    public final ttr a = hwr.a(a1s.a, new a());
    public Integer d = 0;

    public static final class a implements Function0<l1z> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            nv60 nv60Var = svg.this;
            if (nv60Var instanceof rrp) {
                qn70VarJ = ((rrp) nv60Var).j();
                dq7VarA = jq40.a(l1z.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(l1z.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        nwg nwgVarA = nwg.a(layoutInflater, viewGroup);
        this.b = nwgVarA;
        ConstraintLayout constraintLayout = nwgVarA.a;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Unit unit;
        List<GameDetails> list;
        view.getClass();
        super.onViewCreated(view, bundle);
        wz.a("RecommendationDialogShow", this.e, new String[0]);
        CasinoLogger.INSTANCE.logEventToCasino("RecommendationDialogShow", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, this.e), new Pair("Platform", "ANDROID")));
        nwg nwgVar = this.b;
        if (nwgVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        nwgVar.b.setOnClickListener(new View.OnClickListener() { // from class: pvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                svg svgVar = this.a;
                wz.a("ExitOnRecommendation", svgVar.e, new String[0]);
                CasinoLogger.INSTANCE.logEventToCasino("ExitOnRecommendation", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, svgVar.e), new Pair("Platform", "ANDROID")));
                ((l1z) svgVar.a.getValue()).h(svgVar.d, svgVar.e);
                e activity = svgVar.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        nwg nwgVar2 = this.b;
        if (nwgVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        nwgVar2.e.setOnClickListener(new View.OnClickListener() { // from class: qvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FragmentManager supportFragmentManager;
                svg svgVar = this.a;
                wz.a("StayOnRecommendation", svgVar.e, new String[0]);
                CasinoLogger.INSTANCE.logEventToCasino("StayOnRecommendation", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, svgVar.e), new Pair("Platform", "ANDROID")));
                svgVar.getParentFragmentManager().m0("exit_dialog_result", vj5.a(new Pair("action", "stay")));
                e activity = svgVar.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                supportFragmentManager.a0();
            }
        });
        e activity = getActivity();
        kwg kwgVar = (activity == null || (list = this.c) == null) ? null : new kwg(this.d, this.e, list, activity, (l1z) this.a.getValue());
        nwg nwgVar3 = this.b;
        if (nwgVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = nwgVar3.v;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        nwg nwgVar4 = this.b;
        if (nwgVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        nwgVar4.v.setAdapter(kwgVar);
        op5 op5Var = op5.a;
        nwg nwgVar5 = this.b;
        if (nwgVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        op5.r(op5Var, b.f(nwgVar5.c, nwgVar5.y, nwgVar5.d), null, 6);
        rvg rvgVar = new rvg(this);
        nwg nwgVar6 = this.b;
        if (nwgVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        nwgVar6.v.k(rvgVar);
        String strB = this.i;
        if (strB != null) {
            String str = (String) pcg.a(getContext()).get(strB);
            nwg nwgVar7 = this.b;
            if (nwgVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = nwgVar7.i;
            if (str != null) {
                strB = op5.b(str, strB, null);
            }
            textView.setText(strB);
            nwg nwgVar8 = this.b;
            if (nwgVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            nwgVar8.f.setVisibility(0);
            nwg nwgVar9 = this.b;
            if (nwgVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            nwgVar9.e.setVisibility(8);
            Context context = getContext();
            if (context != null) {
                nwg nwgVar10 = this.b;
                if (nwgVar10 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                nwgVar10.b.setBackgroundColor(context.getColor(R.color.use_gift_color));
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        nwg nwgVar11 = this.b;
        if (nwgVar11 != null) {
            nwgVar11.f.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
