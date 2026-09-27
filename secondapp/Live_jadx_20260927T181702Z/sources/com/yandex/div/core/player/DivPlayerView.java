package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.div.R;
import kotlin.jvm.internal.x;
import mq.dq;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.divImageStyle : i10);
    }

    @Override // com.yandex.div.core.player.DivVideoAttachable
    public /* synthetic */ void attach(DivPlayer divPlayer) {
        d.a(this, divPlayer);
    }

    @Override // com.yandex.div.core.player.DivVideoAttachable
    public /* synthetic */ void detach() {
        d.b(this);
    }

    @Override // com.yandex.div.core.player.DivVideoAttachable
    public /* synthetic */ DivPlayer getAttachedPlayer() {
        return d.c(this);
    }

    @Override // com.yandex.div.core.player.DivVideoAttachable
    public /* synthetic */ void setScale(dq dqVar) {
        d.d(this, dqVar);
    }

    @Override // com.yandex.div.core.player.DivVideoAttachable
    public /* synthetic */ void setVisibleOnScreen(boolean z10) {
        d.e(this, z10);
    }

    public DivPlayerView(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
