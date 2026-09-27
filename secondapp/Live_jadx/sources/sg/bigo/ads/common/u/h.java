package sg.bigo.ads.common.u;

/* JADX INFO: loaded from: classes7.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f133373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f133375c;

    public h(int i10, String str) {
        this.f133373a = i10;
        this.f133374b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc = this.f133375c;
        return exc != null ? exc.getMessage() : this.f133374b;
    }
}
