package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class mov<T> implements an70<T> {
    public final wnv a;
    public final agh0<?, ?> b;
    public final boolean c;
    public final s3h<?> d;

    public mov(agh0<?, ?> agh0Var, s3h<?> s3hVar, wnv wnvVar) {
        this.b = agh0Var;
        this.c = s3hVar.e(wnvVar);
        this.d = s3hVar;
        this.a = wnvVar;
    }

    @Override // defpackage.an70
    public final void a(T t, y7k0 y7k0Var) {
        Iterator itF = this.d.c(t).f();
        if (itF.hasNext()) {
            ((njh.a) ((Map.Entry) itF.next()).getKey()).getLiteJavaType();
            throw null;
        }
        agh0<?, ?> agh0Var = this.b;
        agh0Var.q(agh0Var.g(t), y7k0Var);
    }

    @Override // defpackage.an70
    public final void b(Object obj, o08 o08Var, r3h r3hVar) {
        agh0<?, ?> agh0Var = this.b;
        cgh0 cgh0VarF = agh0Var.f(obj);
        s3h<?> s3hVar = this.d;
        njh<T> njhVarD = s3hVar.d(obj);
        while (o08Var.a() != Integer.MAX_VALUE) {
            try {
                mov<T> movVar = this;
                o08 o08Var2 = o08Var;
                r3h r3hVar2 = r3hVar;
                if (!movVar.g(o08Var2, r3hVar2, s3hVar, njhVarD, agh0Var, cgh0VarF)) {
                    return;
                }
                this = movVar;
                o08Var = o08Var2;
                r3hVar = r3hVar2;
            } finally {
                agh0Var.n(obj, cgh0VarF);
            }
        }
    }

    @Override // defpackage.an70
    public final boolean c(n1k n1kVar, n1k n1kVar2) {
        agh0<?, ?> agh0Var = this.b;
        if (!agh0Var.g(n1kVar).equals(agh0Var.g(n1kVar2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        s3h<?> s3hVar = this.d;
        return s3hVar.c(n1kVar).equals(s3hVar.c(n1kVar2));
    }

    @Override // defpackage.an70
    public final int d(n1k n1kVar) {
        int iHashCode = this.b.g(n1kVar).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.c(n1kVar).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.an70
    public final int e(d4 d4Var) {
        agh0<?, ?> agh0Var = this.b;
        int i = agh0Var.i(agh0Var.g(d4Var));
        if (this.c) {
            p1a0 p1a0Var = this.d.c(d4Var).a;
            if (p1a0Var.b.size() > 0) {
                njh.c(p1a0Var.d(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = p1a0Var.e().iterator();
            if (it.hasNext()) {
                njh.c(it.next());
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[EDGE_INSN: B:55:0x00a0->B:42:0x00a0 BREAK  A[LOOP:1: B:22:0x005e->B:32:0x0080], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.an70
    public final void f(T t, byte[] bArr, int i, int i2, fx0.a aVar) throws Throwable {
        Throwable th;
        n1k n1kVar = (n1k) t;
        cgh0 cgh0Var = n1kVar.unknownFields;
        if (cgh0Var == cgh0.f) {
            cgh0Var = new cgh0();
            n1kVar.unknownFields = cgh0Var;
        }
        cgh0 cgh0Var2 = cgh0Var;
        n1k.c cVar = (n1k.c) t;
        njh<n1k.d> njhVar = cVar.extensions;
        if (njhVar.b) {
            cVar.extensions = njhVar.clone();
        }
        Throwable th2 = null;
        int iM = i;
        n1k.e eVar = null;
        while (iM < i2) {
            n1k.e eVarB = eVar;
            int i3 = fx0.i(bArr, iM, aVar);
            int i4 = aVar.a;
            r3h r3hVar = aVar.d;
            wnv wnvVar = this.a;
            s3h<?> s3hVar = this.d;
            int i5 = 2;
            if (i4 == 11) {
                int i6 = 0;
                Object obj = th2;
                while (true) {
                    if (i3 >= i2) {
                        th = th2;
                        break;
                    }
                    i3 = fx0.i(bArr, i3, aVar);
                    int i7 = aVar.a;
                    int i8 = i7 >>> 3;
                    th = th2;
                    int i9 = i7 & 7;
                    if (i8 != i5) {
                        if (i8 == 3) {
                            if (eVarB != null) {
                                u630 u630Var = u630.c;
                                throw th;
                            }
                            if (i9 == 2) {
                                i3 = fx0.a(bArr, i3, aVar);
                                obj = (ql5) aVar.c;
                            } else if (i7 == 12) {
                                break;
                            } else {
                                i3 = fx0.m(i7, bArr, i3, i2, aVar);
                            }
                        } else {
                            if (i7 == 12) {
                                break;
                                break;
                            }
                            i3 = fx0.m(i7, bArr, i3, i2, aVar);
                        }
                    } else if (i9 == 0) {
                        i3 = fx0.i(bArr, i3, aVar);
                        i6 = aVar.a;
                        eVarB = s3hVar.b(r3hVar, wnvVar, i6);
                    } else {
                        if (i7 == 12) {
                            break;
                            break;
                        }
                        i3 = fx0.m(i7, bArr, i3, i2, aVar);
                    }
                    th2 = th;
                    i5 = 2;
                }
                if (obj != null) {
                    cgh0Var2.c((i6 << 3) | 2, obj);
                }
                th2 = th;
                iM = i3;
            } else if ((i4 & 7) == 2) {
                eVarB = s3hVar.b(r3hVar, wnvVar, i4 >>> 3);
                if (eVarB != null) {
                    u630 u630Var2 = u630.c;
                    throw th2;
                }
                iM = fx0.g(i4, bArr, i3, i2, cgh0Var2, aVar);
            } else {
                iM = fx0.m(i4, bArr, i3, i2, aVar);
            }
            eVar = eVarB;
        }
        if (iM != i2) {
            throw f0p.f();
        }
    }

    public final boolean g(o08 o08Var, r3h r3hVar, s3h s3hVar, njh njhVar, agh0 agh0Var, Object obj) throws f0p {
        int i = o08Var.b;
        wnv wnvVar = this.a;
        if (i != 11) {
            if ((i & 7) != 2) {
                return o08Var.w();
            }
            n1k.e eVarB = s3hVar.b(r3hVar, wnvVar, i >>> 3);
            if (eVarB == null) {
                return agh0Var.l(obj, o08Var);
            }
            s3hVar.h(eVarB);
            throw null;
        }
        int iX = 0;
        n1k.e eVarB2 = null;
        ql5 ql5VarE = null;
        while (o08Var.a() != Integer.MAX_VALUE) {
            int i2 = o08Var.b;
            if (i2 == 16) {
                o08Var.v(0);
                iX = o08Var.a.x();
                eVarB2 = s3hVar.b(r3hVar, wnvVar, iX);
            } else if (i2 == 26) {
                if (eVarB2 != null) {
                    s3hVar.h(eVarB2);
                    throw null;
                }
                ql5VarE = o08Var.e();
            } else if (!o08Var.w()) {
                break;
            }
        }
        if (o08Var.b != 12) {
            throw new f0p("Protocol message end-group tag did not match expected tag.");
        }
        if (ql5VarE == null) {
            return true;
        }
        if (eVarB2 == null) {
            agh0Var.d(obj, iX, ql5VarE);
            return true;
        }
        s3hVar.i(eVarB2);
        throw null;
    }

    @Override // defpackage.an70
    public final boolean isInitialized(T t) {
        this.d.c(t).d();
        return true;
    }

    @Override // defpackage.an70
    public final void makeImmutable(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // defpackage.an70
    public final void mergeFrom(T t, T t2) {
        Class<?> cls = nn70.a;
        agh0<?, ?> agh0Var = this.b;
        agh0Var.o(t, agh0Var.k(agh0Var.g(t), agh0Var.g(t2)));
        if (this.c) {
            nn70.y(this.d, t, t2);
        }
    }

    @Override // defpackage.an70
    public final T newInstance() {
        wnv wnvVar = this.a;
        return wnvVar instanceof n1k ? (T) ((n1k) wnvVar).q() : (T) wnvVar.newBuilderForType().buildPartial();
    }
}
