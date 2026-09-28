package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.aek0;
import defpackage.bmy;
import defpackage.cek0;
import defpackage.dek0;

/* JADX INFO: loaded from: classes4.dex */
final class ac {
    final dek0 a;
    final dek0 b;
    final dek0 c;
    final dek0 d;
    final dek0 e;
    final dek0 f;

    public ac(Context context) {
        if (context == null) {
            bmy.a("instance cannot be null");
            throw null;
        }
        cek0 cek0Var = new cek0(context);
        this.a = cek0Var;
        aek0 aek0VarB = aek0.b(bg.a);
        this.b = aek0VarB;
        x xVar = w.a;
        az azVarC = az.c(cek0Var, xVar);
        this.c = azVarC;
        aek0 aek0VarB2 = aek0.b(bu.b(cek0Var, aek0VarB, azVarC, xVar));
        this.d = aek0VarB2;
        aek0 aek0VarB3 = aek0.b(bz.b(aek0VarB2));
        this.e = aek0VarB3;
        this.f = aek0.b(bf.b(aek0VarB2, aek0VarB3));
    }
}
