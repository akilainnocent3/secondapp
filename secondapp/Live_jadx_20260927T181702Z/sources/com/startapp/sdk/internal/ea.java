package com.startapp.sdk.internal;

import android.content.Context;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ea extends j6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
    }

    public static final String b(InputMethodSubtype inputMethodSubtype) {
        kotlin.jvm.internal.m0.m(inputMethodSubtype);
        return da.a(inputMethodSubtype);
    }

    @Override // com.startapp.sdk.internal.j6
    public final /* bridge */ /* synthetic */ Object c() {
        return ca.f74635b;
    }

    @Override // com.startapp.sdk.internal.j6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ca a() {
        Object systemService = this.f75023a.getSystemService("input_method");
        final InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return null;
        }
        InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
        zu.m mVarC = zu.x.C(currentInputMethodSubtype != null ? da.a(currentInputMethodSubtype) : null);
        List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
        kotlin.jvm.internal.m0.o(inputMethodList, "getInputMethodList(...)");
        Set setL3 = zu.k0.L3(zu.k0.E3(zu.k0.P0(zu.k0.X0(zu.k0.T2(mVarC, zu.k0.N1(zu.k0.P0(zu.x.s(zu.k0.N1(fr.r0.E1(inputMethodList), new ds.l() { // from class: com.startapp.sdk.internal.nl
            @Override // ds.l
            public final Object invoke(Object obj) {
                return ea.a(inputMethodManager, (InputMethodInfo) obj);
            }
        })), new ds.l() { // from class: com.startapp.sdk.internal.ol
            @Override // ds.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ea.a((InputMethodSubtype) obj));
            }
        }), new ds.l() { // from class: com.startapp.sdk.internal.pl
            @Override // ds.l
            public final Object invoke(Object obj) {
                return ea.b((InputMethodSubtype) obj);
            }
        }))), new ds.l() { // from class: com.startapp.sdk.internal.ql
            @Override // ds.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ea.a((String) obj));
            }
        }), 10));
        if (setL3.isEmpty()) {
            return null;
        }
        return new ca(setL3);
    }

    public static final List a(InputMethodManager systemService, InputMethodInfo inputMethodInfo) {
        kotlin.jvm.internal.m0.p(systemService, "$systemService");
        return systemService.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
    }

    public static final boolean a(InputMethodSubtype inputMethodSubtype) {
        return kotlin.jvm.internal.m0.g("keyboard", inputMethodSubtype.getMode());
    }

    public static final boolean a(String it) {
        kotlin.jvm.internal.m0.p(it, "it");
        return it.length() > 0;
    }
}
