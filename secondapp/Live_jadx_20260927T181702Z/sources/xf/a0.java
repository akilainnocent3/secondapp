package xf;

import ah.x0;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import xf.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a0<T extends z<T>> implements x0.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.a<? extends T> f144879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<StreamKey> f144880b;

    public a0(x0.a<? extends T> aVar, @Nullable List<StreamKey> list) {
        this.f144879a = aVar;
        this.f144880b = list;
    }

    @Override // ah.x0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t10 = this.f144879a.parse(uri, inputStream);
        List<StreamKey> list = this.f144880b;
        return (list == null || list.isEmpty()) ? t10 : (T) t10.copy(this.f144880b);
    }
}
