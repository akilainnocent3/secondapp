package yads;

import android.util.SparseArray;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ar implements pq0, fu {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final du f146894k = new du() { // from class: yads.nx3
        @Override // yads.du
        public final fu a(int i10, mx0 mx0Var, boolean z10, List list, m73 m73Var, ye2 ye2Var) {
            return ar.a(i10, mx0Var, z10, list, m73Var, ye2Var);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final gg2 f146895l = new gg2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq0 f146896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f146898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f146899e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f146900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public eu f146901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f146902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vw2 f146903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mx0[] f146904j;

    public ar(mq0 mq0Var, int i10, mx0 mx0Var) {
        this.f146896b = mq0Var;
        this.f146897c = i10;
        this.f146898d = mx0Var;
    }

    @Override // yads.pq0
    public final void a() {
        mx0[] mx0VarArr = new mx0[this.f146899e.size()];
        for (int i10 = 0; i10 < this.f146899e.size(); i10++) {
            mx0 mx0Var = ((zq) this.f146899e.valueAt(i10)).f158991d;
            if (mx0Var == null) {
                throw new IllegalStateException();
            }
            mx0VarArr[i10] = mx0Var;
        }
        this.f146904j = mx0VarArr;
    }

    public final hu b() {
        vw2 vw2Var = this.f146903i;
        if (vw2Var instanceof hu) {
            return (hu) vw2Var;
        }
        return null;
    }

    public final void c() {
        this.f146896b.release();
    }

    public final void a(eu euVar, long j10, long j11) {
        m73 al0Var;
        this.f146901g = euVar;
        this.f146902h = j11;
        if (!this.f146900f) {
            this.f146896b.a(this);
            if (j10 != -9223372036854775807L) {
                this.f146896b.seek(0L, j10);
            }
            this.f146900f = true;
            return;
        }
        mq0 mq0Var = this.f146896b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        mq0Var.seek(0L, j10);
        for (int i10 = 0; i10 < this.f146899e.size(); i10++) {
            zq zqVar = (zq) this.f146899e.valueAt(i10);
            if (euVar == null) {
                zqVar.f158992e = zqVar.f158990c;
            } else {
                zqVar.f158993f = j11;
                int i11 = zqVar.f158988a;
                lo loVar = (lo) euVar;
                int i12 = 0;
                while (true) {
                    int[] iArr = loVar.f152068a;
                    if (i12 < iArr.length) {
                        if (i11 == iArr[i12]) {
                            al0Var = loVar.f152069b[i12];
                            break;
                        }
                        i12++;
                    } else {
                        ih1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                        al0Var = new al0();
                        break;
                    }
                }
                zqVar.f158992e = al0Var;
                mx0 mx0Var = zqVar.f158991d;
                if (mx0Var != null) {
                    al0Var.a(mx0Var);
                }
            }
        }
    }

    public static fu a(int i10, mx0 mx0Var, boolean z10, List list, m73 m73Var, ye2 ye2Var) {
        mq0 sx0Var;
        String str = mx0Var.f152728l;
        if (ht1.e(str)) {
            return null;
        }
        if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
            sx0Var = new sx0(z10 ? 4 : 0, list, m73Var);
        } else {
            sx0Var = new zi1(new jd0(), 1);
        }
        return new ar(sx0Var, i10, mx0Var);
    }

    @Override // yads.pq0
    public final void a(vw2 vw2Var) {
        this.f146903i = vw2Var;
    }

    @Override // yads.pq0
    public final m73 a(int i10, int i11) {
        m73 al0Var;
        zq zqVar = (zq) this.f146899e.get(i10);
        if (zqVar != null) {
            return zqVar;
        }
        if (this.f146904j == null) {
            zq zqVar2 = new zq(i10, i11, i11 == this.f146897c ? this.f146898d : null);
            eu euVar = this.f146901g;
            long j10 = this.f146902h;
            if (euVar == null) {
                zqVar2.f158992e = zqVar2.f158990c;
            } else {
                zqVar2.f158993f = j10;
                lo loVar = (lo) euVar;
                int i12 = 0;
                while (true) {
                    int[] iArr = loVar.f152068a;
                    if (i12 < iArr.length) {
                        if (i11 == iArr[i12]) {
                            al0Var = loVar.f152069b[i12];
                            break;
                        }
                        i12++;
                    } else {
                        ih1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                        al0Var = new al0();
                        break;
                    }
                }
                zqVar2.f158992e = al0Var;
                mx0 mx0Var = zqVar2.f158991d;
                if (mx0Var != null) {
                    al0Var.a(mx0Var);
                }
            }
            this.f146899e.put(i10, zqVar2);
            return zqVar2;
        }
        throw new IllegalStateException();
    }
}
