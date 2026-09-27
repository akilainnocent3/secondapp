package q5;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import q5.z;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class a0<T extends z<T>> implements z5.v.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5.v.a<? extends T> f121583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<StreamKey> f121584b;

    public a0(z5.v.a<? extends T> aVar, @Nullable List<StreamKey> list) {
        this.f121583a = aVar;
        this.f121584b = list;
    }

    @Override // z5.v.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t10 = this.f121583a.parse(uri, inputStream);
        List<StreamKey> list = this.f121584b;
        return (list == null || list.isEmpty()) ? t10 : (T) t10.copy(this.f121584b);
    }
}
