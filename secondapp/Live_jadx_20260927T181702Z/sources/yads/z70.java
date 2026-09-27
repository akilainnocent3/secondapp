package yads;

import android.widget.ImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k41 f158641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f158642b;

    public z70(d03 d03Var, List list) {
        this.f158641a = d03Var;
        this.f158642b = list;
    }

    public final et a(String str, ImageView imageView) {
        final i41 i41VarA = this.f158641a.a(str, new y70(imageView), 0, 0);
        et etVar = new et() { // from class: yads.se4
            @Override // yads.et
            public final void cancel() {
                z70.a(i41VarA);
            }
        };
        this.f158642b.add(etVar);
        return etVar;
    }

    public static final void a(i41 i41Var) {
        i41Var.a();
    }
}
