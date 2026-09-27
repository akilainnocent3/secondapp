package androidx.leanback.app;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.SearchOrbView;
import androidx.leanback.widget.a3;
import androidx.leanback.widget.b3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class h extends Fragment {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f11428k = "titleShow";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11429b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f11430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f11431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f11432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b3 f11433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SearchOrbView.a f11434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f11436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a3 f11437j;

    public void A(SearchOrbView.a aVar) {
        this.f11434g = aVar;
        this.f11435h = true;
        b3 b3Var = this.f11433f;
        if (b3Var != null) {
            b3Var.h(aVar);
        }
    }

    public void B(CharSequence charSequence) {
        this.f11430c = charSequence;
        b3 b3Var = this.f11433f;
        if (b3Var != null) {
            b3Var.i(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C(View view) {
        this.f11432e = view;
        if (view == 0) {
            this.f11433f = null;
            this.f11437j = null;
            return;
        }
        b3 titleViewAdapter = ((b3.a) view).getTitleViewAdapter();
        this.f11433f = titleViewAdapter;
        titleViewAdapter.i(this.f11430c);
        this.f11433f.f(this.f11431d);
        if (this.f11435h) {
            this.f11433f.h(this.f11434g);
        }
        View.OnClickListener onClickListener = this.f11436i;
        if (onClickListener != null) {
            y(onClickListener);
        }
        if (getView() instanceof ViewGroup) {
            this.f11437j = new a3((ViewGroup) getView(), this.f11432e);
        }
    }

    public void D(int i10) {
        b3 b3Var = this.f11433f;
        if (b3Var != null) {
            b3Var.j(i10);
        }
        E(true);
    }

    public void E(boolean z10) {
        if (z10 == this.f11429b) {
            return;
        }
        this.f11429b = z10;
        a3 a3Var = this.f11437j;
        if (a3Var != null) {
            a3Var.e(z10);
        }
    }

    public Drawable n() {
        return this.f11431d;
    }

    public int o() {
        return p().f12231a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f11437j = null;
        this.f11432e = null;
        this.f11433f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        b3 b3Var = this.f11433f;
        if (b3Var != null) {
            b3Var.e(false);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        b3 b3Var = this.f11433f;
        if (b3Var != null) {
            b3Var.e(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("titleShow", this.f11429b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f11433f != null) {
            E(this.f11429b);
            this.f11433f.e(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f11429b = bundle.getBoolean("titleShow");
        }
        View view2 = this.f11432e;
        if (view2 == null || !(view instanceof ViewGroup)) {
            return;
        }
        a3 a3Var = new a3((ViewGroup) view, view2);
        this.f11437j = a3Var;
        a3Var.e(this.f11429b);
    }

    public SearchOrbView.a p() {
        if (this.f11435h) {
            return this.f11434g;
        }
        b3 b3Var = this.f11433f;
        if (b3Var != null) {
            return b3Var.b();
        }
        throw new IllegalStateException("Fragment views not yet created");
    }

    public CharSequence q() {
        return this.f11430c;
    }

    public a3 r() {
        return this.f11437j;
    }

    public View s() {
        return this.f11432e;
    }

    public b3 t() {
        return this.f11433f;
    }

    public void u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewW = w(layoutInflater, viewGroup, bundle);
        if (viewW == null) {
            C(null);
        } else {
            viewGroup.addView(viewW);
            C(viewW.findViewById(s3.a.h.f128782x));
        }
    }

    public final boolean v() {
        return this.f11429b;
    }

    public View w(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        return layoutInflater.inflate((viewGroup == null || !viewGroup.getContext().getTheme().resolveAttribute(s3.a.c.f128451o, typedValue, true)) ? s3.a.j.f128825e : typedValue.resourceId, viewGroup, false);
    }

    public void x(Drawable drawable) {
        if (this.f11431d != drawable) {
            this.f11431d = drawable;
            b3 b3Var = this.f11433f;
            if (b3Var != null) {
                b3Var.f(drawable);
            }
        }
    }

    public void y(View.OnClickListener onClickListener) {
        this.f11436i = onClickListener;
        b3 b3Var = this.f11433f;
        if (b3Var != null) {
            b3Var.g(onClickListener);
        }
    }

    public void z(int i10) {
        A(new SearchOrbView.a(i10));
    }
}
