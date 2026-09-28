package com.sportybet.android.bethistory.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.boy;
import defpackage.bq2;
import defpackage.cq2;
import defpackage.cyb;
import defpackage.dq2;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.fq2;
import defpackage.frz;
import defpackage.g1i;
import defpackage.h5e;
import defpackage.iym;
import defpackage.jq40;
import defpackage.ju5;
import defpackage.k9j;
import defpackage.kzh;
import defpackage.mml;
import defpackage.o8i0;
import defpackage.pm7;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qm7;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.uyc;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.vd;
import defpackage.wp2;
import defpackage.xp2;
import defpackage.yfd0;
import defpackage.yp2;
import defpackage.zyh;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/activity/BetHistoryCalendarActivity;", "Lpy1;", "Landroid/view/View$OnClickListener;", "Lboy;", "Lk9j;", "Lbb40;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetHistoryCalendarActivity extends mml implements View.OnClickListener, boy, k9j, bb40 {
    public static final /* synthetic */ int i = 0;
    public iym b;
    public yfd0 c;
    public ju5 d;
    public final q8i0 e = new q8i0(jq40.a(fq2.class), new c(), new b(), new d());
    public e f;

    public static final class a extends vd<pm7, qm7> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            pm7 pm7Var = (pm7) obj;
            pm7Var.getClass();
            Intent intent = new Intent(context, (Class<?>) BetHistoryCalendarActivity.class);
            Long l = pm7Var.a;
            intent.putExtra("start_time", l != null ? l.longValue() : -1L);
            Long l2 = pm7Var.b;
            intent.putExtra("end_time", l2 != null ? l2.longValue() : -1L);
            intent.putExtra("show_toast", pm7Var.c.booleanValue());
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            if (intent == null || i != -1) {
                return qm7.b.a;
            }
            long longExtra = intent.getLongExtra("start_time", -1L);
            long longExtra2 = intent.getLongExtra("end_time", -1L);
            if (Intrinsics.g(intent.getStringExtra("resultType"), "GoOlderBetHistory")) {
                return qm7.d.a;
            }
            return (longExtra == -1 || longExtra2 == -1) ? qm7.a.a : new qm7.c(longExtra, longExtra2);
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetHistoryCalendarActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetHistoryCalendarActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetHistoryCalendarActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.boy
    public final void I() {
        ju5 ju5Var = this.d;
        if (ju5Var == null) {
            Intrinsics.n("calendarRangeSelectionManager");
            throw null;
        }
        frz<uyc, uyc> frzVar = ju5Var.b;
        if (frzVar != null) {
            fq2 fq2VarZ1 = z1();
            Date time = frzVar.a.a.getTime();
            time.getClass();
            Date time2 = frzVar.b.a.getTime();
            time2.getClass();
            fq2VarZ1.z1(time, time2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        v.getClass();
        int id = v.getId();
        if (id == R.id.cancel_btn) {
            fq2 fq2VarZ1 = z1();
            ej5.c(o8i0.d(fq2VarZ1), null, null, new cq2(fq2VarZ1, null), 3);
            return;
        }
        if (id == R.id.back_to_all_dates) {
            fq2 fq2VarZ2 = z1();
            ej5.c(o8i0.d(fq2VarZ2), null, null, new bq2(fq2VarZ2, null), 3);
        } else if (id == R.id.update_btn) {
            z1().x1();
        } else if (id == R.id.go_to_older) {
            fq2 fq2VarZ3 = z1();
            ej5.c(o8i0.d(fq2VarZ3), null, null, new dq2(fq2VarZ3, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_activity_calendar, (ViewGroup) null, false);
        int i2 = R.id.back_to_all_dates;
        TextView textView = (TextView) h5e.a(R.id.back_to_all_dates, viewInflate);
        if (textView != null) {
            i2 = R.id.calendar_view;
            CalendarView calendarView = (CalendarView) h5e.a(R.id.calendar_view, viewInflate);
            if (calendarView != null) {
                i2 = R.id.cancel_btn;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.cancel_btn, viewInflate);
                if (appCompatImageView != null) {
                    i2 = R.id.go_to_older;
                    RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.go_to_older, viewInflate);
                    if (relativeLayout != null) {
                        i2 = R.id.go_to_older_text;
                        if (((TextView) h5e.a(R.id.go_to_older_text, viewInflate)) != null) {
                            i2 = R.id.tv_range_desc;
                            TextView textView2 = (TextView) h5e.a(R.id.tv_range_desc, viewInflate);
                            if (textView2 != null) {
                                i2 = R.id.tv_range_end_date;
                                TextView textView3 = (TextView) h5e.a(R.id.tv_range_end_date, viewInflate);
                                if (textView3 != null) {
                                    i2 = R.id.tv_range_start_date;
                                    TextView textView4 = (TextView) h5e.a(R.id.tv_range_start_date, viewInflate);
                                    if (textView4 != null) {
                                        i2 = R.id.update_btn;
                                        TextView textView5 = (TextView) h5e.a(R.id.update_btn, viewInflate);
                                        if (textView5 != null) {
                                            RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                            this.c = new yfd0(relativeLayout2, textView, calendarView, appCompatImageView, relativeLayout, textView2, textView3, textView4, textView5);
                                            setContentView(relativeLayout2);
                                            Bundle extras = getIntent().getExtras();
                                            if (extras != null) {
                                                long j = extras.getLong("start_time", -1L);
                                                long j2 = extras.getLong("end_time", -1L);
                                                frz frzVar = (j == -1 && j2 == -1) ? null : new frz(new uyc(new Date(j)), new uyc(new Date(j2)));
                                                boolean booleanExtra = getIntent().getBooleanExtra("show_toast", false);
                                                this.d = new ju5(frzVar, 30, this, new Function0() { // from class: up2
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i3 = BetHistoryCalendarActivity.i;
                                                        fq2 fq2VarZ1 = this.a.z1();
                                                        ej5.c(o8i0.d(fq2VarZ1), null, null, new eq2(fq2VarZ1, null), 3);
                                                        return Unit.a;
                                                    }
                                                });
                                                yfd0 yfd0Var = this.c;
                                                if (yfd0Var == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                yfd0Var.d.setOnClickListener(this);
                                                yfd0Var.b.setOnClickListener(this);
                                                yfd0Var.w.setOnClickListener(this);
                                                yfd0Var.e.setOnClickListener(this);
                                                yfd0 yfd0Var2 = this.c;
                                                if (yfd0Var2 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                CalendarView calendarView2 = yfd0Var2.c;
                                                Calendar calendar = Calendar.getInstance();
                                                calendar.add(6, -179);
                                                Date time = calendar.getTime();
                                                ju5 ju5Var = this.d;
                                                if (ju5Var == null) {
                                                    Intrinsics.n("calendarRangeSelectionManager");
                                                    throw null;
                                                }
                                                calendarView2.setSelectionManager(ju5Var);
                                                calendarView2.setOnlySix(true);
                                                calendarView2.setMinimumDate(time);
                                                HashSet hashSet = new HashSet();
                                                Calendar calendar2 = Calendar.getInstance();
                                                long timeInMillis = calendar2.getTimeInMillis();
                                                for (int actualMaximum = calendar2.getActualMaximum(5); -1 < actualMaximum; actualMaximum--) {
                                                    calendar2.set(5, actualMaximum);
                                                    if (calendar2.getTimeInMillis() <= timeInMillis) {
                                                        break;
                                                    }
                                                    hashSet.add(Long.valueOf(calendar2.getTimeInMillis()));
                                                }
                                                calendar2.add(6, -179);
                                                for (int i3 = 0; i3 < 37; i3++) {
                                                    calendar2.add(6, -1);
                                                    hashSet.add(Long.valueOf(calendar2.getTimeInMillis()));
                                                }
                                                calendarView2.setDisabledDays(hashSet);
                                                fq2 fq2VarZ1 = z1();
                                                v340 v340Var = fq2VarZ1.b;
                                                s9s lifecycle = getLifecycle();
                                                s9s.b bVar = s9s.b.d;
                                                kzh.d(new g1i(zyh.a(v340Var, lifecycle, bVar), new wp2(this, null)), ebs.a(getLifecycle()));
                                                kzh.d(new g1i(zyh.a(fq2VarZ1.d, getLifecycle(), bVar), new xp2(this, null)), ebs.a(getLifecycle()));
                                                kzh.d(new g1i(zyh.a(fq2VarZ1.f, getLifecycle(), bVar), new yp2(this, null)), ebs.a(getLifecycle()));
                                                if (booleanExtra) {
                                                    e eVar = this.f;
                                                    if (eVar == null) {
                                                        Intrinsics.n("commonUiEventProcessor");
                                                        throw null;
                                                    }
                                                    StringUiText stringUiText = vch0.a;
                                                    com.sporty.android.common.uievent.a.m mVar = new com.sporty.android.common.uievent.a.m(new ResourceUiText(R.string.bet_history__selections_discarded));
                                                    yfd0 yfd0Var3 = this.c;
                                                    if (yfd0Var3 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    eVar.c(mVar, this, yfd0Var3.a, null);
                                                }
                                                if (frzVar != null) {
                                                    F f = frzVar.a;
                                                    f.getClass();
                                                    final uyc uycVar = (uyc) f;
                                                    S s = frzVar.b;
                                                    s.getClass();
                                                    uyc uycVar2 = (uyc) s;
                                                    ju5 ju5Var2 = this.d;
                                                    if (ju5Var2 == null) {
                                                        Intrinsics.n("calendarRangeSelectionManager");
                                                        throw null;
                                                    }
                                                    ju5Var2.b = new frz<>(uycVar, uycVar2);
                                                    ju5Var2.e = null;
                                                    yfd0 yfd0Var4 = this.c;
                                                    if (yfd0Var4 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    yfd0Var4.c.o();
                                                    yfd0 yfd0Var5 = this.c;
                                                    if (yfd0Var5 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    yfd0Var5.c.post(new Runnable() { // from class: vp2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            yfd0 yfd0Var6 = this.a.c;
                                                            if (yfd0Var6 != null) {
                                                                yfd0Var6.c.d(uycVar);
                                                            } else {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                        }
                                                    });
                                                    z1().y1(j, j2);
                                                    return;
                                                }
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public final fq2 z1() {
        return (fq2) this.e.getValue();
    }
}
