package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.data.TournamentDetails;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class itg implements gtg {
    public final z7h a;
    public final k5b b;
    public final a1f0<TournamentDetails, List<Event>> c;
    public final JsonSerializeService d;

    public itg(z7h z7hVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, a1f0<TournamentDetails, List<Event>> a1f0Var, JsonSerializeService jsonSerializeService) {
        z7hVar.getClass();
        jsonSerializeService.getClass();
        this.a = z7hVar;
        this.b = k5bVar;
        this.c = a1f0Var;
        this.d = jsonSerializeService;
    }

    @Override // defpackage.gtg
    public final void a(int i, String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        TournamentDetails tournamentDetails = new TournamentDetails(str, i, str2);
        a1f0<TournamentDetails, List<Event>> a1f0Var = this.c;
        if (a1f0Var.a(tournamentDetails) != null) {
            a1f0Var.b(tournamentDetails, arrayList);
        }
    }

    @Override // defpackage.gtg
    public final lyh b(TournamentDetails tournamentDetails) {
        return ozh.c(new or60(new htg(this, tournamentDetails, null)), this.b);
    }
}
