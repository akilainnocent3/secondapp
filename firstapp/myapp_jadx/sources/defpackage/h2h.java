package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class h2h implements fpv {
    public static final h2h a = new h2h();
    public static final e b = new e();
    public static final j c = new j();
    public static final c d = new c();
    public static final a e = new a();

    public static class a implements oze {
        public static final f a = new f();

        @Override // defpackage.oze
        public final xjt c() {
            return a;
        }
    }

    public static class h implements t2h {
        public static final g a = new g();

        @Override // defpackage.zjt
        public final yjt build() {
            return a;
        }
    }

    @Override // defpackage.fpv
    public final ukt a(String str) {
        return c;
    }

    @Override // defpackage.fpv
    public final tjt b(String str) {
        return b;
    }

    @Override // defpackage.fpv
    public final oze c(String str) {
        return e;
    }

    @Override // defpackage.fpv
    public final qze d(String str) {
        return d;
    }

    public static class d implements sjt {
        @Override // defpackage.sjt
        public final void g() {
        }

        @Override // defpackage.sjt
        public final void a(long j, m21 m21Var) {
        }
    }

    public static class f implements xjt {
        public static final a a = new a();

        public class a implements qdy {
        }

        @Override // defpackage.xjt
        public final qdy c(Consumer<rdy> consumer) {
            return a;
        }

        @Override // defpackage.xjt
        public final xjt d() {
            return this;
        }

        @Override // defpackage.xjt
        public final xjt e() {
            return this;
        }
    }

    public static class c implements m2h {
        public static final b a = new b();
        public static final h b = new h();

        @Override // defpackage.qze
        public final pze build() {
            return a;
        }

        @Override // defpackage.qze
        public final zjt c() {
            return b;
        }

        @Override // defpackage.qze
        public final qze a(String str) {
            return this;
        }

        @Override // defpackage.qze
        public final qze b(String str) {
            return this;
        }
    }

    public static class e implements tjt {
        public static final d a = new d();

        @Override // defpackage.tjt
        public final sjt build() {
            return a;
        }

        @Override // defpackage.tjt
        public final tjt a(String str) {
            return this;
        }

        @Override // defpackage.tjt
        public final tjt b(String str) {
            return this;
        }
    }

    public static class j implements ukt {
        public static final a a = new a();
        public static final b b = new b();

        public class a extends i {
        }

        public class b implements sdy {
        }

        @Override // defpackage.ukt
        public final tkt build() {
            return a;
        }

        @Override // defpackage.ukt
        public final sdy c(Consumer<rdy> consumer) {
            return b;
        }

        @Override // defpackage.ukt
        public final ukt a(String str) {
            return this;
        }

        @Override // defpackage.ukt
        public final ukt b(String str) {
            return this;
        }
    }

    public static class i implements u2h {
        @Override // defpackage.tkt
        public final void a(long j, m21 m21Var) {
        }
    }

    public static class b implements pze {
        @Override // defpackage.pze
        public final void b(double d, m21 m21Var, m0b m0bVar) {
        }
    }

    public static class g implements yjt {
        @Override // defpackage.yjt
        public final void c(long j, m21 m21Var, m0b m0bVar) {
        }
    }
}
