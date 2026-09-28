package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.OutrightTournament;

/* JADX INFO: loaded from: classes7.dex */
public final class m3p extends e64<cjd0> implements wyg {
    public final OutrightTournament d;
    public final hl20 e;

    public m3p(OutrightTournament outrightTournament, hl20 hl20Var) {
        outrightTournament.getClass();
        this.d = outrightTournament;
        this.e = hl20Var;
    }

    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        cjd0 cjd0Var = (cjd0) g6i0Var;
        cjd0Var.getClass();
        TextView textView = cjd0Var.b;
        textView.setText(this.d.getName());
        textView.setOnClickListener(new View.OnClickListener() { // from class: l3p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m3p m3pVar = this.a;
                hl20 hl20Var = m3pVar.e;
                OutrightTournament outrightTournament = m3pVar.d;
                hl20Var.a(outrightTournament.getEventId(), outrightTournament.getName());
            }
        });
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spr_outright_tournament;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        TextView textView = (TextView) h5e.a(R.id.tournament, view);
        if (textView != null) {
            return new cjd0((ConstraintLayout) view, textView);
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tournament)));
        return null;
    }

    @Override // defpackage.wyg
    public final void b(vyg vygVar) {
    }
}
