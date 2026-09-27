package qg;

import java.util.List;
import og.i;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<og.b> f122247b;

    public c(List<og.b> list) {
        this.f122247b = list;
    }

    @Override // og.i
    public List<og.b> getCues(long j10) {
        return this.f122247b;
    }

    @Override // og.i
    public long getEventTime(int i10) {
        return 0L;
    }

    @Override // og.i
    public int getEventTimeCount() {
        return 1;
    }

    @Override // og.i
    public int getNextEventTimeIndex(long j10) {
        return -1;
    }
}
