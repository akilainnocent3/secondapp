package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.yandex.div.R;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TabItemLayout extends LinearLayout {
    /* JADX WARN: Multi-variable type inference failed */
    @cs.k
    public TabItemLayout(@l Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    @cs.k
    public TabItemLayout(@l Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(R.id.div_tabbed_tab_title_item);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(0);
    }

    public /* synthetic */ TabItemLayout(Context context, AttributeSet attributeSet, int i10, x xVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
