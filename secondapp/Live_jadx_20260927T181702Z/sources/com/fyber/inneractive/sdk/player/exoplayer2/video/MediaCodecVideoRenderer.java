package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C4235d4;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f47171q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final h P;
    public final VideoRendererEventListener.EventDispatcher Q;
    public final long R;
    public final int S;
    public final boolean T;
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] U;
    public e V;
    public Surface W;
    public int X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f47172a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f47173b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f47174c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f47175d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f47176e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f47177f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f47178g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f47179h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f47180i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f47181j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f47182k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f47183l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f47184m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f47185n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f47186o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public f f47187p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z10 = false;
        this.R = 5000L;
        this.S = -1;
        this.P = new h();
        this.Q = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (z.f47158a <= 22 && "foster".equals(z.f47159b) && "NVIDIA".equals(z.f47160c)) {
            z10 = true;
        }
        this.T = z10;
        this.Z = -9223372036854775807L;
        this.f47177f0 = -1;
        this.f47178g0 = -1;
        this.f47180i0 = -1.0f;
        this.f47176e0 = -1.0f;
        this.X = 1;
        this.f47181j0 = -1;
        this.f47182k0 = -1;
        this.f47184m0 = -1.0f;
        this.f47183l0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr) {
        this.U = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        int i10;
        int i11;
        String str = oVar.f46789f;
        if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar2 = oVar.f46792i;
        if (dVar2 != null) {
            z10 = false;
            for (int i12 = 0; i12 < dVar2.f45727c; i12++) {
                z10 |= dVar2.f45725a[i12].f45724e;
            }
        } else {
            z10 = false;
        }
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(z10, str);
        if (aVarA == null) {
            return 1;
        }
        boolean zA = aVarA.a(oVar.f46786c);
        if (zA && (i10 = oVar.f46793j) > 0 && (i11 = oVar.f46794k) > 0) {
            if (z.f47158a >= 21) {
                zA = aVarA.a(i10, i11, oVar.f46795l);
            } else {
                boolean z11 = i10 * i11 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a();
                if (!z11) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + oVar.f46793j + "x" + oVar.f46794k + "] [" + z.f47162e + C4235d4.j.f61462e);
                }
                zA = z11;
            }
        }
        return (zA ? 3 : 2) | (aVarA.f46714b ? 8 : 4) | (aVarA.f46715c ? 16 : 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        if ((this.Y || super.q()) && super.f()) {
            this.Z = -9223372036854775807L;
            return true;
        }
        if (this.Z == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Z) {
            return true;
        }
        this.Z = -9223372036854775807L;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        this.f47177f0 = -1;
        this.f47178g0 = -1;
        this.f47180i0 = -1.0f;
        this.f47176e0 = -1.0f;
        this.f47181j0 = -1;
        this.f47182k0 = -1;
        this.f47184m0 = -1.0f;
        this.f47183l0 = -1;
        r();
        h hVar = this.P;
        if (hVar.f47210b) {
            hVar.f47209a.f47206b.sendEmptyMessage(2);
        }
        this.f47187p0 = null;
        try {
            this.f46724n = null;
            o();
        } finally {
            this.N.ensureUpdated();
            this.Q.disabled(this.N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.N = decoderCounters;
        int i10 = this.f45570b.f46917a;
        this.f47186o0 = i10;
        this.f47185n0 = i10 != 0;
        this.Q.enabled(decoderCounters);
        h hVar = this.P;
        hVar.f47216h = false;
        if (hVar.f47210b) {
            hVar.f47209a.f47206b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.f47173b0 = 0;
        this.f47172a0 = SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        this.Z = -9223372036854775807L;
        if (this.f47173b0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.Q.droppedFrames(this.f47173b0, jElapsedRealtime - this.f47172a0);
            this.f47173b0 = 0;
            this.f47172a0 = jElapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void m() {
        if (z.f47158a >= 23 || !this.f47185n0 || this.Y) {
            return;
        }
        this.Y = true;
        this.Q.renderedFirstFrame(this.W);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean q() {
        Surface surface;
        return super.q() && (surface = this.W) != null && surface.isValid();
    }

    public final void r() {
        MediaCodec mediaCodec;
        this.Y = false;
        if (z.f47158a < 23 || !this.f47185n0 || (mediaCodec = this.f46725o) == null) {
            return;
        }
        this.f47187p0 = new f(this, mediaCodec);
    }

    public final void s() {
        int i10 = this.f47177f0;
        if (i10 == -1 && this.f47178g0 == -1) {
            return;
        }
        if (this.f47181j0 == i10 && this.f47182k0 == this.f47178g0 && this.f47183l0 == this.f47179h0 && this.f47184m0 == this.f47180i0) {
            return;
        }
        this.Q.videoSizeChanged(i10, this.f47178g0, this.f47179h0, this.f47180i0);
        this.f47181j0 = this.f47177f0;
        this.f47182k0 = this.f47178g0;
        this.f47183l0 = this.f47179h0;
        this.f47184m0 = this.f47180i0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z10, j10);
        r();
        this.f47174c0 = 0;
        if (z10) {
            this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
        } else {
            this.Z = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i10, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i10 != 1) {
            if (i10 == 4) {
                int iIntValue = ((Integer) obj).intValue();
                this.X = iIntValue;
                MediaCodec mediaCodec = this.f46725o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.W == surface) {
            if (surface != null) {
                int i11 = this.f47181j0;
                if (i11 != -1 || this.f47182k0 != -1) {
                    this.Q.videoSizeChanged(i11, this.f47182k0, this.f47183l0, this.f47184m0);
                }
                if (this.Y) {
                    this.Q.renderedFirstFrame(this.W);
                    return;
                }
                return;
            }
            return;
        }
        this.W = surface;
        int i12 = this.f45571c;
        if (i12 == 1 || i12 == 2) {
            MediaCodec mediaCodec2 = this.f46725o;
            if (z.f47158a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                o();
                l();
            }
        }
        if (surface != null) {
            int i13 = this.f47181j0;
            if (i13 != -1 || this.f47182k0 != -1) {
                this.Q.videoSizeChanged(i13, this.f47182k0, this.f47183l0, this.f47184m0);
            }
            r();
            if (i12 == 2) {
                this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
                return;
            }
            return;
        }
        this.f47181j0 = -1;
        this.f47182k0 = -1;
        this.f47184m0 = -1.0f;
        this.f47183l0 = -1;
        r();
    }

    public static boolean b(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (oVar.f46789f.equals(oVar2.f46789f)) {
            int i10 = oVar.f46796m;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = oVar2.f46796m;
            if (i11 == -1) {
                i11 = 0;
            }
            if (i10 == i11) {
                if (z10) {
                    return true;
                }
                if (oVar.f46793j == oVar2.f46793j && oVar.f46794k == oVar2.f46794k) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        e eVar;
        Point point;
        boolean z10;
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.U;
        int iMax = oVar.f46793j;
        int iMax2 = oVar.f46794k;
        int iMax3 = oVar.f46790g;
        if (iMax3 == -1) {
            iMax3 = a(oVar.f46789f, iMax, iMax2);
        }
        if (oVarArr.length == 1) {
            eVar = new e(iMax, iMax2, iMax3);
        } else {
            boolean z11 = false;
            for (com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 : oVarArr) {
                if (b(aVar.f46714b, oVar, oVar2)) {
                    int i11 = oVar2.f46793j;
                    z11 |= i11 == -1 || oVar2.f46794k == -1;
                    iMax = Math.max(iMax, i11);
                    iMax2 = Math.max(iMax2, oVar2.f46794k);
                    int iA = oVar2.f46790g;
                    if (iA == -1) {
                        iA = a(oVar2.f46789f, oVar2.f46793j, oVar2.f46794k);
                    }
                    iMax3 = Math.max(iMax3, iA);
                }
            }
            if (z11) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i12 = oVar.f46794k;
                int i13 = oVar.f46793j;
                boolean z12 = i12 > i13;
                int i14 = z12 ? i12 : i13;
                if (z12) {
                    i12 = i13;
                }
                float f10 = i12 / i14;
                int[] iArr = f47171q0;
                int i15 = 0;
                while (true) {
                    if (i15 < 9) {
                        int i16 = iArr[i15];
                        int i17 = i15;
                        int i18 = (int) (i16 * f10);
                        if (i16 > i14 && i18 > i12) {
                            int i19 = i12;
                            if (z.f47158a >= 21) {
                                point = aVar.a(z12 ? i18 : i16, z12 ? i16 : i18);
                                z10 = z12;
                                if (aVar.a(point.x, point.y, oVar.f46795l)) {
                                    break;
                                }
                                i15 = i17 + 1;
                                i12 = i19;
                                f10 = f10;
                                z12 = z10;
                                i14 = i14;
                            } else {
                                z10 = z12;
                                int i20 = ((i16 + 15) / 16) * 16;
                                int i21 = ((i18 + 15) / 16) * 16;
                                if (i20 * i21 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a()) {
                                    int i22 = z10 ? i21 : i20;
                                    if (!z10) {
                                        i20 = i21;
                                    }
                                    point = new Point(i22, i20);
                                    break;
                                }
                                i15 = i17 + 1;
                                i12 = i19;
                                f10 = f10;
                                z12 = z10;
                                i14 = i14;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iMax3 = Math.max(iMax3, a(oVar.f46789f, iMax, iMax2));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            eVar = new e(iMax, iMax2, iMax3);
        }
        this.V = eVar;
        boolean z13 = this.T;
        int i23 = this.f47186o0;
        MediaFormat mediaFormatA = oVar.a();
        mediaFormatA.setInteger("max-width", eVar.f47200a);
        mediaFormatA.setInteger("max-height", eVar.f47201b);
        int i24 = eVar.f47202c;
        if (i24 != -1) {
            mediaFormatA.setInteger("max-input-size", i24);
        }
        if (z13) {
            i10 = 0;
            mediaFormatA.setInteger("auto-frc", 0);
        } else {
            i10 = 0;
        }
        if (i23 != 0) {
            mediaFormatA.setFeatureEnabled("tunneled-playback", true);
            mediaFormatA.setInteger("audio-session-id", i23);
        }
        mediaCodec.configure(mediaFormatA, this.W, (MediaCrypto) null, i10);
        if (z.f47158a < 23 || !this.f47185n0) {
            return;
        }
        this.f47187p0 = new f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j10, long j11) {
        this.Q.decoderInitialized(str, j10, j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.Q.inputFormatChanged(oVar);
        float f10 = oVar.f46797n;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f47176e0 = f10;
        int i10 = oVar.f46796m;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f47175d0 = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f47177f0 = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f47178g0 = integer2;
        float f10 = this.f47176e0;
        this.f47180i0 = f10;
        if (z.f47158a >= 21) {
            int i10 = this.f47175d0;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f47177f0;
                this.f47177f0 = integer2;
                this.f47178g0 = i11;
                this.f47180i0 = 1.0f / f10;
            }
        } else {
            this.f47179h0 = this.f47175d0;
        }
        mediaCodec.setVideoScalingMode(this.X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (!b(z10, oVar, oVar2)) {
            return false;
        }
        int i10 = oVar2.f46793j;
        e eVar = this.V;
        return i10 <= eVar.f47200a && oVar2.f46794k <= eVar.f47201b && oVar2.f46790g <= eVar.f47202c;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:51:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10) {
        String str;
        long j13;
        long j14;
        g gVar;
        long j15;
        long j16;
        int i11;
        long j17;
        long j18;
        long j19;
        if (z10) {
            w.a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i10, false);
            w.a();
            this.N.skippedOutputBufferCount++;
            return true;
        }
        if (!this.Y) {
            if (z.f47158a >= 21) {
                long jNanoTime = System.nanoTime();
                s();
                w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i10, jNanoTime);
                w.a();
                this.N.renderedOutputBufferCount++;
                this.f47174c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
            } else {
                s();
                w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i10, true);
                w.a();
                this.N.renderedOutputBufferCount++;
                this.f47174c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
            }
            return true;
        }
        if (this.f45571c != 2) {
            return false;
        }
        long jElapsedRealtime = (j12 - j10) - ((SystemClock.elapsedRealtime() * 1000) - j11);
        long jNanoTime2 = System.nanoTime();
        long j20 = (jElapsedRealtime * 1000) + jNanoTime2;
        h hVar = this.P;
        long j21 = j12 * 1000;
        if (hVar.f47216h) {
            if (j12 != hVar.f47213e) {
                hVar.f47219k++;
                hVar.f47214f = hVar.f47215g;
            }
            long j22 = hVar.f47219k;
            if (j22 >= 6) {
                str = "releaseOutputBuffer";
                long j23 = hVar.f47218j;
                long j24 = hVar.f47214f + ((j21 - j23) / j22);
                if (Math.abs((j20 - hVar.f47217i) - (j24 - j23)) > 20000000) {
                    hVar.f47216h = false;
                } else {
                    j13 = (hVar.f47217i + j24) - hVar.f47218j;
                    j14 = j24;
                }
                if (!hVar.f47216h) {
                    hVar.f47218j = j21;
                    hVar.f47217i = j20;
                    hVar.f47219k = 0L;
                    hVar.f47216h = true;
                }
                hVar.f47213e = j12;
                hVar.f47215g = j14;
                gVar = hVar.f47209a;
                if (gVar != null && gVar.f47205a != 0) {
                    long j25 = hVar.f47209a.f47205a;
                    j17 = hVar.f47211c;
                    j18 = (((j13 - j25) / j17) * j17) + j25;
                    if (j13 <= j18) {
                        j19 = j18 - j17;
                    } else {
                        j19 = j18;
                        j18 = j17 + j18;
                    }
                    if (j18 - j13 >= j13 - j19) {
                        j18 = j19;
                    }
                    j13 = j18 - hVar.f47212d;
                }
                j15 = j13;
                j16 = (j15 - jNanoTime2) / 1000;
                if (j16 < d6.l.f78241l2) {
                    w.a("dropVideoBuffer");
                    mediaCodec.releaseOutputBuffer(i10, false);
                    w.a();
                    DecoderCounters decoderCounters = this.N;
                    decoderCounters.droppedOutputBufferCount++;
                    this.f47173b0++;
                    int i12 = this.f47174c0 + 1;
                    this.f47174c0 = i12;
                    decoderCounters.maxConsecutiveDroppedOutputBufferCount = Math.max(i12, decoderCounters.maxConsecutiveDroppedOutputBufferCount);
                    i11 = this.f47173b0;
                    if (i11 != this.S && i11 > 0) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        this.Q.droppedFrames(this.f47173b0, jElapsedRealtime2 - this.f47172a0);
                        this.f47173b0 = 0;
                        this.f47172a0 = jElapsedRealtime2;
                        return true;
                    }
                }
                if (z.f47158a >= 21) {
                    if (j16 < 50000) {
                        return false;
                    }
                    s();
                    w.a(str);
                    mediaCodec.releaseOutputBuffer(i10, j15);
                    w.a();
                    this.N.renderedOutputBufferCount++;
                    this.f47174c0 = 0;
                    if (!this.Y) {
                        this.Y = true;
                        this.Q.renderedFirstFrame(this.W);
                    }
                    return true;
                }
                if (j16 < 30000) {
                    return false;
                }
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                s();
                w.a(str);
                mediaCodec.releaseOutputBuffer(i10, true);
                w.a();
                this.N.renderedOutputBufferCount++;
                this.f47174c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
                return true;
            }
            str = "releaseOutputBuffer";
            if (Math.abs((j20 - hVar.f47217i) - (j21 - hVar.f47218j)) > 20000000) {
                hVar.f47216h = false;
            }
        } else {
            str = "releaseOutputBuffer";
        }
        j14 = j21;
        j13 = j20;
        if (!hVar.f47216h) {
            hVar.f47218j = j21;
            hVar.f47217i = j20;
            hVar.f47219k = 0L;
            hVar.f47216h = true;
        }
        hVar.f47213e = j12;
        hVar.f47215g = j14;
        gVar = hVar.f47209a;
        if (gVar != null) {
            long j26 = hVar.f47209a.f47205a;
            j17 = hVar.f47211c;
            j18 = (((j13 - j26) / j17) * j17) + j26;
            if (j13 <= j18) {
                j19 = j18 - j17;
            } else {
                j19 = j18;
                j18 = j17 + j18;
            }
            if (j18 - j13 >= j13 - j19) {
                j18 = j19;
            }
            j13 = j18 - hVar.f47212d;
        }
        j15 = j13;
        j16 = (j15 - jNanoTime2) / 1000;
        if (j16 < d6.l.f78241l2) {
            w.a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i10, false);
            w.a();
            DecoderCounters decoderCounters2 = this.N;
            decoderCounters2.droppedOutputBufferCount++;
            this.f47173b0++;
            int i13 = this.f47174c0 + 1;
            this.f47174c0 = i13;
            decoderCounters2.maxConsecutiveDroppedOutputBufferCount = Math.max(i13, decoderCounters2.maxConsecutiveDroppedOutputBufferCount);
            i11 = this.f47173b0;
            return i11 != this.S ? true : true;
        }
        if (z.f47158a >= 21) {
            if (j16 < 50000) {
                return false;
            }
            s();
            w.a(str);
            mediaCodec.releaseOutputBuffer(i10, j15);
            w.a();
            this.N.renderedOutputBufferCount++;
            this.f47174c0 = 0;
            if (!this.Y) {
                this.Y = true;
                this.Q.renderedFirstFrame(this.W);
            }
            return true;
        }
        if (j16 < 30000) {
            return false;
        }
        if (j16 > 11000) {
            Thread.sleep((j16 - 10000) / 1000);
        }
        s();
        w.a(str);
        mediaCodec.releaseOutputBuffer(i10, true);
        w.a();
        this.N.renderedOutputBufferCount++;
        this.f47174c0 = 0;
        if (!this.Y) {
            this.Y = true;
            this.Q.renderedFirstFrame(this.W);
        }
        return true;
    }

    public static int a(String str, int i10, int i11) {
        int i12;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.getClass();
        int i13 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i12 = i11 * i10;
                i13 = 2;
                return (i12 * 3) / (i13 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i12 = i11 * i10;
                return (i12 * 3) / (i13 * 2);
            case "video/avc":
                if ("BRAVIA 4K 2015".equals(z.f47161d)) {
                    return -1;
                }
                i12 = ((i11 + 15) / 16) * ((i10 + 15) / 16) * 256;
                i13 = 2;
                return (i12 * 3) / (i13 * 2);
            default:
                return -1;
        }
    }
}
