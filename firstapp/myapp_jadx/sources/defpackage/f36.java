package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f36 implements go50 {
    public final wxf0 b;

    public class a implements fo50 {
        public final /* synthetic */ long b;

        public a(long j) {
            this.b = j;
        }

        @Override // defpackage.fo50
        public final long a() {
            return this.b;
        }

        @Override // defpackage.fo50
        public final fo50.a b(e36 e36Var) {
            return e36Var.a == 1 ? fo50.a.d : fo50.a.e;
        }
    }

    public static final class b implements go50 {
        public final f36 b;

        public b(long j) {
            this.b = new f36(j);
        }

        @Override // defpackage.fo50
        public final long a() {
            return this.b.b.b;
        }

        @Override // defpackage.fo50
        public final fo50.a b(e36 e36Var) {
            if (this.b.b.b(e36Var).b) {
                return fo50.a.e;
            }
            Throwable th = e36Var.c;
            if (th instanceof x36.b) {
                pgt.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((x36.b) th).a > 0) {
                    return fo50.a.f;
                }
            }
            return fo50.a.d;
        }

        @Override // defpackage.go50
        public final fo50 c(long j) {
            return new b(j);
        }
    }

    public f36(long j) {
        this.b = new wxf0(j, new a(j));
    }

    @Override // defpackage.fo50
    public final long a() {
        return this.b.b;
    }

    @Override // defpackage.fo50
    public final fo50.a b(e36 e36Var) {
        return this.b.b(e36Var);
    }

    @Override // defpackage.go50
    public final fo50 c(long j) {
        return new f36(j);
    }
}
