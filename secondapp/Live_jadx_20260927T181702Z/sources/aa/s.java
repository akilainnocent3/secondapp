package aa;

import android.os.Handler;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.d
public abstract class s {
    @y0({y0.a.LIBRARY})
    public s() {
    }

    public abstract void a();

    @NonNull
    @t0(23)
    @y0({y0.a.LIBRARY})
    public abstract WebMessagePort b();

    @NonNull
    @y0({y0.a.LIBRARY})
    public abstract InvocationHandler c();

    public abstract void d(@NonNull r rVar);

    public abstract void e(@NonNull a aVar);

    public abstract void f(@Nullable Handler handler, @NonNull a aVar);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {
        public void a(@NonNull s sVar, @Nullable r rVar) {
        }
    }
}
