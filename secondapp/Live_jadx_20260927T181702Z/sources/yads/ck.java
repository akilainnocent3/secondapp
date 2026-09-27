package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ck implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f147754c;

    public ck(wj wjVar, mx0 mx0Var) {
        jb2 jb2Var = wjVar.f157394b;
        this.f147754c = jb2Var;
        jb2Var.e(12);
        int iP = jb2Var.p();
        if ("audio/raw".equals(mx0Var.f152729m)) {
            int iB = ib3.b(mx0Var.B, mx0Var.f152742z);
            if (iP == 0 || iP % iB != 0) {
                ih1.d(jf.b.f99867a, "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iP);
                iP = iB;
            }
        }
        this.f147752a = iP == 0 ? -1 : iP;
        this.f147753b = jb2Var.p();
    }

    @Override // yads.ak
    public final int a() {
        return this.f147752a;
    }

    @Override // yads.ak
    public final int b() {
        return this.f147753b;
    }

    @Override // yads.ak
    public final int c() {
        int i10 = this.f147752a;
        return i10 == -1 ? this.f147754c.p() : i10;
    }
}
