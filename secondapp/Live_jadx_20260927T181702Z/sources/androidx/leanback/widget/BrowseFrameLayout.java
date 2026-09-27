package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class BrowseFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f12003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f12004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnKeyListener f12005d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        boolean a(int i10, Rect rect);

        void b(View view, View view2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        View a(View view, int i10);
    }

    public BrowseFrameLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.f12005d;
        return (onKeyListener == null || zDispatchKeyEvent) ? zDispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewA;
        b bVar = this.f12003b;
        return (bVar == null || (viewA = bVar.a(view, i10)) == null) ? super.focusSearch(view, i10) : viewA;
    }

    public a getOnChildFocusListener() {
        return this.f12004c;
    }

    public b getOnFocusSearchListener() {
        return this.f12003b;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        a aVar = this.f12004c;
        if (aVar == null || !aVar.a(i10, rect)) {
            return super.onRequestFocusInDescendants(i10, rect);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        a aVar = this.f12004c;
        if (aVar != null) {
            aVar.b(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(a aVar) {
        this.f12004c = aVar;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.f12005d = onKeyListener;
    }

    public void setOnFocusSearchListener(b bVar) {
        this.f12003b = bVar;
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
