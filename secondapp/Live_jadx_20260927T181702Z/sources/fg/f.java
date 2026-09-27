package fg;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<Uri, byte[]> f83984a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends LinkedHashMap<Uri, byte[]> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f83985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f83985b = i11;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f83985b;
        }
    }

    public f(int i10) {
        this.f83984a = new a(i10 + 1, 1.0f, false, i10);
    }

    public boolean a(Uri uri) {
        return this.f83984a.containsKey(eh.a.g(uri));
    }

    @Nullable
    public byte[] b(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f83984a.get(uri);
    }

    @Nullable
    public byte[] c(Uri uri, byte[] bArr) {
        return this.f83984a.put((Uri) eh.a.g(uri), (byte[]) eh.a.g(bArr));
    }

    @Nullable
    public byte[] d(Uri uri) {
        return this.f83984a.remove(eh.a.g(uri));
    }
}
