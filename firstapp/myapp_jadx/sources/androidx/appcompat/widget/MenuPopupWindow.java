package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import defpackage.jmv;
import defpackage.qef;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class MenuPopupWindow extends ListPopupWindow implements jmv {
    public static final Method S;
    public androidx.appcompat.view.menu.b.c R;

    public static class MenuDropDownListView extends qef {
        public final int B;
        public final int C;
        public jmv D;
        public h E;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.B = 21;
                this.C = 22;
            } else {
                this.B = 22;
                this.C = 21;
            }
        }

        @Override // defpackage.qef, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            e eVar;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.D != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    headersCount = 0;
                }
                h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= eVar.getCount()) ? null : eVar.getItem(i);
                h hVar = this.E;
                if (hVar != item) {
                    f fVar = eVar.a;
                    if (hVar != null) {
                        this.D.n(fVar, hVar);
                    }
                    this.E = item;
                    if (item != null) {
                        this.D.d(fVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.B) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.C) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (e) adapter).a.c(false);
            return true;
        }

        public void setHoverListener(jmv jmvVar) {
            this.D = jmvVar;
        }

        @Override // defpackage.qef, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                S = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.jmv
    public final void d(f fVar, h hVar) {
        androidx.appcompat.view.menu.b.c cVar = this.R;
        if (cVar != null) {
            cVar.d(fVar, hVar);
        }
    }

    @Override // defpackage.jmv
    public final void n(f fVar, MenuItem menuItem) {
        androidx.appcompat.view.menu.b.c cVar = this.R;
        if (cVar != null) {
            cVar.n(fVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public final qef q(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
