package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class tir implements tse {
    public final /* synthetic */ ytw a;

    public tir(ytw ytwVar) {
        this.a = ytwVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        ((Function1) this.a.getValue()).invoke(new ler.j(false));
    }
}
