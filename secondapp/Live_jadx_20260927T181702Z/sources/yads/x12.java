package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f157619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckBox f157620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f157621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f157622d = fr.h0.J();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f157623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f157624f;

    public x12(View view, Map map) {
        this.f157619a = view;
        this.f157623e = fr.n1.J0(map);
    }

    public final Map a() {
        return this.f157623e;
    }

    public final List b() {
        return this.f157622d;
    }

    public final ImageView c() {
        return this.f157624f;
    }

    public final CheckBox d() {
        return this.f157620b;
    }

    public final View e() {
        return this.f157619a;
    }

    public final ProgressBar f() {
        return this.f157621c;
    }
}
