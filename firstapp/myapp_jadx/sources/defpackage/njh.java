package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import njh.a;

/* JADX INFO: loaded from: classes4.dex */
public final class njh<T extends a<T>> {
    public static final njh d = new njh(0);
    public final p1a0 a;
    public boolean b;
    public boolean c;

    public interface a<T extends a<T>> extends Comparable<T> {
        mgj0 getLiteJavaType();
    }

    public njh(int i) {
        int i2 = s1a0.i;
        this.a = new p1a0(0);
        g();
        g();
    }

    public static int b(a<?> aVar, Object obj) {
        int size;
        int iH0;
        aVar.getClass();
        int iI0 = 0;
        int iF0 = r08.f0(0);
        Enum r2 = null;
        if (lgj0.a == null) {
            iF0 *= 2;
        }
        switch (r2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = r08.d;
                iI0 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = r08.d;
                iI0 = 4;
                break;
            case 2:
                iI0 = r08.i0(((Long) obj).longValue());
                break;
            case 3:
                iI0 = r08.i0(((Long) obj).longValue());
                break;
            case 4:
                iI0 = r08.c0(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = r08.d;
                iI0 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = r08.d;
                iI0 = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = r08.d;
                iI0 = 1;
                break;
            case 8:
                if (!(obj instanceof ql5)) {
                    iI0 = r08.e0((String) obj);
                } else {
                    Logger logger6 = r08.d;
                    size = ((ql5) obj).size();
                    iH0 = r08.h0(size);
                    iI0 = size + iH0;
                }
                break;
            case 9:
                Logger logger7 = r08.d;
                iI0 = ((wnv) obj).getSerializedSize();
                break;
            case 10:
                if (!(obj instanceof cur)) {
                    Logger logger8 = r08.d;
                    size = ((wnv) obj).getSerializedSize();
                    iH0 = r08.h0(size);
                    iI0 = size + iH0;
                } else {
                    iI0 = r08.d0((cur) obj);
                }
                break;
            case 11:
                if (obj instanceof ql5) {
                    Logger logger9 = r08.d;
                    size = ((ql5) obj).size();
                    iH0 = r08.h0(size);
                } else {
                    Logger logger10 = r08.d;
                    size = ((byte[]) obj).length;
                    iH0 = r08.h0(size);
                }
                iI0 = size + iH0;
                break;
            case 12:
                iI0 = r08.h0(((Integer) obj).intValue());
                break;
            case 13:
                iI0 = !(obj instanceof gyo.a) ? r08.c0(((Integer) obj).intValue()) : r08.c0(((gyo.a) obj).getNumber());
                break;
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = r08.d;
                iI0 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = r08.d;
                iI0 = 8;
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iI0 = r08.h0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iI0 = r08.i0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            default:
                b9p.a("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return iI0 + iF0;
    }

    public static int c(Map.Entry entry) {
        r08.f0(1);
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.getLiteJavaType();
        throw null;
    }

    public static <T extends a<T>> boolean e(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final njh<T> clone() {
        njh<T> njhVar = new njh<>();
        p1a0 p1a0Var = this.a;
        if (p1a0Var.b.size() > 0) {
            Map.Entry<Object, Object> entryD = p1a0Var.d(0);
            njhVar.i((a) entryD.getKey(), entryD.getValue());
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = p1a0Var.e().iterator();
        if (!it.hasNext()) {
            njhVar.c = this.c;
            return njhVar;
        }
        Map.Entry<Object, Object> next = it.next();
        njhVar.i((a) next.getKey(), next.getValue());
        throw null;
    }

    public final boolean d() {
        p1a0 p1a0Var = this.a;
        if (p1a0Var.b.size() > 0) {
            e(p1a0Var.d(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = p1a0Var.e().iterator();
        if (!it.hasNext()) {
            return true;
        }
        e(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof njh) {
            return this.a.equals(((njh) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> f() {
        boolean z = this.c;
        p1a0 p1a0Var = this.a;
        if (!z) {
            return ((s1a0.d) p1a0Var.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((s1a0.d) p1a0Var.entrySet()).iterator();
        cur.b bVar = new cur.b();
        bVar.a = it;
        return bVar;
    }

    public final void g() {
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            p1a0 p1a0Var = this.a;
            if (i >= p1a0Var.b.size()) {
                p1a0Var.g();
                this.b = true;
                return;
            }
            Map.Entry<Object, Object> entryD = p1a0Var.d(i);
            if (entryD.getValue() instanceof n1k) {
                n1k n1kVar = (n1k) entryD.getValue();
                n1kVar.getClass();
                u630 u630Var = u630.c;
                u630Var.getClass();
                u630Var.a(n1kVar.getClass()).makeImmutable(n1kVar);
                n1kVar.o();
            }
            i++;
        }
    }

    public final void h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof cur) {
            ((cur) value).a(null);
        }
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(T t, Object obj) {
        t.getClass();
        t.getClass();
        Charset charset = gyo.a;
        obj.getClass();
        throw null;
    }

    public njh() {
        int i = s1a0.i;
        this.a = new p1a0(16);
    }
}
