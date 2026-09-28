package com.sportybet.plugin.webcontainer.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.c;
import defpackage.dvi;
import defpackage.ejd;
import defpackage.j1k;
import defpackage.r8i0;
import defpackage.t6i0;
import defpackage.uvi;
import defpackage.z7b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Hilt_WebViewBottomSheetFragment extends c implements j1k {
    private ContextWrapper componentContext;
    private volatile dvi componentManager;
    private final Object componentManagerLock;
    private boolean disableGetContextFix;
    private boolean injected;

    public Hilt_WebViewBottomSheetFragment() {
        this.disableGetContextFix = false;
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = new t6i0.a(super.getContext(), this);
            this.disableGetContextFix = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.j1k
    public final dvi componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.componentManager;
    }

    public dvi createComponentManager() {
        return new dvi(this);
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.iel
    public r8i0.c getDefaultViewModelProviderFactory() {
        return ejd.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((WebViewBottomSheetFragment_GeneratedInjector) generatedComponent()).injectWebViewBottomSheetFragment((WebViewBottomSheetFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        z7b.c(contextWrapper == null || dvi.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public Hilt_WebViewBottomSheetFragment(int i) {
        super(i);
        this.disableGetContextFix = false;
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }
}
