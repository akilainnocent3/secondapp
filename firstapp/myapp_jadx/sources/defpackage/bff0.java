package defpackage;

import com.google.protobuf.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bff0 {
    public final nk0 a;
    public final imf0 b;
    public final boolean e;
    public final mmd g;
    public final f8i.a h;
    public final List<nk0.d<ji10>> i;
    public ckw j;
    public asr k;
    public final int c = Reader.READ_DONE;
    public final int d = 1;
    public final int f = 1;

    public bff0(nk0 nk0Var, imf0 imf0Var, boolean z, mmd mmdVar, f8i.a aVar, List list) {
        this.a = nk0Var;
        this.b = imf0Var;
        this.e = z;
        this.g = mmdVar;
        this.h = aVar;
        this.i = list;
    }

    public final void a(asr asrVar) {
        ckw ckwVar = this.j;
        if (ckwVar == null || asrVar != this.k || ckwVar.a()) {
            this.k = asrVar;
            ckwVar = new ckw(this.a, ib30.c(this.b, asrVar), this.i, this.g, this.h);
        }
        this.j = ckwVar;
    }
}
