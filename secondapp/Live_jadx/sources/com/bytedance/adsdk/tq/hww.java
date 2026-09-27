package com.bytedance.adsdk.tq;

import com.applovin.impl.sdk.utils.JsonUtils;
import fw.b;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class hww<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static int f31981hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static Object[] f31982hv;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static int f31983ok;
    private static Object[] vgm;
    Object[] hww;
    private weu<E, E> nod;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int[] f31985rs;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    int f31986tq;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static final int[] f31984sd = new int[0];
    private static final Object[] vy = new Object[0];

    public hww() {
        this(0);
    }

    private int hww(Object obj, int i10) {
        int i11 = this.f31986tq;
        if (i11 == 0) {
            return -1;
        }
        int iHww = tq.hww(this.f31985rs, i11, i10);
        if (iHww < 0 || obj.equals(this.hww[iHww])) {
            return iHww;
        }
        int i12 = iHww + 1;
        while (i12 < i11 && this.f31985rs[i12] == i10) {
            if (obj.equals(this.hww[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iHww - 1; i13 >= 0 && this.f31985rs[i13] == i10; i13--) {
            if (obj.equals(this.hww[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    private void vy(int i10) {
        if (i10 == 8) {
            synchronized (hww.class) {
                Object[] objArr = vgm;
                if (objArr != null) {
                    this.hww = objArr;
                    vgm = (Object[]) objArr[0];
                    this.f31985rs = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f31983ok--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (hww.class) {
                Object[] objArr2 = f31982hv;
                if (objArr2 != null) {
                    this.hww = objArr2;
                    f31982hv = (Object[]) objArr2[0];
                    this.f31985rs = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f31981hu--;
                    return;
                }
            }
        }
        this.f31985rs = new int[i10];
        this.hww = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iHww;
        if (e10 == null) {
            iHww = hww();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iHww = hww(e10, iHashCode);
        }
        if (iHww >= 0) {
            return false;
        }
        int i11 = ~iHww;
        int i12 = this.f31986tq;
        int[] iArr = this.f31985rs;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.hww;
            vy(i13);
            int[] iArr2 = this.f31985rs;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.hww, 0, objArr.length);
            }
            hww(iArr, objArr, this.f31986tq);
        }
        int i14 = this.f31986tq;
        if (i11 < i14) {
            int[] iArr3 = this.f31985rs;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.hww;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f31986tq - i11);
        }
        this.f31985rs[i11] = i10;
        this.hww[i11] = e10;
        this.f31986tq++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        hww(this.f31986tq + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f31986tq;
        if (i10 != 0) {
            hww(this.f31985rs, this.hww, i10);
            this.f31985rs = f31984sd;
            this.hww = vy;
            this.f31986tq = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return hww(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f31986tq; i10++) {
                try {
                    if (!set.contains(tq(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f31985rs;
        int i10 = this.f31986tq;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f31986tq <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return tq().vy().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iHww = hww(obj);
        if (iHww < 0) {
            return false;
        }
        sd(iHww);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f31986tq - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.hww[i10])) {
                sd(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public E sd(int i10) {
        Object[] objArr = this.hww;
        E e10 = (E) objArr[i10];
        int i11 = this.f31986tq;
        if (i11 <= 1) {
            hww(this.f31985rs, objArr, i11);
            this.f31985rs = f31984sd;
            this.hww = vy;
            this.f31986tq = 0;
            return e10;
        }
        int[] iArr = this.f31985rs;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f31986tq = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.hww;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f31986tq - i10);
            }
            this.hww[this.f31986tq] = null;
            return e10;
        }
        vy(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f31986tq--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f31985rs, 0, i10);
            System.arraycopy(objArr, 0, this.hww, 0, i10);
        }
        int i14 = this.f31986tq;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.f31985rs, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.hww, i10, this.f31986tq - i10);
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f31986tq;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f31986tq;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.hww, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f31986tq * 14);
        sb2.append(b.f85382i);
        for (int i10 = 0; i10 < this.f31986tq; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eTq = tq(i10);
            if (eTq != this) {
                sb2.append(eTq);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(b.f85383j);
        return sb2.toString();
    }

    public E tq(int i10) {
        return (E) this.hww[i10];
    }

    public hww(int i10) {
        if (i10 == 0) {
            this.f31985rs = f31984sd;
            this.hww = vy;
        } else {
            vy(i10);
        }
        this.f31986tq = 0;
    }

    private weu<E, E> tq() {
        if (this.nod == null) {
            this.nod = new weu<E, E>() { // from class: com.bytedance.adsdk.tq.hww.1
                @Override // com.bytedance.adsdk.tq.weu
                public int hww() {
                    return hww.this.f31986tq;
                }

                @Override // com.bytedance.adsdk.tq.weu
                public void sd() {
                    hww.this.clear();
                }

                @Override // com.bytedance.adsdk.tq.weu
                public Map<E, E> tq() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.tq.weu
                public Object hww(int i10, int i11) {
                    return hww.this.hww[i10];
                }

                @Override // com.bytedance.adsdk.tq.weu
                public int hww(Object obj) {
                    return hww.this.hww(obj);
                }

                @Override // com.bytedance.adsdk.tq.weu
                public void hww(int i10) {
                    hww.this.sd(i10);
                }
            };
        }
        return this.nod;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f31986tq) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f31986tq));
        }
        System.arraycopy(this.hww, 0, tArr, 0, this.f31986tq);
        int length = tArr.length;
        int i10 = this.f31986tq;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int hww() {
        int i10 = this.f31986tq;
        if (i10 == 0) {
            return -1;
        }
        int iHww = tq.hww(this.f31985rs, i10, 0);
        if (iHww < 0 || this.hww[iHww] == null) {
            return iHww;
        }
        int i11 = iHww + 1;
        while (i11 < i10 && this.f31985rs[i11] == 0) {
            if (this.hww[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iHww - 1; i12 >= 0 && this.f31985rs[i12] == 0; i12--) {
            if (this.hww[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void hww(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (hww.class) {
                try {
                    if (f31983ok < 10) {
                        objArr[0] = vgm;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        vgm = objArr;
                        f31983ok++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (hww.class) {
                try {
                    if (f31981hu < 10) {
                        objArr[0] = f31982hv;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f31982hv = objArr;
                        f31981hu++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void hww(int i10) {
        int[] iArr = this.f31985rs;
        if (iArr.length < i10) {
            Object[] objArr = this.hww;
            vy(i10);
            int i11 = this.f31986tq;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f31985rs, 0, i11);
                System.arraycopy(objArr, 0, this.hww, 0, this.f31986tq);
            }
            hww(iArr, objArr, this.f31986tq);
        }
    }

    public int hww(Object obj) {
        return obj == null ? hww() : hww(obj, obj.hashCode());
    }
}
