package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f154226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q22 f154227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckBox f154228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f154229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f154230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f154231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f154232g = fr.h0.J();

    public q12(View view, q22 q22Var, Map map) {
        this.f154226a = view;
        this.f154227b = q22Var;
        this.f154230e = fr.n1.J0(map);
    }

    public final Map a() {
        return this.f154230e;
    }

    public final List b() {
        return this.f154232g;
    }

    public final ImageView c() {
        return this.f154231f;
    }

    public final CheckBox d() {
        return this.f154228c;
    }

    public final View e() {
        return this.f154226a;
    }

    public final q22 f() {
        return this.f154227b;
    }

    public final ProgressBar g() {
        return this.f154229d;
    }
}
