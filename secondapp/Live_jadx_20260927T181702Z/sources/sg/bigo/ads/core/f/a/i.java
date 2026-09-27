package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Node f134836a;

    public i(@NonNull Node node) {
        this.f134836a = node;
    }

    public final String a() {
        return sg.bigo.ads.core.f.a.e(this.f134836a, "type");
    }

    public final String b() {
        return sg.bigo.ads.core.f.a.b(this.f134836a);
    }

    public final int c() {
        return sg.bigo.ads.core.f.a.d(this.f134836a, "fileSize").intValue();
    }

    public final int d() {
        return sg.bigo.ads.core.f.a.d(this.f134836a, "bitrate").intValue();
    }

    public final String e() {
        return sg.bigo.ads.core.f.a.e(this.f134836a, "md5");
    }
}
