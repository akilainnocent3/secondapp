package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f5a0<T> extends mw0<T> {
    public T[] e;
    public T[] f;
    public int i;

    @Override // defpackage.mw0
    public final void clear() {
        k();
        super.clear();
    }

    @Override // defpackage.mw0
    public final T e(int i) {
        k();
        return (T) super.e(i);
    }

    @Override // defpackage.mw0
    public final void f(int i, T t) {
        throw null;
    }

    @Override // defpackage.mw0
    public final T[] h(int i) {
        k();
        return (T[]) super.h(i);
    }

    @Override // defpackage.mw0
    public final void j(int i) {
        k();
        super.j(i);
    }

    public final void k() {
        T[] tArr;
        T[] tArr2 = this.e;
        if (tArr2 == null || tArr2 != (tArr = this.a)) {
            return;
        }
        T[] tArr3 = this.f;
        if (tArr3 != null) {
            int length = tArr3.length;
            int i = this.b;
            if (length >= i) {
                System.arraycopy(tArr, 0, tArr3, 0, i);
                this.a = this.f;
                this.f = null;
                return;
            }
        }
        this.a = (T[]) Arrays.copyOf(tArr, tArr.length);
    }

    @Override // defpackage.mw0
    public final T pop() {
        k();
        return (T) super.pop();
    }
}
