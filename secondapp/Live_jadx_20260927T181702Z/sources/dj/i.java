package dj;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@f
@yi.b
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f79358a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends d {
        @Override // dj.d, dj.h
        public String b(String string) {
            return (String) l0.E(string);
        }

        @Override // dj.d
        @zq.a
        public char[] c(char c10) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Character, String> f79359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public char f79360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public char f79361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @zq.a
        public String f79362d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends dj.a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @zq.a
            public final char[] f79363g;

            public a(Map replacementMap, char safeMin, char safeMax) {
                super((Map<Character, String>) replacementMap, safeMin, safeMax);
                this.f79363g = b.this.f79362d != null ? b.this.f79362d.toCharArray() : null;
            }

            @Override // dj.a
            @zq.a
            public char[] f(char c10) {
                return this.f79363g;
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @qj.a
        public b b(char c10, String replacement) {
            l0.E(replacement);
            this.f79359a.put(Character.valueOf(c10), replacement);
            return this;
        }

        public h c() {
            return new a(this.f79359a, this.f79360b, this.f79361c);
        }

        @qj.a
        public b d(char safeMin, char safeMax) {
            this.f79360b = safeMin;
            this.f79361c = safeMax;
            return this;
        }

        @qj.a
        public b e(String unsafeReplacement) {
            this.f79362d = unsafeReplacement;
            return this;
        }

        public b() {
            this.f79359a = new HashMap();
            this.f79360b = (char) 0;
            this.f79361c = s.f102777c;
            this.f79362d = null;
        }
    }

    public static b a() {
        return new b(null);
    }

    @zq.a
    public static String b(d escaper, char c10) {
        return e(escaper.c(c10));
    }

    @zq.a
    public static String c(l escaper, int cp2) {
        return e(escaper.d(cp2));
    }

    public static h d() {
        return f79358a;
    }

    @zq.a
    public static String e(@zq.a char[] in2) {
        if (in2 == null) {
            return null;
        }
        return new String(in2);
    }
}
