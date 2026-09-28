package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wcl extends k5b implements ekd {
    @Override // defpackage.k5b
    public final k5b g0(int i) {
        wcs.a(i);
        return this;
    }

    public abstract vcl h0();

    public wse m(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return icd.a.m(j, runnable, coroutineContext);
    }

    @Override // defpackage.k5b
    public String toString() {
        vcl vclVarH0;
        String str;
        pfd pfdVar = fse.a;
        wcl wclVar = gku.a;
        if (this == wclVar) {
            str = "Dispatchers.Main";
        } else {
            try {
                vclVarH0 = wclVar.h0();
            } catch (UnsupportedOperationException unused) {
                vclVarH0 = null;
            }
            str = this == vclVarH0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + x2d.b(this);
    }
}
