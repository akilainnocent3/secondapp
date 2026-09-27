package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName() + "WithResault";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ImageView f68392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected TextView f68393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected TextView f68394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected StarLevelLayoutView f68395m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullscreen_top", "layout"), this.f68388i);
        if (viewInflate != null) {
            this.f68392j = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f68393k = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f68394l = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f68395m = (StarLevelLayoutView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f68394l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f68394l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f68392j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f68393k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f68395m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f68380a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f68381b.setLayoutParams(layoutParams2);
    }
}
