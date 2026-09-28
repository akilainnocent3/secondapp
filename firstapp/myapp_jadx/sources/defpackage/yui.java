package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class yui<T extends Fragment> extends fxi {
    public final List<T> f;
    public final List<String> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yui(FragmentManager fragmentManager, ArrayList arrayList, ArrayList arrayList2) {
        super(fragmentManager);
        fragmentManager.getClass();
        arrayList.getClass();
        this.f = arrayList;
        this.g = arrayList2;
    }

    @Override // defpackage.loz
    public final int c() {
        return this.f.size();
    }

    @Override // defpackage.loz
    public final CharSequence e(int i) {
        String str;
        List<String> list = this.g;
        return (list == null || (str = list.get(i)) == null) ? "" : str;
    }

    @Override // defpackage.fxi
    public final T l(int i) {
        return this.f.get(i);
    }
}
