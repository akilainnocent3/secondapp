package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class c220<T> implements b220<T> {
    public final Object[] a;
    public int b;

    public c220(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            hb5.a("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // defpackage.b220
    public boolean a(T t) {
        t.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = t;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == t) {
                ib5.a("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.b220
    public T b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        t.getClass();
        objArr[i2] = null;
        this.b--;
        return t;
    }
}
