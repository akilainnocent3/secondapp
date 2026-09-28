package com.sportybet.plugin.realsports.activities;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.ResultsActivity;
import com.sportybet.plugin.realsports.activities.ResultsSearchActivity;
import com.sportybet.plugin.realsports.results.ResultsLoadingView;
import defpackage.an50;
import defpackage.arr;
import defpackage.azm;
import defpackage.bmy;
import defpackage.bwf0;
import defpackage.cyb;
import defpackage.dgd0;
import defpackage.ej5;
import defpackage.fm50;
import defpackage.g1i;
import defpackage.gsc;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.iwh0;
import defpackage.jq40;
import defpackage.mpe0;
import defpackage.o0o;
import defpackage.o8i0;
import defpackage.ols;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.xk50;
import defpackage.y1m;
import defpackage.ym50;
import defpackage.yt5;
import defpackage.z680;
import defpackage.zm50;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/plugin/realsports/activities/ResultsActivity;", "Lpy1;", "Lvym;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ResultsActivity extends y1m implements vym {
    public static final /* synthetic */ int A = 0;
    public final q8i0 b = new q8i0(jq40.a(an50.class), new b(), new a(), new c());
    public azm c;
    public dgd0 d;
    public long e;
    public long f;
    public final Date i;
    public Date v;
    public z680 w;
    public final mpe0 y;
    public PopupWindow z;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ResultsActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ResultsActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ResultsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public ResultsActivity() {
        Date time = Calendar.getInstance().getTime();
        time.getClass();
        this.i = time;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        calendar.add(5, -1);
        Date time2 = calendar.getTime();
        time2.getClass();
        this.v = time2;
        this.w = new z680();
        this.y = hwr.b(new o0o(this, 2));
    }

    public final void A1() {
        this.e = gsc.d(this.v);
        Date date = this.v;
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        yt5.d(calendar);
        this.f = calendar.getTimeInMillis();
        an50 an50Var = (an50) this.b.getValue();
        z680 z680Var = this.w;
        long j = this.e;
        long j2 = this.f;
        z680Var.getClass();
        an50Var.c.setValue(ym50.e.a);
        ej5.c(o8i0.d(an50Var), null, null, new zm50(an50Var, z680Var, j, j2, null), 3);
    }

    public final void B1() {
        dgd0 dgd0Var = this.d;
        if (dgd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        boolean z = false;
        dgd0Var.d.setText(bwf0.a.p(this.v, false));
        dgd0 dgd0Var2 = this.d;
        if (dgd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ImageView imageView = dgd0Var2.f;
        Date date = this.v;
        Date date2 = this.i;
        if (!date.after(date2) && !gsc.e(this.v, date2)) {
            z = true;
        }
        imageView.setEnabled(z);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_activity_results_main_page, (ViewGroup) null, false);
        int i = R.id.anchor;
        Space space = (Space) h5e.a(R.id.anchor, viewInflate);
        if (space != null) {
            i = R.id.back_icon;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.back_icon, viewInflate);
            if (imageButton != null) {
                i = R.id.back_title;
                if (((TextView) h5e.a(R.id.back_title, viewInflate)) != null) {
                    i = R.id.date_selector;
                    TextView textView = (TextView) h5e.a(R.id.date_selector, viewInflate);
                    if (textView != null) {
                        i = R.id.home;
                        ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, viewInflate);
                        if (imageButton2 != null) {
                            i = R.id.next_btn;
                            ImageView imageView = (ImageView) h5e.a(R.id.next_btn, viewInflate);
                            if (imageView != null) {
                                i = R.id.previous_btn;
                                ImageView imageView2 = (ImageView) h5e.a(R.id.previous_btn, viewInflate);
                                if (imageView2 != null) {
                                    i = R.id.results_change_league;
                                    TextView textView2 = (TextView) h5e.a(R.id.results_change_league, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.results_loading_view;
                                        ResultsLoadingView resultsLoadingView = (ResultsLoadingView) h5e.a(R.id.results_loading_view, viewInflate);
                                        if (resultsLoadingView != null) {
                                            i = R.id.results_search_recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.results_search_recycler_view, viewInflate);
                                            if (recyclerView != null) {
                                                i = R.id.search_icon;
                                                ImageButton imageButton3 = (ImageButton) h5e.a(R.id.search_icon, viewInflate);
                                                if (imageButton3 != null) {
                                                    i = R.id.select_option_text;
                                                    TextView textView3 = (TextView) h5e.a(R.id.select_option_text, viewInflate);
                                                    if (textView3 != null) {
                                                        i = R.id.title_root;
                                                        if (((RelativeLayout) h5e.a(R.id.title_root, viewInflate)) != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                                            this.d = new dgd0(relativeLayout, space, imageButton, textView, imageButton2, imageView, imageView2, textView2, resultsLoadingView, recyclerView, imageButton3, textView3);
                                                            setContentView(relativeLayout);
                                                            z680 z680Var = this.w;
                                                            z680Var.a = "sr:sport:1";
                                                            z680Var.b = getCountryManager().O() ? getCMSString(R.string.common_sports__football__ZA, new Object[0]) : getCMSString(R.string.common_sports__football, new Object[0]);
                                                            this.e = gsc.d(this.v);
                                                            Date date = this.v;
                                                            date.getClass();
                                                            Calendar calendar = Calendar.getInstance();
                                                            calendar.setTime(date);
                                                            yt5.d(calendar);
                                                            this.f = calendar.getTimeInMillis();
                                                            dgd0 dgd0Var = this.d;
                                                            if (dgd0Var == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            dgd0Var.i.setImageDrawable(iwh0.a(this, R.drawable.spr_ic_keyboard_arrow_left_black_24dp, getColor(R.color.brand_tertiary)));
                                                            dgd0Var.f.setImageDrawable(iwh0.a(this, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, getColor(R.color.brand_tertiary)));
                                                            dgd0Var.y.setLayoutManager(new LinearLayoutManager());
                                                            dgd0Var.d.setText(bwf0.a.p(this.v, false));
                                                            dgd0 dgd0Var2 = this.d;
                                                            if (dgd0Var2 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            dgd0Var2.d.setOnClickListener(new View.OnClickListener() { // from class: pk50
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i2 = ResultsActivity.A;
                                                                    Calendar calendar2 = Calendar.getInstance();
                                                                    final ResultsActivity resultsActivity = this.a;
                                                                    calendar2.setTime(resultsActivity.v);
                                                                    DatePickerDialog datePickerDialog = new DatePickerDialog(resultsActivity, R.style.datePicker, new DatePickerDialog.OnDateSetListener() { // from class: nk50
                                                                        @Override // android.app.DatePickerDialog.OnDateSetListener
                                                                        public final void onDateSet(DatePicker datePicker, int i3, int i4, int i5) {
                                                                            int i6 = ResultsActivity.A;
                                                                            GregorianCalendar gregorianCalendar = new GregorianCalendar(i3, i4, i5);
                                                                            ResultsActivity resultsActivity2 = resultsActivity;
                                                                            Date date2 = resultsActivity2.v;
                                                                            Date time = gregorianCalendar.getTime();
                                                                            time.getClass();
                                                                            if (gsc.e(date2, time)) {
                                                                                return;
                                                                            }
                                                                            Date time2 = gregorianCalendar.getTime();
                                                                            time2.getClass();
                                                                            resultsActivity2.v = time2;
                                                                            resultsActivity2.B1();
                                                                            resultsActivity2.A1();
                                                                        }
                                                                    }, calendar2.get(1), calendar2.get(2), calendar2.get(5));
                                                                    DatePicker datePicker = datePickerDialog.getDatePicker();
                                                                    datePicker.getClass();
                                                                    datePicker.setMaxDate(new Date().getTime());
                                                                    datePickerDialog.show();
                                                                }
                                                            });
                                                            dgd0Var2.i.setOnClickListener(new View.OnClickListener() { // from class: qk50
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    ResultsActivity resultsActivity = this.a;
                                                                    Date date2 = resultsActivity.v;
                                                                    date2.getClass();
                                                                    Calendar calendar2 = Calendar.getInstance();
                                                                    calendar2.setTime(date2);
                                                                    calendar2.add(5, -1);
                                                                    Date time = calendar2.getTime();
                                                                    time.getClass();
                                                                    resultsActivity.v = time;
                                                                    resultsActivity.B1();
                                                                    resultsActivity.A1();
                                                                }
                                                            });
                                                            dgd0Var2.f.setOnClickListener(new View.OnClickListener() { // from class: rk50
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    ResultsActivity resultsActivity = this.a;
                                                                    Date date2 = resultsActivity.v;
                                                                    date2.getClass();
                                                                    Calendar calendar2 = Calendar.getInstance();
                                                                    calendar2.setTime(date2);
                                                                    calendar2.add(5, 1);
                                                                    Date time = calendar2.getTime();
                                                                    time.getClass();
                                                                    resultsActivity.v = time;
                                                                    resultsActivity.B1();
                                                                    resultsActivity.A1();
                                                                }
                                                            });
                                                            dgd0Var2.c.setOnClickListener(new View.OnClickListener() { // from class: sk50
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i2 = ResultsActivity.A;
                                                                    this.a.getOnBackPressedDispatcher().d();
                                                                }
                                                            });
                                                            dgd0Var2.z.setOnClickListener(new View.OnClickListener() { // from class: tk50
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i2 = ResultsActivity.A;
                                                                    yrh0.t(this.a, ResultsSearchActivity.class, true);
                                                                }
                                                            });
                                                            dgd0Var2.w.setOnClickListener(new View.OnClickListener() { // from class: uk50
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i2 = ResultsActivity.A;
                                                                    this.a.A1();
                                                                }
                                                            });
                                                            dgd0Var2.v.setOnClickListener(new ols(this, 1));
                                                            dgd0Var2.e.setOnClickListener(new View.OnClickListener() { // from class: vk50
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    azm azmVar = this.a.c;
                                                                    if (azmVar == null) {
                                                                        Intrinsics.n("router");
                                                                        throw null;
                                                                    }
                                                                    String strA = o7d.a(wae.HOME);
                                                                    strA.getClass();
                                                                    azm.c(azmVar, strA, null, null, 6);
                                                                }
                                                            });
                                                            dgd0 dgd0Var3 = this.d;
                                                            if (dgd0Var3 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            dgd0Var3.y.setAdapter((fm50) this.y.getValue());
                                                            g1i g1iVar = new g1i(((an50) this.b.getValue()).d, new xk50(2, this, ResultsActivity.class, "handleUiState", "handleUiState(Lcom/sportybet/plugin/realsports/results/main/ResultsUiState;)V", 4));
                                                            s9s lifecycle = getLifecycle();
                                                            lifecycle.getClass();
                                                            arr.a(g1iVar, lifecycle, s9s.b.d);
                                                            A1();
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        z1();
        super.onStop();
    }

    public final void z1() {
        PopupWindow popupWindow = this.z;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener(null);
        }
        PopupWindow popupWindow2 = this.z;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
        this.z = null;
    }
}
