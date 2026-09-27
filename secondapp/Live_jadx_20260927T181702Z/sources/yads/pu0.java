package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f154130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f154131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f154132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l12 f154133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz1 f154134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ou0 f154135f;

    public pu0(d4 d4Var, lu2 lu2Var, lv lvVar, l12 l12Var, uz1 uz1Var, ou0 ou0Var) {
        this.f154130a = d4Var;
        this.f154131b = lu2Var;
        this.f154132c = lvVar;
        this.f154133d = l12Var;
        this.f154134e = uz1Var;
        this.f154135f = ou0Var;
    }

    public final void a(Context context, gu0 gu0Var) {
        View viewA = this.f154133d.f151835c.a("feedback");
        ImageView imageView = viewA instanceof ImageView ? (ImageView) viewA : null;
        if (imageView == null) {
            return;
        }
        List list = gu0Var.f149783b;
        if (list.isEmpty()) {
            return;
        }
        try {
            za zaVar = new za(context, this.f154131b, this.f154130a);
            this.f154135f.getClass();
            PopupMenu popupMenuA = ou0.a(context, imageView, list);
            popupMenuA.setOnMenuItemClickListener(new dg2(zaVar, list, this.f154132c, this.f154134e));
            popupMenuA.show();
        } catch (Exception e10) {
            boolean z10 = ad1.f146762a;
            ((iu3) this.f154131b).a().reportError("Failed to render feedback", e10);
        }
    }
}
