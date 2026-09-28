package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class mdl0 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ nfl0 e;

    public mdl0(nfl0 nfl0Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
        Objects.requireNonNull(nfl0Var);
        this.e = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0VarO = this.e.a.o();
        ikl0VarO.g();
        ikl0VarO.h();
        ikl0VarO.u(new yil0(ikl0VarO, this.a, this.b, this.c, ikl0VarO.w(false), this.d));
    }
}
