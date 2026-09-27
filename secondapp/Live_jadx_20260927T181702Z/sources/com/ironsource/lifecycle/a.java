package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62283b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0583a f62284a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0583a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f62283b);
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f62283b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f62283b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC0583a interfaceC0583a) {
        if (interfaceC0583a != null) {
            interfaceC0583a.a(getActivity());
        }
    }

    public void d(InterfaceC0583a interfaceC0583a) {
        this.f62284a = interfaceC0583a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f62284a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f62284a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f62284a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f62284a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC0583a interfaceC0583a) {
        if (interfaceC0583a != null) {
            interfaceC0583a.b(getActivity());
        }
    }

    private void b(InterfaceC0583a interfaceC0583a) {
        if (interfaceC0583a != null) {
            interfaceC0583a.onResume(getActivity());
        }
    }
}
