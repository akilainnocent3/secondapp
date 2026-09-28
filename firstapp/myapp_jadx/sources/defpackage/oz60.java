package defpackage;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.AspectRatioFrameLayout;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import com.sportybet.plugin.realsports.data.Schedule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class oz60 extends Fragment implements SwipeRefreshLayout.f, View.OnClickListener {
    public nz60 A;
    public View B;
    public FrameLayout D;
    public ArrayList E;
    public PopupWindow F;
    public su5<BaseResponse<RealSportsAdsData>> G;
    public AspectRatioFrameLayout H;
    public ImageView I;
    public String J;
    public boolean K;
    public String L;
    public String M;
    public List<OrderedSportItem> N;
    public LoadingView a;
    public TextView b;
    public TextView c;
    public SwipeRefreshLayout d;
    public int i;
    public int v;
    public RecyclerView w;
    public su5<BaseResponse<List<Schedule>>> y;
    public long z;
    public final mo0 e = l840.a();
    public final z7h f = ap0.b();
    public boolean C = true;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            oz60 oz60Var = oz60.this;
            oz60Var.b.setActivated(false);
            oz60Var.D.getForeground().setAlpha(0);
        }
    }

    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            oz60 oz60Var = oz60.this;
            oz60Var.c.setActivated(false);
            oz60Var.D.getForeground().setAlpha(0);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            sh8.c().e(oz60.this.L);
        }
    }

    public static void n0(TextView textView, ViewGroup viewGroup) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_activated}, iwh0.a(viewGroup.getContext(), com.sportybet.android.gp.tz.R.drawable.spr_ic_keyboard_arrow_up_black_24dp, viewGroup.getContext().getColor(com.sportybet.android.gp.tz.R.color.text_type2_primary)));
        stateListDrawable.addState(StateSet.WILD_CARD, iwh0.a(viewGroup.getContext(), com.sportybet.android.gp.tz.R.drawable.spr_ic_keyboard_arrow_down_black_24dp, viewGroup.getContext().getColor(com.sportybet.android.gp.tz.R.color.text_type1_secondary)));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, stateListDrawable, (Drawable) null);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        m0(true);
    }

    public final List<String> j0() {
        if (this.E == null) {
            this.E = new ArrayList(10);
            Date date = new Date();
            this.z = date.getTime();
            this.E.add(sn5.d(this, com.sportybet.android.gp.tz.R.string.common_dates__today, new Object[0]).concat(" "));
            ArrayList arrayList = this.E;
            bwf0 bwf0Var = bwf0.a;
            arrayList.add(bwf0.m(bwf0Var, date, "dd/MM", false, 0));
            this.E.add(sn5.d(this, com.sportybet.android.gp.tz.R.string.common_dates__tomorrow, new Object[0]).concat(" "));
            this.E.add(bwf0Var.b(this.z + 86400000));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.getDefault());
            this.E.add(byx.c(simpleDateFormat.format(new Date(this.z + 172800000))));
            this.E.add(bwf0Var.b(this.z + 172800000));
            this.E.add(byx.c(simpleDateFormat.format(new Date(this.z + 259200000))));
            this.E.add(bwf0Var.b(this.z + 259200000));
            this.E.add(byx.c(simpleDateFormat.format(new Date(this.z + 345600000))));
            this.E.add(bwf0Var.b(this.z + 345600000));
        }
        return this.E;
    }

    public final void m0(boolean z) {
        su5<BaseResponse<List<Schedule>>> su5Var = this.y;
        if (su5Var != null) {
            su5Var.cancel();
        }
        if (!z) {
            this.a.K();
            this.d.setRefreshing(false);
        }
        ap0.e().b().G(new qty(this));
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        float timeInMillis = (calendar.getTimeInMillis() - System.currentTimeMillis()) / 3600000.0f;
        String str = this.N.get(this.i).id;
        int i = this.v;
        su5<BaseResponse<List<Schedule>>> su5VarN = this.f.N(str, i == 0 ? 0.0f : ((i - 1) * 24) + timeInMillis, timeInMillis + (i * 24));
        this.y = su5VarN;
        su5VarN.G(new qz60(this, z));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0042  */
    public final void o0(String str, String str2, String str3, boolean z) {
        this.J = str;
        this.K = z;
        this.M = str2;
        this.L = str3;
        if (z) {
            if (vn20.c("sportybet", this.J + "schedule", true)) {
                this.H.setVisibility(0);
                sh8.a().a(this.M, this.I);
                this.H.setOnClickListener(new c());
            } else {
                this.H.setVisibility(8);
            }
        } else {
            this.H.setVisibility(8);
        }
        if (this.K) {
            return;
        }
        vn20.a("sportybet").edit().remove(this.J + "schedule").apply();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.C) {
            this.C = false;
            e activity = getActivity();
            nz60 nz60Var = new nz60();
            nz60Var.a = activity;
            this.A = nz60Var;
            RecyclerView recyclerView = this.w;
            getActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.w.setAdapter(this.A);
            this.N = OrderedSportItemHelper.getFromStorage(3);
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string = arguments.getString("DEFAULT_SPORT_ID");
                for (int i = 0; i < this.N.size(); i++) {
                    if (TextUtils.equals(this.N.get(i).id, string)) {
                        this.i = i;
                        break;
                    }
                }
            }
            this.c.setText(this.N.get(this.i).nameUiText.e(requireContext()));
            m0(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != com.sportybet.android.gp.tz.R.id.time) {
            if (id == com.sportybet.android.gp.tz.R.id.sport) {
                this.c.setActivated(true);
                View viewInflate = LayoutInflater.from(getContext()).inflate(com.sportybet.android.gp.tz.R.layout.fragment_schedule_popup, (ViewGroup) null);
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.container);
                int size = this.N.size();
                for (int i = 0; i < size; i++) {
                    OrderedSportItem orderedSportItem = this.N.get(i);
                    View viewInflate2 = getLayoutInflater().inflate(com.sportybet.android.gp.tz.R.layout.spr_schedule_sport_item, (ViewGroup) linearLayout, false);
                    if (this.i == i) {
                        viewInflate2.setActivated(true);
                    }
                    viewInflate2.setTag(Integer.valueOf(i));
                    viewInflate2.setOnClickListener(this);
                    ((TextView) viewInflate2).setText(orderedSportItem.nameUiText.e(requireContext()));
                    linearLayout.addView(viewInflate2);
                }
                PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2, true);
                this.F = popupWindow;
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                this.F.setOnDismissListener(new b());
                if (Build.VERSION.SDK_INT == 24) {
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    this.F.showAtLocation(this.B, 0, 0, view.getHeight() + iArr[1]);
                } else {
                    this.F.showAsDropDown(view);
                }
                this.F.showAsDropDown(view);
                this.D.getForeground().setAlpha(154);
                return;
            }
            if (id == com.sportybet.android.gp.tz.R.id.time_item) {
                int iIntValue = ((Integer) view.getTag()).intValue();
                if (this.v != iIntValue) {
                    this.v = iIntValue;
                    this.b.setText(sn5.d(this, com.sportybet.android.gp.tz.R.string.app_common__var_var, ((ArrayList) j0()).get(this.v * 2), ((ArrayList) j0()).get((this.v * 2) + 1)));
                    this.w.o0(0);
                    m0(false);
                }
                this.F.dismiss();
                return;
            }
            if (id != com.sportybet.android.gp.tz.R.id.sport_item) {
                if (id != com.sportybet.android.gp.tz.R.id.close_boost) {
                    m0(false);
                    return;
                } else {
                    vn20.g("sportybet", uf80.a(new StringBuilder(), this.J, "schedule"), false, false);
                    this.H.setVisibility(8);
                    return;
                }
            }
            int iIntValue2 = ((Integer) view.getTag()).intValue();
            if (this.i != iIntValue2) {
                this.i = iIntValue2;
                this.c.setText(this.N.get(iIntValue2).nameUiText.e(requireContext()));
                this.w.o0(0);
                m0(false);
            }
            this.F.dismiss();
            return;
        }
        this.b.setActivated(true);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext());
        linearLayoutCompat.setOrientation(1);
        linearLayoutCompat.setBackgroundColor(getContext().getColor(com.sportybet.android.gp.tz.R.color.background_type2_secondary));
        linearLayoutCompat.setPadding(0, zch0.a(getContext(), 14), 0, 0);
        List<String> listJ0 = j0();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listJ0;
            if (i2 >= arrayList.size()) {
                PopupWindow popupWindow2 = new PopupWindow((View) linearLayoutCompat, -1, -2, true);
                this.F = popupWindow2;
                popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
                this.F.setOnDismissListener(new a());
                this.F.showAsDropDown(view);
                this.D.getForeground().setAlpha(154);
                return;
            }
            View viewInflate3 = getLayoutInflater().inflate(com.sportybet.android.gp.tz.R.layout.spr_schedule_time_item, (ViewGroup) linearLayoutCompat, false);
            int i3 = i2 / 2;
            if (this.v == i3) {
                viewInflate3.setActivated(true);
            }
            viewInflate3.setTag(Integer.valueOf(i3));
            viewInflate3.setOnClickListener(this);
            ((TextView) viewInflate3.findViewById(com.sportybet.android.gp.tz.R.id.day)).setText((CharSequence) arrayList.get(i2));
            ((TextView) viewInflate3.findViewById(com.sportybet.android.gp.tz.R.id.date)).setText((CharSequence) arrayList.get(i2 + 1));
            linearLayoutCompat.addView(viewInflate3);
            i2 += 2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.B;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(com.sportybet.android.gp.tz.R.layout.spr_fragment_schedule, viewGroup, false);
        this.B = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.time);
        this.b = textView;
        textView.setOnClickListener(this);
        n0(this.b, viewGroup);
        this.H = (AspectRatioFrameLayout) this.B.findViewById(com.sportybet.android.gp.tz.R.id.boost_ad);
        this.I = (ImageView) this.B.findViewById(com.sportybet.android.gp.tz.R.id.boost_ad_view);
        this.B.findViewById(com.sportybet.android.gp.tz.R.id.close_boost).setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.H.setAspectRatio(0.17777778f);
        TextView textView2 = (TextView) this.B.findViewById(com.sportybet.android.gp.tz.R.id.sport);
        this.c = textView2;
        textView2.setOnClickListener(this);
        n0(this.c, viewGroup);
        int color = requireContext().getColor(com.sportybet.android.gp.tz.R.color.text_type1_secondary);
        LoadingView loadingView = (LoadingView) this.B.findViewById(com.sportybet.android.gp.tz.R.id.loading);
        this.a = loadingView;
        loadingView.getErrorView().getTitle().setTextColor(color);
        this.a.getEmptyView().setTextColor(color);
        this.a.setOnClickListener(this);
        this.a.L(this);
        this.d = (SwipeRefreshLayout) this.B.findViewById(com.sportybet.android.gp.tz.R.id.swipe);
        this.w = (RecyclerView) this.B.findViewById(com.sportybet.android.gp.tz.R.id.recycler);
        this.d.setOnRefreshListener(this);
        FrameLayout frameLayout = (FrameLayout) this.B.findViewById(com.sportybet.android.gp.tz.R.id.frame);
        this.D = frameLayout;
        frameLayout.getForeground().setAlpha(0);
        this.b.setText(sn5.d(this, com.sportybet.android.gp.tz.R.string.app_common__var_var, ((ArrayList) j0()).get(this.v * 2), ((ArrayList) j0()).get((this.v * 2) + 1)));
        return this.B;
    }
}
