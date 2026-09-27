package o5;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import nj.c2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(35)
@m1
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<MediaCodec> f118795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f118796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public LoudnessCodecController f118797c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        public a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return u.this.f118796b.a(bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f118799a = new b() { // from class: o5.v
            @Override // o5.u.b
            public final Bundle a(Bundle bundle) {
                return w.a(bundle);
            }
        };

        Bundle a(Bundle bundle);
    }

    public u() {
        this(b.f118799a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f118797c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            zi.l0.g0(this.f118795a.add(mediaCodec));
        }
    }

    public void c() {
        this.f118795a.clear();
        LoudnessCodecController loudnessCodecController = this.f118797c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f118795a.remove(mediaCodec) || (loudnessCodecController = this.f118797c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f118797c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f118797c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, c2.c(), new a());
        this.f118797c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.f118795a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public u(b bVar) {
        this.f118795a = new HashSet<>();
        this.f118796b = bVar;
    }
}
