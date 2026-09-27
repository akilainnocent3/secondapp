package dj;

import java.util.Map;
import kotlin.jvm.internal.s;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@f
@yi.b
public abstract class c extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char[][] f79345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f79347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f79348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final char f79349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char f79350h;

    public c(Map<Character, String> replacementMap, int safeMin, int safeMax, String unsafeReplacement) {
        this(b.a(replacementMap), safeMin, safeMax, unsafeReplacement);
    }

    @Override // dj.l, dj.h
    public final String b(String s10) {
        l0.E(s10);
        for (int i10 = 0; i10 < s10.length(); i10++) {
            char cCharAt = s10.charAt(i10);
            if ((cCharAt < this.f79346d && this.f79345c[cCharAt] != null) || cCharAt > this.f79350h || cCharAt < this.f79349g) {
                return e(s10, i10);
            }
        }
        return s10;
    }

    @Override // dj.l
    @zq.a
    public final char[] d(int cp2) {
        char[] cArr;
        if (cp2 < this.f79346d && (cArr = this.f79345c[cp2]) != null) {
            return cArr;
        }
        if (cp2 < this.f79347e || cp2 > this.f79348f) {
            return h(cp2);
        }
        return null;
    }

    @Override // dj.l
    public final int g(CharSequence csq, int index, int end) {
        while (index < end) {
            char cCharAt = csq.charAt(index);
            if ((cCharAt < this.f79346d && this.f79345c[cCharAt] != null) || cCharAt > this.f79350h || cCharAt < this.f79349g) {
                break;
            }
            index++;
        }
        return index;
    }

    @zq.a
    public abstract char[] h(int cp2);

    public c(b escaperMap, int safeMin, int safeMax, String unsafeReplacement) {
        l0.E(escaperMap);
        char[][] cArrC = escaperMap.c();
        this.f79345c = cArrC;
        this.f79346d = cArrC.length;
        if (safeMax < safeMin) {
            safeMax = -1;
            safeMin = Integer.MAX_VALUE;
        }
        this.f79347e = safeMin;
        this.f79348f = safeMax;
        if (safeMin >= 55296) {
            this.f79349g = s.f102777c;
            this.f79350h = (char) 0;
        } else {
            this.f79349g = (char) safeMin;
            this.f79350h = (char) Math.min(safeMax, 55295);
        }
    }
}
