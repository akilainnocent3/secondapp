package ff;

import af.d0;
import af.e0;
import af.g0;
import af.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f83962c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d0 f83963d;

        public a(d0 d0Var) {
            this.f83963d = d0Var;
        }

        @Override // af.d0
        public long getDurationUs() {
            return this.f83963d.getDurationUs();
        }

        @Override // af.d0
        public d0.a getSeekPoints(long j10) {
            d0.a seekPoints = this.f83963d.getSeekPoints(j10);
            e0 e0Var = seekPoints.f4897a;
            e0 e0Var2 = new e0(e0Var.f4908a, e0Var.f4909b + d.this.f83961b);
            e0 e0Var3 = seekPoints.f4898b;
            return new d0.a(e0Var2, new e0(e0Var3.f4908a, e0Var3.f4909b + d.this.f83961b));
        }

        @Override // af.d0
        public boolean isSeekable() {
            return this.f83963d.isSeekable();
        }
    }

    public d(long j10, o oVar) {
        this.f83961b = j10;
        this.f83962c = oVar;
    }

    @Override // af.o
    public void d(d0 d0Var) {
        this.f83962c.d(new a(d0Var));
    }

    @Override // af.o
    public void endTracks() {
        this.f83962c.endTracks();
    }

    @Override // af.o
    public g0 track(int i10, int i11) {
        return this.f83962c.track(i10, i11);
    }
}
