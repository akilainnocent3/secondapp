package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public f c;
    public ExpandedMenuView d;
    public j.a e;
    public a f;

    public class a extends BaseAdapter {
        public int a = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.c;
            h hVar = fVar.v;
            if (hVar != null) {
                fVar.k();
                ArrayList<h> arrayList = fVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == hVar) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i) {
            f fVar = d.this.c;
            fVar.k();
            ArrayList<h> arrayList = fVar.j;
            int i2 = this.a;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            f fVar = d.this.c;
            fVar.k();
            int size = fVar.j.size();
            return this.a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        j.a aVar = this.e;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        boolean zHasVisibleItems = mVar.hasVisibleItems();
        Context context = mVar.a;
        if (!zHasVisibleItems) {
            return false;
        }
        g gVar = new g();
        gVar.a = mVar;
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(context);
        d dVar = new d(aVar.getContext());
        gVar.c = dVar;
        dVar.e = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.c;
        a aVar2 = dVar2.f;
        if (aVar2 == null) {
            aVar2 = dVar2.new a();
            dVar2.f = aVar2;
        }
        AlertController.b bVar = aVar.a;
        bVar.o = aVar2;
        bVar.p = gVar;
        View view = mVar.o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.c = mVar.n;
            aVar.setTitle(mVar.m);
        }
        bVar.n = gVar;
        androidx.appcompat.app.b bVarCreate = aVar.create();
        gVar.b = bVarCreate;
        bVarCreate.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.b.show();
        j.a aVar3 = this.e;
        if (aVar3 == null) {
            return true;
        }
        aVar3.d(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(Context context, f fVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = fVar;
        a aVar = this.f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.s(this.f.getItem(i), this, 0);
    }
}
