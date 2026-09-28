package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cuw<S> extends o {
    public final ytw b;
    public final ytw c;

    public cuw(S s) {
        super(3);
        this.b = m.b(s);
        this.c = m.b(s);
    }

    @Override // defpackage.o
    public final S V() {
        return (S) ((x5a0) this.b).getValue();
    }

    @Override // defpackage.o
    public final S b0() {
        return (S) ((x5a0) this.c).getValue();
    }

    @Override // defpackage.o
    public final void d0(S s) {
        ((x5a0) this.b).setValue(s);
    }

    public final boolean n0() {
        return Intrinsics.g(((x5a0) this.b).getValue(), ((x5a0) this.c).getValue()) && !((Boolean) ((x5a0) ((ytw) this.a)).getValue()).booleanValue();
    }

    public final void o0(Boolean bool) {
        ((x5a0) this.c).setValue(bool);
    }

    @Override // defpackage.o
    public final void f0() {
    }

    @Override // defpackage.o
    public final void e0(dtg0<S> dtg0Var) {
    }
}
