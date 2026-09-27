package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f12249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SearchOrbView.a f12250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SearchOrbView.a f12251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12253x;

    public SpeechOrbView(Context context) {
        this(context, null);
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return s3.a.j.f128824d0;
    }

    public void i() {
        setOrbColors(this.f12250u);
        setOrbIcon(getResources().getDrawable(s3.a.f.B));
        c(true);
        d(false);
        e(1.0f);
        this.f12252w = 0;
        this.f12253x = true;
    }

    public void j() {
        setOrbColors(this.f12251v);
        setOrbIcon(getResources().getDrawable(s3.a.f.C));
        c(hasFocus());
        e(1.0f);
        this.f12253x = false;
    }

    public void setListeningOrbColors(SearchOrbView.a aVar) {
        this.f12250u = aVar;
    }

    public void setNotListeningOrbColors(SearchOrbView.a aVar) {
        this.f12251v = aVar;
    }

    public void setSoundLevel(int i10) {
        if (this.f12253x) {
            int i11 = this.f12252w;
            if (i10 > i11) {
                this.f12252w = i11 + ((i10 - i11) / 2);
            } else {
                this.f12252w = (int) (i11 * 0.7f);
            }
            e((((this.f12249t - getFocusedZoom()) * this.f12252w) / 100.0f) + 1.0f);
        }
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12252w = 0;
        this.f12253x = false;
        Resources resources = context.getResources();
        this.f12249t = resources.getFraction(s3.a.g.f128687g, 1, 1);
        this.f12251v = new SearchOrbView.a(resources.getColor(s3.a.d.U), resources.getColor(s3.a.d.W), resources.getColor(s3.a.d.V));
        this.f12250u = new SearchOrbView.a(resources.getColor(s3.a.d.X), resources.getColor(s3.a.d.X), 0);
        j();
    }
}
