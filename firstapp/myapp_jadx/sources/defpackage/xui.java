package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xui<T extends Fragment> extends fxi {
    public final ArrayList f;
    public final List<String> g;
    public T h;

    public xui(FragmentManager fragmentManager, ArrayList arrayList, ArrayList arrayList2) {
        super(fragmentManager);
        this.f = arrayList;
        this.g = arrayList2;
    }

    @Override // defpackage.loz
    public final int c() {
        return this.f.size();
    }

    @Override // defpackage.loz
    public final CharSequence e(int i) {
        return this.g.get(i);
    }

    @Override // defpackage.fxi, defpackage.loz
    public final void j(ViewPager viewPager, int i, Object obj) {
        super.j(viewPager, i, obj);
        T t = (T) this.f.get(i);
        T t2 = this.h;
        if (t2 != t) {
            if (t2 instanceof exi) {
                ((exi) t2).B(false);
            }
            if (t instanceof exi) {
                ((exi) t).B(true);
            }
            this.h = t;
        }
    }

    @Override // defpackage.fxi
    public final T l(int i) {
        return (T) this.f.get(i);
    }
}
