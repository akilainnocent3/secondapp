package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import com.cruxlab.sectionedrecyclerview.lib.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.live.data.UpcomingOutcomeMeta;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class qih0 extends a.b {
    public final sjd0 b;
    public final djh0.a c;
    public final ajh0 d;
    public final ity e;
    public final Context f;
    public final List<OutcomeButton> g;
    public final lty h;
    public final mpe0 i;

    /* JADX WARN: Illegal instructions before constructor call */
    public qih0(final sjd0 sjd0Var, djh0.a aVar, iqs iqsVar, ity ityVar) {
        ityVar.getClass();
        FrameLayout frameLayout = sjd0Var.a;
        super(frameLayout);
        this.b = sjd0Var;
        this.c = aVar;
        this.d = iqsVar;
        this.e = ityVar;
        Context context = frameLayout.getContext();
        context.getClass();
        this.f = context;
        this.h = ityVar.b(sjd0Var.C);
        mpe0 mpe0VarB = hwr.b(new Function0() { // from class: jih0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                sjd0 sjd0Var2 = this.a.b;
                return new u8z(sjd0Var2.F, sjd0Var2.G, new ArrayList(), false);
            }
        });
        this.i = mpe0VarB;
        b3.H(sjd0Var.v, R.color.cmn_cool_grey);
        ListenableSpinner listenableSpinner = sjd0Var.F;
        listenableSpinner.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
        u8z u8zVar = (u8z) mpe0VarB.getValue();
        oih0 oih0Var = new oih0(this);
        u8zVar.getClass();
        u8zVar.f = oih0Var;
        listenableSpinner.setOnItemSelectedListener(new pih0(sjd0Var, this));
        List<OutcomeButton> listK = b.k(sjd0Var.w, sjd0Var.y, sjd0Var.z, sjd0Var.A);
        for (final OutcomeButton outcomeButton : listK) {
            outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: lih0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OutcomeButton outcomeButton2 = outcomeButton;
                    outcomeButton2.getClass();
                    this.a.a(outcomeButton2);
                }
            });
        }
        this.g = listK;
        sjd0Var.i.setOnClickListener(new View.OnClickListener() { // from class: mih0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajh0 ajh0Var;
                Object tag = view.getTag();
                if (!(tag instanceof Event)) {
                    tag = null;
                }
                Event event = (Event) tag;
                if (event == null || (ajh0Var = this.a.d) == null) {
                    return;
                }
                ajh0Var.b(event);
            }
        });
        sjd0Var.J.setOnClickListener(new View.OnClickListener() { // from class: nih0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajh0 ajh0Var;
                Object tag = sjd0Var.i.getTag();
                if (!(tag instanceof Event)) {
                    tag = null;
                }
                Event event = (Event) tag;
                if (event == null || (ajh0Var = this.d) == null) {
                    return;
                }
                ajh0Var.c(event);
            }
        });
        ImageView imageView = sjd0Var.B;
        Context context2 = frameLayout.getContext();
        context2.getClass();
        imageView.setImageDrawable(gug0.b(context2));
        ImageView imageView2 = sjd0Var.O;
        Context context3 = frameLayout.getContext();
        context3.getClass();
        imageView2.setImageDrawable(gug0.g(context3));
        ImageView imageView3 = sjd0Var.N;
        Context context4 = frameLayout.getContext();
        context4.getClass();
        imageView3.setImageDrawable(gug0.f(context4));
    }

    public final void a(OutcomeButton outcomeButton) {
        Object tag = outcomeButton.getTag();
        if (!(tag instanceof UpcomingOutcomeMeta)) {
            tag = null;
        }
        UpcomingOutcomeMeta upcomingOutcomeMeta = (UpcomingOutcomeMeta) tag;
        if (upcomingOutcomeMeta != null) {
            boolean zT = iu2.t(upcomingOutcomeMeta.getSelection().a, upcomingOutcomeMeta.getSelection().b, upcomingOutcomeMeta.getSelection().c, outcomeButton.isChecked(), false, null, 16368);
            if (!zT) {
                outcomeButton.setChecked(false);
            }
            upcomingOutcomeMeta.setChecked(outcomeButton.isChecked());
            upcomingOutcomeMeta.setCanUpdate(zT);
            if (iu2.p() && outcomeButton.isChecked() && !iu2.o(upcomingOutcomeMeta.getSelection())) {
                iu2.e(this.f, upcomingOutcomeMeta.getSelection());
            }
            ajh0 ajh0Var = this.d;
            if (ajh0Var != null) {
                ajh0Var.d(upcomingOutcomeMeta);
            }
        }
    }
}
