package com.sportybet.android.cashoutphase3.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.c;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.cashoutphase3.widget.STVPlayerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.model.cashOut.STVPlayerDataSource;
import com.sportybet.plugin.realsports.widget.EPLStreamingMentionView;
import defpackage.gec;
import defpackage.hce0;
import defpackage.i0j0;
import defpackage.idd;
import defpackage.itf0;
import defpackage.njv;
import defpackage.nq60;
import defpackage.oq60;
import defpackage.pid;
import defpackage.pq60;
import defpackage.ro70;
import defpackage.tf;
import defpackage.uhc;
import defpackage.uq60;
import defpackage.vjd0;
import defpackage.vq60;
import defpackage.wc;
import defpackage.wq60;
import defpackage.xq60;
import defpackage.yv0;
import defpackage.zad;
import defpackage.zch0;
import defpackage.zf;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/sportybet/android/cashoutphase3/widget/STVPlayerView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setupPlayer", "(Landroid/content/Context;)V", "Lcom/sportybet/model/cashOut/STVPlayerDataSource$MultipleWebViewSource;", "data", "setUpChannelSwitch", "(Lcom/sportybet/model/cashOut/STVPlayerDataSource$MultipleWebViewSource;)V", "getChannelsWidth", "()I", "Li0j0;", "c", "Li0j0;", "getWebViewWrapperService", "()Li0j0;", "setWebViewWrapperService", "(Li0j0;)V", "webViewWrapperService", "Lcom/sportybet/android/cashoutphase3/widget/STVPlayerView$a;", "B", "Lcom/sportybet/android/cashoutphase3/widget/STVPlayerView$a;", "getCallback", "()Lcom/sportybet/android/cashoutphase3/widget/STVPlayerView$a;", "setCallback", "(Lcom/sportybet/android/cashoutphase3/widget/STVPlayerView$a;)V", "callback", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class STVPlayerView extends Hilt_STVPlayerView {
    public static final /* synthetic */ int E = 0;
    public boolean A;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public a callback;
    public final oq60 C;
    public final pq60 D;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public i0j0 webViewWrapperService;
    public final vjd0 d;
    public d e;
    public boolean f;
    public float i;
    public STVPlayerDataSource v;
    public int w;
    public boolean y;
    public boolean z;

    public interface a {
        void a(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [pq60] */
    /* JADX WARN: Type inference failed for: r2v5, types: [oq60] */
    public STVPlayerView(final Context context, AttributeSet attributeSet, int i) {
        vjd0 vjd0VarA;
        super(context, attributeSet, i);
        context.getClass();
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((xq60) generatedComponent()).f(this);
        }
        this.f = true;
        this.z = true;
        this.callback = new nq60();
        try {
            vjd0VarA = vjd0.a(LayoutInflater.from(context), this);
            c(vjd0VarA);
        } catch (Exception unused) {
            vjd0VarA = null;
        }
        this.d = vjd0VarA;
        this.C = new Runnable() { // from class: oq60
            @Override // java.lang.Runnable
            public final void run() {
                STVPlayerView sTVPlayerView = this.a;
                vjd0 vjd0Var = sTVPlayerView.d;
                if (vjd0Var != null) {
                    TextView textView = vjd0Var.c;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, -textView.getWidth());
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "translationX", textView.getWidth(), 0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    if (sTVPlayerView.getHandler() != null) {
                        sTVPlayerView.getHandler().postDelayed(sTVPlayerView.D, 5000L);
                    }
                }
                vn20.f(context, "sportybet", "live_stream_channel_switch_first_shown", false, true);
            }
        };
        this.D = new Runnable() { // from class: pq60
            @Override // java.lang.Runnable
            public final void run() {
                vjd0 vjd0Var = this.a.d;
                if (vjd0Var != null) {
                    TextView textView = vjd0Var.c;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vjd0Var.b, "translationX", -textView.getWidth(), 0.0f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, textView.getWidth());
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                }
            }
        };
    }

    private final int getChannelsWidth() {
        vjd0 vjd0Var = this.d;
        if (vjd0Var == null) {
            return 0;
        }
        return zch0.a(getContext(), 36) * vjd0Var.d.getChildCount();
    }

    public static void h(TextView textView, String str) {
        textView.setText(str);
        if (StringsKt.M(str, " ", false)) {
            textView.setGravity(17);
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setMaxLines(1);
        }
    }

    private final void setUpChannelSwitch(STVPlayerDataSource.MultipleWebViewSource data) {
        vjd0 vjd0Var = this.d;
        if (vjd0Var != null) {
            TextView textView = vjd0Var.c;
            LinearLayout linearLayout = vjd0Var.d;
            ImageView imageView = vjd0Var.b;
            if (data.getUrl().size() < 2) {
                return;
            }
            linearLayout.removeAllViews();
            int size = data.getUrl().size();
            final int i = 0;
            while (i < size) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(zch0.a(getContext(), 36), zch0.a(getContext(), 36));
                final String str = data.getUrl().get(i);
                int i2 = i + 1;
                String strA = hce0.a(i2, "Ch.");
                TextView textView2 = new TextView(getContext());
                textView2.setLayoutParams(layoutParams);
                textView2.setTextSize(12.0f);
                textView2.setText(strA);
                textView2.setBackgroundColor(i == this.w ? -16777216 : textView2.getContext().getColor(R.color.cashout_live_event_channel_unselected_bg));
                textView2.setTextColor(i == this.w ? textView2.getContext().getColor(R.color.brand_secondary_variable_type3) : -1);
                textView2.setGravity(17);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: qq60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = STVPlayerView.E;
                        STVPlayerView sTVPlayerView = this.a;
                        vjd0 vjd0Var2 = sTVPlayerView.d;
                        if (vjd0Var2 != null) {
                            LinearLayout linearLayout2 = vjd0Var2.d;
                            View childAt = linearLayout2.getChildAt(sTVPlayerView.w);
                            if (!(childAt instanceof TextView)) {
                                childAt = null;
                            }
                            TextView textView3 = (TextView) childAt;
                            if (textView3 != null) {
                                textView3.setBackgroundColor(sTVPlayerView.getContext().getColor(R.color.cashout_live_event_channel_unselected_bg));
                            }
                            if (textView3 != null) {
                                textView3.setTextColor(-1);
                            }
                            int i4 = i;
                            View childAt2 = linearLayout2.getChildAt(i4);
                            TextView textView4 = (TextView) (childAt2 instanceof TextView ? childAt2 : null);
                            if (textView4 != null) {
                                textView4.setBackgroundColor(-16777216);
                            }
                            if (textView4 != null) {
                                textView4.setTextColor(sTVPlayerView.getContext().getColor(R.color.brand_secondary_variable_type3));
                            }
                            sTVPlayerView.w = i4;
                            sTVPlayerView.i(str);
                        }
                    }
                });
                linearLayout.addView(textView2);
                i = i2;
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: rq60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = STVPlayerView.E;
                    this.a.f();
                }
            });
            if (this.y) {
                return;
            }
            linearLayout.setVisibility(0);
            imageView.setVisibility(0);
            textView.setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, textView.getWidth());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, "translationX", 0.0f, getChannelsWidth());
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "translationX", getChannelsWidth(), 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat, objectAnimatorOfFloat3);
            animatorSet.setDuration(0L);
            animatorSet.start();
            this.y = true;
        }
    }

    private final void setupPlayer(Context context) {
        pid.d dVar;
        vjd0 vjd0Var = this.d;
        if (vjd0Var != null) {
            PlayerView playerView = vjd0Var.v;
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
            pid pidVar = new pid(context, new zf.b(25000));
            synchronized (pidVar.c) {
                dVar = pidVar.f;
            }
            dVar.getClass();
            pid.d.a aVar = new pid.d.a(dVar);
            aVar.l();
            aVar.l = 2;
            pidVar.g(new pid.d(aVar));
            c.k(1000, 0, "bufferForPlaybackMs", "0");
            c.k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
            c.k(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
            c.k(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            c.k(50000, 50000, "maxBufferMs", "minBufferMs");
            c cVar = new c(new tf(1));
            ExoPlayer.b bVar = new ExoPlayer.b(context);
            bVar.c(cVar);
            bVar.d(pidVar);
            bVar.b(zadVar);
            d dVarA = bVar.a();
            this.e = dVarA;
            playerView.setPlayer(dVarA);
            playerView.setResizeMode(2);
        }
    }

    public final void a() {
        Window window;
        if (this.A) {
            this.A = false;
            WeakHashMap<Window, Integer> weakHashMap = ro70.a;
            Context context = getContext();
            context.getClass();
            Activity activityB = wc.b(context);
            if (activityB == null || (window = activityB.getWindow()) == null) {
                return;
            }
            WeakHashMap<Window, Integer> weakHashMap2 = ro70.a;
            Integer num = weakHashMap2.get(window);
            int iIntValue = (num != null ? num.intValue() : 0) - 1;
            if (iIntValue > 0) {
                weakHashMap2.put(window, Integer.valueOf(iIntValue));
                return;
            }
            weakHashMap2.remove(window);
            Boolean boolRemove = ro70.b.remove(window);
            if (boolRemove != null ? boolRemove.booleanValue() : false) {
                return;
            }
            window.clearFlags(8192);
        }
    }

    public final void b() {
        Window window;
        if (this.A) {
            return;
        }
        this.A = true;
        WeakHashMap<Window, Integer> weakHashMap = ro70.a;
        Context context = getContext();
        context.getClass();
        Activity activityB = wc.b(context);
        if (activityB == null || (window = activityB.getWindow()) == null) {
            return;
        }
        WeakHashMap<Window, Integer> weakHashMap2 = ro70.a;
        Integer num = weakHashMap2.get(window);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 0) {
            ro70.b.put(window, Boolean.valueOf((window.getAttributes().flags & 8192) != 0));
        }
        weakHashMap2.put(window, Integer.valueOf(iIntValue + 1));
        window.setFlags(8192, 8192);
    }

    public final void c(vjd0 vjd0Var) {
        PlayerView playerView = vjd0Var.v;
        playerView.setShowBuffering(2);
        ProgressBar progressBar = (ProgressBar) playerView.findViewById(R.id.exo_buffering);
        if (progressBar != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(getContext().getColor(R.color.white_70)));
        }
        ImageView imageView = (ImageView) playerView.findViewById(R.id.exo_fullscreen_icon);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.spm_ic_enter_full_screen);
        }
        playerView.setResizeMode(2);
        View viewFindViewById = playerView.findViewById(R.id.exo_volume_button);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: sq60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    float f;
                    int i = STVPlayerView.E;
                    STVPlayerView sTVPlayerView = this.a;
                    vjd0 vjd0Var2 = sTVPlayerView.d;
                    if (vjd0Var2 != null) {
                        PlayerView playerView2 = vjd0Var2.v;
                        boolean z = sTVPlayerView.f;
                        d dVar = sTVPlayerView.e;
                        if (z) {
                            if (dVar != null) {
                                dVar.S0();
                                f = dVar.c0;
                            } else {
                                f = 0.0f;
                            }
                            sTVPlayerView.i = f;
                            d dVar2 = sTVPlayerView.e;
                            if (dVar2 != null) {
                                dVar2.L(0.0f);
                            }
                            ImageView imageView2 = (ImageView) playerView2.findViewById(R.id.exo_volume_icon);
                            if (imageView2 != null) {
                                imageView2.setImageResource(R.drawable.spm_ic_volume_off);
                            }
                        } else {
                            if (dVar != null) {
                                dVar.L(sTVPlayerView.i);
                            }
                            ImageView imageView3 = (ImageView) playerView2.findViewById(R.id.exo_volume_icon);
                            if (imageView3 != null) {
                                imageView3.setImageResource(R.drawable.spm_ic_volume_on);
                            }
                        }
                        sTVPlayerView.f = !sTVPlayerView.f;
                    }
                }
            });
        }
    }

    public final void d() {
        vjd0 vjd0Var = this.d;
        if (vjd0Var != null) {
            WebView webView = vjd0Var.w;
            webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webView.getSettings().setCacheMode(2);
            getWebViewWrapperService().installJsBridge(getContext(), webView, new vq60(this), new uq60(vjd0Var));
        }
    }

    public final void e(STVPlayerDataSource sTVPlayerDataSource) {
        vjd0 vjd0Var = this.d;
        if (vjd0Var != null) {
            PlayerView playerView = vjd0Var.v;
            WebView webView = vjd0Var.w;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_STV_PLAYER);
            aVar.a("play " + sTVPlayerDataSource, new Object[0]);
            if (Intrinsics.g(this.v, sTVPlayerDataSource)) {
                return;
            }
            this.v = sTVPlayerDataSource;
            boolean z = sTVPlayerDataSource instanceof STVPlayerDataSource.BetGeniusSource;
            if (!z || !((STVPlayerDataSource.BetGeniusSource) sTVPlayerDataSource).getEnableScreenProtection()) {
                a();
            }
            vjd0Var.i.setAspectRatio(sTVPlayerDataSource.getRatio());
            vjd0Var.d.setVisibility(4);
            if (sTVPlayerDataSource instanceof STVPlayerDataSource.StreamingSource) {
                webView.setVisibility(8);
                playerView.setVisibility(0);
                STVPlayerDataSource.StreamingSource streamingSource = (STVPlayerDataSource.StreamingSource) sTVPlayerDataSource;
                if (streamingSource.isSportyTV()) {
                    EPLStreamingMentionView ePLStreamingMentionView = vjd0Var.e;
                    playerView.setVisibility(8);
                    ePLStreamingMentionView.setVisibility(0);
                    ePLStreamingMentionView.setEPLWatchText(streamingSource.isPlayInDotCom());
                    ePLStreamingMentionView.setListener(new com.sportybet.android.cashoutphase3.widget.a(streamingSource, vjd0Var, this));
                    return;
                }
                String url = streamingSource.getUrl();
                aVar.a(yv0.a(aVar, MyLog.TAG_STV_PLAYER, "ExoPlayer url: ", url), new Object[0]);
                if (this.e == null) {
                    Context context = getContext();
                    context.getClass();
                    setupPlayer(context);
                }
                HlsMediaSource.Factory factory = new HlsMediaSource.Factory(new idd.a());
                factory.j = true;
                factory.i = new gec();
                HlsMediaSource hlsMediaSourceE = factory.b(njv.b(url));
                d dVar = this.e;
                if (dVar != null) {
                    dVar.I0(hlsMediaSourceE);
                }
                d dVar2 = this.e;
                if (dVar2 != null) {
                    dVar2.d();
                }
                d dVar3 = this.e;
                if (dVar3 != null) {
                    dVar3.n(!(dVar3.Q()));
                }
                PlayerControlView playerControlView = playerView.A;
                if (playerControlView != null) {
                    playerControlView.f();
                    return;
                }
                return;
            }
            if (sTVPlayerDataSource instanceof STVPlayerDataSource.WebViewSource) {
                webView.setVisibility(0);
                playerView.setVisibility(8);
                STVPlayerDataSource.WebViewSource webViewSource = (STVPlayerDataSource.WebViewSource) sTVPlayerDataSource;
                try {
                    d();
                    UiText htmlData = webViewSource.getHtmlData();
                    if (htmlData != null) {
                        String url2 = webViewSource.getUrl();
                        Context context2 = getContext();
                        context2.getClass();
                        webView.loadDataWithBaseURL(url2, htmlData.e(context2).toString(), "text/html", "UTF-8", null);
                    } else {
                        String url3 = webViewSource.getUrl();
                        if (url3 != null) {
                            aVar.q(MyLog.TAG_STV_PLAYER);
                            aVar.a("WebView url: ".concat(url3), new Object[0]);
                            webView.loadUrl(url3);
                        }
                    }
                    return;
                } catch (Exception e) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_STV_PLAYER);
                    aVar2.d("error on playWebViewSource: " + e, new Object[0]);
                    return;
                }
            }
            if (!z) {
                if (!(sTVPlayerDataSource instanceof STVPlayerDataSource.MultipleWebViewSource)) {
                    uhc.a();
                    return;
                }
                STVPlayerDataSource.MultipleWebViewSource multipleWebViewSource = (STVPlayerDataSource.MultipleWebViewSource) sTVPlayerDataSource;
                setUpChannelSwitch(multipleWebViewSource);
                i(multipleWebViewSource.getUrl().get(this.w));
                return;
            }
            webView.setVisibility(0);
            playerView.setVisibility(8);
            STVPlayerDataSource.BetGeniusSource betGeniusSource = (STVPlayerDataSource.BetGeniusSource) sTVPlayerDataSource;
            try {
                if (betGeniusSource.getEnableScreenProtection()) {
                    b();
                }
                d();
                webView.setWebChromeClient(new wq60(getContext(), new uq60(vjd0Var), Boolean.FALSE));
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setAllowFileAccess(true);
                Uri uri = Uri.parse(betGeniusSource.getUri());
                CookieManager.getInstance().setCookie(uri.getScheme() + "://" + uri.getHost(), "accessToken=" + betGeniusSource.getAccessToken());
                aVar.q(MyLog.TAG_STV_PLAYER);
                aVar.a("BetGenius url: " + betGeniusSource.getUri(), new Object[0]);
                webView.loadUrl(betGeniusSource.getUri());
            } catch (Exception e2) {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_STV_PLAYER);
                aVar3.d("error on playBetGeniusSource: " + e2, new Object[0]);
            }
        }
    }

    public final void f() {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        vjd0 vjd0Var = this.d;
        if (vjd0Var != null) {
            LinearLayout linearLayout = vjd0Var.d;
            boolean z = this.z;
            ImageView imageView = vjd0Var.b;
            if (z) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -getChannelsWidth());
                objectAnimatorOfFloat.getClass();
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, "translationX", getChannelsWidth(), 0.0f);
                objectAnimatorOfFloat2.getClass();
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", -getChannelsWidth(), 0.0f);
                objectAnimatorOfFloat.getClass();
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, "translationX", 0.0f, getChannelsWidth());
                objectAnimatorOfFloat2.getClass();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            animatorSet.start();
            this.z = !this.z;
        }
    }

    public final void g() {
        if (getHandler() != null) {
            getHandler().removeCallbacks(this.C);
            getHandler().removeCallbacks(this.D);
        }
        this.w = 0;
        vjd0 vjd0Var = this.d;
        if (vjd0Var != null) {
            getWebViewWrapperService().uninstallJsBridge(vjd0Var.w);
        }
        this.z = true;
        this.y = false;
        this.v = null;
        d dVar = this.e;
        if (dVar != null) {
            dVar.M0();
        }
        d dVar2 = this.e;
        if (dVar2 != null) {
            dVar2.release();
        }
        this.e = null;
        a();
    }

    public final a getCallback() {
        return this.callback;
    }

    public final i0j0 getWebViewWrapperService() {
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var != null) {
            return i0j0Var;
        }
        Intrinsics.n("webViewWrapperService");
        throw null;
    }

    public final void i(String str) {
        vjd0 vjd0Var = this.d;
        if (vjd0Var != null) {
            try {
                vjd0Var.w.loadUrl(str);
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_STV_PLAYER);
                aVar.d("error on webViewLoadUrl: " + e, new Object[0]);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getHandler().removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    public final void setCallback(a aVar) {
        aVar.getClass();
        this.callback = aVar;
    }

    public final void setWebViewWrapperService(i0j0 i0j0Var) {
        i0j0Var.getClass();
        this.webViewWrapperService = i0j0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public STVPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public STVPlayerView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ STVPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
