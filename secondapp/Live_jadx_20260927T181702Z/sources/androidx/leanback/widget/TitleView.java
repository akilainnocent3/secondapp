package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class TitleView extends FrameLayout implements b3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f12262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f12263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SearchOrbView f12264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b3 f12267g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends b3 {
        public a() {
        }

        @Override // androidx.leanback.widget.b3
        public Drawable a() {
            return TitleView.this.getBadgeDrawable();
        }

        @Override // androidx.leanback.widget.b3
        public SearchOrbView.a b() {
            return TitleView.this.getSearchAffordanceColors();
        }

        @Override // androidx.leanback.widget.b3
        public View c() {
            return TitleView.this.getSearchAffordanceView();
        }

        @Override // androidx.leanback.widget.b3
        public CharSequence d() {
            return TitleView.this.getTitle();
        }

        @Override // androidx.leanback.widget.b3
        public void e(boolean z10) {
            TitleView.this.a(z10);
        }

        @Override // androidx.leanback.widget.b3
        public void f(Drawable drawable) {
            TitleView.this.setBadgeDrawable(drawable);
        }

        @Override // androidx.leanback.widget.b3
        public void g(View.OnClickListener onClickListener) {
            TitleView.this.setOnSearchClickedListener(onClickListener);
        }

        @Override // androidx.leanback.widget.b3
        public void h(SearchOrbView.a aVar) {
            TitleView.this.setSearchAffordanceColors(aVar);
        }

        @Override // androidx.leanback.widget.b3
        public void i(CharSequence charSequence) {
            TitleView.this.setTitle(charSequence);
        }

        @Override // androidx.leanback.widget.b3
        public void j(int i10) {
            TitleView.this.c(i10);
        }
    }

    public TitleView(Context context) {
        this(context, null);
    }

    public void a(boolean z10) {
        SearchOrbView searchOrbView = this.f12264d;
        searchOrbView.d(z10 && searchOrbView.hasFocus());
    }

    public final void b() {
        if (this.f12262b.getDrawable() != null) {
            this.f12262b.setVisibility(0);
            this.f12263c.setVisibility(8);
        } else {
            this.f12262b.setVisibility(8);
            this.f12263c.setVisibility(0);
        }
    }

    public void c(int i10) {
        this.f12265e = i10;
        if ((i10 & 2) == 2) {
            b();
        } else {
            this.f12262b.setVisibility(8);
            this.f12263c.setVisibility(8);
        }
        d();
    }

    public final void d() {
        int i10 = 4;
        if (this.f12266f && (this.f12265e & 4) == 4) {
            i10 = 0;
        }
        this.f12264d.setVisibility(i10);
    }

    public Drawable getBadgeDrawable() {
        return this.f12262b.getDrawable();
    }

    public SearchOrbView.a getSearchAffordanceColors() {
        return this.f12264d.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f12264d;
    }

    public CharSequence getTitle() {
        return this.f12263c.getText();
    }

    @Override // androidx.leanback.widget.b3.a
    public b3 getTitleViewAdapter() {
        return this.f12267g;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f12262b.setImageDrawable(drawable);
        b();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.f12266f = onClickListener != null;
        this.f12264d.setOnOrbClickedListener(onClickListener);
        d();
    }

    public void setSearchAffordanceColors(SearchOrbView.a aVar) {
        this.f12264d.setOrbColors(aVar);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12263c.setText(charSequence);
        b();
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s3.a.c.f128455p);
    }

    public TitleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12265e = 6;
        this.f12266f = false;
        this.f12267g = new a();
        View viewInflate = LayoutInflater.from(context).inflate(s3.a.j.f128826e0, this);
        this.f12262b = (ImageView) viewInflate.findViewById(s3.a.h.f128746n2);
        this.f12263c = (TextView) viewInflate.findViewById(s3.a.h.f128754p2);
        this.f12264d = (SearchOrbView) viewInflate.findViewById(s3.a.h.f128750o2);
        setClipToPadding(false);
        setClipChildren(false);
    }
}
