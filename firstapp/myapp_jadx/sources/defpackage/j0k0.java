package defpackage;

import com.sportybet.plugin.worldcuptournament.ui.WorldCupPanelComposeViewWrapper;

/* JADX INFO: loaded from: classes7.dex */
public final class j0k0 implements tse {
    public final /* synthetic */ WorldCupPanelComposeViewWrapper a;

    public j0k0(WorldCupPanelComposeViewWrapper worldCupPanelComposeViewWrapper) {
        this.a = worldCupPanelComposeViewWrapper;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.setTag(null);
    }
}
