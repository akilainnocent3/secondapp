package defpackage;

import android.accounts.Account;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.jackpot.activities.JackpotMainActivity;
import com.sportybet.plugin.jackpot.data.JackpotData;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.jackpot.data.Order;
import com.sportybet.plugin.jackpot.data.Outcome;
import com.sportybet.plugin.jackpot.widget.ChildClickableLinearLayout;
import com.sportybet.plugin.jackpot.widget.LoadingView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c7p extends ltl implements View.OnClickListener, tit {
    public String A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public View H;
    public ProgressButton I;
    public View J;
    public ChildClickableLinearLayout K;
    public su5<BaseResponse<Order>> L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public String Q;
    public boolean R;
    public CountDownTimer S;
    public TextView U;
    public View X;
    public CheckBox Y;
    public TextView Z;
    public uqm a0;
    public psm b0;
    public s890 c0;
    public uy0 d0;
    public j7p e0;
    public LoadingView f;
    public RecyclerView v;
    public i6p w;
    public su5<BaseResponse<JackpotData>> y;
    public final lo0 i = t5p.a();
    public final ArrayList z = new ArrayList();
    public int T = 0;
    public boolean V = true;
    public long W = -1;

    public class a extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean t() {
            return false;
        }
    }

    public final void C0() {
        boolean z = false;
        this.T = 0;
        ArrayList arrayList = this.z;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            boolean z2 = true;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Iterator<Outcome> it = ((JackpotElement) obj).outcomes.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (it.next().status == 1) {
                        i2++;
                    }
                }
                if (i2 == 0) {
                    z2 = false;
                } else {
                    int i3 = this.T;
                    if (i3 == 0) {
                        this.T = i2;
                    } else {
                        this.T = i3 * i2;
                    }
                }
            }
            this.C.setText(z2 ? bjb0.M(new BigDecimal(this.T)) : "0");
            this.D.setText(z2 ? a8b.a(bjb0.L(new BigDecimal(o0()), Locale.US)) : "0");
            z = z2;
        }
        m0(z);
    }

    public final void m0(boolean z) {
        this.I.setEnabled(z);
        int i = z ? R.color.text_type2_primary : R.color.text_disable_type1_primary;
        ProgressButton progressButton = this.I;
        progressButton.setTextColor(c8i0.d(i, progressButton));
    }

    public final String n0() {
        if (!this.Y.isChecked() || this.e0.z1().isEmpty()) {
            return String.format(Locale.US, "%,.2f", Double.valueOf(o0()));
        }
        double dO0 = o0() - Double.parseDouble(this.e0.z1().replace(",", ""));
        if (dO0 < 0.0d) {
            dO0 = 0.0d;
        }
        return String.format(Locale.US, "%,.2f", Double.valueOf(dO0));
    }

    public final long o0() {
        return ((long) this.T) * this.W;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.jackpot_clear_btn) {
            r0();
            return;
        }
        if (id == R.id.jackpot_place_btn) {
            if (getActivity() != null) {
                ((JackpotMainActivity) getActivity()).A = true;
            }
            this.K.setChildClickable(false);
            String strN0 = n0();
            j7p j7pVar = this.e0;
            long jO0 = o0();
            boolean zIsChecked = this.Y.isChecked();
            j7pVar.getClass();
            q5p q5pVar = j7pVar.c;
            q5p.a aVarY1 = j7pVar.y1(jO0, strN0, zIsChecked);
            q5pVar.getClass();
            q5pVar.b(new o7p.e(q5pVar.a(aVarY1)));
            this.E.setText(a8b.a(strN0));
            z0(true);
            return;
        }
        if (id == R.id.jackpot_cancel) {
            q0();
            return;
        }
        if (id == R.id.jackpot_confirm) {
            this.c0.getClass();
            z0(false);
            this.K.setChildClickable(false);
            if (getActivity() != null) {
                ((JackpotMainActivity) getActivity()).A = true;
            }
            this.F.setEnabled(false);
            if (!vox.d(hp0.A)) {
                y0(q5p.b.NETWORK_UNAVAILABLE);
                u0(null, sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
                q0();
                return;
            }
            if (getActivity() != null) {
                JackpotMainActivity jackpotMainActivity = (JackpotMainActivity) getActivity();
                jackpotMainActivity.getClass();
                if ((System.currentTimeMillis() / 1000) - jackpotMainActivity.y >= jackpotMainActivity.z) {
                    y0(q5p.b.ROUND_CLOSED);
                    u0(sn5.d(this, R.string.jackpot__round_closed, new Object[0]), sn5.d(this, R.string.jackpot__round_closed_tip, new Object[0]));
                    s0();
                    return;
                }
            }
            this.a0.demandAccount(getActivity(), this);
            return;
        }
        if (id == R.id.gift_textview) {
            this.M = true;
            this.a0.setRegisterStatus(false);
            this.a0.demandAccount(getActivity(), this);
            return;
        }
        if (id == R.id.jackpot_rush) {
            q5p q5pVar2 = this.e0.c;
            q5pVar2.getClass();
            q5pVar2.b(o7p.i.a);
            if (this.T > 0 && this.I.isEnabled()) {
                r0();
            }
            ArrayList arrayList = this.z;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                JackpotElement jackpotElement = (JackpotElement) obj;
                Iterator<Outcome> it = jackpotElement.outcomes.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (it.next().status == 1) {
                        i2++;
                    }
                }
                if (i2 == 0) {
                    jackpotElement.outcomes.get(o380.a().nextInt(3)).status = 1;
                }
            }
            i6p i6pVar = this.w;
            if (i6pVar != null) {
                i6pVar.notifyDataSetChanged();
            }
            C0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.J;
        if (view != null) {
            return view;
        }
        if (getActivity() == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.jap_fragment_jackpot_sporty, viewGroup, false);
        this.J = viewInflate;
        LoadingView loadingView = (LoadingView) viewInflate.findViewById(R.id.jackpot_games_loading);
        this.f = loadingView;
        loadingView.a.getTitle().setTextColor(Color.parseColor("#9ca0ab"));
        this.f.c.setTextColor(Color.parseColor("#9ca0ab"));
        this.f.setOnClickListener(new z6p(this, 0));
        this.K = (ChildClickableLinearLayout) getActivity().findViewById(R.id.jackpot_home_root);
        this.B = (TextView) this.J.findViewById(R.id.round_number);
        this.v = (RecyclerView) this.J.findViewById(R.id.jackpot_games_recycler);
        this.G = (TextView) this.J.findViewById(R.id.games_no_data);
        this.D = (TextView) this.J.findViewById(R.id.jackpot_stake_value);
        this.C = (TextView) this.J.findViewById(R.id.jackpot_combination_count);
        this.I = (ProgressButton) this.J.findViewById(R.id.jackpot_place_btn);
        m0(false);
        this.I.setButtonText(R.string.component_betslip__place_bet);
        this.I.setLoadingText(R.string.component_betslip__place_bet);
        this.I.setOnClickListener(this);
        View viewFindViewById = getActivity().findViewById(R.id.jackpot_confirm_layout);
        this.H = viewFindViewById;
        this.E = (TextView) viewFindViewById.findViewById(R.id.jackpot_account_balance_value);
        this.H.findViewById(R.id.jackpot_cancel).setOnClickListener(this);
        this.H.findViewById(R.id.jackpot_confirm).setOnClickListener(this);
        this.F = (TextView) this.J.findViewById(R.id.jackpot_clear_btn);
        TextView textView = (TextView) this.J.findViewById(R.id.jackpot_rush);
        this.U = textView;
        textView.setOnClickListener(this);
        this.F.setOnClickListener(this);
        this.X = this.J.findViewById(R.id.jackpot_disabled_overlay);
        this.Y = (CheckBox) this.J.findViewById(R.id.gift_checkbox);
        this.Z = (TextView) this.J.findViewById(R.id.gift_textview);
        this.Y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a7p
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                j7p j7pVar = this.a.e0;
                if (j7pVar == null) {
                    return;
                }
                wwd0 wwd0Var = j7pVar.d;
                while (true) {
                    Object value = wwd0Var.getValue();
                    boolean z2 = z;
                    if (wwd0Var.g(value, ayk.a((ayk) value, false, z2, null, null, null, null, false, false, null, 509))) {
                        return;
                    } else {
                        z = z2;
                    }
                }
            }
        });
        TextView textView2 = this.Z;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        this.Z.setOnClickListener(this);
        return this.J;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.O = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.O = true;
        if (this.R) {
            v0(this.P, this.Q);
            return;
        }
        this.v.setFocusable(false);
        if (this.N) {
            this.H.setVisibility(0);
        } else {
            C0();
        }
        if (((ayk) this.e0.d.getValue()).b) {
            return;
        }
        j7p j7pVar = this.e0;
        j7pVar.getClass();
        ej5.c(o8i0.d(j7pVar), null, null, new i7p(j7pVar, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(j7p.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        j7p j7pVar = (j7p) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.e0 = j7pVar;
        yyh.b(j7pVar.d, this, s9s.b.d, new b7p(this, 0));
        ComposeView composeView = (ComposeView) view.findViewById(R.id.gift_value_edit_composeview);
        final wwd0 wwd0Var = this.e0.d;
        final x6p x6pVar = new x6p(this);
        composeView.getClass();
        wwd0Var.getClass();
        mla.i(composeView, new op8(-773231543, new Function2() { // from class: nwk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ytw ytwVarC = wyh.c(wwd0Var, aVar, 0, 7);
                    final x6p x6pVar2 = x6pVar;
                    o0z.a(null, null, null, null, null, pp8.b(54045114, new Function2() { // from class: vwk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 0;
                            int i2 = 1;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ayk aykVar = (ayk) ytwVarC.getValue();
                                final x6p x6pVar3 = x6pVar2;
                                boolean zM = aVar2.M(x6pVar3);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zM || objY == c0042a) {
                                    objY = new wjb(x6pVar3, i2);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zM2 = aVar2.M(x6pVar3);
                                Object objY2 = aVar2.y();
                                if (zM2 || objY2 == c0042a) {
                                    objY2 = new xjb(x6pVar3, i2);
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zM3 = aVar2.M(x6pVar3);
                                Object objY3 = aVar2.y();
                                if (zM3 || objY3 == c0042a) {
                                    objY3 = new wwk(x6pVar3, i);
                                    aVar2.r(objY3);
                                }
                                Function1 function2 = (Function1) objY3;
                                boolean zM4 = aVar2.M(x6pVar3);
                                Object objY4 = aVar2.y();
                                if (zM4 || objY4 == c0042a) {
                                    objY4 = new zjb(x6pVar3, i2);
                                    aVar2.r(objY4);
                                }
                                Function0 function3 = (Function0) objY4;
                                boolean zM5 = aVar2.M(x6pVar3);
                                Object objY5 = aVar2.y();
                                if (zM5 || objY5 == c0042a) {
                                    objY5 = new xwk(x6pVar3, i);
                                    aVar2.r(objY5);
                                }
                                Function0 function4 = (Function0) objY5;
                                boolean zM6 = aVar2.M(x6pVar3);
                                Object objY6 = aVar2.y();
                                if (zM6 || objY6 == c0042a) {
                                    objY6 = new Function0() { // from class: ywk
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            x6pVar3.invoke(zxk.e.a);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY6);
                                }
                                ayk aykVar2 = ayk.j;
                                bxk.f(aykVar, function0, function1, function2, function3, function4, (Function0) objY6, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        ComposeView composeView2 = (ComposeView) view.findViewById(R.id.gift_selector_composeview);
        final wwd0 wwd0Var2 = this.e0.e;
        final y6p y6pVar = new y6p(this);
        composeView2.getClass();
        wwd0Var2.getClass();
        mla.i(composeView2, new op8(1704383485, new Function2() { // from class: ctk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ytw ytwVarC = wyh.c(wwd0Var2, aVar, 0, 7);
                    final y6p y6pVar2 = y6pVar;
                    o0z.a(null, null, null, null, null, pp8.b(-1714039572, new Function2() { // from class: otk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 1;
                            int i2 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                nvk nvkVar = (nvk) ytwVarC.getValue();
                                final y6p y6pVar3 = y6pVar2;
                                boolean zM = aVar2.M(y6pVar3);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zM || objY == c0042a) {
                                    objY = new Function1() { // from class: ptk
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            String str = (String) obj5;
                                            str.getClass();
                                            y6pVar3.invoke(new mvk.b(str));
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                Function1 function1 = (Function1) objY;
                                boolean zM2 = aVar2.M(y6pVar3);
                                Object objY2 = aVar2.y();
                                if (zM2 || objY2 == c0042a) {
                                    objY2 = new aj7(y6pVar3, i2);
                                    aVar2.r(objY2);
                                }
                                Function1 function2 = (Function1) objY2;
                                boolean zM3 = aVar2.M(y6pVar3);
                                Object objY3 = aVar2.y();
                                if (zM3 || objY3 == c0042a) {
                                    objY3 = new x4g(y6pVar3, i);
                                    aVar2.r(objY3);
                                }
                                nvk nvkVar2 = nvk.c;
                                luk.b(nvkVar, function1, function2, (Function0) objY3, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    public final void p0() {
        su5<BaseResponse<JackpotData>> su5Var = this.y;
        if (su5Var != null) {
            su5Var.cancel();
        }
        if (!this.f.isShown()) {
            this.f.d();
            this.v.setVisibility(8);
        }
        su5<BaseResponse<JackpotData>> su5VarC = ap0.d().c(1);
        this.y = su5VarC;
        su5VarC.G(new g7p(this));
    }

    public final void q0() {
        this.K.setChildClickable(true);
        if (getActivity() != null) {
            ((JackpotMainActivity) getActivity()).A = false;
        }
        z0(false);
        this.I.setButtonText(R.string.component_betslip__place_bet);
        this.I.setLoadingText(R.string.component_betslip__place_bet);
        m0(true);
        this.F.setEnabled(true);
    }

    public final void r0() {
        t0(0);
        i6p i6pVar = this.w;
        if (i6pVar != null) {
            i6pVar.notifyDataSetChanged();
        }
        if (getActivity() != null) {
            ((JackpotMainActivity) getActivity()).A = false;
        }
        this.K.setChildClickable(true);
        this.H.setVisibility(8);
        this.I.setButtonText(R.string.component_betslip__place_bet);
        this.I.setLoadingText(R.string.component_betslip__place_bet);
        C0();
        this.F.setEnabled(this.V);
        this.I.setLoading(false);
        this.Z.setEnabled(true);
    }

    public final void s0() {
        this.U.setEnabled(false);
        this.F.setEnabled(false);
        this.K.setChildClickable(true);
        if (getActivity() != null) {
            ((JackpotMainActivity) getActivity()).A = false;
        }
        this.H.setVisibility(8);
    }

    public final void t0(int i) {
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Iterator<Outcome> it = ((JackpotElement) obj).outcomes.iterator();
            while (it.hasNext()) {
                it.next().status = i;
            }
        }
        i6p i6pVar = this.w;
        if (i6pVar != null) {
            i6pVar.notifyDataSetChanged();
        }
    }

    public final void u0(String str, String str2) {
        if (getActivity() != null) {
            b.a title = new b.a(getActivity()).setTitle(str);
            title.a.f = str2;
            title.c(sn5.d(this, R.string.common_functions__ok, new Object[0]), null);
            title.create().show();
        }
    }

    public final void v0(int i, String str) {
        if (getActivity() == null || getActivity().isFinishing() || isDetached()) {
            return;
        }
        o6p o6pVar = new o6p();
        Bundle bundle = new Bundle();
        bundle.putInt("jackpot_param1", i);
        bundle.putString("jackpot_param2", str);
        o6pVar.setArguments(bundle);
        if (!this.O) {
            this.R = true;
            this.P = i;
            this.Q = str;
            return;
        }
        o6pVar.show(getActivity().getSupportFragmentManager(), "JackpotPlaceDialogFragment");
        this.R = false;
        this.Q = null;
        this.P = 0;
        if (i == 10) {
            r0();
        } else {
            q0();
        }
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        Object value;
        if (this.M) {
            this.M = false;
            if (account == null || getActivity() == null) {
                return;
            }
            if (this.a0.getRegisterStatus()) {
                this.a0.setRegisterStatus(false);
                return;
            }
            wwd0 wwd0Var = this.e0.d;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ayk.a((ayk) value, true, false, null, null, null, null, false, false, null, 510)));
            return;
        }
        if (account == null || !z) {
            q0();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bizType", 3);
            jSONObject.put("operId", 1);
            jSONObject.put("period", this.A);
            jSONObject.put("actualPayAmount", new BigDecimal(n0().replace(",", "")).multiply(BigDecimal.valueOf(10000L)).longValue());
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.z;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                JackpotElement jackpotElement = (JackpotElement) obj;
                for (Outcome outcome : jackpotElement.outcomes) {
                    if (outcome.status == 1) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, jackpotElement.eventId);
                        jSONObject3.put(AnalyticsParam.EVENT_PARAM_ID, outcome.id);
                        jSONObject3.put("banker", false);
                        jSONArray.put(jSONObject3);
                    }
                }
            }
            jSONObject2.put("selections", jSONArray);
            jSONObject.put("ticket", jSONObject2);
            if (this.Y.isChecked() && !TextUtils.isEmpty(this.e0.z1())) {
                JSONObject jSONObject4 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("giftId", ((ayk) this.e0.d.getValue()).d);
                jSONObject5.put("giftValue", this.e0.z1());
                jSONArray2.put(jSONObject5);
                jSONObject4.put("favorInfo", jSONArray2);
                jSONObject.put("favor", jSONObject4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.I.setButtonText(R.string.common_functions__submitting);
        this.I.setLoadingText(R.string.common_functions__submitting);
        this.I.setLoading(true);
        this.Z.setEnabled(false);
        this.S = new d7p(this).start();
        su5<BaseResponse<Order>> su5VarE = this.i.e(jSONObject.toString());
        this.L = su5VarE;
        su5VarE.G(new e7p(this));
    }

    public final void w0(int i) {
        j7p j7pVar = this.e0;
        long jO0 = o0();
        String strN0 = n0();
        boolean zIsChecked = this.Y.isChecked();
        Integer numValueOf = Integer.valueOf(i);
        j7pVar.getClass();
        j7pVar.A1(jO0, strN0, zIsChecked, numValueOf, null);
    }

    public final void y0(q5p.b bVar) {
        this.e0.A1(o0(), n0(), this.Y.isChecked(), null, bVar);
    }

    public final void z0(boolean z) {
        this.N = z;
        View view = this.H;
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        su5<BaseResponse<Object>> su5VarC;
        super.onActivityCreated(bundle);
        RecyclerView recyclerView = this.v;
        getActivity();
        recyclerView.setLayoutManager(new a());
        if (this.T == 0) {
            this.f.d();
            bcp bcpVar = new bcp();
            xdp xdpVar = new xdp();
            xdpVar.i("appId", "order");
            xdpVar.i("namespace", "application");
            xdpVar.i(siPCzPFw.AAfjUzM, "jackpot_stake");
            bcpVar.h(xdpVar);
            boolean zR = this.b0.r();
            lo0 lo0Var = this.i;
            if (zR) {
                su5VarC = lo0Var.b(bcpVar.toString());
            } else {
                su5VarC = lo0Var.c(bcpVar.toString());
            }
            su5VarC.G(new f7p(this));
        }
    }
}
