package ye;

import androidx.annotation.Nullable;
import ye.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface f<I, O, E extends h> {
    @Nullable
    I dequeueInputBuffer() throws h;

    @Nullable
    O dequeueOutputBuffer() throws h;

    void flush();

    String getName();

    void queueInputBuffer(I i10) throws h;

    void release();
}
