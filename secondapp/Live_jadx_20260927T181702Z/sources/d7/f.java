package d7;

import c7.j;
import java.util.Collections;
import java.util.List;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<w4.a> f78558b;

    public f(List<w4.a> list) {
        this.f78558b = list;
    }

    @Override // c7.j
    public List<w4.a> getCues(long j10) {
        return j10 >= 0 ? this.f78558b : Collections.EMPTY_LIST;
    }

    @Override // c7.j
    public long getEventTime(int i10) {
        l0.d(i10 == 0);
        return 0L;
    }

    @Override // c7.j
    public int getEventTimeCount() {
        return 1;
    }

    @Override // c7.j
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
