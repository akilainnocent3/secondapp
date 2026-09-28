package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.ui.PlayerView;
import com.sporty.android.common_ui.widgets.AspectRatioFrameLayout;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.event.view.LiveEventVideoView;
import com.sportybet.plugin.realsports.widget.EPLStreamingMentionView;

/* JADX INFO: loaded from: classes4.dex */
public final class ems implements g6i0 {
    public final WebView A;
    public final AspectRatioFrameLayout B;
    public final LiveEventVideoView a;
    public final ImageView b;
    public final TextView c;
    public final LinearLayout d;
    public final AspectRatioFrameLayout e;
    public final EPLStreamingMentionView f;
    public final ComposeView i;
    public final LoadingView v;
    public final AspectRatioFrameLayout w;
    public final PlayerView y;
    public final TextView z;

    public ems(LiveEventVideoView liveEventVideoView, ImageView imageView, TextView textView, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, EPLStreamingMentionView ePLStreamingMentionView, ComposeView composeView, LoadingView loadingView, AspectRatioFrameLayout aspectRatioFrameLayout2, PlayerView playerView, TextView textView2, WebView webView, AspectRatioFrameLayout aspectRatioFrameLayout3) {
        this.a = liveEventVideoView;
        this.b = imageView;
        this.c = textView;
        this.d = linearLayout;
        this.e = aspectRatioFrameLayout;
        this.f = ePLStreamingMentionView;
        this.i = composeView;
        this.v = loadingView;
        this.w = aspectRatioFrameLayout2;
        this.y = playerView;
        this.z = textView2;
        this.A = webView;
        this.B = aspectRatioFrameLayout3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
