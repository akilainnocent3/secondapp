package ah;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        ah.a a();

        @Nullable
        a next();
    }

    void a(ah.a aVar);

    ah.a allocate();

    void b(a aVar);

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void trim();
}
