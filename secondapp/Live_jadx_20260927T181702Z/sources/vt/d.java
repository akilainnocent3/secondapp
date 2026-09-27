package vt;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final String f141574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        public final String f141575b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l String name, @l String desc) {
            super(null);
            m0.p(name, "name");
            m0.p(desc, "desc");
            this.f141574a = name;
            this.f141575b = desc;
        }

        @Override // vt.d
        @l
        public String a() {
            return c() + ':' + b();
        }

        @Override // vt.d
        @l
        public String b() {
            return this.f141575b;
        }

        @Override // vt.d
        @l
        public String c() {
            return this.f141574a;
        }

        @l
        public final String d() {
            return this.f141574a;
        }

        @l
        public final String e() {
            return this.f141575b;
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m0.g(this.f141574a, aVar.f141574a) && m0.g(this.f141575b, aVar.f141575b);
        }

        public int hashCode() {
            return (this.f141574a.hashCode() * 31) + this.f141575b.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final String f141576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        public final String f141577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l String name, @l String desc) {
            super(null);
            m0.p(name, "name");
            m0.p(desc, "desc");
            this.f141576a = name;
            this.f141577b = desc;
        }

        @Override // vt.d
        @l
        public String a() {
            return c() + b();
        }

        @Override // vt.d
        @l
        public String b() {
            return this.f141577b;
        }

        @Override // vt.d
        @l
        public String c() {
            return this.f141576a;
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return m0.g(this.f141576a, bVar.f141576a) && m0.g(this.f141577b, bVar.f141577b);
        }

        public int hashCode() {
            return (this.f141576a.hashCode() * 31) + this.f141577b.hashCode();
        }
    }

    public /* synthetic */ d(x xVar) {
        this();
    }

    @l
    public abstract String a();

    @l
    public abstract String b();

    @l
    public abstract String c();

    @l
    public final String toString() {
        return a();
    }

    public d() {
    }
}
