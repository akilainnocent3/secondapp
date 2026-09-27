package yads;

import android.media.MediaCodec;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d53 implements bk1 {
    public static MediaCodec b(ak1 ak1Var) throws IOException {
        ak1Var.f146837a.getClass();
        String str = ak1Var.f146837a.f150657a;
        d73.a("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        d73.a();
        return mediaCodecCreateByCodecName;
    }

    @Override // yads.bk1
    public final dk1 a(ak1 ak1Var) {
        MediaCodec mediaCodecB = null;
        try {
            mediaCodecB = b(ak1Var);
            d73.a("configureCodec");
            mediaCodecB.configure(ak1Var.f146838b, ak1Var.f146840d, ak1Var.f146841e, 0);
            d73.a();
            d73.a("startCodec");
            mediaCodecB.start();
            d73.a();
            return new e53(mediaCodecB);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodecB != null) {
                mediaCodecB.release();
            }
            throw e10;
        }
    }
}
