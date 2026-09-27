package c7;

import androidx.annotation.Nullable;
import java.util.List;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public abstract class p extends c5.k implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public j f22539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22540g;

    @Override // c5.k, c5.a
    public void b() {
        super.b();
        this.f22539f = null;
    }

    @Override // c7.j
    public List<w4.a> getCues(long j10) {
        return ((j) l0.E(this.f22539f)).getCues(j10 - this.f22540g);
    }

    @Override // c7.j
    public long getEventTime(int i10) {
        return ((j) l0.E(this.f22539f)).getEventTime(i10) + this.f22540g;
    }

    @Override // c7.j
    public int getEventTimeCount() {
        return ((j) l0.E(this.f22539f)).getEventTimeCount();
    }

    @Override // c7.j
    public int getNextEventTimeIndex(long j10) {
        return ((j) l0.E(this.f22539f)).getNextEventTimeIndex(j10 - this.f22540g);
    }

    public void m(long j10, j jVar, long j11) {
        this.f22420c = j10;
        this.f22539f = jVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f22540g = j10;
    }
}
