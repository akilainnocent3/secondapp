package defpackage;

import com.sportybet.plugin.realsports.results.ResultChangeLeaguePanel;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gj50 implements Runnable {
    public final /* synthetic */ ResultChangeLeaguePanel a;
    public final /* synthetic */ z680 b;

    public /* synthetic */ gj50(ResultChangeLeaguePanel resultChangeLeaguePanel, z680 z680Var) {
        this.a = resultChangeLeaguePanel;
        this.b = z680Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = ResultChangeLeaguePanel.E;
        this.a.b(this.b);
    }
}
