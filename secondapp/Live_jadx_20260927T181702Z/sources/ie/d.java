package ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f90614c = new a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f90616b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f90617a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<c> f90618b = new ArrayList();

        public a a(c cVar) {
            this.f90618b.add(cVar);
            return this;
        }

        public d b() {
            return new d(this.f90617a, Collections.unmodifiableList(this.f90618b));
        }

        public a c(List<c> list) {
            this.f90618b = list;
            return this;
        }

        public a d(String str) {
            this.f90617a = str;
            return this;
        }
    }

    public d(String str, List<c> list) {
        this.f90615a = str;
        this.f90616b = list;
    }

    public static d a() {
        return f90614c;
    }

    public static a d() {
        return new a();
    }

    @uk.a.InterfaceC1443a(name = "logEventDropped")
    @xk.d(tag = 2)
    public List<c> b() {
        return this.f90616b;
    }

    @xk.d(tag = 1)
    public String c() {
        return this.f90615a;
    }
}
