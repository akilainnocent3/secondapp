package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchView;
import com.sportybet.plugin.realsports.home.featuredsection.a;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rfh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ rfh(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Event event;
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                FeaturedMatchView featuredMatchView = (FeaturedMatchView) callback;
                int i2 = FeaturedMatchView.G;
                Object tag = view.getTag();
                if (!(tag instanceof FeaturedMatch)) {
                    tag = null;
                }
                FeaturedMatch featuredMatch = (FeaturedMatch) tag;
                if (featuredMatch != null && (event = featuredMatch.getEvent()) != null) {
                    featuredMatchView.c.m(event, a.C0430a.a);
                    break;
                }
                break;
            default:
                dt80 dt80Var = (dt80) callback;
                new d6j0(dt80Var.a).a();
                dt80Var.dismiss();
                break;
        }
    }
}
