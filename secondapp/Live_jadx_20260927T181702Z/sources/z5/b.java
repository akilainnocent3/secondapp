package z5;

import androidx.annotation.Nullable;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        z5.a a();

        @Nullable
        a next();
    }

    void a(a aVar);

    z5.a allocate();

    void b(z5.a aVar);

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void trim();
}
