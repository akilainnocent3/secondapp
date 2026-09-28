package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;

/* JADX INFO: loaded from: classes.dex */
public abstract class x6j0 implements smd {
    public int a;
    public ixa b;
    public v160 c;
    public ixa.a d;
    public final fqe e = new fqe(this);
    public int f = 0;
    public boolean g = false;
    public final zmd h = new zmd(this);
    public final zmd i = new zmd(this);
    public a j = a.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("START", 1);
            a aVar3 = new a("END", 2);
            a aVar4 = new a(gvQvkPPtA.SwjED, 3);
            b = aVar4;
            c = new a[]{aVar, aVar2, aVar3, aVar4};
        }
    }

    public x6j0(ixa ixaVar) {
        this.b = ixaVar;
    }

    public static void b(zmd zmdVar, zmd zmdVar2, int i) {
        zmdVar.l.add(zmdVar2);
        zmdVar.f = i;
        zmdVar2.k.add(zmdVar);
    }

    public static zmd h(ewa ewaVar) {
        ewa ewaVar2 = ewaVar.f;
        if (ewaVar2 == null) {
            return null;
        }
        ixa ixaVar = ewaVar2.d;
        int iOrdinal = ewaVar2.e.ordinal();
        if (iOrdinal == 1) {
            return ixaVar.d.h;
        }
        if (iOrdinal == 2) {
            return ixaVar.e.h;
        }
        if (iOrdinal == 3) {
            return ixaVar.d.i;
        }
        if (iOrdinal == 4) {
            return ixaVar.e.i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return ixaVar.e.k;
    }

    public static zmd i(ewa ewaVar, int i) {
        ewa ewaVar2 = ewaVar.f;
        if (ewaVar2 == null) {
            return null;
        }
        ixa ixaVar = ewaVar2.d;
        x6j0 x6j0Var = i == 0 ? ixaVar.d : ixaVar.e;
        int iOrdinal = ewaVar2.e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return x6j0Var.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return x6j0Var.i;
        }
        return null;
    }

    public final void c(zmd zmdVar, zmd zmdVar2, int i, fqe fqeVar) {
        zmdVar.l.add(zmdVar2);
        zmdVar.l.add(this.e);
        zmdVar.h = i;
        zmdVar.i = fqeVar;
        zmdVar2.k.add(zmdVar);
        fqeVar.k.add(zmdVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        ixa ixaVar = this.b;
        if (i2 == 0) {
            int i3 = ixaVar.w;
            int iMax = Math.max(ixaVar.v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = ixaVar.z;
            int iMax2 = Math.max(ixaVar.y, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        fqe fqeVar = this.e;
        if (fqeVar.j) {
            return fqeVar.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(ewa ewaVar, ewa ewaVar2, int i) {
        fqe fqeVar;
        float f;
        int i2;
        int i3;
        zmd zmdVarH = h(ewaVar);
        zmd zmdVarH2 = h(ewaVar2);
        if (zmdVarH.j && zmdVarH2.j) {
            int iE = ewaVar.e() + zmdVarH.g;
            int iE2 = zmdVarH2.g - ewaVar2.e();
            int i4 = iE2 - iE;
            fqe fqeVar2 = this.e;
            if (!fqeVar2.j) {
                ixa.a aVar = this.d;
                ixa.a aVar2 = ixa.a.c;
                if (aVar == aVar2) {
                    int i5 = this.a;
                    if (i5 == 0) {
                        fqeVar2.d(g(i4, i));
                    } else if (i5 == 1) {
                        fqeVar2.d(Math.min(g(fqeVar2.m, i), i4));
                    } else if (i5 == 2) {
                        ixa ixaVar = this.b;
                        ixa ixaVar2 = ixaVar.W;
                        if (ixaVar2 != null) {
                            fqe fqeVar3 = (i == 0 ? ixaVar2.d : ixaVar2.e).e;
                            if (fqeVar3.j) {
                                fqeVar2.d(g((int) ((fqeVar3.g * (i == 0 ? ixaVar.x : ixaVar.A)) + 0.5f), i));
                            }
                        }
                    } else if (i5 == 3) {
                        ixa ixaVar3 = this.b;
                        x6j0 x6j0Var = ixaVar3.d;
                        if (x6j0Var.d == aVar2 && x6j0Var.a == 3) {
                            c3i0 c3i0Var = ixaVar3.e;
                            if (c3i0Var.d != aVar2 || c3i0Var.a != 3) {
                                if (i == 0) {
                                    x6j0Var = ixaVar3.e;
                                }
                                fqeVar = x6j0Var.e;
                                if (fqeVar.j) {
                                    f = ixaVar3.Z;
                                    i2 = fqeVar.g;
                                    if (i == 1) {
                                        i3 = (int) ((i2 / f) + 0.5f);
                                    } else {
                                        i3 = (int) ((f * i2) + 0.5f);
                                    }
                                    fqeVar2.d(i3);
                                }
                            }
                        } else {
                            if (i == 0) {
                                x6j0Var = ixaVar3.e;
                            }
                            fqeVar = x6j0Var.e;
                            if (fqeVar.j) {
                                f = ixaVar3.Z;
                                i2 = fqeVar.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                fqeVar2.d(i3);
                            }
                        }
                    }
                }
            }
            if (fqeVar2.j) {
                int i6 = fqeVar2.g;
                zmd zmdVar = this.i;
                zmd zmdVar2 = this.h;
                if (i6 == i4) {
                    zmdVar2.d(iE);
                    zmdVar.d(iE2);
                    return;
                }
                ixa ixaVar4 = this.b;
                float f2 = i == 0 ? ixaVar4.g0 : ixaVar4.h0;
                if (zmdVarH == zmdVarH2) {
                    iE = zmdVarH.g;
                    iE2 = zmdVarH2.g;
                    f2 = 0.5f;
                }
                zmdVar2.d((int) ((((iE2 - iE) - i6) * f2) + iE + 0.5f));
                zmdVar.d(zmdVar2.g + fqeVar2.g);
            }
        }
    }

    @Override // defpackage.smd
    public void a(smd smdVar) {
    }
}
