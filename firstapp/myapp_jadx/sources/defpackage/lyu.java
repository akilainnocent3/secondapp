package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.League;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventBetBuilderAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llyu;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lyu extends owl {
    public boolean A;
    public n4p C;
    public gbn D;
    public wvi f;
    public MatchEventBetBuilderAdapter v;
    public nyu z;
    public final mpe0 i = hwr.b(new Function0() { // from class: gyu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.a.requireContext();
            return new LinearLayoutManager();
        }
    });
    public final mpe0 w = hwr.b(new Function0() { // from class: hyu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new kyu(this.a);
        }
    });
    public final mpe0 y = hwr.b(new Function0() { // from class: iyu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            final lyu lyuVar = this.a;
            return new mpg.a() { // from class: jyu
                @Override // mpg.a
                public final void h(mpg mpgVar) {
                    nyu nyuVar = lyuVar.z;
                    if (nyuVar != null) {
                        nyuVar.Z0(mpgVar);
                    }
                }
            };
        }
    });
    public final q8i0 B = new q8i0(jq40.a(z5v.class), new a(), new c(), new b());

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return lyu.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return lyu.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return lyu.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.owl, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.z = context instanceof nyu ? (nyu) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_instant_win_match_event_bet_builder, viewGroup, false);
        if (viewInflate == null) {
            bmy.a("rootView");
            return null;
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate;
        this.f = new wvi(recyclerView, recyclerView);
        return recyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.z = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        wvi wviVar = this.f;
        if (wviVar != null) {
            wviVar.b.k0((kyu) this.w.getValue());
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wvi wviVar = this.f;
        if (wviVar != null) {
            wviVar.b.k((kyu) this.w.getValue());
        }
        nyu nyuVar = this.z;
        if (nyuVar != null) {
            nyuVar.G0(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        Throwable th;
        String str;
        int iZ1;
        int iZ2;
        Float fB;
        Float fB2;
        view.getClass();
        super.onViewCreated(view, bundle);
        wvi wviVar = this.f;
        Throwable th2 = null;
        String str2 = "sharedData";
        if (wviVar != null) {
            RecyclerView recyclerView = wviVar.b;
            recyclerView.setLayoutManager((LinearLayoutManager) this.i.getValue());
            n4p n4pVar = this.C;
            if (n4pVar == null) {
                Intrinsics.n("sharedData");
                throw null;
            }
            MatchEventBetBuilderAdapter matchEventBetBuilderAdapter = new MatchEventBetBuilderAdapter(n4pVar.i);
            recyclerView.setAdapter(matchEventBetBuilderAdapter);
            this.v = matchEventBetBuilderAdapter;
        }
        ArrayList arrayList = new ArrayList();
        q8i0 q8i0Var = this.B;
        for (League league : ((z5v) q8i0Var.getValue()).V) {
            String str3 = league.leagueId;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = league.iconUrl;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = league.name;
            p2s p2sVar = new p2s(str4, str5 != null ? str5 : "", str3, m2g.a);
            for (Event event : ((z5v) q8i0Var.getValue()).W) {
                List<Market> list = event.markets;
                list.getClass();
                Market market = (Market) CollectionsKt.V(0, list);
                if (market == null || !kotlin.text.c.l(event.leagueId, str3, true)) {
                    th = th2;
                    str = str2;
                } else {
                    n4p n4pVar2 = this.C;
                    if (n4pVar2 == null) {
                        Throwable th3 = th2;
                        Intrinsics.n(str2);
                        throw th3;
                    }
                    String strC = n4pVar2.c();
                    String str6 = event.leagueId;
                    String str7 = event.eventId;
                    th = th2;
                    String str8 = event.homeTeamName;
                    String str9 = event.homeTeamLogo;
                    float[] fArr = event.teamStrengthPercentage;
                    if (fArr == null || (fB2 = ay0.B(fArr, 0)) == null) {
                        iZ1 = 0;
                    } else {
                        float fFloatValue = fB2.floatValue();
                        iZ1 = z5v.z1(fFloatValue);
                    }
                    String str10 = event.awayTeamName;
                    String str11 = event.awayTeamLogo;
                    float[] fArr2 = event.teamStrengthPercentage;
                    str = str2;
                    if (fArr2 == null || (fB = ay0.B(fArr2, 1)) == null) {
                        iZ2 = 0;
                    } else {
                        float fFloatValue2 = fB.floatValue();
                        iZ2 = z5v.z1(fFloatValue2);
                    }
                    int i = event.marketCount;
                    String str12 = event.eventId;
                    n4p n4pVar3 = this.C;
                    if (n4pVar3 == null) {
                        Intrinsics.n(str);
                        throw th;
                    }
                    p2sVar.e.add(new mpg(strC, str6, str7, str8, str9, iZ1, str10, str11, iZ2, i, sqo.c(str12, market, n4pVar3), false, (mpg.a) this.y.getValue()));
                }
                th2 = th;
                str2 = str;
            }
            arrayList.add(p2sVar);
        }
        MatchEventBetBuilderAdapter matchEventBetBuilderAdapter2 = this.v;
        if (matchEventBetBuilderAdapter2 != null) {
            matchEventBetBuilderAdapter2.setList(arrayList);
        }
    }
}
