package og;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class o extends ye.j implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public i f119090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f119091f;

    @Override // ye.a
    public void b() {
        super.b();
        this.f119090e = null;
    }

    @Override // og.i
    public List<b> getCues(long j10) {
        return ((i) eh.a.g(this.f119090e)).getCues(j10 - this.f119091f);
    }

    @Override // og.i
    public long getEventTime(int i10) {
        return ((i) eh.a.g(this.f119090e)).getEventTime(i10) + this.f119091f;
    }

    @Override // og.i
    public int getEventTimeCount() {
        return ((i) eh.a.g(this.f119090e)).getEventTimeCount();
    }

    @Override // og.i
    public int getNextEventTimeIndex(long j10) {
        return ((i) eh.a.g(this.f119090e)).getNextEventTimeIndex(j10 - this.f119091f);
    }

    public void m(long j10, i iVar, long j11) {
        this.f159206c = j10;
        this.f119090e = iVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f119091f = j10;
    }
}
