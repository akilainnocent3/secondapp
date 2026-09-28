package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.aek0;
import defpackage.bmy;
import defpackage.cek0;
import defpackage.dek0;

/* JADX INFO: loaded from: classes4.dex */
final class z {
    final dek0 a;
    final dek0 b;
    final dek0 c;
    final dek0 d;
    final dek0 e;

    public z(Context context) {
        if (context == null) {
            bmy.a("instance cannot be null");
            throw null;
        }
        cek0 cek0Var = new cek0(context);
        this.a = cek0Var;
        aek0 aek0VarB = aek0.b(ak.a);
        this.b = aek0VarB;
        v vVar = u.a;
        az azVarC = az.c(cek0Var, vVar);
        this.c = azVarC;
        aek0 aek0VarB2 = aek0.b(at.b(cek0Var, aek0VarB, azVarC, vVar));
        this.d = aek0VarB2;
        this.e = aek0.b(aj.b(aek0VarB2));
    }
}
