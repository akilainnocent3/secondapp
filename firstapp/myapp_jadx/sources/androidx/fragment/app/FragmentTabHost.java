package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import defpackage.iyi;
import defpackage.oke;
import defpackage.uf80;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public final ArrayList<b> a;
    public FrameLayout b;
    public Context c;
    public FragmentManager d;
    public int e;
    public TabHost.OnTabChangeListener f;
    public b i;
    public boolean v;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.a = parcel.readString();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            return uf80.a(sb, this.a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    public static class a implements TabHost.TabContentFactory {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public final View createTabContent(String str) {
            View view = new View(this.a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    public static final class b {
        public final String a;
        public final Class<?> b;
        public Fragment c;

        public b(Class cls, String str) {
            this.a = str;
            this.b = cls;
        }
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.a = new ArrayList<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.inflatedId}, 0, 0);
        this.e = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public final void a(TabHost.TabSpec tabSpec, Class cls) {
        tabSpec.setContent(new a(this.c));
        String tag = tabSpec.getTag();
        b bVar = new b(cls, tag);
        if (this.v) {
            Fragment fragmentH = this.d.H(tag);
            bVar.c = fragmentH;
            if (fragmentH != null && !fragmentH.isDetached()) {
                FragmentManager fragmentManager = this.d;
                androidx.fragment.app.a aVarA = oke.a(fragmentManager, fragmentManager);
                aVarA.m(bVar.c);
                aVarA.d();
            }
        }
        this.a.add(bVar);
        addTab(tabSpec);
    }

    public final n b(String str, androidx.fragment.app.a aVar) {
        b bVar;
        Fragment fragment;
        ArrayList<b> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = arrayList.get(i);
            if (bVar.a.equals(str)) {
                break;
            }
            i++;
        }
        if (this.i != bVar) {
            if (aVar == null) {
                FragmentManager fragmentManager = this.d;
                aVar = oke.a(fragmentManager, fragmentManager);
            }
            b bVar2 = this.i;
            if (bVar2 != null && (fragment = bVar2.c) != null) {
                aVar.m(fragment);
            }
            if (bVar != null) {
                Fragment fragment2 = bVar.c;
                if (fragment2 == null) {
                    g gVarO = this.d.O();
                    this.c.getClassLoader();
                    Fragment fragmentA = gVarO.a(bVar.b.getName());
                    bVar.c = fragmentA;
                    fragmentA.setArguments(null);
                    aVar.e(this.e, bVar.c, bVar.a, 1);
                } else {
                    aVar.b(new n.a(fragment2, 7));
                }
            }
            this.i = bVar;
        }
        return aVar;
    }

    public final void c() {
        if (this.b == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.e);
            this.b = frameLayout;
            if (frameLayout != null) {
                return;
            }
            iyi.a(this.e, "No tab content FrameLayout found for id ");
        }
    }

    public final void d(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.b = frameLayout2;
            frameLayout2.setId(this.e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        ArrayList<b> arrayList = this.a;
        int size = arrayList.size();
        androidx.fragment.app.a aVarA = null;
        for (int i = 0; i < size; i++) {
            b bVar = arrayList.get(i);
            Fragment fragmentH = this.d.H(bVar.a);
            bVar.c = fragmentH;
            if (fragmentH != null && !fragmentH.isDetached()) {
                if (bVar.a.equals(currentTabTag)) {
                    this.i = bVar;
                } else {
                    if (aVarA == null) {
                        FragmentManager fragmentManager = this.d;
                        aVarA = oke.a(fragmentManager, fragmentManager);
                    }
                    aVarA.m(bVar.c);
                }
            }
        }
        this.v = true;
        n nVarB = b(currentTabTag, aVarA);
        if (nVarB != null) {
            nVarB.d();
            FragmentManager fragmentManager2 = this.d;
            fragmentManager2.C(true);
            fragmentManager2.J();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v = false;
    }

    @Override // android.view.View
    @Deprecated
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.a);
    }

    @Override // android.view.View
    @Deprecated
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public final void onTabChanged(String str) {
        n nVarB;
        if (this.v && (nVarB = b(str, null)) != null) {
            nVarB.d();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f = onTabChangeListener;
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager, int i) {
        d(context);
        super.setup();
        this.c = context;
        this.d = fragmentManager;
        this.e = i;
        c();
        this.b.setId(i);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.c = context;
        this.d = fragmentManager;
        c();
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.e = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
