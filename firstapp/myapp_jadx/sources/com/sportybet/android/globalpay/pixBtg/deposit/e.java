package com.sportybet.android.globalpay.pixBtg.deposit;

import com.sportybet.android.globalpay.pixBtg.deposit.f;
import defpackage.ej5;
import defpackage.et7;
import defpackage.ztw;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public static final void a(ztw ztwVar, et7 et7Var, final Function1 function1) {
        ztwVar.getClass();
        b(ztwVar, et7Var, new Function1() { // from class: k810
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                f.c cVar = (f.c) obj;
                cVar.getClass();
                return f.c.a(cVar, null, 0.0d, null, null, null, null, null, (kme) function1.invoke(cVar.h), 127);
            }
        });
    }

    public static final void b(ztw ztwVar, et7 et7Var, Function1 function1) {
        ztwVar.getClass();
        ej5.c(et7Var, null, null, new d(ztwVar, function1, null), 3);
    }
}
