package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r12 implements hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckBox f154710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f154711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f154712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f154713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q22 f154714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f154715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f154716g;

    public r12(q12 q12Var) {
        this.f154710a = q12Var.d();
        this.f154711b = q12Var.g();
        this.f154712c = q12Var.e();
        this.f154713d = q12Var.a();
        this.f154714e = q12Var.f();
        this.f154715f = q12Var.b();
        this.f154716g = q12Var.c();
    }

    @Override // yads.hj
    public final View getAssetView(String str) {
        return (View) this.f154713d.get("close_button");
    }

    @Override // yads.hj
    public final Map getAssetViews() {
        return this.f154713d;
    }
}
