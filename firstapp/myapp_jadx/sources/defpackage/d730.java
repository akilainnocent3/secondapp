package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class d730 implements zuh0 {
    public boolean a = false;
    public boolean b = false;
    public hjh c;
    public final a730 d;

    public d730(a730 a730Var) {
        this.d = a730Var;
    }

    @Override // defpackage.zuh0
    public final zuh0 b(String str) throws IOException {
        if (this.a) {
            throw new k4g("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.zuh0
    public final zuh0 c(boolean z) throws IOException {
        if (this.a) {
            throw new k4g("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
