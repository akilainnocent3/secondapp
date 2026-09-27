package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends n implements Comparable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f134852a;

    public l(@NonNull String str, float f10) {
        super(str);
        this.f134852a = f10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull l lVar) {
        return Double.compare(this.f134852a, lVar.f134852a);
    }

    @Override // sg.bigo.ads.core.f.a.n
    public final String toString() {
        return "{\"Content\":\"" + this.f134855b + "\",\"progress\":\"" + this.f134852a + "\"}";
    }
}
