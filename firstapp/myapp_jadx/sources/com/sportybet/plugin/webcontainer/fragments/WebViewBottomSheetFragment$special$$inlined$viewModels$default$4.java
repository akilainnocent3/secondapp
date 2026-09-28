package com.sportybet.plugin.webcontainer.fragments;

import defpackage.cyb;
import defpackage.iel;
import defpackage.qlr;
import defpackage.ttr;
import defpackage.w8i0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj8i0;", "VM", "Lcyb;", "invoke", "()Lcyb;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
public final class WebViewBottomSheetFragment$special$$inlined$viewModels$default$4 extends qlr implements Function0<cyb> {
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ ttr $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewBottomSheetFragment$special$$inlined$viewModels$default$4(Function0 function0, ttr ttrVar) {
        super(0);
        this.$extrasProducer = function0;
        this.$owner$delegate = ttrVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final cyb invoke() {
        cyb cybVar;
        Function0 function0 = this.$extrasProducer;
        if (function0 != null && (cybVar = (cyb) function0.invoke()) != null) {
            return cybVar;
        }
        w8i0 w8i0Var = (w8i0) this.$owner$delegate.getValue();
        iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
        return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
    }
}
