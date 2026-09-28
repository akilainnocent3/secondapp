package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.cruxlab.sectionedrecyclerview.lib.a;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveTournamentData;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class dvs extends a.b {
    public final jid0 b;
    public final Drawable c;
    public final Drawable d;
    public final xss.h e;

    public dvs(jid0 jid0Var, Drawable drawable, Drawable drawable2, xss.h hVar) {
        super(jid0Var.a);
        this.b = jid0Var;
        this.c = drawable;
        this.d = drawable2;
        this.e = hVar;
        jid0Var.c.setOnClickListener(new View.OnClickListener() { // from class: cvs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = view.getTag();
                if (!(tag instanceof LiveTournamentData)) {
                    tag = null;
                }
                LiveTournamentData liveTournamentData = (LiveTournamentData) tag;
                if (liveTournamentData == null) {
                    return;
                }
                xss.h hVar2 = this.a.e;
                Tournament tournament = liveTournamentData.getTournament();
                hVar2.getClass();
                tournament.getClass();
                boolean zA = hVar2.a(tournament);
                xss xssVar = xss.this;
                LinkedHashSet linkedHashSet = xssVar.w;
                String str = tournament.id;
                if (zA) {
                    linkedHashSet.remove(str);
                } else {
                    str.getClass();
                    linkedHashSet.add(str);
                }
                k48.a(xssVar.u, xssVar.o());
                xssVar.I = true;
                xssVar.v();
                xssVar.c();
            }
        });
    }
}
