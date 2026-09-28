package defpackage;

import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j180 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j180(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((SearchView) obj).j();
                break;
            default:
                AFa1uSDK.getMediationNetwork((AFc1bSDK) obj);
                break;
        }
    }
}
