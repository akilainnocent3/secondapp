package com.cleveradssolutions.sdk;

import com.cleveradssolutions.internal.main.h;
import com.ironsource.C4497s;
import com.vungle.ads.internal.Constants;
import oy.l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v7 com.cleveradssolutions.sdk.c[], still in use, count: 1, list:
  (r7v7 com.cleveradssolutions.sdk.c[]) from 0x008d: INVOKE (r7v7 com.cleveradssolutions.sdk.c[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:142)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    APP_OPEN(3, to.c.preferenceAppOpening, Constants.PLACEMENT_TYPE_APP_OPEN, 64),
    BANNER(0, "Banner", "banner", 1),
    INLINE_BANNER(6, "InlineBanner", "banner", 1),
    MEDIUM_RECTANGLE(5, "MREC", "mrec", 32),
    INTERSTITIAL(1, "Interstitial", "inter", 2),
    REWARDED(2, "Rewarded", C4497s.f63499j, 4),
    NATIVE(4, "Native", "native", 8);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ sr.a f44011n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44015e;

    static {
        f44011n = sr.c.c(cVarArr);
    }

    public c(int i10, String str, String str2, int i11) {
        super(str, i);
        this.f44012b = i10;
        this.f44013c = str;
        this.f44014d = str2;
        this.f44015e = i11;
    }

    @l
    public static sr.a<c> g() {
        return f44011n;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f44010m.clone();
    }

    public final int d() {
        return this.f44015e;
    }

    @l
    public final String h() {
        if (this.f44012b == 5) {
            String str = h.f43616a;
            if (!h.f43619d) {
                return "banner";
            }
        }
        return this.f44014d;
    }

    @l
    public final String i() {
        return this.f44013c;
    }

    public final int j() {
        return this.f44012b;
    }

    public final boolean k() {
        int i10 = this.f44015e;
        return i10 == 1 || i10 == 32;
    }

    @Override // java.lang.Enum
    @l
    public String toString() {
        return this.f44013c;
    }
}
