package com.sportygames.lobby.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.utils.VerticalViewPager;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.jxa;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportygames/lobby/views/LobbyNotificationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LobbyNotificationView extends ConstraintLayout {
    /* JADX WARN: Illegal instructions before constructor call */
    public LobbyNotificationView(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new jxa();
        this.d = 0;
        this.e = 0;
        this.f = Reader.READ_DONE;
        this.i = Reader.READ_DONE;
        this.v = true;
        this.w = 257;
        this.y = null;
        this.z = null;
        this.A = -1;
        this.B = new HashMap<>();
        this.C = new SparseArray<>();
        this.D = new ConstraintLayout.a(this);
        x(attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.lobby_notification_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i3 = R.id.not_image;
        if (((ImageView) h5e.a(R.id.not_image, viewInflate)) != null) {
            i3 = R.id.notification_layout;
            if (((ConstraintLayout) h5e.a(R.id.notification_layout, viewInflate)) != null) {
                i3 = R.id.notification_list;
                if (((VerticalViewPager) h5e.a(R.id.notification_list, viewInflate)) != null) {
                    i3 = R.id.notification_shimmer;
                    if (((LobbyBannerPlaceHolder) h5e.a(R.id.notification_shimmer, viewInflate)) != null) {
                        return;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyNotificationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyNotificationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyNotificationView(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
