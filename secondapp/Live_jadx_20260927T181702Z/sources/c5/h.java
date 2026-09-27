package c5;

import androidx.annotation.Nullable;
import c5.i;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface h<I, O, E extends i> {
    void a(long j10);

    @Nullable
    I dequeueInputBuffer() throws i;

    @Nullable
    O dequeueOutputBuffer() throws i;

    void flush();

    String getName();

    void queueInputBuffer(I i10) throws i;

    void release();
}
