package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes4.dex */
public final class pjl extends tjl {
    @Override // defpackage.tjl
    public final <V extends View> int a(V v, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // defpackage.tjl
    public final int b() {
        return 0;
    }

    @Override // defpackage.tjl
    public final ViewPropertyAnimator c(int i, View view) {
        return view.animate().translationX(i);
    }
}
