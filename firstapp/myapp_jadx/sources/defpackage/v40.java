package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* JADX INFO: loaded from: classes.dex */
public final class v40 extends e6 {
    public final /* synthetic */ AndroidComposeView d;
    public final /* synthetic */ tsr e;
    public final /* synthetic */ AndroidComposeView f;

    public v40(AndroidComposeView androidComposeView, tsr tsrVar, AndroidComposeView androidComposeView2) {
        this.d = androidComposeView;
        this.e = tsrVar;
        this.f = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // defpackage.e6
    public final void d(View view, c7 c7Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.d;
        c cVar = androidComposeView.J;
        if (cVar.v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        tsr tsrVar = this.e;
        tsr tsrVarH = tsrVar.H();
        while (true) {
            if (tsrVarH == null) {
                tsrVarH = null;
                break;
            } else if (tsrVarH.U.c(8)) {
                break;
            } else {
                tsrVarH = tsrVarH.H();
            }
        }
        Integer numValueOf = tsrVarH != null ? Integer.valueOf(tsrVarH.b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().a().g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        c7Var.b = iIntValue;
        AndroidComposeView androidComposeView2 = this.f;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i = tsrVar.b;
        int iD = cVar.E.d(i);
        if (iD != -1) {
            AndroidViewHolder androidViewHolderB = vb80.b(androidComposeView.getAndroidViewsHandler$ui_release(), iD);
            if (androidViewHolderB != null) {
                accessibilityNodeInfo.setTraversalBefore(androidViewHolderB);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iD);
            }
            androidComposeView.G(i, accessibilityNodeInfo, cVar.G);
        }
        int iD2 = cVar.F.d(i);
        if (iD2 != -1) {
            AndroidViewHolder androidViewHolderB2 = vb80.b(androidComposeView.getAndroidViewsHandler$ui_release(), iD2);
            if (androidViewHolderB2 != null) {
                accessibilityNodeInfo.setTraversalAfter(androidViewHolderB2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iD2);
            }
            androidComposeView.G(i, accessibilityNodeInfo, cVar.H);
        }
    }
}
