package dj;

import java.util.Map;
import kotlin.jvm.internal.s;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@f
@yi.b
public abstract class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char[][] f79339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final char f79341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char f79342f;

    public a(Map<Character, String> replacementMap, char safeMin, char safeMax) {
        this(b.a(replacementMap), safeMin, safeMax);
    }

    @Override // dj.d, dj.h
    public final String b(String s10) {
        l0.E(s10);
        for (int i10 = 0; i10 < s10.length(); i10++) {
            char cCharAt = s10.charAt(i10);
            if ((cCharAt < this.f79340d && this.f79339c[cCharAt] != null) || cCharAt > this.f79342f || cCharAt < this.f79341e) {
                return d(s10, i10);
            }
        }
        return s10;
    }

    @Override // dj.d
    @zq.a
    public final char[] c(char c10) {
        char[] cArr;
        if (c10 < this.f79340d && (cArr = this.f79339c[c10]) != null) {
            return cArr;
        }
        if (c10 < this.f79341e || c10 > this.f79342f) {
            return f(c10);
        }
        return null;
    }

    @zq.a
    public abstract char[] f(char c10);

    public a(b escaperMap, char safeMin, char safeMax) {
        l0.E(escaperMap);
        char[][] cArrC = escaperMap.c();
        this.f79339c = cArrC;
        this.f79340d = cArrC.length;
        if (safeMax < safeMin) {
            safeMax = 0;
            safeMin = s.f102777c;
        }
        this.f79341e = safeMin;
        this.f79342f = safeMax;
    }
}
