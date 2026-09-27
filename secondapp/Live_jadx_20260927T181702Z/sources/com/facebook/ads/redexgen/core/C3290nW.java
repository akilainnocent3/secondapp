package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import f6.q;
import java.util.ArrayList;
import java.util.Arrays;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3290nW implements AnonymousClass24 {
    public static byte[] A03;
    public static String[] A04 = {"kjXOolT", "y1uosoppcQ2KAnagmdUHUDs2pqKkNOP", "9S5fCrLfVI6Z6wWSlA", "LW4KLvv", "ESAoxwChDjEBJ2YD38hEjiU5IsN", "MD8cz6uZEkXt7x64XO0blzPRBkN5Dhm8", "wv8vTraLOdvtLK52tGc0aCYgNtDO0cFF", "ftZS2reRIxcEfCn6parOlN78mV3R9Y2K"};
    public static final AnonymousClass23<C3290nW> A05;
    public static final C3290nW A06;
    public static final String A07;
    public int A00;
    public final int A01;
    public final BP<C3423pg> A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, 79, 86, 78, 83, 74, 86, 95, c.D, 83, 94, 95, 84, 78, 83, 89, 91, 86, c.D, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 73, c.D, 91, 94, 94, 95, 94, c.D, 78, 85, c.D, 85, 84, 95, c.D, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 123, 72, 72, 91, 67, c.f161646x, 81, 119, q.f83619w, 102, 110, 66, 119, 106, 112, 117, 68, 119, 119, q.f83619w, 124};
        if (A04[5].charAt(31) == 'Q') {
            throw new RuntimeException();
        }
        A04[4] = "LoVxB454";
        A03 = bArr;
    }

    static {
        A03();
        A06 = new C3290nW(new C3423pg[0]);
        A07 = C5C.A0h(0);
        A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nX
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C3290nW.A00(bundle);
            }
        };
    }

    public C3290nW(C3423pg... c3423pgArr) {
        this.A02 = BP.A07(c3423pgArr);
        this.A01 = c3423pgArr.length;
        A02();
    }

    public static /* synthetic */ C3290nW A00(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new C3290nW(new C3423pg[0]);
        }
        return new C3290nW((C3423pg[]) AnonymousClass44.A01(C3423pg.A06, parcelableArrayList).toArray(new C3423pg[0]));
    }

    private void A02() {
        for (int i10 = 0; i10 < i; i10++) {
            for (int i11 = i10 + 1; i11 < i; i11++) {
                if (this.A02.get(i10).equals(this.A02.get(i11))) {
                    AbstractC16924g.A08(A01(60, 15, 90), A01(0, 0, 115), new IllegalArgumentException(A01(0, 60, 101)));
                }
            }
        }
    }

    public final int A04(C3423pg c3423pg) {
        int index = this.A02.indexOf(c3423pg);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final C3423pg A05(int i10) {
        return this.A02.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3290nW c3290nW = (C3290nW) obj;
        return this.A01 == c3290nW.A01 && this.A02.equals(c3290nW.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        int i10 = this.A00;
        String[] strArr = A04;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[6] = "ifk0Ba0Zppjn7MlaJBrmzFqZbJ0HKklT";
        return i10;
    }
}
