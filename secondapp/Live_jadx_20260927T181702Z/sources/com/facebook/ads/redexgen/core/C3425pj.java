package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.Arrays;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3425pj implements AnonymousClass24 {
    public static byte[] A0H;
    public static String[] A0I = {"AtN4gZlBq", "c6vG0ZoB350sNCwGTcbmyQxG", "GzjisXMF7MeBETThzgY0McLZmUxvZEHG", "X6Q", "OR9IAwpAbXPQPDykEqLOHO0nD", "OJOMvHQBuYweGyqOlvOJ7Ft7l3L2", "Cgb", "Ei80eZ3oJ"};
    public static final AnonymousClass23<C3425pj> A0J;
    public static final Object A0K;
    public static final C3449q7 A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C3452qA A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;

    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public C3449q7 A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C3425pj A00(Bundle bundle) {
        C3452qA c3452qA;
        Bundle bundle2 = bundle.getBundle(A0W);
        C3449q7 c3449q7 = bundle2 != null ? (C3449q7) C3449q7.A08.A6f(bundle2) : C3449q7.A09;
        long j10 = bundle.getLong(A0Y, -9223372036854775807L);
        long j11 = bundle.getLong(A0Z, -9223372036854775807L);
        long j12 = bundle.getLong(A0P, -9223372036854775807L);
        boolean z10 = bundle.getBoolean(A0T, false);
        boolean z11 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        if (bundle3 != null) {
            c3452qA = (C3452qA) C3452qA.A06.A6f(bundle3);
        } else {
            c3452qA = null;
            if (A0I[2].charAt(1) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[6] = "auZ";
            strArr[3] = "aKQ";
        }
        boolean z12 = bundle.getBoolean(A0S, false);
        long j13 = bundle.getLong(A0N, 0L);
        long j14 = bundle.getLong(A0O, -9223372036854775807L);
        int i10 = bundle.getInt(A0Q, 0);
        int i11 = bundle.getInt(A0U, 0);
        long j15 = bundle.getLong(A0X, 0L);
        C3425pj c3425pj = new C3425pj();
        c3425pj.A07(A0M, c3449q7, null, j10, j11, j12, z10, z11, c3452qA, j13, j14, i10, i11, j15);
        c3425pj.A0F = z12;
        return c3425pj;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{6, 10, 8, 75, 3, 4, 6, 0, 7, 10, 10, c.f161638p, 75, 4, 1, c.f161648z, 75, 4, c.f161635m, 1, c.A, 10, c.f161636n, 1, c.G, 75, 8, 0, 1, c.f161636n, 4, 86, 75, 6, 10, 8, 8, 10, c.f161635m, 75, 49, c.f161636n, 8, 0, 9, c.f161636n, c.f161635m, 0};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new C16562u().A03(A02(0, 48, SignalKey.EVENT_ID)).A00(Uri.EMPTY).A05();
        A0W = C5C.A0h(1);
        A0Y = C5C.A0h(2);
        A0Z = C5C.A0h(3);
        A0P = C5C.A0h(4);
        A0T = C5C.A0h(5);
        A0R = C5C.A0h(6);
        A0V = C5C.A0h(7);
        A0S = C5C.A0h(8);
        A0N = C5C.A0h(9);
        A0O = C5C.A0h(10);
        A0Q = C5C.A0h(11);
        A0U = C5C.A0h(12);
        A0X = C5C.A0h(13);
        A0J = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pk
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C3425pj.A00(bundle);
            }
        };
    }

    public final long A04() {
        return C5C.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return C5C.A0P(this.A03);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    public final C3425pj A07(Object obj, C3449q7 c3449q7, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, C3452qA c3452qA, long j13, long j14, int i10, int i11, long j15) {
        Object obj3;
        this.A0C = obj;
        this.A09 = c3449q7 != null ? c3449q7 : A0L;
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        A0I[5] = "sHLAwqiYlmMVa087WjDP7yFYW";
        if (c3449q7 != null) {
            AnonymousClass32 anonymousClass32 = c3449q7.A03;
            if (A0I[2].charAt(1) != 'z') {
                A0I[2] = "JzGzHC0FwGnnWhMzWBrJaCXM29VIx9g1";
                if (anonymousClass32 != null) {
                    obj3 = c3449q7.A03.A03;
                } else {
                    obj3 = null;
                }
            } else {
                A0I[5] = "IGwZtC";
                if (anonymousClass32 != null) {
                    obj3 = c3449q7.A03.A03;
                } else {
                    obj3 = null;
                }
            }
        } else {
            obj3 = null;
        }
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j10;
        this.A07 = j11;
        this.A04 = j12;
        this.A0G = z10;
        this.A0D = z11;
        this.A0E = c3452qA != null;
        this.A08 = c3452qA;
        this.A02 = j13;
        this.A03 = j14;
        this.A00 = i10;
        this.A01 = i11;
        this.A05 = j15;
        this.A0F = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C3425pj c3425pj = (C3425pj) obj;
        if (C5C.A1E(this.A0C, c3425pj.A0C) && C5C.A1E(this.A09, c3425pj.A09) && C5C.A1E(this.A0A, c3425pj.A0A) && C5C.A1E(this.A08, c3425pj.A08) && this.A06 == c3425pj.A06 && this.A07 == c3425pj.A07 && this.A04 == c3425pj.A04 && this.A0G == c3425pj.A0G && this.A0D == c3425pj.A0D && this.A0F == c3425pj.A0F && this.A02 == c3425pj.A02 && this.A03 == c3425pj.A03 && this.A00 == c3425pj.A00 && this.A01 == c3425pj.A01) {
            long j10 = this.A05;
            long j11 = c3425pj.A05;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[6] = "Zdu";
            strArr2[3] = "ITW";
            if (j10 == j11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((7 * 31) + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31) + (this.A0A == null ? 0 : this.A0A.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0)) * 31) + ((int) (this.A06 ^ (this.A06 >>> 32)))) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + ((int) (this.A04 ^ (this.A04 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[6] = "6VN";
        strArr[3] = "iNJ";
        return (((((((((((((iHashCode * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (this.A05 ^ (this.A05 >>> 32)));
    }
}
