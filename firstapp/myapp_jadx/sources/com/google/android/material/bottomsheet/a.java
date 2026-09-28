package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.l8j0;
import defpackage.zmy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements zmy {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.zmy
    public final l8j0 b(View view, l8j0 l8j0Var) {
        b bVar = this.a;
        b.C0191b c0191b = bVar.B;
        if (c0191b != null) {
            bVar.f.p0.remove(c0191b);
        }
        b.C0191b c0191b2 = new b.C0191b(bVar.w, l8j0Var);
        bVar.B = c0191b2;
        c0191b2.e(bVar.getWindow());
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar.f;
        b.C0191b c0191b3 = bVar.B;
        ArrayList<BottomSheetBehavior.d> arrayList = bottomSheetBehavior.p0;
        if (!arrayList.contains(c0191b3)) {
            arrayList.add(c0191b3);
        }
        return l8j0Var;
    }
}
