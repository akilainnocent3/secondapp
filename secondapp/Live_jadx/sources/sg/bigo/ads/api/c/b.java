package sg.bigo.ads.api.c;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f132743h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f132744i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f132745j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132746a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f132747b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f132748c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f132749d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f132750e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f132751f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f132752g = false;

    public static void a() {
        f132744i = 1;
    }

    public static int b() {
        return f132743h;
    }

    public static void a(int i10) {
        f132743h = i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    public static b b(int i10) {
        b bVar = new b();
        if (f132745j) {
            bVar.f132752g = true;
            bVar.f132748c = true;
            bVar.f132747b = true;
            bVar.f132751f = 2000L;
        } else if (i10 == 2) {
            bVar.f132752g = true;
            bVar.f132748c = true;
            bVar.f132747b = true;
            bVar.f132751f = 2000L;
            bVar.f132746a = 4;
        } else {
            if (i10 == 3) {
                bVar.f132752g = true;
                bVar.f132748c = true;
            } else if (i10 != 4) {
                if (i10 == 12) {
                    bVar.f132752g = true;
                    bVar.f132748c = true;
                    bVar.f132747b = true;
                    bVar.f132751f = 2000L;
                } else if (i10 == 20) {
                    bVar.f132748c = true;
                }
                bVar.f132746a = 4;
            } else {
                bVar.f132752g = true;
                bVar.f132748c = true;
                bVar.f132747b = true;
            }
            bVar.f132751f = 2000L;
            bVar.f132746a = f132744i;
        }
        f132744i = 3;
        return bVar;
    }

    public static void a(boolean z10) {
        f132745j = z10;
    }
}
