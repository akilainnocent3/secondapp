package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class sqk0 extends fqk0 {
    public static final Object[] v;
    public static final sqk0 w;
    public final transient Object[] c;
    public final transient int d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int i;

    static {
        Object[] objArr = new Object[0];
        v = objArr;
        w = new sqk0(0, 0, 0, objArr, objArr);
    }

    public sqk0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.c = objArr;
        this.d = i;
        this.e = objArr2;
        this.f = i2;
        this.i = i3;
    }

    @Override // defpackage.spk0
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.i);
    }

    @Override // defpackage.spk0
    public final int b() {
        return this.i;
    }

    @Override // defpackage.spk0
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.e;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // defpackage.spk0
    public final Object[] d() {
        return this.c;
    }

    @Override // defpackage.fqk0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        eqk0 oqk0Var = this.b;
        if (oqk0Var == null) {
            upk0 upk0Var = eqk0.b;
            int i = this.i;
            oqk0Var = i == 0 ? oqk0.e : new oqk0(i, this.c);
            this.b = oqk0Var;
        }
        return oqk0Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }
}
