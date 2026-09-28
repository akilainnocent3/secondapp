package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo10 implements mfe0 {
    @Override // defpackage.mfe0
    public final Object get() {
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e) {
            dad.a(e);
            return null;
        }
    }
}
