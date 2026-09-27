package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected RelativeLayout f68380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected RelativeLayout f68381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RelativeLayout f68382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f68383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TextView f68384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ProgressBar f68385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected FrameLayout f68386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected LinearLayout f68387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RelativeLayout f68388i;
    public a style;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f68388i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f68380a = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f68381b = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f68382c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f68383d = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f68384e = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f68385f = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f68386g = (FrameLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f68387h = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f68382c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f68383d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f68385f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f68380a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f68381b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f68384e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f68386g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f68387h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
