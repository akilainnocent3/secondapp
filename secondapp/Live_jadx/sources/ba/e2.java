package ba;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebResourceRequestBoundaryInterface f20916a;

    public e2(@NonNull WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f20916a = webResourceRequestBoundaryInterface;
    }

    public boolean a() {
        return this.f20916a.isRedirect();
    }
}
