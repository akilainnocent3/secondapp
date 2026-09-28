package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import defpackage.al30;
import defpackage.hyi;
import defpackage.ib5;
import defpackage.jyi;
import defpackage.tug;
import defpackage.vvi;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LayoutInflater.Factory2 {
    public final FragmentManager a;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ k a;

        public a(k kVar) {
            this.a = kVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            k kVar = this.a;
            Fragment fragment = kVar.c;
            kVar.k();
            q.i((ViewGroup) fragment.mView.getParent(), h.this.a).h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public h(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        k kVarJ;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, al30.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(g.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentG = resourceId != -1 ? fragmentManager.G(resourceId) : null;
                    if (fragmentG == null && string != null) {
                        fragmentG = fragmentManager.H(string);
                    }
                    if (fragmentG == null && id != -1) {
                        fragmentG = fragmentManager.G(id);
                    }
                    if (fragmentG == null) {
                        g gVarO = fragmentManager.O();
                        context.getClassLoader();
                        fragmentG = gVarO.a(attributeValue);
                        fragmentG.mFromLayout = true;
                        fragmentG.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragmentG.mContainerId = id;
                        fragmentG.mTag = string;
                        fragmentG.mInLayout = true;
                        fragmentG.mFragmentManager = fragmentManager;
                        vvi<?> vviVar = fragmentManager.x;
                        fragmentG.mHost = vviVar;
                        fragmentG.onInflate(vviVar.b, attributeSet, fragmentG.mSavedFragmentState);
                        kVarJ = fragmentManager.a(fragmentG);
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentG + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentG.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentG.mInLayout = true;
                        fragmentG.mFragmentManager = fragmentManager;
                        vvi<?> vviVar2 = fragmentManager.x;
                        fragmentG.mHost = vviVar2;
                        fragmentG.onInflate(vviVar2.b, attributeSet, fragmentG.mSavedFragmentState);
                        kVarJ = fragmentManager.j(fragmentG);
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentG + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    hyi.b bVar = hyi.a;
                    jyi jyiVar = new jyi(fragmentG, oAudzpbdOhCI.PwMvYSSsw + fragmentG + " to container " + viewGroup);
                    hyi.c(jyiVar);
                    hyi.b bVarA = hyi.a(fragmentG);
                    if (bVarA.a.contains(hyi.a.d) && hyi.e(bVarA, fragmentG.getClass(), jyi.class)) {
                        hyi.b(bVarA, jyiVar);
                    }
                    fragmentG.mContainer = viewGroup;
                    kVarJ.k();
                    kVarJ.j();
                    View view2 = fragmentG.mView;
                    if (view2 == null) {
                        ib5.a(tug.a("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentG.mView.getTag() == null) {
                        fragmentG.mView.setTag(string);
                    }
                    fragmentG.mView.addOnAttachStateChangeListener(new a(kVarJ));
                    return fragmentG.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
