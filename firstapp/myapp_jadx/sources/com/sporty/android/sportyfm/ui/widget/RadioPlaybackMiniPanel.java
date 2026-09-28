package com.sporty.android.sportyfm.ui.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.sporty.android.sportyfm.service.RadioService;
import com.sporty.android.sportyfm.ui.widget.RadioPlaybackMiniPanel;
import com.sportybet.android.gp.tz.R;
import defpackage.an80;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.itf0;
import defpackage.so10;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/sportyfm/ui/widget/RadioPlaybackMiniPanel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "", "", "listener", "setOnPlayPauseToggleClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", "url", "setStreamURL", "(Ljava/lang/String;)V", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RadioPlaybackMiniPanel extends ConstraintLayout {
    public static final /* synthetic */ int M = 0;
    public final AtomicBoolean F;
    public String G;
    public final an80 H;
    public RadioService.a I;
    public Function1<? super Boolean, Unit> J;
    public final a K;
    public final b L;

    public static final class a implements so10.c {
        public a() {
        }

        @Override // so10.c
        public final void Q(int i, boolean z) {
            itf0.a aVar = itf0.a;
            aVar.q("com.sporty.sportyfm");
            aVar.a("onPlayWhenReadyChanged, playWhenReady: " + z + ", reason: " + i, new Object[0]);
            int i2 = RadioPlaybackMiniPanel.M;
            RadioPlaybackMiniPanel.this.H.b.setSelected(z);
        }

        @Override // so10.c
        public final void j0(boolean z) {
            itf0.a aVar = itf0.a;
            aVar.q("com.sporty.sportyfm");
            aVar.a("onIsPlayingChanged, isPlaying : " + z, new Object[0]);
            int i = z ? 3 : 1;
            int i2 = RadioPlaybackMiniPanel.M;
            RadioPlaybackMiniPanel radioPlaybackMiniPanel = RadioPlaybackMiniPanel.this;
            radioPlaybackMiniPanel.E(i);
            radioPlaybackMiniPanel.H.b.setSelected(z);
        }

        @Override // so10.c
        public final void q(int i) {
            itf0.a aVar = itf0.a;
            aVar.q("com.sporty.sportyfm");
            aVar.a("onPlayerStateChanged, playbackState: " + i, new Object[0]);
            int i2 = RadioPlaybackMiniPanel.M;
            RadioPlaybackMiniPanel.this.E(i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            itf0.a aVar = itf0.a;
            aVar.q("com.sporty.sportyfm");
            aVar.a("onServiceConnected", new Object[0]);
            iBinder.getClass();
            RadioService.a aVar2 = (RadioService.a) iBinder;
            RadioPlaybackMiniPanel radioPlaybackMiniPanel = RadioPlaybackMiniPanel.this;
            radioPlaybackMiniPanel.I = aVar2;
            d dVarA = aVar2.a();
            if (dVarA != null) {
                dVarA.D(radioPlaybackMiniPanel.K);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            itf0.a aVar = itf0.a;
            aVar.q("com.sporty.sportyfm");
            aVar.a("onServiceDisconnected", new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioPlaybackMiniPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.F = new AtomicBoolean(false);
        LayoutInflater.from(context).inflate(R.layout.sfm_view_play_back_mini_panel, this);
        int i2 = R.id.icon_fm_logo;
        if (((AppCompatImageView) h5e.a(R.id.icon_fm_logo, this)) != null) {
            i2 = R.id.label_sporty_fm;
            if (((TextView) h5e.a(R.id.label_sporty_fm, this)) != null) {
                i2 = R.id.left_guideline;
                if (((Guideline) h5e.a(R.id.left_guideline, this)) != null) {
                    i2 = R.id.play_btn;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.play_btn, this);
                    if (appCompatImageView != null) {
                        i2 = R.id.player_status;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.player_status, this);
                        if (appCompatImageView2 != null) {
                            this.H = new an80(this, appCompatImageView, appCompatImageView2);
                            this.K = new a();
                            this.L = new b();
                            setBackgroundResource(R.drawable.sfm_bg_boarder_sporty_green);
                            setOnClickListener(new View.OnClickListener() { // from class: dv30
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    d dVarA;
                                    d dVarA2;
                                    RadioPlaybackMiniPanel radioPlaybackMiniPanel = this.a;
                                    RadioService.a aVar = radioPlaybackMiniPanel.I;
                                    if (aVar == null || (dVarA = aVar.a()) == null) {
                                        return;
                                    }
                                    boolean z = !dVarA.Q();
                                    Function1<? super Boolean, Unit> function1 = radioPlaybackMiniPanel.J;
                                    if (function1 != null) {
                                        function1.invoke(Boolean.valueOf(z));
                                    }
                                    if (dVarA.Q()) {
                                        dVarA.n(false);
                                        return;
                                    }
                                    String str = radioPlaybackMiniPanel.G;
                                    if (str == null) {
                                        Intrinsics.n("streamURL");
                                        throw null;
                                    }
                                    radioPlaybackMiniPanel.G = str;
                                    RadioService.a aVar2 = radioPlaybackMiniPanel.I;
                                    if (aVar2 == null || (dVarA2 = aVar2.a()) == null) {
                                        return;
                                    }
                                    dVarA2.I0(new HlsMediaSource.Factory(new idd.a()).e(njv.a(Uri.parse(str))));
                                    dVarA2.d();
                                    dVarA2.n(true);
                                }
                            });
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void E(int i) {
        an80 an80Var = this.H;
        if (i != 1) {
            if (i == 2) {
                an80Var.b.setSelected(true);
                com.bumptech.glide.a.d(getContext()).o(Integer.valueOf(R.raw.sfm_gif_sound_loading_green)).M(an80Var.c);
                return;
            } else if (i == 3) {
                an80Var.b.setSelected(true);
                com.bumptech.glide.a.d(getContext()).o(Integer.valueOf(R.raw.sfm_gif_sound_green)).M(an80Var.c);
                return;
            } else if (i != 4) {
                return;
            }
        }
        an80Var.b.setSelected(false);
        com.bumptech.glide.a.d(getContext()).o(Integer.valueOf(R.drawable.sfm_ic_sound_wave_off)).M(an80Var.c);
    }

    public final void setOnPlayPauseToggleClickListener(Function1<? super Boolean, Unit> listener) {
        this.J = listener;
    }

    public final void setStreamURL(String url) {
        url.getClass();
        this.G = url;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioPlaybackMiniPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioPlaybackMiniPanel(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ RadioPlaybackMiniPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
