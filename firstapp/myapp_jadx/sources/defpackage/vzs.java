package defpackage;

import android.view.View;
import com.cruxlab.sectionedrecyclerview.lib.a;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class vzs extends a.b {
    public final sos b;
    public final jts c;

    public vzs(sos sosVar, int i, jts jtsVar) {
        super(sosVar.a);
        this.b = sosVar;
        this.c = jtsVar;
        LoadingView loadingView = sosVar.b;
        loadingView.getEmptyView().setTextColor(-1);
        loadingView.getErrorView().getTitle().setTextColor(i);
        loadingView.getErrorView().setOnClickListener(new View.OnClickListener() { // from class: uzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jts jtsVar2 = this.a.c;
                if (jtsVar2 != null) {
                    jtsVar2.g();
                }
            }
        });
    }
}
