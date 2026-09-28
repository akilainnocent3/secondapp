package com.sportybet.plugin.event.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.c;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.ui.PlayerView;
import com.sporty.android.common_ui.widgets.AspectRatioFrameLayout;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.LiveStreamData;
import com.sportybet.plugin.realsports.data.LiveStreamDataSocialMedia;
import com.sportybet.plugin.realsports.data.LiveStreamDataWebView;
import com.sportybet.plugin.realsports.data.SocialMediaStreamData;
import com.sportybet.plugin.realsports.widget.EPLStreamingMentionView;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.bqe;
import defpackage.br3;
import defpackage.c8i0;
import defpackage.cms;
import defpackage.ems;
import defpackage.ens;
import defpackage.gec;
import defpackage.gfb0;
import defpackage.h5e;
import defpackage.hns;
import defpackage.hp0;
import defpackage.i0j0;
import defpackage.idd;
import defpackage.itf0;
import defpackage.mmc;
import defpackage.njv;
import defpackage.pid;
import defpackage.psm;
import defpackage.qls;
import defpackage.sn5;
import defpackage.tf;
import defpackage.wc;
import defpackage.wq3;
import defpackage.xls;
import defpackage.yxi0;
import defpackage.zad;
import defpackage.zch0;
import defpackage.zf;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0010J%\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R8\u0010A\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\n\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010G\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR0\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/sportybet/plugin/event/view/LiveEventVideoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setupPlayer", "()V", "", "ready", "setVideoPlayWhenReady", "(Z)V", "enabled", "setFullScreenEnabled", "setupVideoInWeb", "visible", "setContainerVisibility", "setPlayerViewVisibility", "showVideoVideo", "", "ratio", "showLoading", "setPlayerLayout", "(ZFZ)V", "Lcom/sportybet/plugin/realsports/data/LiveStreamDataSocialMedia;", "data", "setUpChannelSwitch", "(Lcom/sportybet/plugin/realsports/data/LiveStreamDataSocialMedia;)V", "Lpsm;", "H", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "Li0j0;", "I", "Li0j0;", "getWebViewWrapperService", "()Li0j0;", "setWebViewWrapperService", "(Li0j0;)V", "webViewWrapperService", "Lbnh0;", "J", "Lbnh0;", "getUrlCreator", "()Lbnh0;", "setUrlCreator", "(Lbnh0;)V", "urlCreator", "Lkotlin/Function2;", "", "K", "Lkotlin/jvm/functions/Function2;", "getOnWatchTimeReported", "()Lkotlin/jvm/functions/Function2;", "setOnWatchTimeReported", "(Lkotlin/jvm/functions/Function2;)V", "onWatchTimeReported", "value", "S", "Z", "getFullscreen", "()Z", "fullscreen", "Lkotlin/Function1;", "U", "Lkotlin/jvm/functions/Function1;", "getOnFullScreenToggled", "()Lkotlin/jvm/functions/Function1;", "setOnFullScreenToggled", "(Lkotlin/jvm/functions/Function1;)V", "onFullScreenToggled", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveEventVideoView extends Hilt_LiveEventVideoView {
    public static final /* synthetic */ int W = 0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public psm countryManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public i0j0 webViewWrapperService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public bnh0 urlCreator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Function2<? super Integer, ? super String, Unit> onWatchTimeReported;
    public final ems L;
    public final Handler M;
    public xls N;
    public qls O;
    public hns P;
    public ImageView Q;
    public ViewGroup R;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public boolean fullscreen;
    public int T;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public Function1<? super Boolean, Unit> onFullScreenToggled;
    public final FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveEventVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.live_event_video_view, this);
        int i2 = R.id.channel_switch;
        ImageView imageView = (ImageView) h5e.a(R.id.channel_switch, this);
        if (imageView != null) {
            i2 = R.id.channel_switch_hint;
            TextView textView = (TextView) h5e.a(R.id.channel_switch_hint, this);
            if (textView != null) {
                i2 = R.id.channels_container;
                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.channels_container, this);
                if (linearLayout != null) {
                    i2 = R.id.epl_video_container;
                    AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) h5e.a(R.id.epl_video_container, this);
                    if (aspectRatioFrameLayout != null) {
                        i2 = R.id.epl_watch_layout;
                        EPLStreamingMentionView ePLStreamingMentionView = (EPLStreamingMentionView) h5e.a(R.id.epl_watch_layout, this);
                        if (ePLStreamingMentionView != null) {
                            i2 = R.id.live_stream_playback_cover;
                            ComposeView composeView = (ComposeView) h5e.a(R.id.live_stream_playback_cover, this);
                            if (composeView != null) {
                                i2 = R.id.player_loading;
                                LoadingView loadingView = (LoadingView) h5e.a(R.id.player_loading, this);
                                if (loadingView != null) {
                                    i2 = R.id.player_loading_container;
                                    AspectRatioFrameLayout aspectRatioFrameLayout2 = (AspectRatioFrameLayout) h5e.a(R.id.player_loading_container, this);
                                    if (aspectRatioFrameLayout2 != null) {
                                        i2 = R.id.player_view;
                                        PlayerView playerView = (PlayerView) h5e.a(R.id.player_view, this);
                                        if (playerView != null) {
                                            i2 = R.id.streaming_ended_message;
                                            TextView textView2 = (TextView) h5e.a(R.id.streaming_ended_message, this);
                                            if (textView2 != null) {
                                                i2 = R.id.video_error_view;
                                                View viewA = h5e.a(R.id.video_error_view, this);
                                                if (viewA != null) {
                                                    gfb0.a(viewA);
                                                    i2 = R.id.video_in_web;
                                                    WebView webView = (WebView) h5e.a(R.id.video_in_web, this);
                                                    if (webView != null) {
                                                        i2 = R.id.video_in_web_container;
                                                        AspectRatioFrameLayout aspectRatioFrameLayout3 = (AspectRatioFrameLayout) h5e.a(R.id.video_in_web_container, this);
                                                        if (aspectRatioFrameLayout3 != null) {
                                                            this.L = new ems(this, imageView, textView, linearLayout, aspectRatioFrameLayout, ePLStreamingMentionView, composeView, loadingView, aspectRatioFrameLayout2, playerView, textView2, webView, aspectRatioFrameLayout3);
                                                            this.M = new Handler(Looper.getMainLooper());
                                                            FrameLayout frameLayout = new FrameLayout(context);
                                                            frameLayout.setBackgroundColor(-16777216);
                                                            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                                            this.V = frameLayout;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void E(LiveStreamDataWebView liveStreamDataWebView, Throwable th) {
        hns hnsVar = this.P;
        if (hnsVar == null) {
            Intrinsics.n("webViewHelper");
            throw null;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.n("Failed to load streaming content: " + liveStreamDataWebView + ", Error: " + th, new Object[0]);
        String strS = bjb0.S("/m/liveStreamAgent");
        float f = liveStreamDataWebView.playerRatio;
        hnsVar.d();
        hnsVar.p = null;
        cms cmsVar = hnsVar.f;
        Boolean bool = Boolean.FALSE;
        cmsVar.invoke(bool, Float.valueOf(f), bool);
        hnsVar.b.A.loadUrl(strS);
    }

    public final void F(boolean z) {
        hns hnsVar = this.P;
        if (hnsVar == null) {
            Intrinsics.n("webViewHelper");
            throw null;
        }
        ems emsVar = hnsVar.b;
        if (z) {
            hnsVar.d();
            emsVar.A.onPause();
        } else {
            emsVar.A.onResume();
            hnsVar.c();
        }
    }

    public final void G(String str, LiveStreamData liveStreamData, boolean z) {
        liveStreamData.getClass();
        ems emsVar = this.L;
        if (str == null || str.length() == 0) {
            emsVar.y.setVisibility(8);
            emsVar.B.setVisibility(8);
            emsVar.w.setVisibility(8);
            emsVar.v.E();
            String string = getContext().getString(R.string.sporty_tv__unavailable_in_your_region);
            string.getClass();
            emsVar.z.setText(string);
            emsVar.z.setVisibility(0);
            return;
        }
        setPlayerLayout(true, liveStreamData.playerRatio, false);
        xls xlsVar = this.N;
        Float fValueOf = null;
        if (xlsVar == null) {
            Intrinsics.n("videoPlayerHelper");
            throw null;
        }
        ems emsVar2 = xlsVar.b;
        if (!z) {
            xlsVar.j = liveStreamData.platform;
            if (str.length() == 0) {
                TextView textView = emsVar2.z;
                textView.setVisibility(0);
                textView.setText(sn5.c(textView, R.string.sporty_tv__unavailable_in_your_region, new Object[0]));
            } else {
                idd.a aVar = new idd.a();
                njv njvVarB = njv.b(str);
                HlsMediaSource.Factory factory = new HlsMediaSource.Factory(aVar);
                factory.j = true;
                factory.i = new gec();
                HlsMediaSource hlsMediaSourceE = factory.b(njvVarB);
                yxi0 yxi0Var = xlsVar.i;
                if (yxi0Var != null) {
                    yxi0Var.b();
                }
                d dVar = xlsVar.f;
                if (dVar != null) {
                    dVar.I0(hlsMediaSourceE);
                    dVar.d();
                    dVar.n(!dVar.Q());
                }
                d dVar2 = xlsVar.f;
                if (dVar2 != null) {
                    dVar2.S0();
                    fValueOf = Float.valueOf(dVar2.c0);
                }
                if (Intrinsics.e(fValueOf, 0.0f)) {
                    xlsVar.a();
                }
                emsVar2.z.setVisibility(8);
            }
        }
        emsVar.z.setVisibility(8);
    }

    public final void H(Window window) {
        View decorView;
        View decorView2;
        if (!this.fullscreen) {
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(4102);
            }
            Context context = getContext();
            context.getClass();
            Activity activityB = wc.b(context);
            if (activityB != null) {
                activityB.setRequestedOrientation(0);
            }
            wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
            Context context2 = getContext();
            context2.getClass();
            wq3VarU.a(wc.b(context2), false);
            ViewParent parent = this.L.a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            this.R = viewGroup;
            this.T = viewGroup != null ? viewGroup.indexOfChild(this.L.a) : 0;
            ViewGroup viewGroup2 = this.R;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.L.a);
            }
            this.V.addView(this.L.a, new FrameLayout.LayoutParams(-1, -1));
            View decorView3 = window != null ? window.getDecorView() : null;
            ViewGroup viewGroup3 = decorView3 instanceof ViewGroup ? (ViewGroup) decorView3 : null;
            if (viewGroup3 != null) {
                viewGroup3.addView(this.V);
            }
            PlayerView playerView = this.L.y;
            ViewGroup.LayoutParams layoutParams = playerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            playerView.setLayoutParams(layoutParams);
            this.L.y.setResizeMode(0);
            c8i0.k(-1, this.L.a);
            Function1<? super Boolean, Unit> function1 = this.onFullScreenToggled;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(this.fullscreen));
            }
            ImageView imageView = this.Q;
            if (imageView == null) {
                Intrinsics.n("fullScreenIcon");
                throw null;
            }
            imageView.setImageResource(R.drawable.spm_ic_exit_full_screen);
            this.fullscreen = true;
            return;
        }
        this.V.removeView(this.L.a);
        ViewGroup viewGroup4 = this.R;
        if (viewGroup4 != null) {
            viewGroup4.addView(this.L.a, this.T);
        }
        View decorView4 = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup5 = decorView4 instanceof ViewGroup ? (ViewGroup) decorView4 : null;
        if (viewGroup5 != null) {
            viewGroup5.removeView(this.V);
        }
        if (window != null && (decorView2 = window.getDecorView()) != null) {
            decorView2.setSystemUiVisibility(0);
        }
        Context context3 = getContext();
        context3.getClass();
        Activity activityB2 = wc.b(context3);
        if (activityB2 != null) {
            activityB2.setRequestedOrientation(1);
        }
        PlayerView playerView2 = this.L.y;
        ViewGroup.LayoutParams layoutParams2 = playerView2.getLayoutParams();
        layoutParams2.width = -1;
        xls xlsVar = this.N;
        if (xlsVar == null) {
            Intrinsics.n("videoPlayerHelper");
            throw null;
        }
        layoutParams2.height = xlsVar.l;
        playerView2.setLayoutParams(layoutParams2);
        this.L.y.setResizeMode(2);
        LiveEventVideoView liveEventVideoView = this.L.a;
        xls xlsVar2 = this.N;
        if (xlsVar2 == null) {
            Intrinsics.n("videoPlayerHelper");
            throw null;
        }
        c8i0.k(xlsVar2.l, liveEventVideoView);
        Function1<? super Boolean, Unit> function2 = this.onFullScreenToggled;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(this.fullscreen));
        }
        ImageView imageView2 = this.Q;
        if (imageView2 == null) {
            Intrinsics.n("fullScreenIcon");
            throw null;
        }
        imageView2.setImageResource(R.drawable.spm_ic_enter_full_screen);
        wq3 wq3VarU2 = ((br3) mmc.a(hp0.A, br3.class)).U();
        Context context4 = getContext();
        context4.getClass();
        wq3VarU2.a(wc.b(context4), true);
        this.fullscreen = false;
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final boolean getFullscreen() {
        return this.fullscreen;
    }

    public final Function1<Boolean, Unit> getOnFullScreenToggled() {
        return this.onFullScreenToggled;
    }

    public final Function2<Integer, String, Unit> getOnWatchTimeReported() {
        return this.onWatchTimeReported;
    }

    public final bnh0 getUrlCreator() {
        bnh0 bnh0Var = this.urlCreator;
        if (bnh0Var != null) {
            return bnh0Var;
        }
        Intrinsics.n("urlCreator");
        throw null;
    }

    public final i0j0 getWebViewWrapperService() {
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var != null) {
            return i0j0Var;
        }
        Intrinsics.n("webViewWrapperService");
        throw null;
    }

    public final void setContainerVisibility(boolean visible) {
        hns hnsVar = this.P;
        if (hnsVar == null) {
            Intrinsics.n("webViewHelper");
            throw null;
        }
        hnsVar.b.a.setVisibility(visible ? 0 : 8);
        if (visible) {
            hnsVar.c();
        } else {
            hnsVar.d();
        }
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setFullScreenEnabled(boolean enabled) {
        xls xlsVar = this.N;
        if (xlsVar == null) {
            Intrinsics.n("videoPlayerHelper");
            throw null;
        }
        xlsVar.k = enabled;
        View viewFindViewById = xlsVar.b.y.findViewById(R.id.exo_fullscreen_button);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(xlsVar.k ? 0 : 8);
        }
        hns hnsVar = this.P;
        if (hnsVar != null) {
            hnsVar.q = enabled;
        } else {
            Intrinsics.n("webViewHelper");
            throw null;
        }
    }

    public final void setOnFullScreenToggled(Function1<? super Boolean, Unit> function1) {
        this.onFullScreenToggled = function1;
    }

    public final void setOnWatchTimeReported(Function2<? super Integer, ? super String, Unit> function2) {
        this.onWatchTimeReported = function2;
    }

    public final void setPlayerLayout(boolean showVideoVideo, float ratio, boolean showLoading) {
        ems emsVar = this.L;
        if (showVideoVideo) {
            hns hnsVar = this.P;
            if (hnsVar == null) {
                Intrinsics.n("webViewHelper");
                throw null;
            }
            hnsVar.d();
            emsVar.y.setVisibility(0);
            emsVar.B.setVisibility(8);
        } else {
            PlayerView playerView = emsVar.y;
            AspectRatioFrameLayout aspectRatioFrameLayout = emsVar.B;
            playerView.setVisibility(8);
            setVideoPlayWhenReady(false);
            aspectRatioFrameLayout.setVisibility(0);
            aspectRatioFrameLayout.setAspectRatio(ratio, true);
            hns hnsVar2 = this.P;
            if (hnsVar2 == null) {
                Intrinsics.n("webViewHelper");
                throw null;
            }
            hnsVar2.c();
        }
        if (!showLoading) {
            emsVar.w.setVisibility(8);
            emsVar.v.E();
        } else {
            emsVar.w.setAspectRatio(ratio, true);
            emsVar.w.setVisibility(0);
            emsVar.v.K();
        }
    }

    public final void setPlayerViewVisibility(boolean visible) {
        this.L.y.setVisibility(visible ? 0 : 8);
    }

    public final void setUpChannelSwitch(LiveStreamDataSocialMedia data) {
        data.getClass();
        final hns hnsVar = this.P;
        if (hnsVar == null) {
            Intrinsics.n("webViewHelper");
            throw null;
        }
        Context context = hnsVar.a;
        ems emsVar = hnsVar.b;
        if (data.items.size() < 2) {
            return;
        }
        LinearLayout linearLayout = emsVar.d;
        linearLayout.removeAllViews();
        int iA = zch0.a(context, hnsVar.j);
        List<SocialMediaStreamData> list = data.items;
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            final SocialMediaStreamData socialMediaStreamData = (SocialMediaStreamData) obj;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iA, iA);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams);
            textView.setTextSize(12.0f);
            textView.setText("Ch." + i2);
            textView.setBackgroundColor(i == hnsVar.k ? -16777216 : Color.parseColor("#cc1b1e25"));
            textView.setTextColor(i == hnsVar.k ? Color.parseColor("#32ce62") : -1);
            textView.setGravity(17);
            textView.setTag(Integer.valueOf(i));
            textView.setOnClickListener(new View.OnClickListener() { // from class: bns
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object tag = view.getTag();
                    Integer num = tag instanceof Integer ? (Integer) tag : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        SocialMediaStreamData socialMediaStreamData2 = socialMediaStreamData;
                        socialMediaStreamData2.getClass();
                        hns hnsVar2 = hnsVar;
                        ems emsVar2 = hnsVar2.b;
                        View childAt = emsVar2.d.getChildAt(hnsVar2.k);
                        TextView textView2 = childAt instanceof TextView ? (TextView) childAt : null;
                        if (textView2 != null) {
                            textView2.setBackgroundColor(Color.parseColor("#cc1b1e25"));
                            textView2.setTextColor(-1);
                        }
                        View childAt2 = emsVar2.d.getChildAt(iIntValue);
                        TextView textView3 = childAt2 instanceof TextView ? (TextView) childAt2 : null;
                        if (textView3 != null) {
                            textView3.setBackgroundColor(-16777216);
                            textView3.setTextColor(Color.parseColor("#32ce62"));
                        }
                        hnsVar2.k = iIntValue;
                        emsVar2.A.loadUrl(hnsVar2.a(socialMediaStreamData2));
                    }
                }
            });
            linearLayout.addView(textView);
            i = i2;
        }
        if (hnsVar.l) {
            return;
        }
        qls qlsVar = hnsVar.e;
        ems emsVar2 = qlsVar.b;
        int width = emsVar2.c.getWidth();
        int iA2 = zch0.a(qlsVar.a, 36) * qlsVar.b.d.getChildCount();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(emsVar2.c, "translationX", 0.0f, width);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(emsVar2.d, "translationX", 0.0f, iA2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        animatorSet.setDuration(0L);
        animatorSet.start();
        emsVar.b.setVisibility(0);
        emsVar.c.setVisibility(0);
        linearLayout.setVisibility(0);
        hnsVar.l = true;
    }

    public final void setUrlCreator(bnh0 bnh0Var) {
        bnh0Var.getClass();
        this.urlCreator = bnh0Var;
    }

    public final void setVideoPlayWhenReady(boolean ready) {
        xls xlsVar = this.N;
        if (xlsVar == null) {
            Intrinsics.n("videoPlayerHelper");
            throw null;
        }
        d dVar = xlsVar.f;
        if (dVar != null) {
            dVar.n(ready);
        }
    }

    public final void setWebViewWrapperService(i0j0 i0j0Var) {
        i0j0Var.getClass();
        this.webViewWrapperService = i0j0Var;
    }

    public final void setupPlayer() {
        pid.d dVar;
        final xls xlsVar = this.N;
        if (xlsVar == null) {
            Intrinsics.n("videoPlayerHelper");
            throw null;
        }
        ems emsVar = xlsVar.b;
        Context context = xlsVar.a;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
        zad zadVar = new zad(applicationContext, map);
        pid pidVar = new pid(context, new zf.b());
        synchronized (pidVar.c) {
            dVar = pidVar.f;
        }
        dVar.getClass();
        pid.d.a aVar = new pid.d.a(dVar);
        aVar.l();
        aVar.l = 2;
        pidVar.g(new pid.d(aVar));
        c cVar = new c(new tf(1));
        ExoPlayer.b bVar = new ExoPlayer.b(context);
        bVar.c(cVar);
        bVar.d(pidVar);
        bVar.b(zadVar);
        d dVarA = bVar.a();
        dVarA.m.a(xlsVar.m);
        dVarA.s.Z(xlsVar.n);
        yxi0 yxi0Var = new yxi0(dVarA, new Function1() { // from class: rls
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                xls xlsVar2 = xlsVar;
                xlsVar2.c.invoke(num, xlsVar2.j);
                return Unit.a;
            }
        });
        yxi0Var.b();
        xlsVar.i = yxi0Var;
        xlsVar.f = dVarA;
        xlsVar.l = (int) ((bqe.d() * 9) / 16.0f);
        PlayerView playerView = emsVar.y;
        ViewGroup.LayoutParams layoutParams = playerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = xlsVar.l;
        } else {
            layoutParams = null;
        }
        playerView.setLayoutParams(layoutParams);
        View viewFindViewById = playerView.findViewById(R.id.exo_fullscreen_button);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: sls
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xlsVar.d.invoke();
                }
            });
        }
        View viewFindViewById2 = playerView.findViewById(R.id.exo_volume_button);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: tls
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xlsVar.a();
                }
            });
        }
        View viewFindViewById3 = playerView.findViewById(R.id.exo_play_pause);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: uls
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar2 = xlsVar.f;
                    if (dVar2 != null) {
                        dVar2.n(!dVar2.Q());
                    }
                }
            });
        }
        playerView.setPlayer(xlsVar.f);
        playerView.setResizeMode(2);
        PlayerView playerView2 = this.L.y;
        xls xlsVar2 = this.N;
        if (xlsVar2 != null) {
            playerView2.setPlayer(xlsVar2.f);
        } else {
            Intrinsics.n("videoPlayerHelper");
            throw null;
        }
    }

    public final void setupVideoInWeb() {
        hns hnsVar = this.P;
        if (hnsVar == null) {
            Intrinsics.n("webViewHelper");
            throw null;
        }
        i0j0 i0j0Var = hnsVar.c;
        Context context = hnsVar.a;
        WebView webView = hnsVar.b.A;
        i0j0Var.installJsBridge(context, webView, new ens(hnsVar), hnsVar.r);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setCacheMode(2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveEventVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveEventVideoView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ LiveEventVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
