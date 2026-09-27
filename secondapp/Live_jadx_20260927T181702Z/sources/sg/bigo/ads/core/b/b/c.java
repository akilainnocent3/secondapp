package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f134553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f134554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f134555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f134556d;

    public static c a() {
        c cVar = new c();
        String strK = sg.bigo.ads.common.x.a.k();
        if (!q.a((CharSequence) strK)) {
            String[] strArrSplit = strK.split(",");
            if (strArrSplit.length == 4) {
                try {
                    cVar.f134553a = Integer.parseInt(strArrSplit[0]);
                    cVar.f134554b = Integer.parseInt(strArrSplit[1]);
                    cVar.f134555c = Integer.parseInt(strArrSplit[2]);
                    cVar.f134556d = Integer.parseInt(strArrSplit[3]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return cVar;
    }

    public final boolean b() {
        return ((this.f134553a + this.f134554b) + this.f134555c) + this.f134556d == 0;
    }

    public final void c() {
        this.f134553a = 0;
        this.f134554b = 0;
        this.f134555c = 0;
        this.f134556d = 0;
        sg.bigo.ads.common.x.a.d(toString());
    }

    @NonNull
    public final String toString() {
        return this.f134553a + "," + this.f134554b + "," + this.f134555c + "," + this.f134556d;
    }

    public final void a(String str) {
        str.getClass();
        switch (str) {
            case "filled":
                this.f134554b++;
                break;
            case "load":
                this.f134553a++;
                break;
            case "impression":
                this.f134555c++;
                break;
            case "clicked":
                this.f134556d++;
                break;
        }
        sg.bigo.ads.common.x.a.d(toString());
    }
}
