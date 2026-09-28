package defpackage;

import com.sportybet.plugin.myfavorite.widget.MyFavoriteLivePanel;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jjd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jjd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((nv5.d) obj).cancel(true);
                break;
            default:
                MyFavoriteLivePanel myFavoriteLivePanel = (MyFavoriteLivePanel) obj;
                int i2 = MyFavoriteLivePanel.p0;
                myFavoriteLivePanel.G(myFavoriteLivePanel.R);
                break;
        }
    }
}
