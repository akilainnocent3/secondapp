package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.transition.AutoTransition;
import androidx.transition.e;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.a;
import com.google.android.material.internal.ParcelableSparseArray;
import defpackage.akx;
import defpackage.bkx;
import defpackage.wte;

/* JADX INFO: loaded from: classes4.dex */
public final class NavigationBarPresenter implements j {
    public NavigationBarMenuView a;
    public boolean b;
    public int c;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public ParcelableSparseArray b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.a;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.a;
            int size = navigationBarMenuView.e0.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem menuItemA = navigationBarMenuView.e0.a(i2);
                if (i == menuItemA.getItemId()) {
                    navigationBarMenuView.v = i;
                    navigationBarMenuView.w = i2;
                    navigationBarMenuView.setCheckedItem(menuItemA);
                    break;
                }
            }
            Context context = this.a.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.b;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i3);
                sparseArray.put(iKeyAt, state != null ? new a(context, state) : null);
            }
            NavigationBarMenuView navigationBarMenuView2 = this.a;
            SparseArray<a> sparseArray2 = navigationBarMenuView2.K;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (a) sparseArray.get(iKeyAt2));
                }
            }
            bkx[] bkxVarArr = navigationBarMenuView2.i;
            if (bkxVarArr != null) {
                for (bkx bkxVar : bkxVarArr) {
                    if (bkxVar instanceof NavigationBarItemView) {
                        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) bkxVar;
                        a aVar = sparseArray2.get(navigationBarItemView.getId());
                        if (aVar != null) {
                            navigationBarItemView.setBadge(aVar);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        SavedState savedState = new SavedState();
        savedState.a = this.a.getSelectedItemId();
        SparseArray<a> badgeDrawables = this.a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            a aVarValueAt = badgeDrawables.valueAt(i);
            parcelableSparseArray.put(iKeyAt, aVarValueAt != null ? aVarValueAt.e.a : null);
        }
        savedState.b = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        akx akxVar;
        AutoTransition autoTransition;
        if (this.b) {
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.a;
        if (z) {
            navigationBarMenuView.b();
            return;
        }
        akx akxVar2 = navigationBarMenuView.e0;
        if (akxVar2 == null || navigationBarMenuView.i == null) {
            return;
        }
        navigationBarMenuView.d0.b = true;
        akxVar2.b();
        navigationBarMenuView.d0.b = false;
        if (navigationBarMenuView.i != null && (akxVar = navigationBarMenuView.e0) != null && akxVar.b.size() == navigationBarMenuView.i.length) {
            for (int i = 0; i < navigationBarMenuView.i.length; i++) {
                if (!(navigationBarMenuView.e0.a(i) instanceof wte) || (navigationBarMenuView.i[i] instanceof NavigationBarDividerView)) {
                    boolean z2 = navigationBarMenuView.e0.a(i).hasSubMenu() && !(navigationBarMenuView.i[i] instanceof NavigationBarSubheaderView);
                    boolean z3 = (navigationBarMenuView.e0.a(i).hasSubMenu() || (navigationBarMenuView.i[i] instanceof NavigationBarItemView)) ? false : true;
                    if ((navigationBarMenuView.e0.a(i) instanceof wte) || (!z2 && !z3)) {
                    }
                }
            }
            int i2 = navigationBarMenuView.v;
            int size = navigationBarMenuView.e0.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem menuItemA = navigationBarMenuView.e0.a(i3);
                if (menuItemA.isChecked()) {
                    navigationBarMenuView.setCheckedItem(menuItemA);
                    navigationBarMenuView.v = menuItemA.getItemId();
                    navigationBarMenuView.w = i3;
                }
            }
            if (i2 != navigationBarMenuView.v && (autoTransition = navigationBarMenuView.a) != null) {
                e.a(navigationBarMenuView, autoTransition);
            }
            boolean zG = NavigationBarMenuView.g(navigationBarMenuView.e, navigationBarMenuView.getCurrentVisibleContentItemCount());
            for (int i4 = 0; i4 < size; i4++) {
                navigationBarMenuView.d0.b = true;
                navigationBarMenuView.i[i4].setExpanded(navigationBarMenuView.j0);
                bkx bkxVar = navigationBarMenuView.i[i4];
                if (bkxVar instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) bkxVar;
                    navigationBarItemView.setLabelVisibilityMode(navigationBarMenuView.e);
                    navigationBarItemView.setItemIconGravity(navigationBarMenuView.f);
                    navigationBarItemView.setItemGravity(navigationBarMenuView.W);
                    navigationBarItemView.setShifting(zG);
                }
                if (navigationBarMenuView.e0.a(i4) instanceof h) {
                    navigationBarMenuView.i[i4].c((h) navigationBarMenuView.e0.a(i4));
                }
                navigationBarMenuView.d0.b = false;
            }
            return;
        }
        navigationBarMenuView.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(Context context, f fVar) {
        this.a.a(fVar);
    }
}
