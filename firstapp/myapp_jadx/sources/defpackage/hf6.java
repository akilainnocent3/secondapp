package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class hf6 implements q340 {
    public final hoa N;

    public static final class a implements v1h<hf6> {
        public final ftw a = ftw.V();

        public static a c(hoa hoaVar) {
            a aVar = new a();
            hoaVar.h(new gf6(aVar, hoaVar));
            return aVar;
        }

        @Override // defpackage.v1h
        public final csw a() {
            throw null;
        }

        public final hf6 b() {
            return new hf6(w2z.U(this.a));
        }
    }

    public hf6(hoa hoaVar) {
        this.N = hoaVar;
    }

    @Override // defpackage.q340
    public final hoa l() {
        return this.N;
    }
}
