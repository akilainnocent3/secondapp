package androidx.leanback.app;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.SearchOrbView;
import androidx.leanback.widget.a3;
import androidx.leanback.widget.b3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class g extends Fragment {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f11389k = "titleShow";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11390b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f11391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f11392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f11393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b3 f11394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SearchOrbView.a f11395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f11397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a3 f11398j;

    public Drawable a() {
        return this.f11392d;
    }

    public int b() {
        return c().f12231a;
    }

    public SearchOrbView.a c() {
        if (this.f11396h) {
            return this.f11395g;
        }
        b3 b3Var = this.f11394f;
        if (b3Var != null) {
            return b3Var.b();
        }
        throw new IllegalStateException("Fragment views not yet created");
    }

    public CharSequence d() {
        return this.f11391c;
    }

    public a3 e() {
        return this.f11398j;
    }

    public View f() {
        return this.f11393e;
    }

    public b3 g() {
        return this.f11394f;
    }

    public void h(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewJ = j(layoutInflater, viewGroup, bundle);
        if (viewJ == null) {
            p(null);
        } else {
            viewGroup.addView(viewJ);
            p(viewJ.findViewById(s3.a.h.f128782x));
        }
    }

    public final boolean i() {
        return this.f11390b;
    }

    public View j(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        return layoutInflater.inflate((viewGroup == null || !viewGroup.getContext().getTheme().resolveAttribute(s3.a.c.f128451o, typedValue, true)) ? s3.a.j.f128825e : typedValue.resourceId, viewGroup, false);
    }

    public void k(Drawable drawable) {
        if (this.f11392d != drawable) {
            this.f11392d = drawable;
            b3 b3Var = this.f11394f;
            if (b3Var != null) {
                b3Var.f(drawable);
            }
        }
    }

    public void l(View.OnClickListener onClickListener) {
        this.f11397i = onClickListener;
        b3 b3Var = this.f11394f;
        if (b3Var != null) {
            b3Var.g(onClickListener);
        }
    }

    public void m(int i10) {
        n(new SearchOrbView.a(i10));
    }

    public void n(SearchOrbView.a aVar) {
        this.f11395g = aVar;
        this.f11396h = true;
        b3 b3Var = this.f11394f;
        if (b3Var != null) {
            b3Var.h(aVar);
        }
    }

    public void o(CharSequence charSequence) {
        this.f11391c = charSequence;
        b3 b3Var = this.f11394f;
        if (b3Var != null) {
            b3Var.i(charSequence);
        }
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f11398j = null;
        this.f11393e = null;
        this.f11394f = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        b3 b3Var = this.f11394f;
        if (b3Var != null) {
            b3Var.e(false);
        }
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b3 b3Var = this.f11394f;
        if (b3Var != null) {
            b3Var.e(true);
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("titleShow", this.f11390b);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f11394f != null) {
            r(this.f11390b);
            this.f11394f.e(true);
        }
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f11390b = bundle.getBoolean("titleShow");
        }
        View view2 = this.f11393e;
        if (view2 == null || !(view instanceof ViewGroup)) {
            return;
        }
        a3 a3Var = new a3((ViewGroup) view, view2);
        this.f11398j = a3Var;
        a3Var.e(this.f11390b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(View view) {
        this.f11393e = view;
        if (view == 0) {
            this.f11394f = null;
            this.f11398j = null;
            return;
        }
        b3 titleViewAdapter = ((b3.a) view).getTitleViewAdapter();
        this.f11394f = titleViewAdapter;
        titleViewAdapter.i(this.f11391c);
        this.f11394f.f(this.f11392d);
        if (this.f11396h) {
            this.f11394f.h(this.f11395g);
        }
        View.OnClickListener onClickListener = this.f11397i;
        if (onClickListener != null) {
            l(onClickListener);
        }
        if (getView() instanceof ViewGroup) {
            this.f11398j = new a3((ViewGroup) getView(), this.f11393e);
        }
    }

    public void q(int i10) {
        b3 b3Var = this.f11394f;
        if (b3Var != null) {
            b3Var.j(i10);
        }
        r(true);
    }

    public void r(boolean z10) {
        if (z10 == this.f11390b) {
            return;
        }
        this.f11390b = z10;
        a3 a3Var = this.f11398j;
        if (a3Var != null) {
            a3Var.e(z10);
        }
    }
}
