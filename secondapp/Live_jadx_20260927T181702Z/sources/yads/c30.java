package yads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c30 implements dv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f147520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f147521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f147522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f147523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f147524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f147525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f147526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f147527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hb3 f147528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zx2 f147529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f147530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj2 f147531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f147532m;

    public c30(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, dj2 dj2Var, hb3 hb3Var, zx2 zx2Var, Uri uri, ArrayList arrayList) {
        this.f147520a = j10;
        this.f147521b = j11;
        this.f147522c = j12;
        this.f147523d = z10;
        this.f147524e = j13;
        this.f147525f = j14;
        this.f147526g = j15;
        this.f147527h = j16;
        this.f147531l = dj2Var;
        this.f147528i = hb3Var;
        this.f147530k = uri;
        this.f147529j = zx2Var;
        this.f147532m = arrayList;
    }

    public final fc2 a(int i10) {
        return (fc2) this.f147532m.get(i10);
    }

    public final long b(int i10) {
        long j10;
        long j11;
        if (i10 == this.f147532m.size() - 1) {
            j10 = this.f147521b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((fc2) this.f147532m.get(i10)).f149051b;
        } else {
            j10 = ((fc2) this.f147532m.get(i10 + 1)).f149051b;
            j11 = ((fc2) this.f147532m.get(i10)).f149051b;
        }
        return j10 - j11;
    }

    public final long c(int i10) {
        return ib3.a(b(i10));
    }

    public final c30 a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new v33(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f147532m.size()) {
                break;
            }
            if (((v33) linkedList.peek()).f156726b != i10) {
                long jB = b(i10);
                if (jB != -9223372036854775807L) {
                    j11 += jB;
                } else {
                    j10 = j11;
                }
                i10++;
            } else {
                fc2 fc2Var = (fc2) this.f147532m.get(i10);
                List list2 = fc2Var.f149052c;
                v33 v33Var = (v33) linkedList.poll();
                int i11 = v33Var.f156726b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = v33Var.f156727c;
                    zb zbVar = (zb) list2.get(i12);
                    List list3 = zbVar.f158683c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((lo2) list3.get(v33Var.f156728d));
                        v33Var = (v33) linkedList.poll();
                        if (v33Var.f156726b != i11) {
                            break;
                        }
                    } while (v33Var.f156727c == i12);
                    j10 = j11;
                    arrayList2.add(new zb(zbVar.f158681a, zbVar.f158682b, arrayList3, zbVar.f158684d, zbVar.f158685e, zbVar.f158686f));
                    if (v33Var.f156726b != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(v33Var);
                arrayList.add(new fc2(fc2Var.f149050a, fc2Var.f149051b - j10, arrayList2, fc2Var.f149053d));
            }
            j11 = j10;
            i10++;
        }
        long j12 = j11;
        long j13 = this.f147521b;
        return new c30(this.f147520a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.f147522c, this.f147523d, this.f147524e, this.f147525f, this.f147526g, this.f147527h, this.f147531l, this.f147528i, this.f147529j, this.f147530k, arrayList);
    }
}
