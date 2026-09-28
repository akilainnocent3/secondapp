package defpackage;

import com.appsflyer.internal.AFd1ySDK;
import com.cruxlab.sectionedrecyclerview.lib.SectionHeaderLayout;
import com.cruxlab.sectionedrecyclerview.lib.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f380 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f380(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = SectionHeaderLayout.e;
                d.C0186d c0186d = ((SectionHeaderLayout) obj).b;
                if (c0186d != null) {
                    c0186d.b();
                }
                break;
            default:
                AFd1ySDK.getCurrencyIso4217Code((AFd1ySDK) obj);
                break;
        }
    }
}
