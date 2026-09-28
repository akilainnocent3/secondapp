package defpackage;

import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes8.dex */
public final class uxf0<U, T extends U> extends vn70<T> implements Runnable {
    public final long f;

    public uxf0(long j, v1b<? super U> v1bVar) {
        super(v1bVar, v1bVar.getContext());
        this.f = j;
    }

    @Override // defpackage.m9p
    public final String T() {
        StringBuilder sb = new StringBuilder(super.T());
        sb.append("(timeMillis=");
        return uvh.a(sb, this.f, ')');
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    @Override // java.lang.Runnable
    public final void run() {
        String strA;
        ekd ekdVarD = hkd.d(this.d);
        lkd lkdVar = ekdVarD instanceof lkd ? (lkd) ekdVarD : null;
        long j = this.f;
        if (lkdVar != null) {
            b.a aVar = b.b;
            c.i(j, rgf.MILLISECONDS);
            strA = lkdVar.f();
            if (strA == null) {
                strA = d020.a(j, "Timed out waiting for ", " ms");
            }
        } else {
            strA = d020.a(j, "Timed out waiting for ", " ms");
        }
        r(new txf0(strA, this));
    }
}
