package c7;

import android.util.SparseArray;
import f6.f1;
import f6.w0;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class u implements f6.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6.w f22549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.a f22550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<w> f22551d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22552e;

    public u(f6.w wVar, s.a aVar) {
        this.f22549b = wVar;
        this.f22550c = aVar;
    }

    public void a() {
        for (int i10 = 0; i10 < this.f22551d.size(); i10++) {
            this.f22551d.valueAt(i10).k();
        }
    }

    @Override // f6.w
    public void e(w0 w0Var) {
        this.f22549b.e(w0Var);
    }

    @Override // f6.w
    public void endTracks() {
        this.f22549b.endTracks();
        if (this.f22552e) {
            for (int i10 = 0; i10 < this.f22551d.size(); i10++) {
                this.f22551d.valueAt(i10).l(true);
            }
        }
    }

    @Override // f6.w
    public f1 track(int i10, int i11) {
        if (i11 != 3 && i11 != 5) {
            this.f22552e = true;
        }
        if (i11 != 3) {
            return this.f22549b.track(i10, i11);
        }
        w wVar = this.f22551d.get(i10);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.f22549b.track(i10, i11), this.f22550c);
        this.f22551d.put(i10, wVar2);
        return wVar2;
    }
}
