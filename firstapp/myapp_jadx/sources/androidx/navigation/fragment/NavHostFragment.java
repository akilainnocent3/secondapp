package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;
import defpackage.ak30;
import defpackage.ck30;
import defpackage.hwr;
import defpackage.i0b;
import defpackage.ib5;
import defpackage.j6j;
import defpackage.kjx;
import defpackage.mpe0;
import defpackage.phx;
import defpackage.rui;
import defpackage.yfx;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavHostFragment extends Fragment {
    public final mpe0 a = hwr.b(new j6j(this, 1));
    public View b;
    public int c;
    public boolean d;

    public static final class a {
        public static yfx a(Fragment fragment) {
            Dialog dialog;
            Window window;
            fragment.getClass();
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).j0();
                }
                Fragment fragment2 = parentFragment.getParentFragmentManager().A;
                if (fragment2 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragment2).j0();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return kjx.a(view);
            }
            d dVar = fragment instanceof d ? (d) fragment : null;
            View decorView = (dVar == null || (dialog = dVar.getDialog()) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
            if (decorView != null) {
                return kjx.a(decorView);
            }
            ib5.a(rui.a("Fragment ", fragment, " does not have a NavController set"));
            return null;
        }
    }

    public final phx j0() {
        return (phx) this.a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (this.d) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.r(this);
            aVar.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        j0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.d = true;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.r(this);
            aVar.d();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.b;
        if (view != null && kjx.a(view) == j0()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ak30.b);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.c = resourceId;
        }
        Unit unit = Unit.a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ck30.c);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            i0b.b(view, "created host view ", " is not a ViewGroup");
            return;
        }
        view.setTag(R.id.nav_controller_view_tag, j0());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.b = view2;
            if (view2.getId() == getId()) {
                View view3 = this.b;
                view3.getClass();
                view3.setTag(R.id.nav_controller_view_tag, j0());
            }
        }
    }
}
