package zi;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@k
public final class b0 extends h implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f161620c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f161621b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matcher f161622a;

        public a(Matcher matcher) {
            this.f161622a = (Matcher) l0.E(matcher);
        }

        @Override // zi.g
        public int a() {
            return this.f161622a.end();
        }

        @Override // zi.g
        public boolean b() {
            return this.f161622a.find();
        }

        @Override // zi.g
        public boolean c(int index) {
            return this.f161622a.find(index);
        }

        @Override // zi.g
        public boolean d() {
            return this.f161622a.matches();
        }

        @Override // zi.g
        public String e(String replacement) {
            return this.f161622a.replaceAll(replacement);
        }

        @Override // zi.g
        public int f() {
            return this.f161622a.start();
        }
    }

    public b0(Pattern pattern) {
        this.f161621b = (Pattern) l0.E(pattern);
    }

    @Override // zi.h
    public int d() {
        return this.f161621b.flags();
    }

    @Override // zi.h
    public g h(CharSequence t10) {
        return new a(this.f161621b.matcher(t10));
    }

    @Override // zi.h
    public String i() {
        return this.f161621b.pattern();
    }

    @Override // zi.h
    public String toString() {
        return this.f161621b.toString();
    }
}
