package defpackage;

import android.content.Context;
import androidx.profileinstaller.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f130 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f130(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                c.b((Context) obj, new liv(), c.a, false);
                break;
            default:
                l88 l88VarF = l88.f();
                l88VarF.getClass();
                l88VarF.c(new nqc((i88) obj));
                break;
        }
    }
}
