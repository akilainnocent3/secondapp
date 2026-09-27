package s5;

import android.net.Uri;
import cj.v6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public class k2 extends u4.p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f129284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v6<f6.a1> f129285e;

    @qj.m(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(message, uri, ImmutableList.of())")
    @Deprecated
    public k2(String str, Uri uri) {
        this(str, uri, v6.z());
    }

    @Override // u4.p1, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.f129285e.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + this.f129285e;
    }

    public k2(String str, Uri uri, List<? extends f6.a1> list) {
        super(str, null, false, 1);
        this.f129284d = uri;
        this.f129285e = v6.u(list);
    }
}
