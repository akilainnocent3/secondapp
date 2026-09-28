package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import defpackage.ubv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class nj7<T extends ubv<T>> {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public ChipGroup.a c;
    public boolean d;
    public boolean e;

    public final boolean a(ubv<T> ubvVar) {
        int id = ubvVar.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        ubv<T> ubvVar2 = (ubv) this.a.get(Integer.valueOf(c()));
        if (ubvVar2 != null) {
            e(ubvVar2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!ubvVar.isChecked()) {
            ubvVar.setChecked(true);
        }
        return zAdd;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ubv) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        ChipGroup.a aVar = this.c;
        if (aVar != null) {
            new HashSet(this.b);
            ChipGroup chipGroup = ChipGroup.this;
            ChipGroup.d dVar = chipGroup.i;
            if (dVar != null) {
                chipGroup.v.b(chipGroup);
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.v.d) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(ubv<T> ubvVar, boolean z) {
        int id = ubvVar.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            ubvVar.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (ubvVar.isChecked()) {
            ubvVar.setChecked(false);
        }
        return zRemove;
    }
}
