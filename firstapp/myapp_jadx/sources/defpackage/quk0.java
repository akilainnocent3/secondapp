package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class quk0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ hwk0 b;

    public quk0(hwk0 hwk0Var, long j) {
        this.a = j;
        Objects.requireNonNull(hwk0Var);
        this.b = hwk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.m(this.a);
    }
}
