package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.b;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class dxx {
    public static final dtw<Object> a = zby.a();

    public static final void a(d.c cVar, int i, int i2) {
        if (!(cVar instanceof tkd)) {
            b(cVar, i & cVar.c, i2);
            return;
        }
        tkd tkdVar = (tkd) cVar;
        int i3 = tkdVar.D;
        b(cVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (d.c cVar2 = tkdVar.E; cVar2 != null; cVar2 = cVar2.f) {
            a(cVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d.c cVar, int i, int i2) {
        if (i2 != 0 || cVar.e2()) {
            if ((i & 2) != 0 && (cVar instanceof psr)) {
                pkd.f((psr) cVar).P();
                if (i2 == 2) {
                    pkd.d(cVar, 2).g2();
                }
            }
            if ((i & 128) != 0 && (cVar instanceof mrr) && i2 != 2) {
                pkd.f(cVar).P();
            }
            if ((i & 256) != 0 && (cVar instanceof l2l)) {
                if (i2 == 1) {
                    tsr tsrVarF = pkd.f(cVar);
                    tsrVarF.m0(tsrVarF.e0 + 1);
                } else if (i2 == 2) {
                    tsr tsrVarF2 = pkd.f(cVar);
                    tsrVarF2.m0(tsrVarF2.e0 - 1);
                }
                if (i2 != 2) {
                    tsr tsrVarF3 = pkd.f(cVar);
                    if (tsrVarF3.e0 != 0 && !tsrVarF3.C() && !tsrVarF3.D() && !tsrVarF3.d0) {
                        xsr.a(tsrVarF3).j(tsrVarF3);
                    }
                }
            }
            if ((i & 4) != 0 && (cVar instanceof qcf)) {
                rcf.a((qcf) cVar);
            }
            if ((i & 8) != 0 && (cVar instanceof ya80)) {
                pkd.f(cVar).G = true;
            }
            if ((i & 64) != 0 && (cVar instanceof hsz)) {
                ysr ysrVar = pkd.f((hsz) cVar).V;
                ysrVar.p.G = true;
                blt bltVar = ysrVar.q;
                if (bltVar != null) {
                    bltVar.L = true;
                }
            }
            if ((i & 2048) != 0 && (cVar instanceof z4i)) {
                z4i z4iVar = (z4i) cVar;
                eb6.b = null;
                z4iVar.b0(eb6.a);
                if (eb6.b != null) {
                    if (!z4iVar.i().C) {
                        wkn.c("visitChildren called on an unattached node");
                    }
                    duw duwVar = new duw(new d.c[16]);
                    d.c cVar2 = z4iVar.i().f;
                    if (cVar2 == null) {
                        pkd.a(duwVar, z4iVar.i());
                    } else {
                        duwVar.b(cVar2);
                    }
                    while (true) {
                        int i3 = duwVar.c;
                        if (i3 == 0) {
                            break;
                        }
                        d.c cVarC = (d.c) duwVar.k(i3 - 1);
                        if ((cVarC.d & 1024) == 0) {
                            pkd.a(duwVar, cVarC);
                        } else {
                            while (cVarC != null) {
                                if ((cVarC.c & 1024) != 0) {
                                    duw duwVar2 = null;
                                    while (cVarC != null) {
                                        if (cVarC instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarC;
                                            pkd.g(focusTargetNode).getFocusOwner().h(focusTargetNode);
                                        } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                            int i4 = 0;
                                            for (d.c cVar3 = ((tkd) cVarC).E; cVar3 != null; cVar3 = cVar3.f) {
                                                if ((cVar3.c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cVarC = cVar3;
                                                    } else {
                                                        if (duwVar2 == null) {
                                                            duwVar2 = new duw(new d.c[16]);
                                                        }
                                                        if (cVarC != null) {
                                                            duwVar2.b(cVarC);
                                                            cVarC = null;
                                                        }
                                                        duwVar2.b(cVar3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        cVarC = pkd.c(duwVar2);
                                    }
                                    break;
                                }
                                cVarC = cVarC.f;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(cVar instanceof w3i)) {
                return;
            }
            w3i w3iVar = (w3i) cVar;
            pkd.g(w3iVar).getFocusOwner().b(w3iVar);
        }
    }

    public static final void c(d.c cVar) {
        if (!cVar.C) {
            wkn.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(cVar, -1, 0);
    }

    public static final int d(d.b bVar) {
        int i = bVar instanceof nsr ? 3 : 1;
        if (bVar instanceof pcf) {
            i |= 4;
        }
        if (bVar instanceof wa80) {
            i |= 8;
        }
        if (bVar instanceof r020) {
            i |= 16;
        }
        if ((bVar instanceof j3w) || (bVar instanceof m3w)) {
            i |= 32;
        }
        if (bVar instanceof v3i) {
            i |= 4096;
        }
        if (bVar instanceof q4i) {
            i |= 2048;
        }
        if (bVar instanceof foy) {
            i |= 256;
        }
        if (bVar instanceof gsz) {
            i |= 64;
        }
        if ((bVar instanceof soy) || (bVar instanceof apy)) {
            i |= 128;
        }
        return bVar instanceof ca5 ? 524288 | i : i;
    }

    public static final int e(d.c cVar) {
        int i = cVar.c;
        if (i != 0) {
            return i;
        }
        Class<?> cls = cVar.getClass();
        dtw<Object> dtwVar = a;
        int iD = dtwVar.d(cls);
        if (iD >= 0) {
            return dtwVar.c[iD];
        }
        int i2 = cVar instanceof psr ? 3 : 1;
        if (cVar instanceof qcf) {
            i2 |= 4;
        }
        if (cVar instanceof ya80) {
            i2 |= 8;
        }
        if (cVar instanceof s020) {
            i2 |= 16;
        }
        if (cVar instanceof l3w) {
            i2 |= 32;
        }
        if (cVar instanceof hsz) {
            i2 |= 64;
        }
        if (cVar instanceof mrr) {
            i2 |= 128;
        }
        if (cVar instanceof l2l) {
            i2 |= 256;
        }
        if (cVar instanceof b) {
            i2 |= 512;
        }
        if (cVar instanceof FocusTargetNode) {
            i2 |= 1024;
        }
        if (cVar instanceof z4i) {
            i2 |= 2048;
        }
        if (cVar instanceof w3i) {
            i2 |= 4096;
        }
        if (cVar instanceof imp) {
            i2 |= 8192;
        }
        if (cVar instanceof hw50) {
            i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (cVar instanceof yma) {
            i2 |= 32768;
        }
        if (cVar instanceof noa0) {
            i2 |= 131072;
        }
        if (cVar instanceof hvg0) {
            i2 |= 262144;
        }
        if (cVar instanceof ca5) {
            i2 |= 524288;
        }
        if (cVar instanceof npy) {
            i2 |= 1048576;
        }
        if (cVar instanceof ufn) {
            i2 |= 2097152;
        }
        dtwVar.h(i2, cls);
        return i2;
    }

    public static final int f(d.c cVar) {
        if (!(cVar instanceof tkd)) {
            return e(cVar);
        }
        tkd tkdVar = (tkd) cVar;
        int iF = tkdVar.D;
        for (d.c cVar2 = tkdVar.E; cVar2 != null; cVar2 = cVar2.f) {
            iF |= f(cVar2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
