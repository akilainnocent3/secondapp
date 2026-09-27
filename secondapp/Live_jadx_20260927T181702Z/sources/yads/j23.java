package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class j23 implements ss1 {
    @Override // yads.ss1
    public /* synthetic */ mx0 a() {
        return ya4.a(this);
    }

    @Override // yads.ss1
    public /* synthetic */ byte[] b() {
        return ya4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }

    @Override // yads.ss1
    public /* synthetic */ void a(im1 im1Var) {
        ya4.b(this, im1Var);
    }
}
