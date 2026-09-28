package com.sportybet.plugin.webcontainer.fragments;

import androidx.fragment.app.Fragment;
import defpackage.iel;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.ttr;
import defpackage.w8i0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj8i0;", "VM", "Lr8i0$c;", "invoke", "()Lr8i0$c;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
public final class WebViewBottomSheetFragment$special$$inlined$viewModels$default$5 extends qlr implements Function0<r8i0.c> {
    final /* synthetic */ ttr $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewBottomSheetFragment$special$$inlined$viewModels$default$5(Fragment fragment, ttr ttrVar) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = ttrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final r8i0.c invoke() {
        r8i0.c defaultViewModelProviderFactory;
        w8i0 w8i0Var = (w8i0) this.$owner$delegate.getValue();
        iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
        return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
    }
}
