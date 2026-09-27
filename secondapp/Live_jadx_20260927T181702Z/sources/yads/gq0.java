package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class gq0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd3 f149741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a53 f149742b;

    public gq0(@oy.l Context context) {
        super(context);
    }

    @oy.m
    public final wd3 getAdUiElements() {
        return this.f149741a;
    }

    @oy.m
    public final a53 getPlayerView() {
        return this.f149742b;
    }

    public final void setAdUiElements(@oy.m wd3 wd3Var) {
        this.f149741a = wd3Var;
    }

    public final void setPlayerView(@oy.m a53 a53Var) {
        this.f149742b = a53Var;
    }

    public gq0(@oy.l Context context, @oy.m AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public gq0(@oy.l Context context, @oy.m AttributeSet attributeSet, @k.f int i10) {
        super(context, attributeSet, i10);
    }

    public gq0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
