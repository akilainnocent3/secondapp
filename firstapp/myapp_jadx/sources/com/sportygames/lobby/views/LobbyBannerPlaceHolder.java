package com.sportygames.lobby.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.f0t;
import defpackage.h5e;
import defpackage.tk30;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sportygames/lobby/views/LobbyBannerPlaceHolder;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "typedArray", "", "setThemeAttribute", "(Landroid/content/res/TypedArray;)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LobbyBannerPlaceHolder extends ConstraintLayout {
    public final f0t F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LobbyBannerPlaceHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.lobby_banner_place_holder, (ViewGroup) this, false);
        addView(viewInflate);
        CardView cardView = (CardView) h5e.a(R.id.shimmer_card, viewInflate);
        if (cardView == null) {
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.shimmer_card)));
            throw null;
        }
        this.F = new f0t((ConstraintLayout) viewInflate, cardView);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.j);
            typedArrayObtainStyledAttributes.getClass();
            setThemeAttribute(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void setThemeAttribute(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(0, R.color.shimmer_black_light);
        f0t f0tVar = this.F;
        if (f0tVar != null) {
            f0tVar.b.setBackgroundResource(resourceId);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyBannerPlaceHolder(Context context) {
        this(context, null);
        context.getClass();
    }
}
