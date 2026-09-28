package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ekx implements androidx.appcompat.view.menu.j {
    public ColorStateList A;
    public Drawable B;
    public RippleDrawable C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public int N;
    public int O;
    public int P;
    public NavigationMenuView a;
    public LinearLayout b;
    public androidx.appcompat.view.menu.f c;
    public int d;
    public c e;
    public LayoutInflater f;
    public ColorStateList v;
    public ColorStateList z;
    public int i = 0;
    public int w = 0;
    public boolean y = true;
    public boolean M = true;
    public int Q = -1;
    public final a R = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            ekx ekxVar = ekx.this;
            c cVar = ekxVar.e;
            boolean z = true;
            if (cVar != null) {
                cVar.c = true;
            }
            androidx.appcompat.view.menu.h itemData = navigationMenuItemView.getItemData();
            boolean zS = ekxVar.c.s(itemData, ekxVar, 0);
            if (itemData != null && itemData.isCheckable() && zS) {
                ekxVar.e.j(itemData);
            } else {
                z = false;
            }
            c cVar2 = ekxVar.e;
            if (cVar2 != null) {
                cVar2.c = false;
            }
            if (z) {
                ekxVar.j(false);
            }
        }
    }

    public static class b extends l {
    }

    public class c extends RecyclerView.f<l> {
        public final ArrayList<e> a = new ArrayList<>();
        public androidx.appcompat.view.menu.h b;
        public boolean c;

        public c() {
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemViewType(int i) {
            e eVar = this.a.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a.hasSubMenu() ? 1 : 0;
            }
            b9p.a("Unknown item type.");
            return 0;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void i() {
            if (this.c) {
                return;
            }
            this.c = true;
            ArrayList<e> arrayList = this.a;
            arrayList.clear();
            arrayList.add(new d());
            ekx ekxVar = ekx.this;
            int size = ekxVar.c.n().size();
            boolean z = false;
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                androidx.appcompat.view.menu.h hVar = ekxVar.c.n().get(i2);
                if (hVar.isChecked()) {
                    j(hVar);
                }
                if (hVar.isCheckable()) {
                    hVar.f(z);
                }
                if (hVar.hasSubMenu()) {
                    m mVar = hVar.o;
                    if (mVar.hasVisibleItems()) {
                        if (i2 != 0) {
                            arrayList.add(new f(ekxVar.P, z ? 1 : 0));
                        }
                        arrayList.add(new g(hVar));
                        int size3 = mVar.f.size();
                        int i3 = z ? 1 : 0;
                        int i4 = i3;
                        while (i3 < size3) {
                            androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) mVar.getItem(i3);
                            if (hVar2.isVisible()) {
                                if (i4 == 0 && hVar2.getIcon() != null) {
                                    i4 = 1;
                                }
                                if (hVar2.isCheckable()) {
                                    hVar2.f(z);
                                }
                                if (hVar2.isChecked()) {
                                    j(hVar2);
                                }
                                arrayList.add(new g(hVar2));
                            }
                            i3++;
                            z = false;
                        }
                        if (i4 != 0) {
                            int size4 = arrayList.size();
                            for (int size5 = arrayList.size(); size5 < size4; size5++) {
                                ((g) arrayList.get(size5)).b = true;
                            }
                        }
                    }
                } else {
                    int i5 = hVar.b;
                    if (i5 != i) {
                        size2 = arrayList.size();
                        z2 = hVar.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            int i6 = ekxVar.P;
                            arrayList.add(new f(i6, i6));
                        }
                    } else if (!z2 && hVar.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i7 = size2; i7 < size6; i7++) {
                            ((g) arrayList.get(i7)).b = true;
                        }
                        z2 = true;
                    }
                    g gVar = new g(hVar);
                    gVar.b = z2;
                    arrayList.add(gVar);
                    i = i5;
                }
                i2++;
                z = false;
            }
            this.c = z;
        }

        public final void j(androidx.appcompat.view.menu.h hVar) {
            if (this.b == hVar || !hVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.h hVar2 = this.b;
            if (hVar2 != null) {
                hVar2.setChecked(false);
            }
            this.b = hVar;
            hVar.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            l lVar = (l) d0Var;
            int itemViewType = getItemViewType(i);
            ArrayList<e> arrayList = this.a;
            ekx ekxVar = ekx.this;
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) arrayList.get(i);
                    lVar.itemView.setPaddingRelative(ekxVar.H, fVar.a, ekxVar.I, fVar.b);
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) arrayList.get(i)).a.e);
                textView.setTextAppearance(ekxVar.i);
                textView.setPaddingRelative(ekxVar.J, textView.getPaddingTop(), ekxVar.K, textView.getPaddingBottom());
                ColorStateList colorStateList = ekxVar.v;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                r6i0.p(textView, new fkx(this, i, true));
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(ekxVar.A);
            navigationMenuItemView.setTextAppearance(ekxVar.w);
            ColorStateList colorStateList2 = ekxVar.z;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = ekxVar.B;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = ekxVar.C;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) arrayList.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
            int i2 = ekxVar.D;
            int i3 = ekxVar.E;
            navigationMenuItemView.setPadding(i2, i3, i2, i3);
            navigationMenuItemView.setIconPadding(ekxVar.F);
            if (ekxVar.L) {
                navigationMenuItemView.setIconSize(ekxVar.G);
            }
            navigationMenuItemView.setMaxLines(ekxVar.N);
            androidx.appcompat.view.menu.h hVar = gVar.a;
            navigationMenuItemView.N = ekxVar.y;
            navigationMenuItemView.c(hVar);
            r6i0.p(navigationMenuItemView, new fkx(this, i, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            ekx ekxVar = ekx.this;
            if (i == 0) {
                LayoutInflater layoutInflater = ekxVar.f;
                a aVar = ekxVar.R;
                i iVar = new i(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
                iVar.itemView.setOnClickListener(aVar);
                return iVar;
            }
            if (i == 1) {
                return new k(ekxVar.f.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
            }
            if (i == 2) {
                return new j(ekxVar.f.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
            }
            if (i != 3) {
                return null;
            }
            return new b(ekxVar.b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void onViewRecycled(RecyclerView.d0 d0Var) {
            l lVar = (l) d0Var;
            if (lVar instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                FrameLayout frameLayout = navigationMenuItemView.P;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.O.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    public static class d implements e {
    }

    public interface e {
    }

    public static class f implements e {
        public final int a;
        public final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static class g implements e {
        public final androidx.appcompat.view.menu.h a;
        public boolean b;

        public g(androidx.appcompat.view.menu.h hVar) {
            this.a = hVar;
        }
    }

    public class h extends g0 {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        @Override // androidx.recyclerview.widget.g0, defpackage.e6
        public final void d(View view, c7 c7Var) {
            super.d(view, c7Var);
            ekx ekxVar = ekx.this;
            int i = 0;
            for (int i2 = 0; i2 < ekxVar.e.a.size(); i2++) {
                int itemViewType = ekxVar.e.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            c7Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
        }
    }

    public static class i extends l {
    }

    public static class j extends l {
    }

    public static class k extends l {
    }

    public static abstract class l extends RecyclerView.d0 {
    }

    public final void a() {
        c cVar = this.e;
        if (cVar != null) {
            ArrayList<e> arrayList = cVar.a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof f) {
                    cVar.notifyItemChanged(i2);
                }
            }
        }
    }

    public final void b() {
        c cVar = this.e;
        if (cVar != null) {
            ArrayList<e> arrayList = cVar.a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if ((arrayList.get(i2) instanceof g) && cVar.getItemViewType(i2) == 1) {
                    cVar.notifyItemChanged(i2);
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        androidx.appcompat.view.menu.h hVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.e;
                ArrayList<e> arrayList = cVar.a;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    cVar.c = true;
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        e eVar = arrayList.get(i3);
                        if (eVar instanceof g) {
                            androidx.appcompat.view.menu.h hVar2 = ((g) eVar).a;
                            if (hVar2.a == i2) {
                                cVar.j(hVar2);
                                break;
                            }
                        }
                    }
                    cVar.c = false;
                    cVar.i();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        e eVar2 = arrayList.get(i4);
                        if ((eVar2 instanceof g) && (actionView = (hVar = ((g) eVar2).a).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(hVar.a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        androidx.appcompat.view.menu.h hVar;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.e;
        if (cVar != null) {
            ArrayList<e> arrayList = cVar.a;
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.h hVar2 = cVar.b;
            if (hVar2 != null) {
                bundle2.putInt("android:menu:checked", hVar2.a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = arrayList.get(i2);
                if ((eVar instanceof g) && (actionView = (hVar = ((g) eVar).a).getActionView()) != null) {
                    ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                    actionView.saveHierarchyState(parcelableSparseArray);
                    sparseArray2.put(hVar.a, parcelableSparseArray);
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        c cVar = this.e;
        if (cVar != null) {
            ArrayList<e> arrayList = cVar.a;
            int size = arrayList.size();
            cVar.i();
            cVar.notifyDataSetChanged();
            if (size == arrayList.size()) {
                cVar.notifyItemRangeChanged(0, arrayList.size());
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f = LayoutInflater.from(context);
        this.c = fVar;
        this.P = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public final void m() {
        c cVar = this.e;
        if (cVar != null) {
            ArrayList<e> arrayList = cVar.a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if ((arrayList.get(i2) instanceof g) && cVar.getItemViewType(i2) == 0) {
                    cVar.notifyItemChanged(i2);
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
    }
}
