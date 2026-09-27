package u2;

import dr.w2;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface l0<T> {
    T getDefaultValue();

    @oy.m
    Object readFrom(@oy.l InputStream inputStream, @oy.l or.f<? super T> fVar);

    @oy.m
    Object writeTo(T t10, @oy.l OutputStream outputStream, @oy.l or.f<? super w2> fVar);
}
