package defpackage;

import androidx.compose.runtime.m;

/* JADX INFO: loaded from: classes.dex */
public final class wu90 extends kni0 {
    public final i3w<?> b;
    public final ytw c = m.b(null);

    public wu90(i3w<?> i3wVar) {
        this.b = i3wVar;
    }

    @Override // defpackage.kni0
    public final boolean g(i3w<?> i3wVar) {
        return i3wVar == this.b;
    }

    @Override // defpackage.kni0
    public final <T> T i(i3w<T> i3wVar) {
        if (i3wVar != this.b) {
            wkn.c("Check failed.");
        }
        T t = (T) ((x5a0) this.c).getValue();
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> void p(i3w<T> i3wVar, T t) {
        if (!(i3wVar == this.b)) {
            wkn.c("Check failed.");
        }
        ((x5a0) this.c).setValue(t);
    }
}
