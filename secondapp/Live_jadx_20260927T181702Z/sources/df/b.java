package df;

import af.n;
import af.t;
import af.w;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b extends af.a {

    /* JADX INFO: renamed from: df.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0771b implements af.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f79061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t.a f79063c;

        @Override // af.a.f
        public /* synthetic */ void a() {
            af.b.a(this);
        }

        @Override // af.a.f
        public af.a.e b(n nVar, long j10) throws IOException {
            long position = nVar.getPosition();
            long jC = c(nVar);
            long peekPosition = nVar.getPeekPosition();
            nVar.advancePeekPosition(Math.max(6, this.f79061a.f4998c));
            long jC2 = c(nVar);
            long peekPosition2 = nVar.getPeekPosition();
            if (jC > j10 || jC2 <= j10) {
                return jC2 <= j10 ? af.a.e.f(jC2, peekPosition2) : af.a.e.d(jC, position);
            }
            return af.a.e.e(peekPosition);
        }

        public final long c(n nVar) throws IOException {
            while (nVar.getPeekPosition() < nVar.getLength() - 6 && !t.h(nVar, this.f79061a, this.f79062b, this.f79063c)) {
                nVar.advancePeekPosition(1);
            }
            if (nVar.getPeekPosition() < nVar.getLength() - 6) {
                return this.f79063c.f4987a;
            }
            nVar.advancePeekPosition((int) (nVar.getLength() - nVar.getPeekPosition()));
            return this.f79061a.f5005j;
        }

        public C0771b(w wVar, int i10) {
            this.f79061a = wVar;
            this.f79062b = i10;
            this.f79063c = new t.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final w wVar, int i10, long j10, long j11) {
        super(new af.a.d() { // from class: df.a
            @Override // af.a.d
            public final long a(long j12) {
                return wVar.l(j12);
            }
        }, new C0771b(wVar, i10), wVar.h(), 0L, wVar.f5005j, j10, j11, wVar.e(), Math.max(6, wVar.f4998c));
        Objects.requireNonNull(wVar);
    }
}
