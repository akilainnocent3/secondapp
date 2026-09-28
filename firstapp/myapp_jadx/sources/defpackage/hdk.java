package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import com.sportybet.model.cashOut.STVPlayerDataSource;

/* JADX INFO: loaded from: classes5.dex */
public final class hdk {
    public final e8h a;
    public final dcn b;
    public final td00 c;
    public final psm d;
    public final wsm e;
    public final k5b f;
    public final bnh0 g;
    public final uqm h;
    public final ysm i;

    public hdk(e8h e8hVar, dcn dcnVar, td00 td00Var, psm psmVar, wsm wsmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, bnh0 bnh0Var, uqm uqmVar, ysm ysmVar) {
        e8hVar.getClass();
        dcnVar.getClass();
        td00Var.getClass();
        psmVar.getClass();
        wsmVar.getClass();
        bnh0Var.getClass();
        uqmVar.getClass();
        ysmVar.getClass();
        this.a = e8hVar;
        this.b = dcnVar;
        this.c = td00Var;
        this.d = psmVar;
        this.e = wsmVar;
        this.f = k5bVar;
        this.g = bnh0Var;
        this.h = uqmVar;
        this.i = ysmVar;
    }

    public static STVPlayerDataSource.WebViewSource a() {
        StringUiText stringUiText = vch0.a;
        return new STVPlayerDataSource.WebViewSource(null, 0.5625f, new StringUiText("<style> body { background-color: black; ").h(new StringUiText("display: flex; justify-content: center; align-items: center; ")).h(new StringUiText("color: white; text-align: center; } html, body { ")).h(new StringUiText("width: 100%; height: 100%; } </style> <body> <h3>")).h(new ResourceUiText(R.string.live__sorry_there_is_no_live_data)).h(new StringUiText("</h3></body>")));
    }
}
