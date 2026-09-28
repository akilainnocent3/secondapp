package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ldl0 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nfl0 d;

    public ldl0(nfl0 nfl0Var, AtomicReference atomicReference, String str, String str2) {
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        Objects.requireNonNull(nfl0Var);
        this.d = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0VarO = this.d.a.o();
        ikl0VarO.g();
        ikl0VarO.h();
        ikl0VarO.u(new vil0(ikl0VarO, this.a, this.b, this.c, ikl0VarO.w(false)));
    }
}
