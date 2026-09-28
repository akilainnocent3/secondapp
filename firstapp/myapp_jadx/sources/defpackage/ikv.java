package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ikv implements oya {
    public final /* synthetic */ mkv.a a;
    public final /* synthetic */ tws b;
    public final /* synthetic */ pjv c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ikv(mkv.a aVar, tws twsVar, pjv pjvVar, IOException iOException, boolean z) {
        this.a = aVar;
        this.b = twsVar;
        this.c = pjvVar;
        this.d = iOException;
        this.e = z;
    }

    @Override // defpackage.oya
    public final void accept(Object obj) {
        mkv mkvVar = (mkv) obj;
        mkv.a aVar = this.a;
        mkvVar.v(aVar.a, aVar.b, this.b, this.c, this.d, this.e);
    }
}
