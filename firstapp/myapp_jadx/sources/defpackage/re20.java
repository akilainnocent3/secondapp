package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class re20 implements fpy {
    public final /* synthetic */ te20 a;

    public re20(te20 te20Var) {
        this.a = te20Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        te20 te20Var = this.a;
        zf20 zf20Var = te20Var.f;
        if (zf20Var == null) {
            Intrinsics.n("preMatchItem");
            throw null;
        }
        jpc jpcVar = zf20Var.b;
        ing ingVar = jpcVar instanceof ing ? (ing) jpcVar : null;
        if (ingVar == null) {
            return;
        }
        List<String> specifierList = ingVar.a.getSpecifierList(zf20Var.a.a);
        if (i < 0 || i >= specifierList.size()) {
            return;
        }
        ingVar.d(zf20Var.a.a, specifierList.get(i));
        ag20 ag20Var = te20Var.b;
        String str = specifierList.get(i);
        str.getClass();
        ag20Var.f(zf20Var, str);
    }
}
