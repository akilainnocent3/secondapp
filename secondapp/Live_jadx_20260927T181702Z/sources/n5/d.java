package n5;

import androidx.annotation.Nullable;
import c5.i;
import c5.j;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface d extends c5.h<j, f, e> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public static final a f116266a = new n5.a.b();

        int a(androidx.media3.common.a aVar);

        d b();
    }

    void b(j jVar) throws e;

    @Override // c5.h
    @Nullable
    /* bridge */ /* synthetic */ f dequeueOutputBuffer() throws i;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c5.h
    @Nullable
    f dequeueOutputBuffer() throws e;

    @Override // c5.h
    /* bridge */ /* synthetic */ void queueInputBuffer(j jVar) throws i;
}
