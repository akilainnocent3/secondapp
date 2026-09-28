package defpackage;

import android.app.Activity;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oq3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oq3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((wq3) obj2).i((Activity) obj);
                break;
            default:
                dfm dfmVar = (dfm) obj2;
                List<String> list = dfm.v2;
                dfmVar.J0(dfmVar.t1, (List) obj);
                break;
        }
    }
}
