package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final class v45 implements l7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetBehavior b;

    public v45(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.l7
    public final boolean a(View view) {
        this.b.L(this.a);
        return true;
    }
}
