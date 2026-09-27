package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vj extends xj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f156994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f156995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f156996d;

    public vj(int i10, long j10) {
        super(i10);
        this.f156994b = j10;
        this.f156995c = new ArrayList();
        this.f156996d = new ArrayList();
    }

    public final vj b(int i10) {
        int size = this.f156996d.size();
        for (int i11 = 0; i11 < size; i11++) {
            vj vjVar = (vj) this.f156996d.get(i11);
            if (vjVar.f157882a == i10) {
                return vjVar;
            }
        }
        return null;
    }

    public final wj c(int i10) {
        int size = this.f156995c.size();
        for (int i11 = 0; i11 < size; i11++) {
            wj wjVar = (wj) this.f156995c.get(i11);
            if (wjVar.f157882a == i10) {
                return wjVar;
            }
        }
        return null;
    }

    @Override // yads.xj
    public final String toString() {
        return xj.a(this.f157882a) + " leaves: " + Arrays.toString(this.f156995c.toArray()) + " containers: " + Arrays.toString(this.f156996d.toArray());
    }
}
