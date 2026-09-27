package xg;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements og.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<og.b> f145022b;

    public b(List<og.b> list) {
        this.f145022b = Collections.unmodifiableList(list);
    }

    @Override // og.i
    public List<og.b> getCues(long j10) {
        return j10 >= 0 ? this.f145022b : Collections.EMPTY_LIST;
    }

    @Override // og.i
    public long getEventTime(int i10) {
        eh.a.a(i10 == 0);
        return 0L;
    }

    @Override // og.i
    public int getEventTimeCount() {
        return 1;
    }

    @Override // og.i
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
