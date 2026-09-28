package com.sportybet.android.cashoutphase3.widget;

import com.sportybet.model.cashOut.STVPlayerDataSource;
import com.sportybet.plugin.realsports.widget.EPLStreamingMentionView;
import defpackage.vjd0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements EPLStreamingMentionView.a {
    public final /* synthetic */ STVPlayerDataSource.StreamingSource a;
    public final /* synthetic */ vjd0 b;
    public final /* synthetic */ STVPlayerView c;

    public a(STVPlayerDataSource.StreamingSource streamingSource, vjd0 vjd0Var, STVPlayerView sTVPlayerView) {
        this.a = streamingSource;
        this.b = vjd0Var;
        this.c = sTVPlayerView;
    }

    @Override // com.sportybet.plugin.realsports.widget.EPLStreamingMentionView.a
    public final void a() {
        STVPlayerDataSource.StreamingSource streamingSource = this.a;
        boolean zIsPlayInDotCom = streamingSource.isPlayInDotCom();
        STVPlayerView sTVPlayerView = this.c;
        if (zIsPlayInDotCom) {
            String eventId = streamingSource.getEventId();
            if (eventId != null) {
                sTVPlayerView.getCallback().a(eventId);
                return;
            }
            return;
        }
        vjd0 vjd0Var = this.b;
        vjd0Var.e.setVisibility(8);
        vjd0Var.v.setVisibility(0);
        String url = streamingSource.getUrl();
        int i = STVPlayerView.E;
        sTVPlayerView.i(url);
    }
}
