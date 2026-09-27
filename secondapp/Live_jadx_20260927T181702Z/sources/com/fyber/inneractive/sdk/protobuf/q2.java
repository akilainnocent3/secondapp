package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class q2 extends c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q2 f47548d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f47549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47550c;

    static {
        q2 q2Var = new q2(new Object[0], 0);
        f47548d = q2Var;
        q2Var.f47442a = false;
    }

    public q2(Object[] objArr, int i10) {
        this.f47549b = objArr;
        this.f47550c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f47550c;
        Object[] objArr = this.f47549b;
        if (i10 == objArr.length) {
            this.f47549b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f47549b;
        int i11 = this.f47550c;
        this.f47550c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final k1 b(int i10) {
        if (i10 >= this.f47550c) {
            return new q2(Arrays.copyOf(this.f47549b, i10), this.f47550c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f47550c) {
            return this.f47549b[i10];
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f47550c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        if (i10 < 0 || i10 >= (i11 = this.f47550c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f47550c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        Object[] objArr = this.f47549b;
        Object obj = objArr[i10];
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f47550c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        if (i10 < 0 || i10 >= this.f47550c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f47550c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        Object[] objArr = this.f47549b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47550c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f47550c)) {
            Object[] objArr = this.f47549b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f47549b, i10, objArr2, i10 + 1, this.f47550c - i10);
                this.f47549b = objArr2;
            }
            this.f47549b[i10] = obj;
            this.f47550c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f47550c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }
}
