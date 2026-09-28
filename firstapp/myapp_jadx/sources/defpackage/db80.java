package defpackage;

import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class db80 {
    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    public static final bb80 a(tsr tsrVar, boolean z) {
        d.c cVar = tsrVar.U.f;
        Object obj = null;
        if ((cVar.d & 8) != 0) {
            loop0: while (cVar != null) {
                if ((cVar.c & 8) == 0) {
                    if ((cVar.d & 8) != 0) {
                        break;
                        break;
                    }
                    cVar = cVar.f;
                } else {
                    d.c cVarC = cVar;
                    duw duwVar = null;
                    while (cVarC != null) {
                        if (cVarC instanceof ya80) {
                            obj = cVarC;
                            break loop0;
                        }
                        if ((cVarC.c & 8) != 0 && (cVarC instanceof tkd)) {
                            int i = 0;
                            for (d.c cVar2 = ((tkd) cVarC).E; cVar2 != null; cVar2 = cVar2.f) {
                                if ((cVar2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarC = cVar2;
                                    } else {
                                        if (duwVar == null) {
                                            duwVar = new duw(new d.c[16]);
                                        }
                                        if (cVarC != null) {
                                            duwVar.b(cVarC);
                                            cVarC = null;
                                        }
                                        duwVar.b(cVar2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVarC = pkd.c(duwVar);
                    }
                    if ((cVar.d & 8) != 0) {
                        break;
                    }
                    cVar = cVar.f;
                }
            }
        }
        obj.getClass();
        d.c cVarI = ((ya80) obj).i();
        sa80 sa80VarF = tsrVar.f();
        if (sa80VarF == null) {
            sa80VarF = new sa80();
        }
        return new bb80(cVarI, z, tsrVar, sa80VarF);
    }
}
