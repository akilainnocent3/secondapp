package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.home.LivePanel;

/* JADX INFO: loaded from: classes7.dex */
public final class prs extends RecyclerView.h {
    public final /* synthetic */ LivePanel a;

    public prs(LivePanel livePanel) {
        this.a = livePanel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void a() {
        int i = LivePanel.c0;
        this.a.s(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void b(int i, int i2) {
        int i3 = LivePanel.c0;
        this.a.s(i, i2);
    }
}
