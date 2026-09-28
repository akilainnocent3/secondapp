package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.NonSwipeableViewPager;
import com.sporty.android.core.model.ads.RealSportsAdSpots;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.router.Sender;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class vzy extends dol implements View.OnClickListener, TabLayout.d, i8, tit, k9j, j9j {
    public static final /* synthetic */ int i0 = 0;
    public uqm C;
    public e D;
    public xz80 E;
    public b1z F;
    public rym G;
    public azm H;
    public bnh0 I;
    public oku J;
    public n0z K;
    public tch L;
    public d740 M;
    public final mo0 N;
    public View O;
    public TextView P;
    public TextView Q;
    public View R;
    public View S;
    public TextView T;
    public View U;
    public TextView V;
    public AspectRatioImageView W;
    public View X;
    public TextView Y;
    public View Z;
    public NonSwipeableViewPager a0;
    public TabLayout b0;
    public RecyclerView c0;
    public f0z d0;
    public LoadingView e0;
    public View f0;
    public ComposeView g0;
    public boolean h0;

    public vzy() {
        super(1);
        this.N = l840.a();
        this.h0 = true;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(final TabLayout.g gVar) {
        TabLayout.g gVarK;
        if (!((Boolean) this.M.G.a.getValue()).booleanValue() || gVar.e != 0) {
            p0(gVar);
            return;
        }
        TabLayout tabLayout = this.b0;
        if (tabLayout != null && (gVarK = tabLayout.k(1)) != null) {
            gVarK.b();
        }
        this.M.A1(new Function1() { // from class: bzy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TabLayout.g gVarK2;
                if (((Boolean) obj).booleanValue()) {
                    vzy vzyVar = this.a;
                    if (vzyVar.getView() != null) {
                        vzyVar.b0.o(vzyVar);
                        TabLayout.g gVar2 = gVar;
                        vzyVar.p0(gVar2);
                        int i = gVar2.e;
                        TabLayout tabLayout2 = vzyVar.b0;
                        if (tabLayout2 != null && (gVarK2 = tabLayout2.k(i)) != null) {
                            gVarK2.b();
                        }
                        vzyVar.b0.a(vzyVar);
                    }
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        return "OpenBetFragment";
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        t0();
        q0();
        this.K.A1();
        this.J.g0.m(Boolean.TRUE);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.close) {
            requireActivity().getOnBackPressedDispatcher().d();
            return;
        }
        if (id == R.id.login || id == R.id.login_btn || id == R.id.open_bet_login_btn) {
            this.C.demandAccount(getActivity(), this);
            return;
        }
        if (id == R.id.register) {
            this.C.demandNewAccount(getActivity(), this);
        } else if (id == R.id.how_to_cashout_icon || id == R.id.how_to_cashout_text_view) {
            this.H.h(this.I.h("/m/help#/how-to-play/others/how-to-cashout"), null, Sender.UNKNOWN);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.O != null) {
            s0();
            this.C.addAccountChangeListener(this);
            return this.O;
        }
        if (getActivity() == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.spr_fragment_open_bets, viewGroup, false);
        this.O = viewInflate;
        this.c0 = (RecyclerView) viewInflate.findViewById(R.id.open_bet_data_recycler_view);
        View viewFindViewById = this.O.findViewById(R.id.spr_open_bet_recommended_hide_view);
        this.f0 = viewFindViewById;
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.open_bet_login_btn);
        GradientDrawable gradientDrawableE = zch0.e(requireContext().getColor(R.color.brand_secondary), zch0.a(requireContext(), 1), zch0.a(requireContext(), 2));
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        textView.setBackground(gradientDrawableE);
        textView.setOnClickListener(this);
        this.g0 = (ComposeView) this.f0.findViewById(R.id.compose_recommended_header_view);
        View viewFindViewById2 = this.O.findViewById(R.id.me_img);
        this.X = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: gzy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.M.A1(new jzy());
            }
        });
        this.Z = this.O.findViewById(R.id.empty_container_group);
        this.P = (TextView) this.O.findViewById(R.id.login);
        this.Q = (TextView) this.O.findViewById(R.id.register);
        this.R = this.O.findViewById(R.id.divide_line);
        this.T = (TextView) this.O.findViewById(R.id.login_btn);
        this.U = this.O.findViewById(R.id.info);
        this.V = (TextView) this.O.findViewById(R.id.no_login_text);
        this.e0 = (LoadingView) this.O.findViewById(R.id.open_bet_codehub_panel_loading);
        this.W = (AspectRatioImageView) this.O.findViewById(R.id.ad);
        this.P.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.O.findViewById(R.id.how_to_cashout_icon).setOnClickListener(this);
        this.O.findViewById(R.id.how_to_cashout_text_view).setOnClickListener(this);
        TextView textView2 = (TextView) this.O.findViewById(R.id.money);
        this.Y = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: hzy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.M.A1(new izy());
            }
        });
        TabLayout tabLayout = (TabLayout) this.O.findViewById(R.id.tab);
        this.b0 = tabLayout;
        TabLayout.g gVarL = tabLayout.l();
        gVarL.e(sn5.d(this, R.string.common_functions__open_bets, new Object[0]));
        tabLayout.b(gVarL);
        TabLayout tabLayout2 = this.b0;
        TabLayout.g gVarL2 = tabLayout2.l();
        gVarL2.e(sn5.d(this, R.string.common_functions__bet_history, new Object[0]));
        tabLayout2.b(gVarL2);
        this.b0.a(this);
        View viewFindViewById3 = this.O.findViewById(R.id.close);
        this.S = viewFindViewById3;
        viewFindViewById3.setOnClickListener(this);
        NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager) this.O.findViewById(R.id.vg_frame);
        this.a0 = nonSwipeableViewPager;
        nonSwipeableViewPager.b(new tzy(this));
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        int size = supportFragmentManager.c.f().size();
        if (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                Fragment fragmentH = supportFragmentManager.H(this.a0 == null ? "" : "android:switcher:" + this.a0.getId() + ":" + i);
                if (fragmentH != null && fragmentH.isAdded()) {
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.p(fragmentH);
                    aVar.k(true, true);
                }
            }
        }
        b bVar = new b();
        o540 o540Var = new o540();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        arrayList.add(o540Var);
        this.a0.setAdapter(new xui(supportFragmentManager, arrayList, null));
        this.T.setBackground(zch0.e(requireContext().getColor(R.color.brand_secondary), zch0.a(requireContext(), 1), zch0.a(requireContext(), 2)));
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(tch.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.L = (tch) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        f0z f0zVar = new f0z();
        this.d0 = f0zVar;
        f0zVar.b = new fz4() { // from class: kzy
            @Override // defpackage.fz4
            public final void a(ez4 ez4Var) {
                String str;
                boolean z = ez4Var instanceof ez4.d;
                vzy vzyVar = this.a;
                if (!z) {
                    vzyVar.L.B1(ez4Var);
                    return;
                }
                ez4.d dVar = (ez4.d) ez4Var;
                String str2 = dVar.a;
                if (str2 == null || (str = dVar.b) == null) {
                    return;
                }
                xyd0.a.a(str, str2, false, null).show(vzyVar.getParentFragmentManager(), "statisticsDialogFragment");
            }
        };
        final tch tchVar = this.L;
        Objects.requireNonNull(tchVar);
        f0zVar.c = new ij40() { // from class: lzy
            @Override // defpackage.ij40
            public final jvd0 a() {
                return tchVar.C1();
            }
        };
        f0z f0zVar2 = this.d0;
        f0zVar2.d = new mzy(this);
        this.c0.setAdapter(f0zVar2);
        s0();
        this.C.addAccountChangeListener(this);
        return this.O;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        n0z n0zVar = this.K;
        yzy yzyVar = yzy.b;
        n0zVar.getClass();
        n0zVar.H.m(yzyVar);
        this.C.removeAccountChangeListener(this);
        this.Y = null;
        this.O = null;
        super.onDestroyView();
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        TabLayout.g gVarK;
        super.onResume();
        if (this.b0.getSelectedTabPosition() != this.a0.getCurrentItem() && (gVarK = this.b0.k(this.a0.getCurrentItem())) != null) {
            gVarK.b();
        }
        NonSwipeableViewPager nonSwipeableViewPager = this.a0;
        if (nonSwipeableViewPager != null) {
            this.G.d(nonSwipeableViewPager.getCurrentItem() == 1 ? u420.b.a : u420.h.a);
        }
        ((br3) mmc.a(hp0.A, br3.class)).U().a(requireActivity(), false);
        t0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        n0z n0zVar = this.K;
        yzy yzyVar = yzy.a;
        n0zVar.getClass();
        n0zVar.H.m(yzyVar);
        if (this.a0.getCurrentItem() == 0) {
            yie0.b(this, mie0.b);
        } else {
            yie0.b(this, mie0.c);
        }
        NonSwipeableViewPager nonSwipeableViewPager = this.a0;
        if (nonSwipeableViewPager != null) {
            this.G.d(nonSwipeableViewPager.getCurrentItem() == 1 ? u420.b.a : u420.h.a);
        }
        q0();
    }

    public final void p0(TabLayout.g gVar) {
        Object next;
        this.a0.setCurrentItem(gVar.e);
        t0();
        n0z n0zVar = this.K;
        int i = gVar.e;
        n0zVar.getClass();
        f1z.b.getClass();
        Iterator<T> it = f1z.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f1z) next).a != i);
        f1z f1zVar = (f1z) next;
        if (f1zVar != null) {
            wwd0 wwd0Var = n0zVar.C;
            wwd0Var.getClass();
            wwd0Var.k(null, f1zVar);
            Unit unit = Unit.a;
        }
        this.G.d(gVar.e == 1 ? u420.b.a : u420.h.a);
    }

    public final void q0() {
        boolean zIsLogin = this.C.isLogin();
        TextView textView = this.P;
        if (zIsLogin) {
            textView.setVisibility(8);
            this.Q.setVisibility(8);
            this.R.setVisibility(8);
            this.X.setVisibility(0);
            this.P.setVisibility(8);
            this.Y.setVisibility(0);
            return;
        }
        textView.setVisibility(0);
        this.Q.setVisibility(0);
        this.R.setVisibility(0);
        this.P.setVisibility(0);
        this.Y.setVisibility(8);
        this.X.setVisibility(8);
    }

    public final void r0(int i) {
        if (isVisible()) {
            TabLayout tabLayout = this.b0;
            if (i > 0) {
                tabLayout.k(0).e(sn5.d(this, R.string.common_functions__open_bets_num, String.valueOf(i)));
            } else {
                tabLayout.k(0).e(sn5.d(this, R.string.common_functions__open_bets, new Object[0]));
            }
        }
    }

    public final void s0() {
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(n0z.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        n0z n0zVar = (n0z) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.K = n0zVar;
        n0zVar.A.f(getViewLifecycleOwner(), new lfy() { // from class: nzy
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                this.a.r0(((wyy) obj).a);
            }
        });
        this.K.E.f(getViewLifecycleOwner(), new lfy() { // from class: qzy
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                this.a.S.setVisibility(((Boolean) obj).booleanValue() ? 8 : 0);
            }
        });
        this.K.F.f(getViewLifecycleOwner(), new lfy() { // from class: rzy
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                TabLayout.g gVarK = this.a.b0.k(!((Boolean) obj).booleanValue() ? 1 : 0);
                if (gVarK != null) {
                    gVarK.b();
                }
            }
        });
        androidx.fragment.app.e eVarRequireActivity2 = requireActivity();
        eVarRequireActivity2.getClass();
        v8i0 viewModelStore2 = eVarRequireActivity2.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = eVarRequireActivity2.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(eVarRequireActivity2, viewModelStore2, defaultViewModelProviderFactory2));
        dq7 dq7VarA2 = jq40.a(d740.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.M = (d740) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        androidx.fragment.app.e eVarRequireActivity3 = requireActivity();
        eVarRequireActivity3.getClass();
        v8i0 viewModelStore3 = eVarRequireActivity3.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = eVarRequireActivity3.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, sd7.a(eVarRequireActivity3, viewModelStore3, defaultViewModelProviderFactory3));
        dq7 dq7VarA3 = jq40.a(oku.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.J = (oku) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        i2i.b(this.L.w).f(getViewLifecycleOwner(), new lfy() { // from class: szy
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                vzy vzyVar = this.a;
                vzyVar.D.d((a) obj, vzyVar, vzyVar.O, null);
            }
        });
        i2i.b(this.L.z).f(getViewLifecycleOwner(), new lfy() { // from class: czy
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                mws.c cVar;
                String str;
                mws mwsVar = (mws) obj;
                boolean z = mwsVar instanceof mws.a;
                vzy vzyVar = this.a;
                if (z) {
                    Intent intent = new Intent(vzyVar.requireContext(), (Class<?>) BetslipActivity.class);
                    bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                    intent.putExtra("multi_maker_code_action", 2);
                    intent.putExtra("code_provider", "recommended_code_when_empty");
                    g08 g08Var = g08.UNKNOWN;
                    intent.putExtra("action_load_booking_code_from", "RECOMMENDED_BOOKING_CODE_SUCCESSFUL");
                    yrh0.s(vzyVar.requireContext(), intent, true);
                    return;
                }
                if (!(mwsVar instanceof mws.c) || (str = (cVar = (mws.c) mwsVar).a) == null) {
                    return;
                }
                androidx.fragment.app.e eVarRequireActivity4 = vzyVar.requireActivity();
                List<Event> list = cVar.b;
                g08 g08Var2 = g08.UNKNOWN;
                ekl.b(eVarRequireActivity4, str, list, "RECOMMENDED_BOOKING_CODE_SUCCESSFUL", false, cVar.d);
            }
        });
        r5b r5bVarB = i2i.b(this.L.B);
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        xz80 xz80Var = this.E;
        Objects.requireNonNull(xz80Var);
        r5bVarB.f(viewLifecycleOwner, new eq20(xz80Var));
        jlv jlvVarB = fks.b(i2i.b(this.J.o0), i2i.b(this.K.D), new Function2() { // from class: dzy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                int i = ((f1z) obj2).a;
                boolean z = !bool.booleanValue() && i == 1;
                vzy vzyVar = this.a;
                vzyVar.T.setVisibility(z ? 0 : 8);
                vzyVar.U.setVisibility(z ? 0 : 8);
                vzyVar.V.setVisibility(z ? 0 : 8);
                return Boolean.valueOf(!bool.booleanValue() && i == 0);
            }
        });
        i2i.b(this.K.y).f(getViewLifecycleOwner(), new lfy() { // from class: ezy
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                String str = (String) obj;
                TextView textView = this.a.Y;
                if (textView != null) {
                    textView.setText(str);
                }
            }
        });
        fks.b(i2i.b(this.L.U), jlvVarB, new Function2() { // from class: fzy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                jj40 jj40Var = (jj40) obj;
                Boolean bool = (Boolean) obj2;
                boolean z = jj40Var instanceof jj40.b;
                vzy vzyVar = this.a;
                hj40.c(vzyVar.g0, jj40Var, new x9u(vzyVar, 1));
                int i = 8;
                vzyVar.f0.setVisibility((!bool.booleanValue() || z) ? 8 : 0);
                RecyclerView recyclerView = vzyVar.c0;
                if (bool.booleanValue() && z) {
                    i = 0;
                }
                recyclerView.setVisibility(i);
                return null;
            }
        }).f(getViewLifecycleOwner(), new pzy());
        fks.b(i2i.b(this.L.V), i2i.b(this.L.U), new Function2() { // from class: ozy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                lk50 lk50Var = (lk50) obj;
                jj40 jj40Var = (jj40) obj2;
                boolean z = lk50Var instanceof lk50.c;
                vzy vzyVar = this.a;
                if (z) {
                    vzyVar.e0.E();
                    vzyVar.d0.i(h0z.a((List) ((lk50.c) lk50Var).a, jj40Var, true));
                    return null;
                }
                if (lk50Var instanceof lk50.b) {
                    vzyVar.e0.setVisibility(0);
                    return null;
                }
                if (!(lk50Var instanceof lk50.a)) {
                    return null;
                }
                vzyVar.e0.E();
                return null;
            }
        }).f(getViewLifecycleOwner(), new pzy());
        this.L.A1(new aj40.a(Integer.valueOf(R.drawable.spr_ic_related_bets), true), sch.b, true, false, "recommended_code_when_empty");
        this.L.x1();
    }

    public final void t0() {
        if (this.C.isLogin()) {
            this.Z.setVisibility(8);
            this.a0.setVisibility(0);
            return;
        }
        r0(0);
        this.Z.setVisibility(0);
        if (this.h0) {
            this.h0 = false;
            this.W.setAspectRatio(0.2777778f);
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(new JSONObject().put("spotId", "openBetsFooter"));
                jSONObject.put("adSpots", jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.N.a(jSONObject.toString()).G(new a());
        }
        this.a0.setVisibility(8);
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        this.C.loadAccountInfo(null);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }

    public class a implements gv5<BaseResponse<RealSportsAdsData>> {
        public a() {
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<RealSportsAdsData>> su5Var, bi50<BaseResponse<RealSportsAdsData>> bi50Var) {
            BaseResponse<RealSportsAdsData> baseResponse;
            RealSportsAdsData realSportsAdsData;
            List<RealSportsAdSpots> adSpots;
            final RealSportsAds firstAd;
            vzy vzyVar = vzy.this;
            if (vzyVar.getActivity() == null || vzyVar.getActivity().isFinishing() || !bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || (realSportsAdsData = baseResponse.data) == null || (adSpots = realSportsAdsData.getAdSpots()) == null || adSpots.size() <= 0 || adSpots.get(0) == null || (firstAd = adSpots.get(0).getFirstAd()) == null || TextUtils.isEmpty(firstAd.getLinkUrl()) || TextUtils.isEmpty(firstAd.getImgUrl())) {
                return;
            }
            sh8.a().a(firstAd.getImgUrl(), vzyVar.W);
            vzyVar.W.setVisibility(0);
            vzyVar.W.setOnClickListener(new View.OnClickListener() { // from class: uzy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sh8.c().e(firstAd.getLinkUrl());
                }
            });
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<RealSportsAdsData>> su5Var, Throwable th) {
        }
    }
}
