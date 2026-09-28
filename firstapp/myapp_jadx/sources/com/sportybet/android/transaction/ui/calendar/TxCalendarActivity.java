package com.sportybet.android.transaction.ui.calendar;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.snackbar.Snackbar;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.domain.model.LastDayRangeSetting;
import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.plugin.realsports.activities.TransactionSearchActivity;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import defpackage.af;
import defpackage.bb40;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.boy;
import defpackage.bxg0;
import defpackage.c6m;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.f87;
import defpackage.frz;
import defpackage.g1i;
import defpackage.h5e;
import defpackage.jq40;
import defpackage.ju5;
import defpackage.kzh;
import defpackage.o0h0;
import defpackage.o7d;
import defpackage.p0h0;
import defpackage.q0h0;
import defpackage.q690;
import defpackage.q6a0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r0h0;
import defpackage.r8i0;
import defpackage.s0h0;
import defpackage.s9s;
import defpackage.sh8;
import defpackage.sj5;
import defpackage.uyc;
import defpackage.v0h0;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.wae;
import defpackage.xpg0;
import defpackage.xym;
import defpackage.yrh0;
import defpackage.zyh;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/sportybet/android/transaction/ui/calendar/TxCalendarActivity;", "Lpy1;", "Landroid/view/View$OnClickListener;", "Lboy;", "Lbb40;", "Lxym;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "a", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TxCalendarActivity extends c6m implements View.OnClickListener, boy, bb40, xym {
    public static final /* synthetic */ int f = 0;
    public af b;
    public ju5 c;
    public LastDayRangeSetting d;
    public final q8i0 e = new q8i0(jq40.a(v0h0.class), new d(), new c(), new e());

    public static final class a extends vd<b, bxg0<? extends Long, ? extends Long, ? extends xpg0.e.a>> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            b bVar = (b) obj;
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) TxCalendarActivity.class);
            intent.putExtra("start_time", bVar.a);
            intent.putExtra("end_time", bVar.b);
            intent.putExtra("day_range_setting", bVar.c);
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            if (intent == null || i != -1) {
                return null;
            }
            long longExtra = intent.getLongExtra("start_time", 0L);
            long longExtra2 = intent.getLongExtra("end_time", 0L);
            Bundle extras = intent.getExtras();
            return new bxg0(Long.valueOf(longExtra), Long.valueOf(longExtra2), extras != null ? (xpg0.e.a) sj5.b(extras, "logger_event", xpg0.e.a.class) : null);
        }
    }

    public static final class b {
        public final long a;
        public final long b;
        public final LastDayRangeSetting c;

        public b(long j, long j2, LastDayRangeSetting lastDayRangeSetting) {
            lastDayRangeSetting.getClass();
            this.a = j;
            this.b = j2;
            this.c = lastDayRangeSetting;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
        }

        public final String toString() {
            StringBuilder sbA = q6a0.a(this.a, "TxCalendarParameters(startTime=", ", endTime=");
            sbA.append(this.b);
            sbA.append(", lastDayRangeSetting=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TxCalendarActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TxCalendarActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TxCalendarActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final void A1(final uyc uycVar, uyc uycVar2) {
        ju5 ju5Var = this.c;
        if (ju5Var == null) {
            Intrinsics.n("calendarRangeSelectionManager");
            throw null;
        }
        ju5Var.b = new frz<>(uycVar, uycVar2);
        ju5Var.e = null;
        af afVar = this.b;
        if (afVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar.c.o();
        af afVar2 = this.b;
        if (afVar2 != null) {
            afVar2.c.post(new Runnable() { // from class: k0h0
                @Override // java.lang.Runnable
                public final void run() {
                    af afVar3 = this.a.b;
                    if (afVar3 != null) {
                        afVar3.c.d(uycVar);
                    } else {
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
            });
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.boy
    public final void I() {
        ju5 ju5Var = this.c;
        if (ju5Var == null) {
            Intrinsics.n("calendarRangeSelectionManager");
            throw null;
        }
        frz<uyc, uyc> frzVar = ju5Var.b;
        if (frzVar != null) {
            v0h0 v0h0VarZ1 = z1();
            Date time = frzVar.a.a.getTime();
            time.getClass();
            Date time2 = frzVar.b.a.getTime();
            time2.getClass();
            v0h0VarZ1.z1(time, time2);
            v0h0 v0h0VarZ2 = z1();
            Date time3 = frzVar.a.a.getTime();
            time3.getClass();
            Date time4 = frzVar.b.a.getTime();
            time4.getClass();
            v0h0VarZ2.w = new xpg0.e.a.C1305a(Long.valueOf(time3.getTime()), Long.valueOf(time4.getTime()));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        v.getClass();
        int id = v.getId();
        if (id == R.id.cancel_btn) {
            finish();
            return;
        }
        if (id == R.id.apply_btn) {
            z1().x1();
            return;
        }
        if (id == R.id.goback) {
            getOnBackPressedDispatcher().d();
            return;
        }
        if (id == R.id.help) {
            sh8.c().e(bjb0.S(WebViewActivityUtils.URL_HOW_TO_PLAY_TRANSACTIONS_HISTORY));
        } else if (id == R.id.search) {
            yrh0.t(this, TransactionSearchActivity.class, true);
        } else if (id == R.id.home) {
            sh8.c().e(o7d.a(wae.HOME));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_transaction_calendar, (ViewGroup) null, false);
        int i = R.id.apply_btn;
        TextView textView = (TextView) h5e.a(R.id.apply_btn, viewInflate);
        if (textView != null) {
            i = R.id.bottom_description;
            if (((RelativeLayout) h5e.a(R.id.bottom_description, viewInflate)) != null) {
                i = R.id.calendar_view;
                CalendarView calendarView = (CalendarView) h5e.a(R.id.calendar_view, viewInflate);
                if (calendarView != null) {
                    i = R.id.cancel_btn;
                    TextView textView2 = (TextView) h5e.a(R.id.cancel_btn, viewInflate);
                    if (textView2 != null) {
                        i = R.id.dates;
                        if (((LinearLayout) h5e.a(R.id.dates, viewInflate)) != null) {
                            i = R.id.description;
                            if (((TextView) h5e.a(R.id.description, viewInflate)) != null) {
                                i = R.id.divide_line;
                                if (((ImageView) h5e.a(R.id.divide_line, viewInflate)) != null) {
                                    i = R.id.goback;
                                    ImageButton imageButton = (ImageButton) h5e.a(R.id.goback, viewInflate);
                                    if (imageButton != null) {
                                        i = R.id.help;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.help, viewInflate);
                                        if (appCompatImageView != null) {
                                            i = R.id.home;
                                            ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, viewInflate);
                                            if (imageButton2 != null) {
                                                i = R.id.newFeatureAlertView;
                                                BubbleView bubbleView = (BubbleView) h5e.a(R.id.newFeatureAlertView, viewInflate);
                                                if (bubbleView != null) {
                                                    i = R.id.quick_btn_1;
                                                    CommonButton commonButton = (CommonButton) h5e.a(R.id.quick_btn_1, viewInflate);
                                                    if (commonButton != null) {
                                                        i = R.id.quick_btn_2;
                                                        CommonButton commonButton2 = (CommonButton) h5e.a(R.id.quick_btn_2, viewInflate);
                                                        if (commonButton2 != null) {
                                                            i = R.id.quick_btn_3;
                                                            CommonButton commonButton3 = (CommonButton) h5e.a(R.id.quick_btn_3, viewInflate);
                                                            if (commonButton3 != null) {
                                                                i = R.id.quick_btns;
                                                                if (((ConstraintLayout) h5e.a(R.id.quick_btns, viewInflate)) != null) {
                                                                    i = R.id.search;
                                                                    ImageView imageView = (ImageView) h5e.a(R.id.search, viewInflate);
                                                                    if (imageView != null) {
                                                                        i = R.id.title;
                                                                        if (((TextView) h5e.a(R.id.title, viewInflate)) != null) {
                                                                            i = R.id.title_container;
                                                                            if (((RelativeLayout) h5e.a(R.id.title_container, viewInflate)) != null) {
                                                                                i = R.id.tv_range_end_date;
                                                                                TextView textView3 = (TextView) h5e.a(R.id.tv_range_end_date, viewInflate);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.tv_range_start_date;
                                                                                    TextView textView4 = (TextView) h5e.a(R.id.tv_range_start_date, viewInflate);
                                                                                    if (textView4 != null) {
                                                                                        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                                                                        this.b = new af(relativeLayout, textView, calendarView, textView2, imageButton, appCompatImageView, imageButton2, bubbleView, commonButton, commonButton2, commonButton3, imageView, textView3, textView4);
                                                                                        setContentView(relativeLayout);
                                                                                        Bundle extras = getIntent().getExtras();
                                                                                        if (extras != null) {
                                                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                            long j = extras.getLong("start_time", jCurrentTimeMillis);
                                                                                            long j2 = extras.getLong("end_time", jCurrentTimeMillis);
                                                                                            this.d = Build.VERSION.SDK_INT >= 33 ? (LastDayRangeSetting) extras.getParcelable("day_range_setting", LastDayRangeSetting.class) : (LastDayRangeSetting) extras.getParcelable("day_range_setting");
                                                                                            frz frzVar = new frz(new uyc(new Date(j)), new uyc(new Date(j2)));
                                                                                            LastDayRangeSetting lastDayRangeSetting = this.d;
                                                                                            final int i2 = lastDayRangeSetting != null ? lastDayRangeSetting.d : 180;
                                                                                            this.c = new ju5(frzVar, i2, this, new Function0() { // from class: j0h0
                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                public final Object invoke() {
                                                                                                    TxCalendarActivity txCalendarActivity = this.a;
                                                                                                    af afVar = txCalendarActivity.b;
                                                                                                    if (afVar != null) {
                                                                                                        Snackbar.h(afVar.a, txCalendarActivity.getCMSString(R.string.page_transaction__please_select_date_range_vnumber_days, String.valueOf(i2)), 0).j();
                                                                                                        return Unit.a;
                                                                                                    }
                                                                                                    Intrinsics.n("binding");
                                                                                                    throw null;
                                                                                                }
                                                                                            });
                                                                                            af afVar = this.b;
                                                                                            if (afVar == null) {
                                                                                                Intrinsics.n("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            afVar.e.setOnClickListener(this);
                                                                                            afVar.A.setOnClickListener(this);
                                                                                            afVar.f.setOnClickListener(this);
                                                                                            afVar.i.setOnClickListener(this);
                                                                                            afVar.d.setOnClickListener(this);
                                                                                            afVar.b.setOnClickListener(this);
                                                                                            afVar.v.setOnClickedClose(new q690(this, 1));
                                                                                            af afVar2 = this.b;
                                                                                            if (afVar2 == null) {
                                                                                                Intrinsics.n("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            CalendarView calendarView2 = afVar2.c;
                                                                                            ju5 ju5Var = this.c;
                                                                                            if (ju5Var == null) {
                                                                                                Intrinsics.n("calendarRangeSelectionManager");
                                                                                                throw null;
                                                                                            }
                                                                                            calendarView2.setSelectionManager(ju5Var);
                                                                                            calendarView2.setOnlySix(true);
                                                                                            HashSet hashSet = new HashSet();
                                                                                            Calendar calendar = Calendar.getInstance();
                                                                                            long timeInMillis = calendar.getTimeInMillis();
                                                                                            for (int actualMaximum = calendar.getActualMaximum(5); -1 < actualMaximum; actualMaximum--) {
                                                                                                calendar.set(5, actualMaximum);
                                                                                                if (calendar.getTimeInMillis() <= timeInMillis) {
                                                                                                    break;
                                                                                                }
                                                                                                hashSet.add(Long.valueOf(calendar.getTimeInMillis()));
                                                                                            }
                                                                                            calendar.add(6, -179);
                                                                                            for (int i3 = 0; i3 < 37; i3++) {
                                                                                                calendar.add(6, -1);
                                                                                                hashSet.add(Long.valueOf(calendar.getTimeInMillis()));
                                                                                            }
                                                                                            calendarView2.setDisabledDays(hashSet);
                                                                                            v0h0 v0h0VarZ1 = z1();
                                                                                            v340 v340Var = v0h0VarZ1.z;
                                                                                            s9s lifecycle = getLifecycle();
                                                                                            s9s.b bVar = s9s.b.d;
                                                                                            kzh.d(new g1i(zyh.a(v340Var, lifecycle, bVar), new o0h0(this, v0h0VarZ1, null)), ebs.a(getLifecycle()));
                                                                                            kzh.d(new g1i(zyh.a(v0h0VarZ1.b, getLifecycle(), bVar), new p0h0(this, null)), ebs.a(getLifecycle()));
                                                                                            kzh.d(new g1i(zyh.a(v0h0VarZ1.v, getLifecycle(), bVar), new q0h0(this, null)), ebs.a(getLifecycle()));
                                                                                            kzh.d(new g1i(zyh.a(v0h0VarZ1.d, getLifecycle(), bVar), new r0h0(this, v0h0VarZ1, null)), ebs.a(getLifecycle()));
                                                                                            kzh.d(new g1i(zyh.a(v0h0VarZ1.A, getLifecycle(), bVar), new s0h0(this, null)), ebs.a(getLifecycle()));
                                                                                            F f2 = frzVar.a;
                                                                                            f2.getClass();
                                                                                            S s = frzVar.b;
                                                                                            s.getClass();
                                                                                            A1((uyc) f2, (uyc) s);
                                                                                            v0h0 v0h0VarZ2 = z1();
                                                                                            LastDayRangeSetting lastDayRangeSetting2 = this.d;
                                                                                            v0h0VarZ2.y1(j, j2);
                                                                                            v0h0VarZ2.y.setValue(lastDayRangeSetting2);
                                                                                            return;
                                                                                        }
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
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final v0h0 z1() {
        return (v0h0) this.e.getValue();
    }
}
