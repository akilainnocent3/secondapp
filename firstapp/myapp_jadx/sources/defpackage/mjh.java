package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import mjh.a;

/* JADX INFO: loaded from: classes.dex */
public final class mjh<T extends a<T>> {
    public static final mjh<?> d = new mjh<>(0);
    public final q1a0 a;
    public boolean b;
    public boolean c;

    public interface a<T extends a<T>> extends Comparable<T> {
        ngj0 getLiteJavaType();
    }

    public mjh(int i) {
        int i2 = r1a0.f;
        this.a = new q1a0();
        h();
        h();
    }

    public static int b(kgj0 kgj0Var, int i, Object obj) {
        int size;
        int iN0;
        int iM0 = q08.m0(i);
        if (kgj0Var == kgj0.d) {
            iM0 *= 2;
        }
        int iO0 = 4;
        switch (kgj0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = q08.c;
                iO0 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = q08.c;
                break;
            case 2:
                iO0 = q08.o0(((Long) obj).longValue());
                break;
            case 3:
                iO0 = q08.o0(((Long) obj).longValue());
                break;
            case 4:
                iO0 = q08.o0(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = q08.c;
                iO0 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = q08.c;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = q08.c;
                iO0 = 1;
                break;
            case 8:
                if (!(obj instanceof pl5)) {
                    iO0 = q08.l0((String) obj);
                } else {
                    Logger logger6 = q08.c;
                    size = ((pl5) obj).size();
                    iN0 = q08.n0(size);
                    iO0 = iN0 + size;
                }
                break;
            case 9:
                Logger logger7 = q08.c;
                iO0 = ((xnv) obj).getSerializedSize();
                break;
            case 10:
                if (!(obj instanceof bur)) {
                    Logger logger8 = q08.c;
                    size = ((xnv) obj).getSerializedSize();
                    iN0 = q08.n0(size);
                    iO0 = iN0 + size;
                } else {
                    iO0 = q08.i0((bur) obj);
                }
                break;
            case 11:
                if (obj instanceof pl5) {
                    Logger logger9 = q08.c;
                    size = ((pl5) obj).size();
                    iN0 = q08.n0(size);
                } else {
                    Logger logger10 = q08.c;
                    size = ((byte[]) obj).length;
                    iN0 = q08.n0(size);
                }
                iO0 = iN0 + size;
                break;
            case 12:
                iO0 = q08.n0(((Integer) obj).intValue());
                break;
            case 13:
                iO0 = !(obj instanceof fyo.a) ? q08.o0(((Integer) obj).intValue()) : q08.o0(((fyo.a) obj).getNumber());
                break;
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = q08.c;
                break;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = q08.c;
                iO0 = 8;
                break;
            case 16:
                iO0 = q08.j0(((Integer) obj).intValue());
                break;
            case 17:
                iO0 = q08.k0(((Long) obj).longValue());
                break;
            default:
                b9p.a("There is no way to get here, but the compiler thinks otherwise.");
                iO0 = 0;
                break;
        }
        return iO0 + iM0;
    }

    public static int c(a<?> aVar, Object obj) {
        aVar.getClass();
        return b(null, 0, obj);
    }

    public static int d(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.getLiteJavaType();
        throw null;
    }

    public static <T extends a<T>> boolean f(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    public static void k(q08 q08Var, kgj0 kgj0Var, int i, Object obj) {
        if (kgj0Var == kgj0.d) {
            q08Var.H0(i, 3);
            ((xnv) obj).a(q08Var);
            q08Var.H0(i, 4);
        }
        q08Var.H0(i, kgj0Var.b);
        switch (kgj0Var.ordinal()) {
            case 0:
                q08Var.y0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                q08Var.w0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                q08Var.L0(((Long) obj).longValue());
                break;
            case 3:
                q08Var.L0(((Long) obj).longValue());
                break;
            case 4:
                q08Var.A0(((Integer) obj).intValue());
                break;
            case 5:
                q08Var.y0(((Long) obj).longValue());
                break;
            case 6:
                q08Var.w0(((Integer) obj).intValue());
                break;
            case 7:
                q08Var.q0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof pl5)) {
                    q08Var.G0((String) obj);
                } else {
                    q08Var.u0((pl5) obj);
                }
                break;
            case 9:
                ((xnv) obj).a(q08Var);
                break;
            case 10:
                q08Var.C0((xnv) obj);
                break;
            case 11:
                if (!(obj instanceof pl5)) {
                    byte[] bArr = (byte[]) obj;
                    q08Var.s0(bArr.length, bArr);
                } else {
                    q08Var.u0((pl5) obj);
                }
                break;
            case 12:
                q08Var.J0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof fyo.a)) {
                    q08Var.A0(((Integer) obj).intValue());
                } else {
                    q08Var.A0(((fyo.a) obj).getNumber());
                }
                break;
            case 14:
                q08Var.w0(((Integer) obj).intValue());
                break;
            case 15:
                q08Var.y0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                q08Var.J0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                q08Var.L0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mjh<T> clone() {
        mjh<T> mjhVar = new mjh<>();
        q1a0 q1a0Var = this.a;
        if (q1a0Var.a.size() > 0) {
            Map.Entry<a<Object>, Object> entryD = q1a0Var.d(0);
            mjhVar.j(entryD.getKey(), entryD.getValue());
            throw null;
        }
        Iterator it = q1a0Var.e().iterator();
        if (!it.hasNext()) {
            mjhVar.c = this.c;
            return mjhVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        mjhVar.j((a) entry.getKey(), entry.getValue());
        throw null;
    }

    public final boolean e() {
        q1a0 q1a0Var = this.a;
        if (q1a0Var.a.size() > 0) {
            f(q1a0Var.d(0));
            throw null;
        }
        Iterator it = q1a0Var.e().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mjh) {
            return this.a.equals(((mjh) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        q1a0 q1a0Var = this.a;
        if (q1a0Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (!this.c) {
            return ((r1a0.c) q1a0Var.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((r1a0.c) q1a0Var.entrySet()).iterator();
        bur.b bVar = new bur.b();
        bVar.a = it;
        return bVar;
    }

    public final void h() {
        if (this.b) {
            return;
        }
        q1a0 q1a0Var = this.a;
        int size = q1a0Var.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<a<Object>, Object> entryD = q1a0Var.d(i);
            if (entryD.getValue() instanceof m1k) {
                m1k m1kVar = (m1k) entryD.getValue();
                m1kVar.getClass();
                w630 w630Var = w630.c;
                w630Var.getClass();
                w630Var.a(m1kVar.getClass()).makeImmutable(m1kVar);
                m1kVar.j();
            }
        }
        q1a0Var.g();
        this.b = true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        entry.getValue();
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    public final void j(T t, Object obj) {
        t.getClass();
        t.getClass();
        Charset charset = fyo.a;
        obj.getClass();
        throw null;
    }

    public mjh() {
        int i = r1a0.f;
        this.a = new q1a0();
    }
}
