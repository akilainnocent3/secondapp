package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;

/* JADX INFO: loaded from: classes7.dex */
public final class mjd0 implements g6i0 {
    public final SearchPreMatchPanel a;
    public final RecyclerView b;
    public final LoadingView c;

    public mjd0(SearchPreMatchPanel searchPreMatchPanel, RecyclerView recyclerView, LoadingView loadingView) {
        this.a = searchPreMatchPanel;
        this.b = recyclerView;
        this.c = loadingView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
