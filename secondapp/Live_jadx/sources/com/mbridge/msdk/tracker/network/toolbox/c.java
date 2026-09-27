package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f70372e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f70373a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f70374b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70375c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f70376d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f70376d = i10;
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f70374b.size(); i11++) {
            byte[] bArr = this.f70374b.get(i11);
            if (bArr.length >= i10) {
                this.f70375c -= bArr.length;
                this.f70374b.remove(i11);
                this.f70373a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f70376d) {
                this.f70373a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f70374b, bArr, f70372e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f70374b.add(iBinarySearch, bArr);
                this.f70375c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f70375c > this.f70376d) {
            byte[] bArrRemove = this.f70373a.remove(0);
            this.f70374b.remove(bArrRemove);
            this.f70375c -= bArrRemove.length;
        }
    }
}
