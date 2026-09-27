package com.cleveradssolutions.sdk.nativead;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface c {
    @m
    CASChoicesView getAdChoicesView();

    @m
    TextView getAdLabelView();

    @m
    TextView getAdvertiserView();

    @m
    TextView getBodyView();

    @m
    Button getCallToActionView();

    @l
    ArrayList<View> getClickableViews();

    @m
    TextView getHeadlineView();

    @m
    ImageView getIconView();

    @m
    CASMediaView getMediaView();

    @m
    TextView getPriceView();

    @m
    TextView getReviewCountView();

    @m
    View getStarRatingView();

    @m
    TextView getStoreView();

    void setAdChoicesView(@m CASChoicesView cASChoicesView);
}
