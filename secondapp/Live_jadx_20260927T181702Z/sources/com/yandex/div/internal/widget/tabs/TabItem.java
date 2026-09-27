package com.yandex.div.internal.widget.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.l2;
import com.yandex.div.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"RestrictedApi"})
class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l2 l2VarF = l2.F(context, attributeSet, R.styleable.TabItem);
        this.text = l2VarF.x(R.styleable.TabItem_android_text);
        this.icon = l2VarF.h(R.styleable.TabItem_android_icon);
        this.customLayout = l2VarF.u(R.styleable.TabItem_android_layout, 0);
        l2VarF.I();
    }
}
