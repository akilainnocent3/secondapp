package f6;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class i0 implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f83494b;

    public i0(a0 a0Var) {
        this.f83494b = a0Var;
    }

    @Override // f6.a0
    public a0 a(int i10) {
        return this.f83494b.a(i10);
    }

    @Override // f6.a0
    public a0 b(c7.s.a aVar) {
        return this.f83494b.b(aVar);
    }

    @Override // f6.a0
    public a0 c(boolean z10) {
        return this.f83494b.c(z10);
    }

    @Override // f6.a0
    public u[] createExtractors() {
        return this.f83494b.createExtractors();
    }

    @Override // f6.a0
    public u[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return this.f83494b.createExtractors(uri, map);
    }
}
