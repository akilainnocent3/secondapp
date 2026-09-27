package dj;

import java.util.HashMap;
import java.util.Map;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@f
@yi.b
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79353b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Character, String> f79352a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char[][] f79354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f79355d;

        public a(char[][] replacements) {
            this.f79354c = replacements;
            this.f79355d = replacements.length;
        }

        @Override // dj.d, dj.h
        public String b(String s10) {
            int length = s10.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = s10.charAt(i10);
                char[][] cArr = this.f79354c;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return d(s10, i10);
                }
            }
            return s10;
        }

        @Override // dj.d
        @zq.a
        public char[] c(char c10) {
            if (c10 < this.f79355d) {
                return this.f79354c[c10];
            }
            return null;
        }
    }

    @qj.a
    public e a(char c10, String r10) {
        this.f79352a.put(Character.valueOf(c10), (String) l0.E(r10));
        if (c10 > this.f79353b) {
            this.f79353b = c10;
        }
        return this;
    }

    @qj.a
    public e b(char[] cs2, String r10) {
        l0.E(r10);
        for (char c10 : cs2) {
            a(c10, r10);
        }
        return this;
    }

    public char[][] c() {
        char[][] cArr = new char[this.f79353b + 1][];
        for (Map.Entry<Character, String> entry : this.f79352a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public h d() {
        return new a(c());
    }
}
