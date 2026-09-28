package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.JackpotMainActivity;
import com.sportybet.plugin.jackpot.data.JackpotData;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.jackpot.data.PeriodNumber;
import com.sportybet.plugin.jackpot.data.Winnings;
import com.sportybet.plugin.jackpot.widget.LoadingView;
import com.sportybet.plugin.jackpot.widget.NumberPanel;
import com.sportybet.plugin.jackpot.widget.SpinnerTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class s6p extends Fragment implements View.OnClickListener, PopupWindow.OnDismissListener {
    public List<Winnings> A;
    public View B;
    public zk50 D;
    public igj0 E;
    public SpinnerTextView F;
    public TextView G;
    public List<PeriodNumber> I;
    public su5<BaseResponse<List<PeriodNumber>>> J;
    public TextView K;
    public yec a;
    public LoadingView b;
    public View d;
    public RecyclerView e;
    public RecyclerView f;
    public TextView i;
    public TextView v;
    public su5<BaseResponse<JackpotData>> w;
    public int y;
    public List<JackpotElement> z;
    public final r5p c = ap0.d();
    public boolean C = true;
    public final PeriodNumber H = new PeriodNumber();
    public String L = "";

    public class a extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean t() {
            return false;
        }
    }

    public class b extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean t() {
            return false;
        }
    }

    public final void j0(boolean z) {
        this.f.setVisibility(z ? 4 : 0);
        this.e.setVisibility(z ? 4 : 0);
    }

    public final void m0(boolean z) {
        su5<BaseResponse<JackpotData>> su5Var = this.w;
        if (su5Var != null) {
            su5Var.cancel();
        }
        j0(true);
        this.b.d();
        PeriodNumber periodNumber = this.H;
        su5<BaseResponse<JackpotData>> su5VarB = this.c.b(periodNumber.getPeriodNumber(), periodNumber.getId());
        this.w = su5VarB;
        su5VarB.G(new v6p(this, z));
    }

    public final void n0() {
        if (!a8b.c().z()) {
            this.K.setVisibility(8);
            return;
        }
        String str = this.L;
        PeriodNumber periodNumber = this.H;
        String betType = periodNumber.getBetType();
        Objects.requireNonNull(betType);
        int iCompareTo = str.compareTo(betType);
        TextView textView = this.K;
        if (iCompareTo <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.K.setText(sn5.d(this, R.string.jackpot__upgrade_hint, periodNumber.getBetType(), this.L));
        }
    }

    public final void o0() {
        List<Winnings> arrayList = this.A;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.A = arrayList;
        }
        igj0 igj0Var = this.E;
        String str = this.L;
        if (igj0Var == null) {
            igj0 igj0Var2 = new igj0();
            igj0Var2.b = str;
            igj0Var2.a = arrayList;
            this.E = igj0Var2;
            this.f.setAdapter(igj0Var2);
        } else {
            igj0Var.a = arrayList;
            igj0Var.b = str;
            igj0Var.notifyDataSetChanged();
            this.E.notifyDataSetChanged();
        }
        List<JackpotElement> arrayList2 = this.z;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
            this.z = arrayList2;
        }
        zk50 zk50Var = this.D;
        if (zk50Var == null) {
            zk50 zk50Var2 = new zk50();
            zk50Var2.a = arrayList2;
            this.D = zk50Var2;
            this.e.setAdapter(zk50Var2);
        } else {
            zk50Var.a = arrayList2;
            zk50Var.notifyDataSetChanged();
        }
        if (this.A.isEmpty() && this.z.isEmpty()) {
            this.v.setVisibility(0);
            this.d.setVisibility(8);
            return;
        }
        this.v.setVisibility(8);
        int i = this.y;
        TextView textView = this.i;
        if (i == 4) {
            textView.setVisibility(0);
            this.d.setVisibility(0);
        } else {
            List<Winnings> list = this.A;
            textView.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
            this.d.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.C) {
            if (this.D == null) {
                m0(this.I == null);
                return;
            }
            return;
        }
        this.C = false;
        RecyclerView recyclerView = this.f;
        getActivity();
        recyclerView.setLayoutManager(new a());
        RecyclerView recyclerView2 = this.e;
        getActivity();
        recyclerView2.setLayoutManager(new b());
        m0(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        int id = view.getId();
        if (id != R.id.result_spinner) {
            if (id == R.id.result_tip_info) {
                sh8.c().c(bjb0.S("/m/help#/how-to-play/jackpot"), mll0.a("title", "How to Play"));
                return;
            }
            return;
        }
        SpinnerTextView spinnerTextView = this.F;
        spinnerTextView.setChecked(!spinnerTextView.v);
        List<PeriodNumber> list = this.I;
        if (list == null || list.isEmpty()) {
            return;
        }
        e activity = getActivity();
        List<PeriodNumber> list2 = this.I;
        NumberPanel numberPanel = new NumberPanel(activity);
        LayoutInflater.from(activity).inflate(R.layout.jackpot_numbers_list, numberPanel);
        RecyclerView recyclerView = (RecyclerView) numberPanel.findViewById(R.id.numbers_recycler_view);
        numberPanel.b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        numberPanel.a = this;
        PeriodNumber periodNumber = this.H;
        d6y d6yVar = new d6y(list2, periodNumber);
        d6yVar.b = this;
        numberPanel.b.setAdapter(d6yVar);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) numberPanel.b.getLayoutManager();
        RecyclerView recyclerView2 = numberPanel.b;
        int iIndexOf = list2.indexOf(periodNumber);
        int iF1 = linearLayoutManager.f1();
        int iH1 = linearLayoutManager.h1();
        if (iIndexOf > iF1 && iIndexOf <= iH1) {
            recyclerView2.scrollBy(0, recyclerView2.getChildAt(iIndexOf - iF1).getTop());
        } else {
            recyclerView2.o0(iIndexOf);
        }
        numberPanel.setOnClickListener(numberPanel);
        yec yecVar = new yec((ViewGroup) numberPanel);
        this.a = yecVar;
        yecVar.setOnDismissListener(this);
        this.a.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99000000")));
        JackpotMainActivity jackpotMainActivity = (JackpotMainActivity) getActivity();
        jackpotMainActivity.getClass();
        Rect rect = new Rect();
        jackpotMainActivity.v.offsetDescendantRectToMyCoords(jackpotMainActivity.i, rect);
        jackpotMainActivity.v.smoothScrollTo(0, rect.centerY() - ((jackpotMainActivity.i.getHeight() * 7) / 6));
        view.postDelayed(new Runnable() { // from class: p6p
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.showAsDropDown(view, 0, 0);
            }
        }, 200L);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.B;
        if (view != null) {
            return view;
        }
        if (getActivity() == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.jap_fragment_jackpot_results, viewGroup, false);
        this.B = viewInflate;
        LoadingView loadingView = (LoadingView) viewInflate.findViewById(R.id.jackpot_results_loading);
        this.b = loadingView;
        loadingView.a.getTitle().setTextColor(Color.parseColor("#9ca0ab"));
        this.b.setOnClickListener(new q6p(this, 0));
        this.v = (TextView) this.B.findViewById(R.id.previous_no_data);
        this.f = (RecyclerView) this.B.findViewById(R.id.winnings_recycler_view);
        this.i = (TextView) this.B.findViewById(R.id.winnings_title);
        this.K = (TextView) this.B.findViewById(R.id.result_tip_info);
        this.K.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(getActivity(), R.drawable.spr_info, Color.parseColor("#0d9737")), (Drawable) null, iwh0.a(getActivity(), R.drawable.jap_ic_chevron_right_black_32dp, Color.parseColor("#0d9737")), (Drawable) null);
        this.K.setOnClickListener(this);
        this.e = (RecyclerView) this.B.findViewById(R.id.results_recycler_view);
        this.F = (SpinnerTextView) this.B.findViewById(R.id.result_spinner);
        this.G = (TextView) this.B.findViewById(R.id.sporty_type);
        this.F.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(requireContext(), R.drawable.jap_arrow_down), (Drawable) null);
        this.F.setOnClickListener(this);
        this.d = this.B.findViewById(R.id.void_result_hint);
        return this.B;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
        this.F.setChecked(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f.setFocusable(false);
        this.e.setFocusable(false);
    }
}
