package com.sportygames.piggybash.presentation.component;

import android.content.Context;
import android.view.Choreographer;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportygames/piggybash/presentation/component/StableFrameSpineView;", "Lcom/esotericsoftware/spine/android/SpineView;", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StableFrameSpineView extends SpineView {
    public long G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableFrameSpineView(Context context, b bVar) {
        super(context, bVar);
        bVar.getClass();
        this.G = Long.MIN_VALUE;
    }

    @Override // com.esotericsoftware.spine.android.SpineView, android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.G == j) {
            return;
        }
        this.G = j;
        super.doFrame(j);
    }

    @Override // com.esotericsoftware.spine.android.SpineView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Choreographer.getInstance().postFrameCallback(this);
    }
}
