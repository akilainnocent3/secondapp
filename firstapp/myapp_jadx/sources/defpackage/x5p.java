package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.gift.GiftCountBody;
import com.sporty.android.core.model.gift.GiftCountResponse;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.UserAddress;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.common.gift.GiftsActivity;
import com.sportybet.plugin.jackpot.data.JackpotData;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.jackpot.data.Outcome;
import com.sportybet.plugin.realsports.activities.JackpotPlaceBetActivity;
import com.sportybet.plugin.realsports.activities.JackpotSuccessfulPageActivity;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import com.sportybet.plugin.realsports.jackpot.ChildClickableLinearLayout;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class x5p extends htl implements View.OnClickListener, tit {
    public String A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public View H;
    public View I;
    public ProgressButton J;
    public View K;
    public ChildClickableLinearLayout L;
    public su5<BaseResponse<OrderWithFailUpdate>> M;
    public TextView O;
    public String P;
    public int Q;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public String X;
    public boolean Y;
    public CountDownTimer Z;
    public b6p b0;
    public psm c0;
    public s890 d0;
    public uqm e0;
    public LoadingView f;
    public uy0 f0;
    public RecyclerView v;
    public irj w;
    public su5<BaseResponse<JackpotData>> y;
    public final r5p i = ap0.d();
    public final ArrayList z = new ArrayList();
    public int N = -1;
    public int a0 = 0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            x5p.this.q0();
        }
    }

    public class b extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean t() {
            return false;
        }
    }

    public class c extends CountDownTimer {
        public c() {
            super(10000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            x5p x5pVar = x5p.this;
            su5<BaseResponse<OrderWithFailUpdate>> su5Var = x5pVar.M;
            if (su5Var != null) {
                su5Var.cancel();
            }
            x5pVar.w0(10, null);
            x5pVar.s0();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            itf0.a aVar = itf0.a;
            aVar.q("Submitting倒计时：");
            aVar.d("%s", Long.valueOf(j / 1000));
        }
    }

    public class d implements gv5<BaseResponse<OrderWithFailUpdate>> {
        public d() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<OrderWithFailUpdate>> su5Var, Throwable th) {
            x5p x5pVar = x5p.this;
            x5pVar.Z.cancel();
            e activity = x5pVar.getActivity();
            if (activity == null || activity.isFinishing() || su5Var.isCanceled() || x5pVar.isDetached()) {
                return;
            }
            x5pVar.J.setLoading(false);
            x5pVar.O.setEnabled(true);
            x5pVar.w0(-1, null);
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<OrderWithFailUpdate>> su5Var, bi50<BaseResponse<OrderWithFailUpdate>> bi50Var) {
            x5p x5pVar = x5p.this;
            x5pVar.Z.cancel();
            e activity = x5pVar.getActivity();
            if (activity == null || activity.isFinishing() || su5Var.isCanceled() || x5pVar.isDetached()) {
                return;
            }
            x5pVar.O.setText("");
            x5pVar.J.setLoading(false);
            x5pVar.O.setEnabled(true);
            BaseResponse<OrderWithFailUpdate> baseResponse = bi50Var.b;
            if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
                x5pVar.w0(-1, null);
                return;
            }
            int i = baseResponse.bizCode;
            if (i != 10000) {
                if (i != 80001) {
                    x5pVar.w0(i, baseResponse.message);
                    return;
                }
                fbh0 fbh0VarC = sh8.c();
                OrderWithFailUpdate orderWithFailUpdate = baseResponse.data;
                fbh0VarC.b(x140.a(orderWithFailUpdate != null ? orderWithFailUpdate.reachedLimits : null));
                return;
            }
            OrderWithFailUpdate orderWithFailUpdate2 = baseResponse.data;
            if (orderWithFailUpdate2 == null || orderWithFailUpdate2.orderId == null) {
                itf0.a aVar = itf0.a;
                aVar.q("*****no data----");
                aVar.d("redo", new Object[0]);
                x5pVar.w0(-1, null);
                return;
            }
            x5pVar.f0.g();
            OrderWithFailUpdate orderWithFailUpdate3 = baseResponse.data;
            Intent intent = new Intent(x5pVar.getActivity(), (Class<?>) JackpotSuccessfulPageActivity.class);
            Bundle bundle = new Bundle();
            orderWithFailUpdate3.combinations = x5pVar.C.getText().toString();
            bundle.putParcelable("jackpot_order", orderWithFailUpdate3);
            intent.putExtras(bundle);
            yrh0.s(x5pVar.getActivity(), intent, true);
            x5pVar.s0();
        }
    }

    public final void C0() {
        this.a0 = 0;
        ArrayList arrayList = this.z;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            boolean z = true;
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
                    z = false;
                } else {
                    int i3 = this.a0;
                    if (i3 == 0) {
                        this.a0 = i2;
                    } else {
                        this.a0 = i3 * i2;
                    }
                }
            }
            this.H.setVisibility(this.a0 <= 0 ? 8 : 0);
            this.J.setEnabled(z);
            this.J.setTextColor(Color.parseColor(z ? "#ffffff" : "#9ca0ab"));
            this.F.setEnabled(true);
            this.C.setText(z ? bjb0.M(new BigDecimal(this.a0)) : "0");
            this.D.setText(z ? a8b.a(bjb0.L(new BigDecimal(o0()), Locale.US)) : "0");
        } else {
            this.H.setVisibility(8);
        }
        z0();
    }

    public final void m0(UserAddress userAddress) {
        JSONObject jSONObject = new JSONObject();
        try {
            o5p.a(jSONObject, userAddress);
            jSONObject.put("bizType", 3);
            jSONObject.put("operId", 1);
            jSONObject.put("period", this.A);
            jSONObject.put("actualPayAmount", g93.a().s(n0()));
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
            if (!TextUtils.isEmpty(this.P) && !TextUtils.isEmpty(this.R)) {
                JSONObject jSONObject4 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("giftId", this.R);
                jSONArray2.put(jSONObject5);
                jSONObject4.put("favorInfo", jSONArray2);
                jSONObject.put("favor", jSONObject4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.J.setLoading(true);
        this.O.setEnabled(false);
        this.Z = new c().start();
        su5<BaseResponse<OrderWithFailUpdate>> su5VarE = ap0.f().e(jSONObject.toString());
        this.M = su5VarE;
        su5VarE.G(new d());
    }

    public final String n0() {
        if (p0()) {
            try {
                if (!TextUtils.isEmpty(this.P)) {
                    if (Double.parseDouble(this.P.replace(",", "")) >= 0.0d) {
                        double dO0 = o0() - Double.parseDouble(this.P.replace(",", ""));
                        return String.format(Locale.US, "%,.2f", Double.valueOf(dO0 >= 0.0d ? dO0 : 0.0d));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return String.format(Locale.US, "%,.2f", Double.valueOf(o0()));
    }

    public final long o0() {
        psm psmVar = this.c0;
        return this.a0 * ((psmVar == null || !psmVar.S()) ? 1 : 50);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RecyclerView recyclerView = this.v;
        getActivity();
        recyclerView.setLayoutManager(new b());
        if (this.a0 == 0) {
            q0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("gift_value");
        if (GiftUtil.CLEARED_GIFT_VALUE.equals(stringExtra)) {
            this.P = GiftUtil.CLEARED_GIFT_VALUE;
            this.R = null;
            this.Q = 0;
            this.S = null;
            return;
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            this.P = stringExtra;
        }
        String stringExtra2 = intent.getStringExtra("gift_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            this.R = stringExtra2;
        }
        this.Q = intent.getIntExtra("gift_kind", this.Q);
        if (intent.hasExtra("gift_limit")) {
            this.S = intent.getStringExtra("gift_limit");
        }
        z0();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.jackpot_clear_btn) {
            s0();
            return;
        }
        if (id == R.id.jackpot_place_btn) {
            if (getActivity() != null) {
                ((JackpotPlaceBetActivity) getActivity()).C = true;
            }
            this.L.setChildClickable(false);
            this.E.setText(a8b.a(n0()).concat("?"));
            y0(true);
            return;
        }
        if (id == R.id.jackpot_cancel) {
            r0();
            return;
        }
        if (id != R.id.jackpot_confirm) {
            if (id == R.id.jackpot_use_gift) {
                this.T = true;
                this.e0.setRegisterStatus(false);
                this.e0.demandAccount(getActivity(), this);
                return;
            }
            return;
        }
        this.d0.getClass();
        y0(false);
        this.L.setChildClickable(false);
        if (getActivity() != null) {
            ((JackpotPlaceBetActivity) getActivity()).C = true;
        }
        this.F.setEnabled(false);
        e activity = getActivity();
        if (activity == null) {
            return;
        }
        if (!vox.d(activity)) {
            v0(null, sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
            r0();
            return;
        }
        JackpotPlaceBetActivity jackpotPlaceBetActivity = (JackpotPlaceBetActivity) activity;
        if ((System.currentTimeMillis() / 1000) - jackpotPlaceBetActivity.A < jackpotPlaceBetActivity.B) {
            this.e0.demandAccount(activity, this);
        } else {
            v0(sn5.d(this, R.string.jackpot__round_closed, new Object[0]), sn5.d(this, R.string.jackpot__round_closed_tip, new Object[0]));
            t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.K;
        if (view != null) {
            return view;
        }
        if (getActivity() == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.spr_fragment_jackpot_games, viewGroup, false);
        this.K = viewInflate;
        LoadingView loadingView = (LoadingView) viewInflate.findViewById(R.id.jackpot_games_loading);
        this.f = loadingView;
        loadingView.getErrorView().getTitle().setTextColor(Color.parseColor("#9ca0ab"));
        this.f.setOnClickListener(new a());
        this.B = (TextView) this.K.findViewById(R.id.round_number);
        this.v = (RecyclerView) this.K.findViewById(R.id.jackpot_games_recycler);
        this.G = (TextView) this.K.findViewById(R.id.games_no_data);
        this.D = (TextView) getActivity().findViewById(R.id.jackpot_stake_value);
        this.C = (TextView) getActivity().findViewById(R.id.jackpot_combination_count);
        ProgressButton progressButton = (ProgressButton) getActivity().findViewById(R.id.jackpot_place_btn);
        this.J = progressButton;
        progressButton.setButtonText(R.string.component_betslip__place_bet);
        this.J.setLoadingText(R.string.common_functions__submitting);
        this.J.setOnClickListener(this);
        this.E = (TextView) getActivity().findViewById(R.id.jackpot_account_balance_value);
        this.H = getActivity().findViewById(R.id.jackpot_place_layout);
        this.I = getActivity().findViewById(R.id.jackpot_confirm_layout);
        this.L = (ChildClickableLinearLayout) getActivity().findViewById(R.id.jackpot_home_root);
        getActivity().findViewById(R.id.jackpot_cancel).setOnClickListener(this);
        getActivity().findViewById(R.id.jackpot_confirm).setOnClickListener(this);
        TextView textView = (TextView) getActivity().findViewById(R.id.jackpot_clear_btn);
        this.F = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) getActivity().findViewById(R.id.jackpot_use_gift);
        this.O = textView2;
        textView2.setOnClickListener(this);
        this.O.setEnabled(true);
        this.O.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(getActivity(), R.drawable.spr_ic_chevron_right_black_32dp, Color.parseColor("#9ca0ab")), (Drawable) null);
        this.O.setCompoundDrawablePadding(5);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(b6p.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.b0 = (b6p) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            return this.K;
        }
        hb5.a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.V = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.V = true;
        if (this.Y) {
            w0(this.W, this.X);
            return;
        }
        this.v.setFocusable(false);
        if (this.U) {
            this.I.setVisibility(0);
            this.H.setVisibility(8);
        } else {
            C0();
        }
        CharSequence text = this.O.getText();
        if ((TextUtils.isEmpty(text) || !text.toString().contains(sn5.d(this, R.string.app_common__ksh, new Object[0]))) && this.e0.getAccount() != null) {
            b6p b6pVar = this.b0;
            lyh<BaseResponse<GiftCountResponse>> lyhVarX = b6pVar.a.x(new GiftCountBody(2, 3, null, 1, null, 20, null));
            StringUiText stringUiText = vch0.a;
            kzh.d(new a6p(bm50.b(lyhVarX, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), b6pVar), o8i0.d(b6pVar));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b0.c.f(getViewLifecycleOwner(), new lfy() { // from class: w5p
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int totalNum = ((GiftCountResponse) obj).getTotalNum();
                x5p x5pVar = this.a;
                x5pVar.N = totalNum;
                x5pVar.z0();
            }
        });
    }

    public final boolean p0() {
        if (TextUtils.isEmpty(this.P)) {
            return false;
        }
        if (this.Q != 2 || this.a0 == 0) {
            return true;
        }
        double dO0 = o0();
        String str = this.S;
        return dO0 >= (str == null ? 0.0d : Double.parseDouble(str));
    }

    public final void q0() {
        su5<BaseResponse<JackpotData>> su5Var = this.y;
        if (su5Var != null) {
            su5Var.cancel();
        }
        this.v.setVisibility(4);
        this.f.K();
        su5<BaseResponse<JackpotData>> su5VarA = this.i.a();
        this.y = su5VarA;
        su5VarA.G(new y5p(this));
    }

    public final void r0() {
        this.L.setChildClickable(true);
        if (getActivity() != null) {
            ((JackpotPlaceBetActivity) getActivity()).C = false;
        }
        y0(false);
        this.J.setLoading(false);
        this.J.setEnabled(true);
        this.F.setEnabled(true);
    }

    public final void s0() {
        u0(0);
        this.Q = 0;
        this.P = "";
        this.R = "";
        this.S = null;
        irj irjVar = this.w;
        if (irjVar != null) {
            irjVar.notifyDataSetChanged();
        }
        if (getActivity() != null) {
            ((JackpotPlaceBetActivity) getActivity()).C = false;
        }
        this.L.setChildClickable(true);
        this.I.setVisibility(8);
        this.J.setLoading(false);
        this.O.setEnabled(true);
        this.H.setVisibility(8);
    }

    public final void t0() {
        u0(2);
        this.L.setChildClickable(true);
        if (getActivity() != null) {
            ((JackpotPlaceBetActivity) getActivity()).C = false;
        }
        this.I.setVisibility(8);
        this.H.setVisibility(8);
    }

    public final void u0(int i) {
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
        irj irjVar = this.w;
        if (irjVar != null) {
            irjVar.notifyDataSetChanged();
        }
    }

    public final void v0(String str, String str2) {
        e activity = getActivity();
        if (activity != null) {
            androidx.appcompat.app.b.a title = new androidx.appcompat.app.b.a(activity).setTitle(str);
            title.a.f = str2;
            title.c(sn5.d(this, R.string.common_functions__ok, new Object[0]), null);
            title.create().show();
        }
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        if (this.T) {
            this.T = false;
            if (account == null || getActivity() == null) {
                return;
            }
            if (this.e0.getRegisterStatus()) {
                this.e0.setRegisterStatus(false);
                return;
            }
            Intent intent = new Intent(getActivity(), (Class<?>) GiftsActivity.class);
            if (!this.D.getText().equals("0")) {
                intent.putExtra("jackpot_total_stake", o0());
            }
            Bundle bundle = new Bundle();
            bundle.putString("key_gift_id", this.R);
            bundle.putInt("key_gift_kind", this.Q);
            bundle.putInt("order_biz_type", 3);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
            return;
        }
        if (account == null || !z) {
            r0();
            return;
        }
        final py1 py1Var = (py1) getActivity();
        if (py1Var == null || !this.c0.W()) {
            m0(null);
            return;
        }
        this.J.setLoading(true);
        py1Var.getLocationPermissionHelper().e = new ksj(py1Var);
        py1Var.getLocationPermissionHelper().i = new nta(py1Var);
        py1Var.getLocationPermissionHelper().f = new ooy() { // from class: u5p
            @Override // defpackage.ooy
            public final void a() {
                py1Var.showPermissionDeniedMessage();
            }
        };
        py1Var.getLocationPermissionHelper().g = new pta(py1Var);
        py1Var.getLocationPermissionHelper().h = new ymy() { // from class: v5p
            @Override // defpackage.ymy
            public final void a(UserAddress userAddress) {
                this.a.m0(userAddress);
            }
        };
        py1Var.checkAndRequestPermissions(true);
    }

    public final void w0(int i, String str) {
        if (getActivity() == null || getActivity().isFinishing() || isDetached()) {
            return;
        }
        n6p n6pVar = new n6p();
        Bundle bundle = new Bundle();
        bundle.putInt("jackpot_param1", i);
        bundle.putString("jackpot_param2", str);
        n6pVar.setArguments(bundle);
        if (!this.V) {
            this.Y = true;
            this.W = i;
            this.X = str;
            return;
        }
        n6pVar.show(getActivity().getSupportFragmentManager(), "JackpotPlaceDialogFragment");
        this.Y = false;
        this.X = null;
        this.W = 0;
        if (i == 10) {
            s0();
        } else {
            r0();
        }
    }

    public final void y0(boolean z) {
        this.U = z;
        View view = this.I;
        if (z) {
            view.setVisibility(0);
            this.H.setVisibility(8);
        } else {
            view.setVisibility(8);
            this.H.setVisibility(0);
        }
    }

    public final void z0() {
        String strD;
        if (p0()) {
            TextView textView = this.O;
            if (this.P.contains(GiftUtil.CLEARED_GIFT_VALUE)) {
                strD = this.P;
            } else {
                strD = sn5.d(this, R.string.app_common__minus_two_var, a8b.d().trim(), ((double) o0()) < Double.parseDouble(this.P) ? String.format(Locale.US, "%,.2f", Double.valueOf(o0())) : this.P);
            }
            textView.setText(strD);
            return;
        }
        this.P = "";
        this.Q = 0;
        this.S = null;
        int i = this.N;
        TextView textView2 = this.O;
        if (i == -1) {
            textView2.setText("");
        } else if (i == 0) {
            textView2.setText(sn5.d(this, R.string.common_functions__none, new Object[0]));
        } else {
            textView2.setText(sn5.d(this, R.string.component_coupon__cmn_gifts_label, String.valueOf(i)));
        }
    }
}
