package ea;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements ActivityEmbeddingComponent {
    public void a(@oy.l Set<EmbeddingRule> splitRules) {
        m0.p(splitRules, "splitRules");
    }

    public void b(@oy.l Consumer<List<SplitInfo>> consumer) {
        m0.p(consumer, "consumer");
    }
}
