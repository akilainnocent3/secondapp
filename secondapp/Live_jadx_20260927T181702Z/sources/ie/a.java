package ie;

import ee.n;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f90588e = new C0898a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f90589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f90590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f90591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f90592d;

    /* JADX INFO: renamed from: ie.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0898a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f90593a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<d> f90594b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f90595c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f90596d = "";

        public C0898a a(d dVar) {
            this.f90594b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f90593a, Collections.unmodifiableList(this.f90594b), this.f90595c, this.f90596d);
        }

        public C0898a c(String str) {
            this.f90596d = str;
            return this;
        }

        public C0898a d(b bVar) {
            this.f90595c = bVar;
            return this;
        }

        public C0898a e(List<d> list) {
            this.f90594b = list;
            return this;
        }

        public C0898a f(f fVar) {
            this.f90593a = fVar;
            return this;
        }
    }

    public a(f fVar, List<d> list, b bVar, String str) {
        this.f90589a = fVar;
        this.f90590b = list;
        this.f90591c = bVar;
        this.f90592d = str;
    }

    public static a b() {
        return f90588e;
    }

    public static C0898a h() {
        return new C0898a();
    }

    @xk.d(tag = 4)
    public String a() {
        return this.f90592d;
    }

    @uk.a.b
    public b c() {
        b bVar = this.f90591c;
        return bVar == null ? b.a() : bVar;
    }

    @uk.a.InterfaceC1443a(name = "globalMetrics")
    @xk.d(tag = 3)
    public b d() {
        return this.f90591c;
    }

    @uk.a.InterfaceC1443a(name = "logSourceMetrics")
    @xk.d(tag = 2)
    public List<d> e() {
        return this.f90590b;
    }

    @uk.a.b
    public f f() {
        f fVar = this.f90589a;
        return fVar == null ? f.a() : fVar;
    }

    @uk.a.InterfaceC1443a(name = "window")
    @xk.d(tag = 1)
    public f g() {
        return this.f90589a;
    }

    public byte[] i() {
        return n.b(this);
    }

    public void j(OutputStream outputStream) throws IOException {
        n.a(this, outputStream);
    }
}
