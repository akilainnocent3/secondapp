package defpackage;

import defpackage.cpf0;
import java.lang.Comparable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class bpf0<T extends cpf0 & Comparable<? super T>> {
    public static final /* synthetic */ long b = s0o.a.objectFieldOffset(bpf0.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public T[] a;

    public final void a(upg.c cVar) {
        cVar.a((upg.d) this);
        T[] tArr = this.a;
        if (tArr == null) {
            tArr = (T[]) new cpf0[4];
            this.a = tArr;
        } else if (b() >= tArr.length) {
            tArr = (T[]) ((cpf0[]) Arrays.copyOf(tArr, b() * 2));
            this.a = tArr;
        }
        int iB = b();
        s0o.a.putIntVolatile(this, b, iB + 1);
        tArr[iB] = cVar;
        cVar.b = iB;
        d(iB);
    }

    public final int b() {
        return s0o.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[LOOP:0: B:9:0x003e->B:21:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[EDGE_INSN: B:24:0x0082->B:22:0x0082 BREAK  A[LOOP:0: B:9:0x003e->B:21:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[EDGE_INSN: B:25:0x0082->B:22:0x0082 BREAK  A[LOOP:0: B:9:0x003e->B:21:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final T c(int i) {
        int i2;
        int i3;
        T[] tArr;
        int i4;
        T t;
        T t2;
        T t3;
        T t4;
        T[] tArr2 = this.a;
        tArr2.getClass();
        s0o.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                T t5 = tArr2[i];
                t5.getClass();
                T t6 = tArr2[i5];
                t6.getClass();
                if (((Comparable) t5).compareTo(t6) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= b()) {
                            break;
                        }
                        tArr = this.a;
                        tArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            t3 = tArr[i4];
                            t3.getClass();
                            t4 = tArr[i3];
                            t4.getClass();
                            if (((Comparable) t3).compareTo(t4) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        t = tArr[i];
                        t.getClass();
                        t2 = tArr[i4];
                        t2.getClass();
                        if (((Comparable) t).compareTo(t2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= b()) {
                        break;
                        break;
                    }
                    tArr = this.a;
                    tArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        t3 = tArr[i4];
                        t3.getClass();
                        t4 = tArr[i3];
                        t4.getClass();
                        if (((Comparable) t3).compareTo(t4) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    t = tArr[i];
                    t.getClass();
                    t2 = tArr[i4];
                    t2.getClass();
                    if (((Comparable) t).compareTo(t2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        T t7 = tArr2[b()];
        t7.getClass();
        t7.a(null);
        t7.setIndex(-1);
        tArr2[b()] = null;
        return t7;
    }

    public final void d(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            tArr.getClass();
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            t.getClass();
            T t2 = tArr[i];
            t2.getClass();
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        T[] tArr = this.a;
        tArr.getClass();
        T t = tArr[i2];
        t.getClass();
        T t2 = tArr[i];
        t2.getClass();
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
