package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import defpackage.aoy;
import defpackage.bnv;
import defpackage.dmv;
import defpackage.fu00;
import defpackage.fvi;
import defpackage.ie;
import defpackage.iny;
import defpackage.jv60;
import defpackage.kbs;
import defpackage.kpy;
import defpackage.loy;
import defpackage.lwi;
import defpackage.nny;
import defpackage.nv60;
import defpackage.pxs;
import defpackage.qya;
import defpackage.re;
import defpackage.rn8;
import defpackage.roy;
import defpackage.s9s;
import defpackage.sc;
import defpackage.tny;
import defpackage.v8i0;
import defpackage.vvi;
import defpackage.w8i0;
import defpackage.ylw;
import defpackage.z290;
import defpackage.zwi;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class e extends rn8 implements sc.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final kbs mFragmentLifecycleRegistry;
    final fvi mFragments;
    boolean mResumed;
    boolean mStopped;

    public class a extends vvi<e> implements tny, kpy, loy, roy, w8i0, nny, re, nv60, zwi, dmv {
        public a() {
            super(e.this);
        }

        @Override // defpackage.zwi
        public final void a(FragmentManager fragmentManager, Fragment fragment) {
            e.this.onAttachFragment(fragment);
        }

        @Override // defpackage.dmv
        public final void addMenuProvider(bnv bnvVar) {
            e.this.addMenuProvider(bnvVar);
        }

        @Override // defpackage.tny
        public final void addOnConfigurationChangedListener(qya<Configuration> qyaVar) {
            e.this.addOnConfigurationChangedListener(qyaVar);
        }

        @Override // defpackage.loy
        public final void addOnMultiWindowModeChangedListener(qya<ylw> qyaVar) {
            e.this.addOnMultiWindowModeChangedListener(qyaVar);
        }

        @Override // defpackage.roy
        public final void addOnPictureInPictureModeChangedListener(qya<fu00> qyaVar) {
            e.this.addOnPictureInPictureModeChangedListener(qyaVar);
        }

        @Override // defpackage.kpy
        public final void addOnTrimMemoryListener(qya<Integer> qyaVar) {
            e.this.addOnTrimMemoryListener(qyaVar);
        }

        @Override // defpackage.evi
        public final View b(int i) {
            return e.this.findViewById(i);
        }

        @Override // defpackage.evi
        public final boolean c() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // defpackage.vvi
        public final void d(PrintWriter printWriter, String[] strArr) {
            e.this.dump("  ", null, printWriter, strArr);
        }

        @Override // defpackage.vvi
        public final e e() {
            return e.this;
        }

        @Override // defpackage.vvi
        public final LayoutInflater f() {
            e eVar = e.this;
            return eVar.getLayoutInflater().cloneInContext(eVar);
        }

        @Override // defpackage.vvi
        public final boolean g(String str) {
            return sc.f(e.this, str);
        }

        @Override // defpackage.re
        public final ie getActivityResultRegistry() {
            return e.this.getActivityResultRegistry();
        }

        @Override // defpackage.ibs
        public final s9s getLifecycle() {
            return e.this.mFragmentLifecycleRegistry;
        }

        @Override // defpackage.nny
        public final iny getOnBackPressedDispatcher() {
            return e.this.getOnBackPressedDispatcher();
        }

        @Override // defpackage.nv60
        public final jv60 getSavedStateRegistry() {
            return e.this.getSavedStateRegistry();
        }

        @Override // defpackage.w8i0
        public final v8i0 getViewModelStore() {
            return e.this.getViewModelStore();
        }

        @Override // defpackage.vvi
        public final void h() {
            e.this.invalidateMenu();
        }

        @Override // defpackage.dmv
        public final void removeMenuProvider(bnv bnvVar) {
            e.this.removeMenuProvider(bnvVar);
        }

        @Override // defpackage.tny
        public final void removeOnConfigurationChangedListener(qya<Configuration> qyaVar) {
            e.this.removeOnConfigurationChangedListener(qyaVar);
        }

        @Override // defpackage.loy
        public final void removeOnMultiWindowModeChangedListener(qya<ylw> qyaVar) {
            e.this.removeOnMultiWindowModeChangedListener(qyaVar);
        }

        @Override // defpackage.roy
        public final void removeOnPictureInPictureModeChangedListener(qya<fu00> qyaVar) {
            e.this.removeOnPictureInPictureModeChangedListener(qyaVar);
        }

        @Override // defpackage.kpy
        public final void removeOnTrimMemoryListener(qya<Integer> qyaVar) {
            e.this.removeOnTrimMemoryListener(qyaVar);
        }
    }

    public e() {
        this.mFragments = new fvi(new a());
        this.mFragmentLifecycleRegistry = new kbs(this, true);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new jv60.b() { // from class: tui
            @Override // jv60.b
            public final Bundle a() {
                return this.a.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new qya() { // from class: uui
            @Override // defpackage.qya
            public final void accept(Object obj) {
                this.a.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new qya() { // from class: vui
            @Override // defpackage.qya
            public final void accept(Object obj) {
                this.a.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new aoy() { // from class: wui
            @Override // defpackage.aoy
            public final void onContextAvailable(Context context) {
                this.a.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.g(s9s.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        a aVar = this.mFragments.a;
        aVar.d.b(aVar, aVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, s9s.b bVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), bVar);
                }
                o oVar = fragment.mViewLifecycleOwner;
                if (oVar != null) {
                    oVar.b();
                    if (oVar.e.d.a(s9s.b.d)) {
                        fragment.mViewLifecycleOwner.e.i(bVar);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.d.a(s9s.b.d)) {
                    fragment.mLifecycleRegistry.i(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.d.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                pxs.a(this).b(str2, printWriter);
            }
            this.mFragments.a.d.y(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.d;
    }

    @Deprecated
    public pxs getSupportLoaderManager() {
        return pxs.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), s9s.b.c)) {
        }
    }

    @Override // defpackage.rn8, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.g(s9s.a.ON_CREATE);
        lwi lwiVar = this.mFragments.a.d;
        lwiVar.I = false;
        lwiVar.J = false;
        lwiVar.P.f = false;
        lwiVar.x(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.d.o();
        this.mFragmentLifecycleRegistry.g(s9s.a.ON_DESTROY);
    }

    @Override // defpackage.rn8, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.d.m(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.d.x(5);
        this.mFragmentLifecycleRegistry.g(s9s.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.rn8, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.d.C(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.g(s9s.a.ON_RESUME);
        lwi lwiVar = this.mFragments.a.d;
        lwiVar.I = false;
        lwiVar.J = false;
        lwiVar.P.f = false;
        lwiVar.x(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            lwi lwiVar = this.mFragments.a.d;
            lwiVar.I = false;
            lwiVar.J = false;
            lwiVar.P.f = false;
            lwiVar.x(4);
        }
        this.mFragments.a.d.C(true);
        this.mFragmentLifecycleRegistry.g(s9s.a.ON_START);
        lwi lwiVar2 = this.mFragments.a.d;
        lwiVar2.I = false;
        lwiVar2.J = false;
        lwiVar2.P.f = false;
        lwiVar2.x(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        lwi lwiVar = this.mFragments.a.d;
        lwiVar.J = true;
        lwiVar.P.f = true;
        lwiVar.x(4);
        this.mFragmentLifecycleRegistry.g(s9s.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(z290 z290Var) {
        setEnterSharedElementCallback(z290Var != null ? new sc.b(z290Var) : null);
    }

    public void setExitSharedElementCallback(z290 z290Var) {
        setExitSharedElementCallback(z290Var != null ? new sc.b(z290Var) : null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // sc.a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public e(int i) {
        super(i);
        this.mFragments = new fvi(new a());
        this.mFragmentLifecycleRegistry = new kbs(this, true);
        this.mStopped = true;
        init();
    }
}
