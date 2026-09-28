package defpackage;

import com.google.protobuf.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p08 {
    public final k08 a;
    public int b;
    public int c;
    public int d = 0;

    public p08(k08 k08Var) {
        fyo.a(k08Var, "input");
        this.a = k08Var;
        k08Var.d = this;
    }

    public static void y(int i) throws e0p {
        if ((i & 3) != 0) {
            throw new e0p("Failed to parse the message.");
        }
    }

    public static void z(int i) throws e0p {
        if ((i & 7) != 0) {
            throw new e0p("Failed to parse the message.");
        }
    }

    public final int a() {
        int iU = this.d;
        if (iU != 0) {
            this.b = iU;
            this.d = 0;
        } else {
            iU = this.a.u();
            this.b = iU;
        }
        return (iU == 0 || iU == this.c) ? Reader.READ_DONE : iU >>> 3;
    }

    public final <T> void b(T t, bn70<T> bn70Var, q3h q3hVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            bn70Var.c(t, this, q3hVar);
            if (this.b != this.c) {
                throw new e0p("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final <T> void c(T t, bn70<T> bn70Var, q3h q3hVar) throws e0p {
        k08 k08Var = this.a;
        int iV = k08Var.v();
        if (k08Var.a >= k08Var.b) {
            throw new e0p("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = k08Var.e(iV);
        k08Var.a++;
        bn70Var.c(t, this, q3hVar);
        k08Var.a(0);
        k08Var.a--;
        k08Var.d(iE);
    }

    public final void d(List<Boolean> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof u15;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(k08Var.f()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iB = k08Var.b() + k08Var.v();
            do {
                list.add(Boolean.valueOf(k08Var.f()));
            } while (k08Var.b() < iB);
            v(iB);
            return;
        }
        u15 u15Var = (u15) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                u15Var.addBoolean(k08Var.f());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iB2 = k08Var.b() + k08Var.v();
        do {
            u15Var.addBoolean(k08Var.f());
        } while (k08Var.b() < iB2);
        v(iB2);
    }

    public final pl5 e() throws e0p.a {
        w(2);
        return this.a.g();
    }

    public final void f(List<pl5> list) throws e0p.a {
        int iU;
        if ((this.b & 7) != 2) {
            throw e0p.b();
        }
        do {
            list.add(e());
            k08 k08Var = this.a;
            if (k08Var.c()) {
                return;
            } else {
                iU = k08Var.u();
            }
        } while (iU == this.b);
        this.d = iU;
    }

    public final void g(List<Double> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof bze;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(k08Var.h()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iV = k08Var.v();
            z(iV);
            int iB = k08Var.b() + iV;
            do {
                list.add(Double.valueOf(k08Var.h()));
            } while (k08Var.b() < iB);
            return;
        }
        bze bzeVar = (bze) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                bzeVar.addDouble(k08Var.h());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iV2 = k08Var.v();
        z(iV2);
        int iB2 = k08Var.b() + iV2;
        do {
            bzeVar.addDouble(k08Var.h());
        } while (k08Var.b() < iB2);
    }

    public final void h(List<Integer> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof svo;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(k08Var.i()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iB = k08Var.b() + k08Var.v();
            do {
                list.add(Integer.valueOf(k08Var.i()));
            } while (k08Var.b() < iB);
            v(iB);
            return;
        }
        svo svoVar = (svo) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                svoVar.addInt(k08Var.i());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iB2 = k08Var.b() + k08Var.v();
        do {
            svoVar.addInt(k08Var.i());
        } while (k08Var.b() < iB2);
        v(iB2);
    }

    public final Object i(kgj0 kgj0Var, Class<?> cls, q3h q3hVar) throws e0p {
        int iOrdinal = kgj0Var.ordinal();
        k08 k08Var = this.a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(k08Var.h());
            case 1:
                w(5);
                return Float.valueOf(k08Var.l());
            case 2:
                w(0);
                return Long.valueOf(k08Var.n());
            case 3:
                w(0);
                return Long.valueOf(k08Var.w());
            case 4:
                w(0);
                return Integer.valueOf(k08Var.m());
            case 5:
                w(1);
                return Long.valueOf(k08Var.k());
            case 6:
                w(5);
                return Integer.valueOf(k08Var.j());
            case 7:
                w(0);
                return Boolean.valueOf(k08Var.f());
            case 8:
                w(2);
                return k08Var.t();
            case 9:
            default:
                hb5.a("unsupported field type.");
                return null;
            case 10:
                w(2);
                bn70 bn70VarA = w630.c.a(cls);
                Object objNewInstance = bn70VarA.newInstance();
                c(objNewInstance, bn70VarA, q3hVar);
                bn70VarA.makeImmutable(objNewInstance);
                return objNewInstance;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(k08Var.v());
            case 13:
                w(0);
                return Integer.valueOf(k08Var.i());
            case 14:
                w(5);
                return Integer.valueOf(k08Var.o());
            case 15:
                w(1);
                return Long.valueOf(k08Var.p());
            case 16:
                w(0);
                return Integer.valueOf(k08Var.q());
            case 17:
                w(0);
                return Long.valueOf(k08Var.r());
        }
    }

    public final void j(List<Integer> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof svo;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iV = k08Var.v();
                y(iV);
                int iB = k08Var.b() + iV;
                do {
                    list.add(Integer.valueOf(k08Var.j()));
                } while (k08Var.b() < iB);
                return;
            }
            if (i2 != 5) {
                throw e0p.b();
            }
            do {
                list.add(Integer.valueOf(k08Var.j()));
                if (k08Var.c()) {
                    return;
                } else {
                    iU = k08Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        svo svoVar = (svo) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iV2 = k08Var.v();
            y(iV2);
            int iB2 = k08Var.b() + iV2;
            do {
                svoVar.addInt(k08Var.j());
            } while (k08Var.b() < iB2);
            return;
        }
        if (i3 != 5) {
            throw e0p.b();
        }
        do {
            svoVar.addInt(k08Var.j());
            if (k08Var.c()) {
                return;
            } else {
                iU2 = k08Var.u();
            }
        } while (iU2 == this.b);
        this.d = iU2;
    }

    public final void k(List<Long> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof mjt;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(k08Var.k()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iV = k08Var.v();
            z(iV);
            int iB = k08Var.b() + iV;
            do {
                list.add(Long.valueOf(k08Var.k()));
            } while (k08Var.b() < iB);
            return;
        }
        mjt mjtVar = (mjt) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                mjtVar.addLong(k08Var.k());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iV2 = k08Var.v();
        z(iV2);
        int iB2 = k08Var.b() + iV2;
        do {
            mjtVar.addLong(k08Var.k());
        } while (k08Var.b() < iB2);
    }

    public final void l(List<Float> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof swh;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iV = k08Var.v();
                y(iV);
                int iB = k08Var.b() + iV;
                do {
                    list.add(Float.valueOf(k08Var.l()));
                } while (k08Var.b() < iB);
                return;
            }
            if (i2 != 5) {
                throw e0p.b();
            }
            do {
                list.add(Float.valueOf(k08Var.l()));
                if (k08Var.c()) {
                    return;
                } else {
                    iU = k08Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        swh swhVar = (swh) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iV2 = k08Var.v();
            y(iV2);
            int iB2 = k08Var.b() + iV2;
            do {
                swhVar.addFloat(k08Var.l());
            } while (k08Var.b() < iB2);
            return;
        }
        if (i3 != 5) {
            throw e0p.b();
        }
        do {
            swhVar.addFloat(k08Var.l());
            if (k08Var.c()) {
                return;
            } else {
                iU2 = k08Var.u();
            }
        } while (iU2 == this.b);
        this.d = iU2;
    }

    public final void m(List<Integer> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof svo;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(k08Var.m()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iB = k08Var.b() + k08Var.v();
            do {
                list.add(Integer.valueOf(k08Var.m()));
            } while (k08Var.b() < iB);
            v(iB);
            return;
        }
        svo svoVar = (svo) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                svoVar.addInt(k08Var.m());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iB2 = k08Var.b() + k08Var.v();
        do {
            svoVar.addInt(k08Var.m());
        } while (k08Var.b() < iB2);
        v(iB2);
    }

    public final void n(List<Long> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof mjt;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(k08Var.n()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iB = k08Var.b() + k08Var.v();
            do {
                list.add(Long.valueOf(k08Var.n()));
            } while (k08Var.b() < iB);
            v(iB);
            return;
        }
        mjt mjtVar = (mjt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                mjtVar.addLong(k08Var.n());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iB2 = k08Var.b() + k08Var.v();
        do {
            mjtVar.addLong(k08Var.n());
        } while (k08Var.b() < iB2);
        v(iB2);
    }

    public final void o(List<Integer> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof svo;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iV = k08Var.v();
                y(iV);
                int iB = k08Var.b() + iV;
                do {
                    list.add(Integer.valueOf(k08Var.o()));
                } while (k08Var.b() < iB);
                return;
            }
            if (i2 != 5) {
                throw e0p.b();
            }
            do {
                list.add(Integer.valueOf(k08Var.o()));
                if (k08Var.c()) {
                    return;
                } else {
                    iU = k08Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        svo svoVar = (svo) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iV2 = k08Var.v();
            y(iV2);
            int iB2 = k08Var.b() + iV2;
            do {
                svoVar.addInt(k08Var.o());
            } while (k08Var.b() < iB2);
            return;
        }
        if (i3 != 5) {
            throw e0p.b();
        }
        do {
            svoVar.addInt(k08Var.o());
            if (k08Var.c()) {
                return;
            } else {
                iU2 = k08Var.u();
            }
        } while (iU2 == this.b);
        this.d = iU2;
    }

    public final void p(List<Long> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof mjt;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(k08Var.p()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iV = k08Var.v();
            z(iV);
            int iB = k08Var.b() + iV;
            do {
                list.add(Long.valueOf(k08Var.p()));
            } while (k08Var.b() < iB);
            return;
        }
        mjt mjtVar = (mjt) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                mjtVar.addLong(k08Var.p());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iV2 = k08Var.v();
        z(iV2);
        int iB2 = k08Var.b() + iV2;
        do {
            mjtVar.addLong(k08Var.p());
        } while (k08Var.b() < iB2);
    }

    public final void q(List<Integer> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof svo;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(k08Var.q()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iB = k08Var.b() + k08Var.v();
            do {
                list.add(Integer.valueOf(k08Var.q()));
            } while (k08Var.b() < iB);
            v(iB);
            return;
        }
        svo svoVar = (svo) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                svoVar.addInt(k08Var.q());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iB2 = k08Var.b() + k08Var.v();
        do {
            svoVar.addInt(k08Var.q());
        } while (k08Var.b() < iB2);
        v(iB2);
    }

    public final void r(List<Long> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof mjt;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(k08Var.r()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iB = k08Var.b() + k08Var.v();
            do {
                list.add(Long.valueOf(k08Var.r()));
            } while (k08Var.b() < iB);
            v(iB);
            return;
        }
        mjt mjtVar = (mjt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                mjtVar.addLong(k08Var.r());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iB2 = k08Var.b() + k08Var.v();
        do {
            mjtVar.addLong(k08Var.r());
        } while (k08Var.b() < iB2);
        v(iB2);
    }

    public final void s(List<String> list, boolean z) throws e0p.a {
        String strS;
        int iU;
        int iU2;
        if ((this.b & 7) != 2) {
            throw e0p.b();
        }
        boolean z2 = list instanceof z0s;
        k08 k08Var = this.a;
        if (z2 && !z) {
            z0s z0sVar = (z0s) list;
            do {
                e();
                z0sVar.g();
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        do {
            if (z) {
                w(2);
                strS = k08Var.t();
            } else {
                w(2);
                strS = k08Var.s();
            }
            list.add(strS);
            if (k08Var.c()) {
                return;
            } else {
                iU = k08Var.u();
            }
        } while (iU == this.b);
        this.d = iU;
    }

    public final void t(List<Integer> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof svo;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(k08Var.v()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iB = k08Var.b() + k08Var.v();
            do {
                list.add(Integer.valueOf(k08Var.v()));
            } while (k08Var.b() < iB);
            v(iB);
            return;
        }
        svo svoVar = (svo) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                svoVar.addInt(k08Var.v());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iB2 = k08Var.b() + k08Var.v();
        do {
            svoVar.addInt(k08Var.v());
        } while (k08Var.b() < iB2);
        v(iB2);
    }

    public final void u(List<Long> list) throws e0p {
        int iU;
        int iU2;
        boolean z = list instanceof mjt;
        int i = this.b;
        k08 k08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(k08Var.w()));
                    if (k08Var.c()) {
                        return;
                    } else {
                        iU = k08Var.u();
                    }
                } while (iU == this.b);
                this.d = iU;
                return;
            }
            if (i2 != 2) {
                throw e0p.b();
            }
            int iB = k08Var.b() + k08Var.v();
            do {
                list.add(Long.valueOf(k08Var.w()));
            } while (k08Var.b() < iB);
            v(iB);
            return;
        }
        mjt mjtVar = (mjt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                mjtVar.addLong(k08Var.w());
                if (k08Var.c()) {
                    return;
                } else {
                    iU2 = k08Var.u();
                }
            } while (iU2 == this.b);
            this.d = iU2;
            return;
        }
        if (i3 != 2) {
            throw e0p.b();
        }
        int iB2 = k08Var.b() + k08Var.v();
        do {
            mjtVar.addLong(k08Var.w());
        } while (k08Var.b() < iB2);
        v(iB2);
    }

    public final void v(int i) throws e0p {
        if (this.a.b() != i) {
            throw e0p.e();
        }
    }

    public final void w(int i) throws e0p.a {
        if ((this.b & 7) != i) {
            throw e0p.b();
        }
    }

    public final boolean x() {
        int i;
        k08 k08Var = this.a;
        if (k08Var.c() || (i = this.b) == this.c) {
            return false;
        }
        return k08Var.x(i);
    }
}
