package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class PersistentFocusWrapper extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f12145d = "PersistentFocusWrapper";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f12146e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12148c;

    public PersistentFocusWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12147b = -1;
        this.f12148c = true;
    }

    public void a() {
        this.f12147b = -1;
        if (hasFocus()) {
            clearFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (hasFocus() || b() == 0 || !e(i10)) {
            super.addFocusables(arrayList, i10, i11);
        } else {
            arrayList.add(this);
        }
    }

    public int b() {
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getChildCount();
    }

    public void c() {
        this.f12148c = false;
    }

    public void d() {
        this.f12148c = true;
    }

    public final boolean e(int i10) {
        boolean z10 = this.f12148c;
        if (z10 && (i10 == 33 || i10 == 130)) {
            return true;
        }
        if (z10) {
            return false;
        }
        return i10 == 17 || i10 == 66;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f12147b = savedState.f12149b;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12149b = this.f12147b;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        while (view2 != null && view2.getParent() != view) {
            view2 = (View) view2.getParent();
        }
        this.f12147b = view2 == null ? -1 : ((ViewGroup) view).indexOfChild(view2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        int i11;
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        if (viewGroup == null || (i11 = this.f12147b) < 0 || i11 >= b() || !viewGroup.getChildAt(this.f12147b).requestFocus(i10, rect)) {
            return super.requestFocus(i10, rect);
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12149b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12149b = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f12149b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public PersistentFocusWrapper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12147b = -1;
        this.f12148c = true;
    }
}
