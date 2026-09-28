package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: loaded from: classes4.dex */
public final class e55 extends e6 {
    public final /* synthetic */ b d;

    public e55(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.e6
    public final void d(View view, c7 c7Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (!this.d.y) {
            accessibilityNodeInfo.setDismissable(false);
        } else {
            c7Var.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }
    }

    @Override // defpackage.e6
    public final boolean g(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            b bVar = this.d;
            if (bVar.y) {
                bVar.cancel();
                return true;
            }
        }
        return super.g(view, i, bundle);
    }
}
