package defpackage;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

/* JADX INFO: loaded from: classes4.dex */
public final class zjx extends f {
    public final int A;
    public final boolean B;
    public final Class<?> z;

    public zjx(Context context, Class<?> cls, int i, boolean z) {
        super(context);
        this.z = cls;
        this.A = i;
        this.B = z;
    }

    @Override // androidx.appcompat.view.menu.f
    public final h a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size > i4) {
            String simpleName = this.z.getSimpleName();
            hb5.a(uf80.a(ml5.a(i4, "Maximum number of items supported by ", simpleName, " is ", ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
            return null;
        }
        y();
        h hVarA = super.a(i, i2, i3, charSequence);
        x();
        return hVarA;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        if (!this.B) {
            zkh.a(this.z.getSimpleName().concat(" does not support submenus"));
            return null;
        }
        h hVarA = a(i, i2, i3, charSequence);
        ckx ckxVar = new ckx(this.a, this, hVarA);
        hVarA.o = ckxVar;
        ckxVar.setHeaderTitle(hVarA.e);
        return ckxVar;
    }
}
