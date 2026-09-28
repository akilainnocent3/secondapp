package com.esotericsoftware.spine.android;

import defpackage.b9p;
import defpackage.ei0;
import defpackage.hcb0;
import defpackage.kb0;
import defpackage.mx90;
import defpackage.zi0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final hcb0 a;
    public ei0 b;
    public kb0 c;
    public boolean d = true;

    public b(hcb0 hcb0Var) {
        this.a = hcb0Var;
    }

    public final zi0 a() {
        kb0 kb0Var = this.c;
        if (kb0Var != null) {
            return kb0Var.c;
        }
        b9p.a("Controller is not initialized yet.");
        return null;
    }

    public final mx90 b() {
        kb0 kb0Var = this.c;
        if (kb0Var != null) {
            return kb0Var.b;
        }
        b9p.a("Controller is not initialized yet.");
        return null;
    }
}
