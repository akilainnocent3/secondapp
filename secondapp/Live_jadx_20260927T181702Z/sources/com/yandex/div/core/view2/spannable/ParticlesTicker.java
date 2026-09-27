package com.yandex.div.core.view2.spannable;

import android.view.Choreographer;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ms.u;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ParticlesTicker implements Choreographer.FrameCallback {
    private long lastFrameNs;
    private boolean running;

    @l
    private final TextView view;
    private final Choreographer choreographer = Choreographer.getInstance();

    @l
    private final LinkedHashSet<MaskSpan> spans = new LinkedHashSet<>();

    public ParticlesTicker(@l TextView textView) {
        this.view = textView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        boolean z10;
        if (this.running) {
            if (this.spans.isEmpty() || !this.view.isShown()) {
                stop();
                return;
            }
            long j11 = this.lastFrameNs;
            float fH = j11 != 0 ? u.H((j10 - j11) * 1.0E-9f, 0.0f, 0.05f) : 0.0f;
            this.lastFrameNs = j10;
            Iterator<MaskSpan> it = this.spans.iterator();
            loop0: while (true) {
                z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    MaskSpan next = it.next();
                    if (!next.isAlive$div_release()) {
                        it.remove();
                    } else if (next.onFrame$div_release(fH) || z10) {
                        z10 = true;
                    }
                }
            }
            if (this.spans.isEmpty() || !z10) {
                stop();
            } else {
                this.view.postInvalidateOnAnimation();
                this.choreographer.postFrameCallback(this);
            }
        }
    }

    public final void resumeIfNeeded() {
        if (this.running || this.spans.isEmpty() || !this.view.isShown()) {
            return;
        }
        this.running = true;
        this.lastFrameNs = 0L;
        this.choreographer.postFrameCallback(this);
    }

    public final void stop() {
        if (this.running) {
            this.running = false;
            this.choreographer.removeFrameCallback(this);
        }
    }

    public final void track(@l MaskSpan maskSpan) {
        this.spans.add(maskSpan);
        resumeIfNeeded();
    }

    public final void untrack(@l MaskSpan maskSpan) {
        this.spans.remove(maskSpan);
        if (this.spans.isEmpty()) {
            stop();
        }
    }
}
