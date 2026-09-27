package ea;

import android.app.Activity;
import androidx.window.embedding.EmbeddingRule;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@da.d
public interface i {
    void a(@oy.l Set<? extends EmbeddingRule> set);

    @oy.l
    Set<EmbeddingRule> b();

    boolean c();

    void d(@oy.l EmbeddingRule embeddingRule);

    void e(@oy.l e2.e<List<r>> eVar);

    void f(@oy.l EmbeddingRule embeddingRule);

    void g(@oy.l Activity activity, @oy.l Executor executor, @oy.l e2.e<List<r>> eVar);
}
