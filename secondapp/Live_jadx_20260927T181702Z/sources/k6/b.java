package k6;

import f6.b0;
import f6.e0;
import f6.v;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends f6.e {

    /* JADX INFO: renamed from: k6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0961b implements f6.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f102022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f102023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0.a f102024c;

        @Override // f6.e.f
        public /* synthetic */ void a() {
            f6.f.a(this);
        }

        @Override // f6.e.f
        public f6.e.C0823e b(v vVar, long j10) throws IOException {
            long position = vVar.getPosition();
            long jC = c(vVar);
            long peekPosition = vVar.getPeekPosition();
            vVar.advancePeekPosition(Math.max(6, this.f102022a.f83447c));
            long jC2 = c(vVar);
            long peekPosition2 = vVar.getPeekPosition();
            if (jC > j10 || jC2 <= j10) {
                return jC2 <= j10 ? f6.e.C0823e.f(jC2, peekPosition2) : f6.e.C0823e.d(jC, position);
            }
            return f6.e.C0823e.e(peekPosition);
        }

        public final long c(v vVar) throws IOException {
            while (vVar.getPeekPosition() < vVar.getLength() - 6 && !b0.i(vVar, this.f102022a, this.f102023b, this.f102024c)) {
                vVar.advancePeekPosition(1);
            }
            if (vVar.getPeekPosition() < vVar.getLength() - 6) {
                return this.f102024c.f83354a;
            }
            vVar.advancePeekPosition((int) (vVar.getLength() - vVar.getPeekPosition()));
            return this.f102022a.f83454j;
        }

        public C0961b(e0 e0Var, int i10) {
            this.f102022a = e0Var;
            this.f102023b = i10;
            this.f102024c = new b0.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final e0 e0Var, int i10, long j10, long j11) {
        super(new f6.e.d() { // from class: k6.a
            @Override // f6.e.d
            public final long a(long j12) {
                return e0Var.l(j12);
            }
        }, new C0961b(e0Var, i10), e0Var.h(), 0L, e0Var.f83454j, j10, j11, e0Var.e(), Math.max(6, e0Var.f83447c));
        Objects.requireNonNull(e0Var);
    }
}
