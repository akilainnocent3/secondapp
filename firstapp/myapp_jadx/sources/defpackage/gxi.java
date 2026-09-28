package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class gxi extends yxi {
    public final List<o800> y;
    public final ga00 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxi(fq0 fq0Var, List<o800> list, ga00 ga00Var) {
        super(fq0Var);
        list.getClass();
        this.y = list;
        this.z = ga00Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.y.size() + 1;
    }

    @Override // defpackage.yxi
    public final Fragment k(int i) {
        if (i != 0) {
            q730.D.getClass();
            q730 q730Var = new q730();
            q730Var.setArguments(vj5.a(new Pair("arg_provider_tab_index", Integer.valueOf(i - 1))));
            return q730Var;
        }
        ga00 ga00Var = this.z;
        ga00Var.getClass();
        ou ouVar = new ou();
        Bundle bundle = new Bundle();
        bundle.putSerializable("payment_type", ga00Var);
        ouVar.setArguments(bundle);
        return ouVar;
    }
}
