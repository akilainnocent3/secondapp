package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sportybet.android.cashoutphase3.widget.STVPlayerView;

/* JADX INFO: loaded from: classes5.dex */
public final class vq60 extends WebViewClient {
    public final /* synthetic */ STVPlayerView a;

    public vq60(STVPlayerView sTVPlayerView) {
        this.a = sTVPlayerView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        STVPlayerView sTVPlayerView = this.a;
        if (!vn20.b(sTVPlayerView.getContext(), "sportybet", "live_stream_channel_switch_first_shown", true) || sTVPlayerView.getHandler() == null) {
            return;
        }
        sTVPlayerView.getHandler().postDelayed(sTVPlayerView.C, 5000L);
    }
}
