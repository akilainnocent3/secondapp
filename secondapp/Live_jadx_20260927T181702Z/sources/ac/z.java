package ac;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class z<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f4797b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<h, Data> f4798a;

    public z(o<h, Data> oVar) {
        this.f4798a = oVar;
    }

    @Override // ac.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@NonNull Uri uri, int i10, int i11, @NonNull tb.i iVar) {
        return this.f4798a.b(new h(uri.toString()), i10, i11, iVar);
    }

    @Override // ac.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return f4797b.contains(uri.getScheme());
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements p<Uri, InputStream> {
        @Override // ac.p
        @NonNull
        public o<Uri, InputStream> c(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }

        @Override // ac.p
        public void e() {
        }
    }
}
