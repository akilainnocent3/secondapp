package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b5i {
    public static final b5i b = new b5i();
    public static final b5i c = new b5i();
    public static final b5i d = new b5i();
    public final duw<d5i> a = new duw<>(new d5i[16]);

    public static void b(b5i b5iVar) {
        b5iVar.getClass();
        b5iVar.a(new a5i(1));
    }

    public final boolean a(Function1<? super FocusTargetNode, Boolean> function1) {
        if (this == b) {
            ib5.a("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (this == c) {
            ib5.a("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        duw<d5i> duwVar = this.a;
        int i = duwVar.c;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        d5i[] d5iVarArr = duwVar.a;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            d5i d5iVar = d5iVarArr[i2];
            if (!d5iVar.i().C) {
                wkn.c("visitChildren called on an unattached node");
            }
            duw duwVar2 = new duw(new d.c[16]);
            d.c cVar = d5iVar.i().f;
            if (cVar == null) {
                pkd.a(duwVar2, d5iVar.i());
            } else {
                duwVar2.b(cVar);
            }
            while (true) {
                int i3 = duwVar2.c;
                if (i3 == 0) {
                    break;
                }
                d.c cVarC = (d.c) duwVar2.k(i3 - 1);
                if ((cVarC.d & 1024) == 0) {
                    pkd.a(duwVar2, cVarC);
                } else {
                    while (cVarC != null) {
                        if ((cVarC.c & 1024) != 0) {
                            duw duwVar3 = null;
                            while (cVarC != null) {
                                if (cVarC instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVarC;
                                    if (focusTargetNode.q2().a ? function1.invoke(focusTargetNode).booleanValue() : hoc0.e(focusTargetNode, 7, function1)) {
                                        z = true;
                                        break;
                                    }
                                } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                    int i4 = 0;
                                    for (d.c cVar2 = ((tkd) cVarC).E; cVar2 != null; cVar2 = cVar2.f) {
                                        if ((cVar2.c & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                cVarC = cVar2;
                                            } else {
                                                if (duwVar3 == null) {
                                                    duwVar3 = new duw(new d.c[16]);
                                                }
                                                if (cVarC != null) {
                                                    duwVar3.b(cVarC);
                                                    cVarC = null;
                                                }
                                                duwVar3.b(cVar2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                cVarC = pkd.c(duwVar3);
                            }
                            break;
                        }
                        cVarC = cVarC.f;
                    }
                }
            }
        }
        return z;
    }
}
