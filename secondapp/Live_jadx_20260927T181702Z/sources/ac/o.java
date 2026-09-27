package ac;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface o<Model, Data> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tb.f f4748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<tb.f> f4749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f4750c;

        public a(@NonNull tb.f fVar, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this(fVar, Collections.EMPTY_LIST, dVar);
        }

        public a(@NonNull tb.f fVar, @NonNull List<tb.f> list, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this.f4748a = (tb.f) pc.m.e(fVar);
            this.f4749b = (List) pc.m.e(list);
            this.f4750c = (com.bumptech.glide.load.data.d) pc.m.e(dVar);
        }
    }

    boolean a(@NonNull Model model);

    @Nullable
    a<Data> b(@NonNull Model model, int i10, int i11, @NonNull tb.i iVar);
}
