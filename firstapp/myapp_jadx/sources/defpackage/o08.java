package defpackage;

import com.google.protobuf.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o08 {
    public final m08 a;
    public int b;
    public int c;
    public int d = 0;

    public o08(m08 m08Var) {
        gyo.a(m08Var, "input");
        this.a = m08Var;
        m08Var.d = this;
    }

    public static void x(int i) throws f0p {
        if ((i & 3) != 0) {
            throw f0p.f();
        }
    }

    public static void y(int i) throws f0p {
        if ((i & 7) != 0) {
            throw f0p.f();
        }
    }

    public final int a() {
        int iW = this.d;
        if (iW != 0) {
            this.b = iW;
            this.d = 0;
        } else {
            iW = this.a.w();
            this.b = iW;
        }
        return (iW == 0 || iW == this.c) ? Reader.READ_DONE : iW >>> 3;
    }

    public final <T> void b(T t, an70<T> an70Var, r3h r3hVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            an70Var.b(t, this, r3hVar);
            if (this.b != this.c) {
                throw f0p.f();
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final <T> void c(T t, an70<T> an70Var, r3h r3hVar) throws f0p {
        m08 m08Var = this.a;
        int iX = m08Var.x();
        if (m08Var.a >= m08Var.b) {
            throw new f0p("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iG = m08Var.g(iX);
        m08Var.a++;
        an70Var.b(t, this, r3hVar);
        m08Var.a(0);
        m08Var.a--;
        m08Var.f(iG);
    }

    public final void d(List<Boolean> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof t15;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(m08Var.h()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iD = m08Var.d() + m08Var.x();
            do {
                list.add(Boolean.valueOf(m08Var.h()));
            } while (m08Var.d() < iD);
            u(iD);
            return;
        }
        t15 t15Var = (t15) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                t15Var.addBoolean(m08Var.h());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iD2 = m08Var.d() + m08Var.x();
        do {
            t15Var.addBoolean(m08Var.h());
        } while (m08Var.d() < iD2);
        u(iD2);
    }

    public final ql5 e() throws f0p.a {
        v(2);
        return this.a.i();
    }

    public final void f(List<ql5> list) throws f0p.a {
        int iW;
        if ((this.b & 7) != 2) {
            throw f0p.c();
        }
        do {
            list.add(e());
            m08 m08Var = this.a;
            if (m08Var.e()) {
                return;
            } else {
                iW = m08Var.w();
            }
        } while (iW == this.b);
        this.d = iW;
    }

    public final void g(List<Double> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof aze;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(m08Var.j()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iX = m08Var.x();
            y(iX);
            int iD = m08Var.d() + iX;
            do {
                list.add(Double.valueOf(m08Var.j()));
            } while (m08Var.d() < iD);
            return;
        }
        aze azeVar = (aze) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                azeVar.addDouble(m08Var.j());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iX2 = m08Var.x();
        y(iX2);
        int iD2 = m08Var.d() + iX2;
        do {
            azeVar.addDouble(m08Var.j());
        } while (m08Var.d() < iD2);
    }

    public final void h(List<Integer> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof rvo;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(m08Var.k()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iD = m08Var.d() + m08Var.x();
            do {
                list.add(Integer.valueOf(m08Var.k()));
            } while (m08Var.d() < iD);
            u(iD);
            return;
        }
        rvo rvoVar = (rvo) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                rvoVar.addInt(m08Var.k());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iD2 = m08Var.d() + m08Var.x();
        do {
            rvoVar.addInt(m08Var.k());
        } while (m08Var.d() < iD2);
        u(iD2);
    }

    public final void i(List<Integer> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof rvo;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iX = m08Var.x();
                x(iX);
                int iD = m08Var.d() + iX;
                do {
                    list.add(Integer.valueOf(m08Var.l()));
                } while (m08Var.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw f0p.c();
            }
            do {
                list.add(Integer.valueOf(m08Var.l()));
                if (m08Var.e()) {
                    return;
                } else {
                    iW = m08Var.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        rvo rvoVar = (rvo) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iX2 = m08Var.x();
            x(iX2);
            int iD2 = m08Var.d() + iX2;
            do {
                rvoVar.addInt(m08Var.l());
            } while (m08Var.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw f0p.c();
        }
        do {
            rvoVar.addInt(m08Var.l());
            if (m08Var.e()) {
                return;
            } else {
                iW2 = m08Var.w();
            }
        } while (iW2 == this.b);
        this.d = iW2;
    }

    public final void j(List<Long> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof ljt;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(m08Var.m()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iX = m08Var.x();
            y(iX);
            int iD = m08Var.d() + iX;
            do {
                list.add(Long.valueOf(m08Var.m()));
            } while (m08Var.d() < iD);
            return;
        }
        ljt ljtVar = (ljt) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ljtVar.addLong(m08Var.m());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iX2 = m08Var.x();
        y(iX2);
        int iD2 = m08Var.d() + iX2;
        do {
            ljtVar.addLong(m08Var.m());
        } while (m08Var.d() < iD2);
    }

    public final void k(List<Float> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof rwh;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iX = m08Var.x();
                x(iX);
                int iD = m08Var.d() + iX;
                do {
                    list.add(Float.valueOf(m08Var.n()));
                } while (m08Var.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw f0p.c();
            }
            do {
                list.add(Float.valueOf(m08Var.n()));
                if (m08Var.e()) {
                    return;
                } else {
                    iW = m08Var.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        rwh rwhVar = (rwh) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iX2 = m08Var.x();
            x(iX2);
            int iD2 = m08Var.d() + iX2;
            do {
                rwhVar.addFloat(m08Var.n());
            } while (m08Var.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw f0p.c();
        }
        do {
            rwhVar.addFloat(m08Var.n());
            if (m08Var.e()) {
                return;
            } else {
                iW2 = m08Var.w();
            }
        } while (iW2 == this.b);
        this.d = iW2;
    }

    public final void l(List<Integer> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof rvo;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(m08Var.o()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iD = m08Var.d() + m08Var.x();
            do {
                list.add(Integer.valueOf(m08Var.o()));
            } while (m08Var.d() < iD);
            u(iD);
            return;
        }
        rvo rvoVar = (rvo) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                rvoVar.addInt(m08Var.o());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iD2 = m08Var.d() + m08Var.x();
        do {
            rvoVar.addInt(m08Var.o());
        } while (m08Var.d() < iD2);
        u(iD2);
    }

    public final void m(List<Long> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof ljt;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(m08Var.p()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iD = m08Var.d() + m08Var.x();
            do {
                list.add(Long.valueOf(m08Var.p()));
            } while (m08Var.d() < iD);
            u(iD);
            return;
        }
        ljt ljtVar = (ljt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ljtVar.addLong(m08Var.p());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iD2 = m08Var.d() + m08Var.x();
        do {
            ljtVar.addLong(m08Var.p());
        } while (m08Var.d() < iD2);
        u(iD2);
    }

    public final void n(List<Integer> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof rvo;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iX = m08Var.x();
                x(iX);
                int iD = m08Var.d() + iX;
                do {
                    list.add(Integer.valueOf(m08Var.q()));
                } while (m08Var.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw f0p.c();
            }
            do {
                list.add(Integer.valueOf(m08Var.q()));
                if (m08Var.e()) {
                    return;
                } else {
                    iW = m08Var.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        rvo rvoVar = (rvo) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iX2 = m08Var.x();
            x(iX2);
            int iD2 = m08Var.d() + iX2;
            do {
                rvoVar.addInt(m08Var.q());
            } while (m08Var.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw f0p.c();
        }
        do {
            rvoVar.addInt(m08Var.q());
            if (m08Var.e()) {
                return;
            } else {
                iW2 = m08Var.w();
            }
        } while (iW2 == this.b);
        this.d = iW2;
    }

    public final void o(List<Long> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof ljt;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(m08Var.r()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iX = m08Var.x();
            y(iX);
            int iD = m08Var.d() + iX;
            do {
                list.add(Long.valueOf(m08Var.r()));
            } while (m08Var.d() < iD);
            return;
        }
        ljt ljtVar = (ljt) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ljtVar.addLong(m08Var.r());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iX2 = m08Var.x();
        y(iX2);
        int iD2 = m08Var.d() + iX2;
        do {
            ljtVar.addLong(m08Var.r());
        } while (m08Var.d() < iD2);
    }

    public final void p(List<Integer> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof rvo;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(m08Var.s()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iD = m08Var.d() + m08Var.x();
            do {
                list.add(Integer.valueOf(m08Var.s()));
            } while (m08Var.d() < iD);
            u(iD);
            return;
        }
        rvo rvoVar = (rvo) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                rvoVar.addInt(m08Var.s());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iD2 = m08Var.d() + m08Var.x();
        do {
            rvoVar.addInt(m08Var.s());
        } while (m08Var.d() < iD2);
        u(iD2);
    }

    public final void q(List<Long> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof ljt;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(m08Var.t()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iD = m08Var.d() + m08Var.x();
            do {
                list.add(Long.valueOf(m08Var.t()));
            } while (m08Var.d() < iD);
            u(iD);
            return;
        }
        ljt ljtVar = (ljt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ljtVar.addLong(m08Var.t());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iD2 = m08Var.d() + m08Var.x();
        do {
            ljtVar.addLong(m08Var.t());
        } while (m08Var.d() < iD2);
        u(iD2);
    }

    public final void r(List<String> list, boolean z) throws f0p.a {
        String strU;
        int iW;
        int iW2;
        if ((this.b & 7) != 2) {
            throw f0p.c();
        }
        boolean z2 = list instanceof y0s;
        m08 m08Var = this.a;
        if (z2 && !z) {
            y0s y0sVar = (y0s) list;
            do {
                y0sVar.o1(e());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        do {
            if (z) {
                v(2);
                strU = m08Var.v();
            } else {
                v(2);
                strU = m08Var.u();
            }
            list.add(strU);
            if (m08Var.e()) {
                return;
            } else {
                iW = m08Var.w();
            }
        } while (iW == this.b);
        this.d = iW;
    }

    public final void s(List<Integer> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof rvo;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(m08Var.x()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iD = m08Var.d() + m08Var.x();
            do {
                list.add(Integer.valueOf(m08Var.x()));
            } while (m08Var.d() < iD);
            u(iD);
            return;
        }
        rvo rvoVar = (rvo) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                rvoVar.addInt(m08Var.x());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iD2 = m08Var.d() + m08Var.x();
        do {
            rvoVar.addInt(m08Var.x());
        } while (m08Var.d() < iD2);
        u(iD2);
    }

    public final void t(List<Long> list) throws f0p {
        int iW;
        int iW2;
        boolean z = list instanceof ljt;
        int i = this.b;
        m08 m08Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(m08Var.y()));
                    if (m08Var.e()) {
                        return;
                    } else {
                        iW = m08Var.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (i2 != 2) {
                throw f0p.c();
            }
            int iD = m08Var.d() + m08Var.x();
            do {
                list.add(Long.valueOf(m08Var.y()));
            } while (m08Var.d() < iD);
            u(iD);
            return;
        }
        ljt ljtVar = (ljt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ljtVar.addLong(m08Var.y());
                if (m08Var.e()) {
                    return;
                } else {
                    iW2 = m08Var.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (i3 != 2) {
            throw f0p.c();
        }
        int iD2 = m08Var.d() + m08Var.x();
        do {
            ljtVar.addLong(m08Var.y());
        } while (m08Var.d() < iD2);
        u(iD2);
    }

    public final void u(int i) throws f0p {
        if (this.a.d() != i) {
            throw f0p.g();
        }
    }

    public final void v(int i) throws f0p.a {
        if ((this.b & 7) != i) {
            throw f0p.c();
        }
    }

    public final boolean w() {
        int i;
        m08 m08Var = this.a;
        if (m08Var.e() || (i = this.b) == this.c) {
            return false;
        }
        return m08Var.z(i);
    }
}
