package defpackage;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class fdl {
    public static int a(HandwritingGesture handwritingGesture, gk40 gk40Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        gk40Var.invoke(new ba8(fallbackText, 1));
        return 5;
    }

    public static void b(long j, nk0 nk0Var, boolean z, gk40 gk40Var) {
        if (z) {
            int i = ulf0.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(nk0Var, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < nk0Var.b.length() ? Character.codePointAt(nk0Var, iCharCount2) : 10;
            if (hdl.h(iCodePointBefore) && (hdl.g(iCodePointAt) || hdl.f(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(nk0Var, iCharCount);
                    }
                } while (hdl.h(iCodePointBefore));
                j = vlf0.a(iCharCount, iCharCount2);
            } else if (hdl.h(iCodePointAt) && (hdl.g(iCodePointBefore) || hdl.f(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == nk0Var.b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(nk0Var, iCharCount2);
                    }
                } while (hdl.h(iCodePointAt));
                j = vlf0.a(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        gk40Var.invoke(new gdl(new mof[]{new mi80(i2, i2), new dmd(ulf0.d(j), 0)}));
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0264  */
    public static int c(n6s n6sVar, HandwritingGesture handwritingGesture, iif0 iif0Var, z6i0 z6i0Var, gk40 gk40Var) {
        long jH;
        int i;
        vkf0 vkf0VarD;
        vkf0 vkf0VarD2;
        tkf0 tkf0Var;
        nk0 nk0Var = n6sVar.j;
        if (nk0Var == null) {
            return 3;
        }
        vkf0 vkf0VarD3 = n6sVar.d();
        if (!nk0Var.equals((vkf0VarD3 == null || (tkf0Var = vkf0VarD3.a.a) == null) ? null : tkf0Var.a)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jC = hdl.c(n6sVar, ok40.e(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (ulf0.c(jC)) {
                return a(selectGesture, gk40Var);
            }
            gk40Var.invoke(new mi80((int) (jC >> 32), (int) (jC & 4294967295L)));
            if (iif0Var != null) {
                iif0Var.e(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jC2 = hdl.c(n6sVar, ok40.e(deleteGesture.getDeletionArea()), i2);
                if (ulf0.c(jC2)) {
                    return a(deleteGesture, gk40Var);
                }
                b(jC2, nk0Var, i2 == 1, gk40Var);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jD = hdl.d(n6sVar, ok40.e(deleteRangeGesture.getDeletionStartArea()), ok40.e(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (ulf0.c(jD)) {
                        return a(deleteRangeGesture, gk40Var);
                    }
                    b(jD, nk0Var, i3 == 1, gk40Var);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (z6i0Var == null) {
                        return a(joinOrSplitGesture, gk40Var);
                    }
                    int iB = hdl.b(n6sVar, hdl.i(joinOrSplitGesture.getJoinOrSplitPoint()), z6i0Var);
                    if (iB == -1 || ((vkf0VarD2 = n6sVar.d()) != null && hdl.e(vkf0VarD2.a, iB))) {
                        return a(joinOrSplitGesture, gk40Var);
                    }
                    int iCharCount = iB;
                    while (iCharCount > 0) {
                        int iCodePointBefore = Character.codePointBefore(nk0Var, iCharCount);
                        if (!hdl.g(iCodePointBefore)) {
                            break;
                        }
                        iCharCount -= Character.charCount(iCodePointBefore);
                    }
                    while (iB < nk0Var.b.length()) {
                        int iCodePointAt = Character.codePointAt(nk0Var, iB);
                        if (!hdl.g(iCodePointAt)) {
                            break;
                        }
                        iB += Character.charCount(iCodePointAt);
                    }
                    long jA = vlf0.a(iCharCount, iB);
                    if (!ulf0.c(jA)) {
                        b(jA, nk0Var, false, gk40Var);
                        return 1;
                    }
                    int i4 = (int) (jA >> 32);
                    gk40Var.invoke(new gdl(new mof[]{new mi80(i4, i4), new ba8(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (z6i0Var == null) {
                        return a(insertGesture, gk40Var);
                    }
                    int iB2 = hdl.b(n6sVar, hdl.i(insertGesture.getInsertionPoint()), z6i0Var);
                    if (iB2 == -1 || ((vkf0VarD = n6sVar.d()) != null && hdl.e(vkf0VarD.a, iB2))) {
                        return a(insertGesture, gk40Var);
                    }
                    gk40Var.invoke(new gdl(new mof[]{new mi80(iB2, iB2), new ba8(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                vkf0 vkf0VarD4 = n6sVar.d();
                ukf0 ukf0Var = vkf0VarD4 != null ? vkf0VarD4.a : null;
                long jI = hdl.i(removeSpaceGesture.getStartPoint());
                long jI2 = hdl.i(removeSpaceGesture.getEndPoint());
                urr urrVarC = n6sVar.c();
                if (ukf0Var != null) {
                    zjw zjwVar = ukf0Var.b;
                    if (urrVarC == null) {
                        jH = ulf0.b;
                    } else {
                        long jO = urrVarC.o(jI);
                        long jO2 = urrVarC.o(jI2);
                        int iA = hdl.a(zjwVar, jO, z6i0Var);
                        int iA2 = hdl.a(zjwVar, jO2, z6i0Var);
                        if (iA != -1) {
                            if (iA2 != -1) {
                                iA = Math.min(iA, iA2);
                            }
                            iA2 = iA;
                        } else if (iA2 == -1) {
                            jH = ulf0.b;
                        }
                        float fB = (zjwVar.b(iA2) + zjwVar.f(iA2)) / 2.0f;
                        int i5 = (int) (jO >> 32);
                        int i6 = (int) (jO2 >> 32);
                        jH = zjwVar.h(new lk40(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB - 0.1f, Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB + 0.1f), 0, ojf0.a.a);
                    }
                } else {
                    jH = ulf0.b;
                }
                if (ulf0.c(jH)) {
                    return a(removeSpaceGesture, gk40Var);
                }
                final bq40 bq40Var = new bq40();
                bq40Var.a = -1;
                final bq40 bq40Var2 = new bq40();
                bq40Var2.a = -1;
                String strG = new Regex("\\s+").g(nk0Var.subSequence(ulf0.f(jH), ulf0.e(jH)).b, new Function1() { // from class: ddl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MatchResult matchResult = (MatchResult) obj;
                        bq40 bq40Var3 = bq40Var;
                        if (bq40Var3.a == -1) {
                            bq40Var3.a = matchResult.b().a;
                        }
                        bq40Var2.a = matchResult.b().b + 1;
                        return "";
                    }
                });
                int i7 = bq40Var.a;
                if (i7 == -1 || (i = bq40Var2.a) == -1) {
                    return a(removeSpaceGesture, gk40Var);
                }
                int i8 = (int) (jH >> 32);
                gk40Var.invoke(new gdl(new mof[]{new mi80(i8 + i7, i8 + i), new ba8(strG.substring(i7, strG.length() - (ulf0.d(jH) - bq40Var2.a)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jD2 = hdl.d(n6sVar, ok40.e(selectRangeGesture.getSelectionStartArea()), ok40.e(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (ulf0.c(jD2)) {
                return a(selectRangeGesture, gk40Var);
            }
            gk40Var.invoke(new mi80((int) (jD2 >> 32), (int) (jD2 & 4294967295L)));
            if (iif0Var != null) {
                iif0Var.e(true);
            }
        }
        return 1;
    }

    public static boolean d(n6s n6sVar, PreviewableHandwritingGesture previewableHandwritingGesture, final iif0 iif0Var, CancellationSignal cancellationSignal) {
        tkf0 tkf0Var;
        nk0 nk0Var = n6sVar.j;
        if (nk0Var != null) {
            vkf0 vkf0VarD = n6sVar.d();
            if (nk0Var.equals((vkf0VarD == null || (tkf0Var = vkf0VarD.a.a) == null) ? null : tkf0Var.a)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (iif0Var != null) {
                        long jC = hdl.c(n6sVar, ok40.e(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        n6s n6sVar2 = iif0Var.d;
                        if (n6sVar2 != null) {
                            n6sVar2.f(jC);
                        }
                        n6s n6sVar3 = iif0Var.d;
                        if (n6sVar3 != null) {
                            n6sVar3.e(ulf0.b);
                        }
                        if (!ulf0.c(jC)) {
                            iif0Var.t(false);
                            iif0Var.q(ocl.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (iif0Var != null) {
                        long jC2 = hdl.c(n6sVar, ok40.e(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        n6s n6sVar4 = iif0Var.d;
                        if (n6sVar4 != null) {
                            n6sVar4.e(jC2);
                        }
                        n6s n6sVar5 = iif0Var.d;
                        if (n6sVar5 != null) {
                            n6sVar5.f(ulf0.b);
                        }
                        if (!ulf0.c(jC2)) {
                            iif0Var.t(false);
                            iif0Var.q(ocl.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (iif0Var != null) {
                        long jD = hdl.d(n6sVar, ok40.e(selectRangeGesture.getSelectionStartArea()), ok40.e(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        n6s n6sVar6 = iif0Var.d;
                        if (n6sVar6 != null) {
                            n6sVar6.f(jD);
                        }
                        n6s n6sVar7 = iif0Var.d;
                        if (n6sVar7 != null) {
                            n6sVar7.e(ulf0.b);
                        }
                        if (!ulf0.c(jD)) {
                            iif0Var.t(false);
                            iif0Var.q(ocl.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (iif0Var != null) {
                        long jD2 = hdl.d(n6sVar, ok40.e(deleteRangeGesture.getDeletionStartArea()), ok40.e(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        n6s n6sVar8 = iif0Var.d;
                        if (n6sVar8 != null) {
                            n6sVar8.e(jD2);
                        }
                        n6s n6sVar9 = iif0Var.d;
                        if (n6sVar9 != null) {
                            n6sVar9.f(ulf0.b);
                        }
                        if (!ulf0.c(jD2)) {
                            iif0Var.t(false);
                            iif0Var.q(ocl.a);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: edl
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            iif0 iif0Var2 = iif0Var;
                            if (iif0Var2 != null) {
                                n6s n6sVar10 = iif0Var2.d;
                                if (n6sVar10 != null) {
                                    n6sVar10.e(ulf0.b);
                                }
                                n6s n6sVar11 = iif0Var2.d;
                                if (n6sVar11 != null) {
                                    n6sVar11.f(ulf0.b);
                                }
                            }
                        }
                    });
                }
                return true;
            }
        }
        return false;
    }
}
