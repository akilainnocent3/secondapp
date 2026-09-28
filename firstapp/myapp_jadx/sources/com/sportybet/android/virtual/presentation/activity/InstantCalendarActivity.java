package com.sportybet.android.virtual.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;
import defpackage.bb40;
import defpackage.boy;
import defpackage.bq2;
import defpackage.bwf0;
import defpackage.cq2;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ed;
import defpackage.ej5;
import defpackage.en7;
import defpackage.fn7;
import defpackage.fq2;
import defpackage.frz;
import defpackage.g1i;
import defpackage.hwr;
import defpackage.ipn;
import defpackage.jq40;
import defpackage.ju5;
import defpackage.k9j;
import defpackage.kpn;
import defpackage.kzh;
import defpackage.lpn;
import defpackage.mpe0;
import defpackage.mpn;
import defpackage.npn;
import defpackage.o8i0;
import defpackage.osl;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.uyc;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.vd;
import defpackage.zyh;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/sportybet/android/virtual/presentation/activity/InstantCalendarActivity;", "Lcom/sportybet/android/instantwin/presentation/instantwin/view/a;", "Landroid/view/View$OnClickListener;", "Lboy;", "Lk9j;", "Lbb40;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InstantCalendarActivity extends osl implements View.OnClickListener, boy, k9j, bb40 {
    public static final /* synthetic */ int F = 0;
    public ju5 C;
    public e E;
    public final mpe0 B = hwr.b(new ipn(this, 0));
    public final q8i0 D = new q8i0(jq40.a(fq2.class), new c(), new b(), new d());

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a extends vd<en7, fn7> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            en7 en7Var = (en7) obj;
            en7Var.getClass();
            Intent intent = new Intent(context, (Class<?>) InstantCalendarActivity.class);
            Long l = en7Var.a;
            intent.putExtra("extra_start_time", l != null ? l.longValue() : -1L);
            Long l2 = en7Var.b;
            intent.putExtra("extra_end_time", l2 != null ? l2.longValue() : -1L);
            intent.putExtra("extra_show_toast", false);
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            if (intent == null || i != -1) {
                return fn7.b.a;
            }
            long longExtra = intent.getLongExtra("extra_start_time", -1L);
            long longExtra2 = intent.getLongExtra("extra_end_time", -1L);
            if (Intrinsics.g(intent.getStringExtra("extra_result_type"), "extra_value_older_bet_history")) {
                return fn7.d.a;
            }
            return (longExtra == -1 || longExtra2 == -1) ? fn7.a.a : new fn7.c(longExtra, longExtra2);
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return InstantCalendarActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return InstantCalendarActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return InstantCalendarActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final fq2 G1() {
        return (fq2) this.D.getValue();
    }

    public final ed H1() {
        Object value = this.B.getValue();
        value.getClass();
        return (ed) value;
    }

    @Override // defpackage.boy
    public final void I() {
        ju5 ju5Var = this.C;
        if (ju5Var == null) {
            Intrinsics.n("calendarRangeSelectionManager");
            throw null;
        }
        frz<uyc, uyc> frzVar = ju5Var.b;
        if (frzVar != null) {
            fq2 fq2VarG1 = G1();
            Date time = frzVar.a.a.getTime();
            time.getClass();
            Date time2 = frzVar.b.a.getTime();
            time2.getClass();
            fq2VarG1.z1(time, time2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        v.getClass();
        int id = v.getId();
        if (id == R.id.cancel_btn) {
            fq2 fq2VarG1 = G1();
            ej5.c(o8i0.d(fq2VarG1), null, null, new cq2(fq2VarG1, null), 3);
        } else if (id == R.id.back_to_all_dates) {
            fq2 fq2VarG2 = G1();
            ej5.c(o8i0.d(fq2VarG2), null, null, new bq2(fq2VarG2, null), 3);
        } else if (id == R.id.update_btn) {
            G1().x1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(H1().a);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            long j = extras.getLong("extra_start_time", -1L);
            long j2 = extras.getLong("extra_end_time", -1L);
            frz frzVar = (j == -1 && j2 == -1) ? null : new frz(new uyc(new Date(j)), new uyc(new Date(j2)));
            boolean booleanExtra = getIntent().getBooleanExtra("extra_show_toast", false);
            this.C = new ju5(frzVar, 30, this, new Function0() { // from class: hpn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = InstantCalendarActivity.F;
                    fq2 fq2VarG1 = this.a.G1();
                    ej5.c(o8i0.d(fq2VarG1), null, null, new eq2(fq2VarG1, null), 3);
                    return Unit.a;
                }
            });
            ed edVarH1 = H1();
            edVarH1.d.setOnClickListener(this);
            edVarH1.b.setOnClickListener(this);
            edVarH1.i.setOnClickListener(this);
            CalendarView calendarView = H1().c;
            ju5 ju5Var = this.C;
            if (ju5Var == null) {
                Intrinsics.n("calendarRangeSelectionManager");
                throw null;
            }
            calendarView.setSelectionManager(ju5Var);
            calendarView.setOnlySix(true);
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
            calendar.add(6, -29);
            for (int i = 0; i < 181; i++) {
                calendar.add(6, -1);
                hashSet.add(Long.valueOf(calendar.getTimeInMillis()));
            }
            calendarView.setDisabledDays(hashSet);
            fq2 fq2VarG1 = G1();
            v340 v340Var = fq2VarG1.b;
            s9s lifecycle = getLifecycle();
            s9s.b bVar = s9s.b.d;
            kzh.d(new g1i(zyh.a(v340Var, lifecycle, bVar), new kpn(this, null)), ebs.a(getLifecycle()));
            kzh.d(new g1i(zyh.a(fq2VarG1.d, getLifecycle(), bVar), new lpn(this, null)), ebs.a(getLifecycle()));
            kzh.d(new g1i(zyh.a(fq2VarG1.f, getLifecycle(), bVar), new mpn(this, null)), ebs.a(getLifecycle()));
            E0((ActionBar) findViewById(R.id.action_bar), "", true, false, false, new npn(this));
            Date date = new Date();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String strL = bwf0.l(date, "dd/MM/yy", locale, 0, 0);
            H1().f.setText(strL);
            H1().e.setText(strL);
            if (booleanExtra) {
                e eVar = this.E;
                if (eVar == null) {
                    Intrinsics.n("commonUiEventProcessor");
                    throw null;
                }
                StringUiText stringUiText = vch0.a;
                eVar.c(new com.sporty.android.common.uievent.a.m(new ResourceUiText(R.string.bet_history__selections_discarded)), this, H1().a, null);
            }
            if (frzVar != null) {
                F f = frzVar.a;
                f.getClass();
                final uyc uycVar = (uyc) f;
                S s = frzVar.b;
                s.getClass();
                uyc uycVar2 = (uyc) s;
                ju5 ju5Var2 = this.C;
                if (ju5Var2 == null) {
                    Intrinsics.n("calendarRangeSelectionManager");
                    throw null;
                }
                ju5Var2.b = new frz<>(uycVar, uycVar2);
                ju5Var2.e = null;
                H1().c.o();
                H1().c.post(new Runnable() { // from class: jpn
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = InstantCalendarActivity.F;
                        this.a.H1().c.d(uycVar);
                    }
                });
                G1().y1(j, j2);
            }
        }
    }
}
