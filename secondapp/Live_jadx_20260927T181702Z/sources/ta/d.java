package ta;

import androidx.annotation.NonNull;
import androidx.work.t;
import java.util.Collections;
import java.util.List;
import k.y0;
import nj.t1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    @y0({y0.a.LIBRARY_GROUP})
    public d() {
    }

    @NonNull
    public static d a(@NonNull List<d> continuations) {
        return continuations.get(0).b(continuations);
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public abstract d b(@NonNull List<d> continuations);

    @NonNull
    public abstract t1<Void> c();

    @NonNull
    public final d d(@NonNull t work) {
        return e(Collections.singletonList(work));
    }

    @NonNull
    public abstract d e(@NonNull List<t> work);
}
