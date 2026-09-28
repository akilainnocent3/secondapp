package defpackage;

import androidx.media3.common.StreamKey;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class inh implements wam {
    public final wam a;
    public final List<StreamKey> b;

    public inh(cdd cddVar, List list) {
        this.a = cddVar;
        this.b = list;
    }

    @Override // defpackage.wam
    public final tsz.a<uam> a(tam tamVar, ram ramVar) {
        return new jnh(this.a.a(tamVar, ramVar), this.b);
    }

    @Override // defpackage.wam
    public final tsz.a<uam> b() {
        return new jnh(this.a.b(), this.b);
    }
}
