package sl;

import java.io.IOException;
import java.io.OutputStream;
import ql.l0;
import xk.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f135476b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sl.a f135477a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sl.a f135478a = null;

        public b a() {
            return new b(this.f135478a);
        }

        public a b(sl.a aVar) {
            this.f135478a = aVar;
            return this;
        }
    }

    public b(sl.a aVar) {
        this.f135477a = aVar;
    }

    public static b a() {
        return f135476b;
    }

    public static a d() {
        return new a();
    }

    @uk.a.b
    public sl.a b() {
        sl.a aVar = this.f135477a;
        return aVar == null ? sl.a.f() : aVar;
    }

    @uk.a.InterfaceC1443a(name = "messagingClientEvent")
    @d(tag = 1)
    public sl.a c() {
        return this.f135477a;
    }

    public byte[] e() {
        return l0.b(this);
    }

    public void f(OutputStream outputStream) throws IOException {
        l0.a(this, outputStream);
    }
}
