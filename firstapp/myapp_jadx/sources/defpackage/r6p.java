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
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.jackpot.data.JackpotData;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.jackpot.data.Winnings;
import com.sportybet.plugin.realsports.activities.JackpotPlaceBetActivity;
import com.sportybet.plugin.realsports.jackpot.NumberPanel;
import com.sportybet.plugin.realsports.widget.SpinnerTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class r6p extends Fragment implements View.OnClickListener, PopupWindow.OnDismissListener {
    public View A;
    public al50 C;
    public jgj0 D;
    public SpinnerTextView E;
    public List<String> G;
    public su5<BaseResponse<List<String>>> H;
    public yec I;
    public LoadingView a;
    public View c;
    public RecyclerView d;
    public RecyclerView e;
    public TextView f;
    public TextView i;
    public su5<BaseResponse<JackpotData>> v;
    public int w;
    public List<JackpotElement> y;
    public List<Winnings> z;
    public final r5p b = ap0.d();
    public boolean B = true;
    public String F = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            r6p.this.m0(true);
        }
    }

    public class b extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean t() {
            return false;
        }
    }

    public class c extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean t() {
            return false;
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ View a;

        public d(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            r6p.this.I.showAsDropDown(this.a, 0, 0);
        }
    }

    public final void j0(boolean z) {
        this.e.setVisibility(z ? 4 : 0);
        this.d.setVisibility(z ? 4 : 0);
    }

    public final void m0(boolean z) {
        su5<BaseResponse<JackpotData>> su5Var = this.v;
        if (su5Var != null) {
            su5Var.cancel();
        }
        j0(true);
        this.a.K();
        su5<BaseResponse<JackpotData>> su5VarB = this.b.b(this.F, null);
        this.v = su5VarB;
        su5VarB.G(new w6p(this, z));
    }

    public final void n0() {
        List<Winnings> arrayList = this.z;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.z = arrayList;
        }
        jgj0 jgj0Var = this.D;
        if (jgj0Var == null) {
            jgj0 jgj0Var2 = new jgj0();
            jgj0Var2.a = arrayList;
            this.D = jgj0Var2;
            this.e.setAdapter(jgj0Var2);
        } else {
            jgj0Var.a = arrayList;
            jgj0Var.notifyDataSetChanged();
        }
        List<JackpotElement> arrayList2 = this.y;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
            this.y = arrayList2;
        }
        al50 al50Var = this.C;
        if (al50Var == null) {
            al50 al50Var2 = new al50();
            al50Var2.a = arrayList2;
            this.C = al50Var2;
            this.d.setAdapter(al50Var2);
        } else {
            al50Var.a = arrayList2;
            al50Var.notifyDataSetChanged();
        }
        if (this.z.size() == 0 && this.y.size() == 0) {
            this.i.setVisibility(0);
            this.c.setVisibility(8);
            return;
        }
        this.i.setVisibility(8);
        int i = this.w;
        TextView textView = this.f;
        if (i == 4) {
            textView.setVisibility(0);
            this.c.setVisibility(0);
        } else {
            List<Winnings> list = this.z;
            textView.setVisibility((list == null || list.size() <= 0) ? 8 : 0);
            this.c.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.B) {
            if (this.C == null) {
                m0(this.G == null);
                return;
            }
            return;
        }
        this.B = false;
        RecyclerView recyclerView = this.e;
        getActivity();
        recyclerView.setLayoutManager(new b());
        RecyclerView recyclerView2 = this.d;
        getActivity();
        recyclerView2.setLayoutManager(new c());
        m0(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.result_spinner) {
            SpinnerTextView spinnerTextView = this.E;
            spinnerTextView.setChecked(!spinnerTextView.a);
            List<String> list = this.G;
            if (list == null || list.size() <= 0) {
                return;
            }
            e activity = getActivity();
            List<String> list2 = this.G;
            String str = this.F;
            NumberPanel numberPanel = new NumberPanel(activity);
            LayoutInflater.from(activity).inflate(R.layout.jackpot_numbers_list, numberPanel);
            RecyclerView recyclerView = (RecyclerView) numberPanel.findViewById(R.id.numbers_recycler_view);
            numberPanel.a = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager());
            numberPanel.b = this;
            e6y e6yVar = new e6y();
            e6yVar.a = list2;
            e6yVar.c = str;
            e6yVar.b = this;
            numberPanel.a.setAdapter(e6yVar);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) numberPanel.a.getLayoutManager();
            RecyclerView recyclerView2 = numberPanel.a;
            int iIndexOf = list2.indexOf(str);
            ArrayList arrayList = kgb0.a;
            int iF1 = linearLayoutManager.f1();
            int iH1 = linearLayoutManager.h1();
            if (iIndexOf > iF1 && iIndexOf <= iH1) {
                recyclerView2.scrollBy(0, recyclerView2.getChildAt(iIndexOf - iF1).getTop());
            } else {
                recyclerView2.o0(iIndexOf);
            }
            numberPanel.setOnClickListener(numberPanel);
            yec yecVar = new yec((ViewGroup) numberPanel);
            this.I = yecVar;
            yecVar.setOnDismissListener(this);
            this.I.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99000000")));
            JackpotPlaceBetActivity jackpotPlaceBetActivity = (JackpotPlaceBetActivity) getActivity();
            jackpotPlaceBetActivity.getClass();
            Rect rect = new Rect();
            jackpotPlaceBetActivity.y.offsetDescendantRectToMyCoords(jackpotPlaceBetActivity.w, rect);
            jackpotPlaceBetActivity.y.smoothScrollTo(0, rect.centerY() - ((jackpotPlaceBetActivity.w.getHeight() * 7) / 6));
            view.postDelayed(new d(view), 100L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.A;
        if (view != null) {
            return view;
        }
        if (getActivity() == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.spr_fragment_jackpot_results, viewGroup, false);
        this.A = viewInflate;
        LoadingView loadingView = (LoadingView) viewInflate.findViewById(R.id.jackpot_results_loading);
        this.a = loadingView;
        loadingView.getErrorView().getTitle().setTextColor(Color.parseColor("#9ca0ab"));
        this.a.setOnClickListener(new a());
        this.i = (TextView) this.A.findViewById(R.id.previous_no_data);
        this.e = (RecyclerView) this.A.findViewById(R.id.winnings_recycler_view);
        this.f = (TextView) this.A.findViewById(R.id.winnings_title);
        this.d = (RecyclerView) this.A.findViewById(R.id.results_recycler_view);
        this.E = (SpinnerTextView) this.A.findViewById(R.id.result_spinner);
        this.E.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(getActivity(), R.drawable.spr_arrow_down_jungle_green_32_32dp), (Drawable) null);
        this.E.setOnClickListener(this);
        this.c = this.A.findViewById(R.id.void_result_hint);
        return this.A;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (this.I.isShowing()) {
            this.I.dismiss();
        }
        this.E.setChecked(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.e.setFocusable(false);
        this.d.setFocusable(false);
        getActivity().findViewById(R.id.jackpot_confirm_layout).setVisibility(8);
        getActivity().findViewById(R.id.jackpot_place_layout).setVisibility(8);
    }
}
