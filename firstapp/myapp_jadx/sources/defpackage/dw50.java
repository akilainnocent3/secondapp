package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class dw50 implements yfe0, xfe0 {
    public static final TreeMap<Integer, dw50> w = new TreeMap<>();
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] i;
    public int v;

    public dw50(int i) {
        this.a = i;
        int i2 = i + 1;
        this.i = new int[i2];
        this.c = new long[i2];
        this.d = new double[i2];
        this.e = new String[i2];
        this.f = new byte[i2][];
    }

    public static final dw50 g(int i, String str) {
        TreeMap<Integer, dw50> treeMap = w;
        synchronized (treeMap) {
            Map.Entry<Integer, dw50> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                dw50 value = entryCeilingEntry.getValue();
                value.b = str;
                value.v = i;
                return value;
            }
            Unit unit = Unit.a;
            dw50 dw50Var = new dw50(i);
            dw50Var.b = str;
            dw50Var.v = i;
            return dw50Var;
        }
    }

    @Override // defpackage.xfe0
    public final void C0(int i, String str) {
        str.getClass();
        this.i[i] = 4;
        this.e[i] = str;
    }

    @Override // defpackage.xfe0
    public final void Z0(int i, byte[] bArr) {
        this.i[i] = 5;
        this.f[i] = bArr;
    }

    @Override // defpackage.yfe0
    public final String d() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        ib5.a("Required value was null.");
        return null;
    }

    @Override // defpackage.yfe0
    public final void f(xfe0 xfe0Var) {
        int i = this.v;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.i[i2];
            if (i3 == 1) {
                xfe0Var.r(i2);
            } else if (i3 == 2) {
                xfe0Var.q(i2, this.c[i2]);
            } else if (i3 == 3) {
                xfe0Var.i(i2, this.d[i2]);
            } else if (i3 == 4) {
                String str = this.e[i2];
                if (str == null) {
                    hb5.a("Required value was null.");
                    return;
                }
                xfe0Var.C0(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f[i2];
                if (bArr == null) {
                    hb5.a("Required value was null.");
                    return;
                }
                xfe0Var.Z0(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.xfe0
    public final void i(int i, double d) {
        this.i[i] = 3;
        this.d[i] = d;
    }

    public final void l() {
        TreeMap<Integer, dw50> treeMap = w;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.xfe0
    public final void q(int i, long j) {
        this.i[i] = 2;
        this.c[i] = j;
    }

    @Override // defpackage.xfe0
    public final void r(int i) {
        this.i[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
