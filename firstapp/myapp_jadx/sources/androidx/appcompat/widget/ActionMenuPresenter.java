package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import com.sportybet.android.gp.tz.R;
import defpackage.cc;
import defpackage.e0g0;
import defpackage.fui;
import defpackage.ib5;
import defpackage.mb;
import defpackage.sb90;
import defpackage.ymv;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMenuPresenter extends androidx.appcompat.view.menu.a {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final SparseBooleanArray H;
    public e I;
    public a J;
    public c K;
    public b L;
    public final f M;
    public int N;
    public d y;
    public Drawable z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
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
        }
    }

    public class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if ((mVar.A.x & 32) != 32) {
                View view2 = ActionMenuPresenter.this.y;
                this.e = view2 == null ? (View) ActionMenuPresenter.this.v : view2;
            }
            f fVar = ActionMenuPresenter.this.M;
            this.h = fVar;
            ymv ymvVar = this.i;
            if (ymvVar != null) {
                ymvVar.d(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.J = null;
            actionMenuPresenter.N = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {
        public final e a;

        public c(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.f.a aVar;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.c;
            if (fVar != null && (aVar = fVar.e) != null) {
                aVar.b(fVar);
            }
            View view = (View) actionMenuPresenter.v;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.a;
                if (eVar.b()) {
                    actionMenuPresenter.I = eVar;
                } else if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                    actionMenuPresenter.I = eVar;
                }
            }
            actionMenuPresenter.K = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends fui {
            public a(d dVar) {
                super(dVar);
            }

            @Override // defpackage.fui
            public final sb90 b() {
                e eVar = ActionMenuPresenter.this.I;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // defpackage.fui
            public final boolean c() {
                ActionMenuPresenter.this.n();
                return true;
            }

            @Override // defpackage.fui
            public final boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.K != null) {
                    return false;
                }
                actionMenuPresenter.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e0g0.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, View view) {
            super(context, fVar, view, true, R.attr.actionOverflowMenuStyle, 0);
            this.f = 8388613;
            f fVar2 = ActionMenuPresenter.this.M;
            this.h = fVar2;
            ymv ymvVar = this.i;
            if (ymvVar != null) {
                ymvVar.d(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.c;
            if (fVar != null) {
                fVar.c(true);
            }
            actionMenuPresenter.I = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
            if (fVar instanceof m) {
                ((m) fVar).z.m().c(false);
            }
            j.a aVar = ActionMenuPresenter.this.e;
            if (aVar != null) {
                aVar.c(fVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (fVar == actionMenuPresenter.c) {
                return false;
            }
            actionMenuPresenter.N = ((m) fVar).A.a;
            j.a aVar = actionMenuPresenter.e;
            if (aVar != null) {
                return aVar.d(fVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.f = R.layout.abc_action_menu_layout;
        this.i = R.layout.abc_action_menu_item_layout;
        this.H = new SparseBooleanArray();
        this.M = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            k.a aVar = view instanceof k.a ? (k.a) view : (k.a) this.d.inflate(this.i, viewGroup, false);
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.v);
            b bVar = this.L;
            if (bVar == null) {
                bVar = new b();
                this.L = bVar;
            }
            actionMenuItemView.setPopupCallback(bVar);
            actionView = (View) aVar;
        }
        actionView.setVisibility(hVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        c cVar = this.K;
        if (cVar != null && (obj = this.v) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.K = null;
            return true;
        }
        e eVar = this.I;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.i.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
        b();
        a aVar = this.J;
        if (aVar != null && aVar.b()) {
            aVar.i.dismiss();
        }
        j.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).a) > 0 && (menuItemFindItem = this.c.findItem(i)) != null) {
            g((m) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            m mVar2 = mVar;
            while (true) {
                androidx.appcompat.view.menu.f fVar = mVar2.z;
                if (fVar == this.c) {
                    break;
                }
                mVar2 = (m) fVar;
            }
            h hVar = mVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.v;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == hVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.N = mVar.A.a;
                int size = mVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = mVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                a aVar = new a(this.b, mVar, view);
                this.J = aVar;
                aVar.g = z;
                ymv ymvVar = aVar.i;
                if (ymvVar != null) {
                    ymvVar.q(z);
                }
                a aVar2 = this.J;
                if (!aVar2.b()) {
                    if (aVar2.e == null) {
                        ib5.a("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    aVar2.d(0, 0, false, false);
                }
                j.a aVar3 = this.e;
                if (aVar3 != null) {
                    aVar3.d(mVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        SavedState savedState = new SavedState();
        savedState.a = this.N;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.v;
        ArrayList<h> arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.c;
            if (fVar != null) {
                fVar.k();
                ArrayList<h> arrayListN = this.c.n();
                int size = arrayListN.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar = arrayListN.get(i2);
                    if ((hVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View viewA = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.v).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.y) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.v).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.c;
        if (fVar2 != null) {
            fVar2.k();
            ArrayList<h> arrayList2 = fVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                cc ccVar = arrayList2.get(i3).A;
                if (ccVar != null) {
                    ccVar.a = this;
                }
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.c;
        if (fVar3 != null) {
            fVar3.k();
            arrayList = fVar3.j;
        }
        if (this.B && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        d dVar = this.y;
        if (z2) {
            if (dVar == null) {
                dVar = new d(this.a);
                this.y = dVar;
            }
            ViewGroup viewGroup3 = (ViewGroup) dVar.getParent();
            if (viewGroup3 != this.v) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.y);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.v;
                d dVar2 = this.y;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParamsJ = ActionMenuView.j();
                layoutParamsJ.a = true;
                actionMenuView.addView(dVar2, layoutParamsJ);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.v;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.y);
            }
        }
        ((ActionMenuView) this.v).setOverflowReserved(this.B);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        int size;
        ArrayList<h> arrayListN;
        int i;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.f fVar = actionMenuPresenter.c;
        if (fVar != null) {
            arrayListN = fVar.n();
            size = arrayListN.size();
        } else {
            size = 0;
            arrayListN = null;
        }
        int i2 = actionMenuPresenter.F;
        int i3 = actionMenuPresenter.E;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.v;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            h hVar = arrayListN.get(i4);
            int i7 = hVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.G && hVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (actionMenuPresenter.B && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.H;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            h hVar2 = arrayListN.get(i9);
            int i11 = hVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = hVar2.b;
            if (z3) {
                View viewA = actionMenuPresenter.a(hVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                hVar2.g(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = actionMenuPresenter.a(hVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            h hVar3 = arrayListN.get(i13);
                            if (hVar3.b == i12) {
                                if ((hVar3.x & 32) == 32) {
                                    i8++;
                                }
                                hVar3.g(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    hVar2.g(z5);
                } else {
                    hVar2.g(false);
                }
                i9++;
                i = 2;
                actionMenuPresenter = this;
                z = true;
            }
            i9++;
            i = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(Context context, androidx.appcompat.view.menu.f fVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = fVar;
        Resources resources = context.getResources();
        mb mbVarA = mb.a(context);
        if (!this.C) {
            this.B = true;
        }
        this.D = mbVarA.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.F = mbVarA.b();
        int measuredWidth = this.D;
        if (this.B) {
            if (this.y == null) {
                d dVar = new d(this.a);
                this.y = dVar;
                if (this.A) {
                    dVar.setImageDrawable(this.z);
                    this.z = null;
                    this.A = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.y.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.y.getMeasuredWidth();
        } else {
            this.y = null;
        }
        this.E = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    public final boolean m() {
        e eVar = this.I;
        return eVar != null && eVar.b();
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.B || m() || (fVar = this.c) == null || this.v == null || this.K != null) {
            return false;
        }
        fVar.k();
        if (fVar.j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.b, this.c, this.y));
        this.K = cVar;
        ((View) this.v).post(cVar);
        return true;
    }
}
