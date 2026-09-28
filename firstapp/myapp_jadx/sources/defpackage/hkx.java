package defpackage;

import android.view.View;
import com.google.android.material.navigationrail.NavigationRailView;

/* JADX INFO: loaded from: classes4.dex */
public final class hkx implements eai0.b {
    public final /* synthetic */ NavigationRailView a;

    public hkx(NavigationRailView navigationRailView) {
        this.a = navigationRailView;
    }

    @Override // eai0.b
    public final l8j0 a(View view, l8j0 l8j0Var, eai0.c cVar) {
        l8j0.l lVar = l8j0Var.a;
        ymn ymnVarG = lVar.g(519);
        ymn ymnVarG2 = lVar.g(128);
        NavigationRailView navigationRailView = this.a;
        Boolean bool = navigationRailView.w;
        if (bool != null ? bool.booleanValue() : navigationRailView.getFitsSystemWindows()) {
            cVar.b += ymnVarG.b;
        }
        Boolean bool2 = navigationRailView.y;
        if (bool2 != null ? bool2.booleanValue() : navigationRailView.getFitsSystemWindows()) {
            cVar.d += ymnVarG.d;
        }
        Boolean bool3 = navigationRailView.z;
        if (bool3 != null ? bool3.booleanValue() : navigationRailView.getFitsSystemWindows()) {
            boolean zE = eai0.e(view);
            int i = cVar.a;
            if (zE) {
                cVar.a = Math.max(ymnVarG.c, ymnVarG2.c) + i;
            } else {
                cVar.a = Math.max(ymnVarG.a, ymnVarG2.a) + i;
            }
        }
        view.setPaddingRelative(cVar.a, cVar.b, cVar.c, cVar.d);
        return l8j0Var;
    }
}
