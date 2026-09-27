package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l3.a;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2991iE {
    public static byte[] A03;
    public final C2189Of A00;
    public final InterfaceC2785er A01;
    public final List<C2990iD> A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, a.f103460r7, -60, a.f103460r7};
    }

    public C2991iE(List<AbstractC2187Od> list, Bundle bundle, InterfaceC2785er interfaceC2785er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC2785er;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.A02.add(new C2990iD(list.get(i10), (Bundle) parcelableArrayList.get(i10)));
        }
        this.A00 = (C2189Of) AbstractC2422Xo.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C2991iE(List<AbstractC2187Od> list, InterfaceC2785er interfaceC2785er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC2785er;
        Iterator<AbstractC2187Od> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C2990iD(it.next()));
        }
        this.A00 = new C2189Of();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 126), AbstractC2422Xo.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C2990iD> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C2189Of A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C2990iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d10, double d11) {
        if (d11 >= 0.0d) {
            this.A00.A05(d10, d11);
        }
        double dA9V = this.A01.A9V();
        this.A00.A04(d10, dA9V);
        Iterator<C2990iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d10, dA9V);
        }
    }
}
