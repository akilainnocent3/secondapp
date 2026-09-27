package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.android.gms.cast.MediaError;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.io.IOException;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class TextureViewSurfaceTextureListenerC1899Cy extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, InterfaceC2840fk {
    public static byte[] A0O;
    public static String[] A0P = {"8kg0gsxxraVcY9760AfDDdqqLp5YK9AT", "N8j2Ddyx", "HVNw4PtkXrEg8LlUN7XWbo", "maxPy5SeUtgOYTWaW", "FkAKyJNQQf2eCz2ilXM7tuAli1jbjSs3", "vA9Mb9Xk6BXUb", "TQHC", "vy65DpAohCvDmaIHVnToJ2EB52e80kqi"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;
    public MediaController A0A;
    public EnumC2787et A0B;
    public EnumC2842fm A0C;
    public EnumC2842fm A0D;
    public InterfaceC2843fn A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final long A0L;
    public final MediaController.MediaPlayerControl A0M;
    public final C2900gi A0N;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0O = new byte[]{115, 125, q.A, 115, -74, a.f103493v7, a.f103468s7, a.f103460r7, -78, 115, q.A, -117, q.A, 115, a.f103502w7, 37, -115, -85, -72, -72, -71, -66, 106, -70, -68, -81, -70, -85, -68, -81, 106, -73, -81, -82, -77, -85, 106, -70, -74, -85, a.f103460r7, -81, -68, 106, a.f103444p7, -77, -66, -78, 106, -99, -65, -68, -80, -85, -83, -81, -98, -81, a.f103452q7, -66, -65, -68, -81, -124, 106, -70, -26, -20, -29, -37, -27, -98, -21, -105, -23, -36, -21, -23, -32, -36, -19, -36, -105, -19, -32, -37, -36, -26, -105, -32, -27, -35, -26, -23, -28, a.f103428n7, -21, -32, -26, -27, -47, -20, -12, -9, -16, -17, -85, -1, -6, -85, -6, -5, -16, -7, -85, -20, -2, -2, -16, -1, -2, -104, a.f103436o7, a.f103436o7, -72, -67, -74, q.A, -78, -67, -56, -78, a.f103502w7, -60, q.A, a.f103468s7, -71, a.f103460r7, a.f103436o7, -56, q.A, -78, -65, q.A, -74, a.f103493v7, -76, -74, a.f103444p7, a.f103468s7, -70, a.f103436o7, -65, q.A, -56, -70, a.f103468s7, -71, q.A, -60, -74, a.f103468s7, -109, -78, -76, -68, -72, a.f103460r7, a.f103436o7, a.f103476t7, -65, -75, -107, a.f103460r7, -78, -56, -78, -77, -67, -74, q.A, a.f103436o7, -65, q.A, -97, a.f103436o7, a.f103476t7, -72, -78, a.f103468s7, q.A, -78, -77, a.f103436o7, a.f103484u7, -74, 127, q.A, -60, a.f103436o7, q.A, -56, -74, q.A, -60, -70, -67, -74, -65, a.f103468s7, -67, a.f103502w7, q.A, -70, -72, -65, a.f103436o7, a.f103460r7, -74, q.A, -70, a.f103468s7, 127, -23, 17, 17, 9, c.f161638p, 7, a.f103452q7, 3, c.f161638p, c.C, 3, c.E, c.f161647y, a.f103452q7, c.f161648z, 10, c.f161646x, 17, c.C, a.f103452q7, 3, c.f161640r, a.f103452q7, 7, c.D, 5, 7, c.f161643u, c.f161648z, c.f161635m, 17, c.f161640r, a.f103452q7, c.C, c.f161635m, c.f161648z, 10, a.f103452q7, c.f161647y, 7, c.f161648z, q.B, 17, c.f161646x, 7, 9, c.f161646x, 17, c.A, c.f161640r, 6, a.f103452q7, 17, c.f161640r, a.f103452q7, -16, 17, c.A, 9, 3, c.f161648z, a.f103452q7, 3, 4, 17, c.B, 7, -48, a.f103452q7, c.f161647y, 17, a.f103452q7, c.C, 7, a.f103452q7, c.f161647y, c.f161635m, c.f161638p, 7, c.f161640r, c.f161648z, c.f161638p, c.E, a.f103452q7, c.f161635m, 9, c.f161640r, 17, c.f161646x, 7, a.f103452q7, c.f161635m, c.f161648z, -48, -47, -22, -35, -34, q.B, a.C7, -100, -16, -21, -100, -33, q.B, -21, -17, a.C7, -13, c.f161640r, 7, -66, 17, 6, 13, 19, 10, 2, -66, c.f161636n, 13, c.f161643u, -66, 0, 3, -66, 3, c.f161635m, c.f161638p, c.f161643u, c.A, -52, -4, c.f161639q, 10, c.f161635m, c.f161647y, a.f103476t7, c.C, c.D, 7, c.D, c.f161635m, a.f103476t7, 9, c.f161638p, 7, c.f161646x, 13, c.f161635m, 10, a.f103476t7, c.D, c.f161647y, a.f103476t7, -97, -79, -79, -93, -78, c.D, c.f161648z, c.f161635m, 35, c.f161639q, 28, c.f161636n, -77, 8, -7, q.f83622z, 5, -77, -79, a.f103511x7, -79, -77};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C2350Up.A20(this.A0N)) {
            MediaPlayer mediaPlayer = this.A06;
            if (A0P[4].charAt(10) != '2') {
                throw new RuntimeException();
            }
            A0P[4] = "ZKmo0lxTtT2mJSQRRhI8B7lsvNxlt9ka";
            if (mediaPlayer == null || !A07()) {
                return;
            }
            if (!this.A0I) {
                this.A0I = true;
                this.A0N.A0F().AJ3();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0E != null) {
                this.A0E.ADy(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A04();
        A0Q = TextureViewSurfaceTextureListenerC1899Cy.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC1899Cy(C2900gi c2900gi) {
        super(c2900gi);
        this.A0C = EnumC2842fm.A04;
        this.A0D = EnumC2842fm.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC2787et.A03;
        this.A0M = new C2837fh(this);
        this.A0I = false;
        this.A0N = c2900gi;
    }

    public TextureViewSurfaceTextureListenerC1899Cy(C2900gi c2900gi, AttributeSet attributeSet) {
        super(c2900gi, attributeSet);
        this.A0C = EnumC2842fm.A04;
        this.A0D = EnumC2842fm.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC2787et.A03;
        this.A0M = new C2837fh(this);
        this.A0I = false;
        this.A0N = c2900gi;
    }

    public TextureViewSurfaceTextureListenerC1899Cy(C2900gi c2900gi, AttributeSet attributeSet, int i10) {
        super(c2900gi, attributeSet, i10);
        this.A0C = EnumC2842fm.A04;
        this.A0D = EnumC2842fm.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC2787et.A03;
        this.A0M = new C2837fh(this);
        this.A0I = false;
        this.A0N = c2900gi;
    }

    private final void A05(MediaPlayer mediaPlayer, Uri uri) {
        String strA03 = A03(317, 15, 64);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                try {
                    String uriPath = uri.getPath();
                    if (!TextUtils.isEmpty(uriPath)) {
                        AssetFileDescriptor assetFileDescriptorOpenFd = getContext().getAssets().openFd(uriPath.substring(1));
                        mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        if (assetFileDescriptorOpenFd != null) {
                            assetFileDescriptorOpenFd.close();
                            return;
                        }
                        return;
                    }
                    throw new IOException(A03(MediaError.DetailedErrorCode.SMOOTH_NO_MEDIA_DATA, 24, 98));
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e10) {
                            Log.w(A0Q, strA03, e10);
                        }
                    }
                    throw th2;
                }
            } catch (IOException | SecurityException e11) {
                Log.w(A0Q, A03(100, 21, 79), e11);
                setVideoState(EnumC2842fm.A03);
                this.A0N.A0F().A3i(2);
                if (0 != 0) {
                    assetFileDescriptor.close();
                }
            }
        } catch (IOException e12) {
            String str = A0Q;
            if (A0P[6].length() != 4) {
                throw new RuntimeException();
            }
            A0P[3] = "IDdSaYeoVr3R4FZ1u";
            Log.w(str, strA03, e12);
        }
    }

    private boolean A06() {
        return (this.A0C == EnumC2842fm.A08 || this.A0C == EnumC2842fm.A07) ? false : true;
    }

    private boolean A07() {
        return this.A0C == EnumC2842fm.A07 || this.A0C == EnumC2842fm.A0A || this.A0C == EnumC2842fm.A05 || this.A0C == EnumC2842fm.A06;
    }

    private boolean A08() {
        return (this.A0C == EnumC2842fm.A08 || this.A0C == EnumC2842fm.A07) ? false : true;
    }

    private boolean A09() {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.reset();
            return true;
        } catch (IllegalStateException e10) {
            this.A0N.A08().ABC(A03(384, 6, 110), AbstractC2312Td.A2H, new C2313Te(e10));
            return false;
        }
    }

    private boolean A0A(Surface surface) {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.setSurface(surface);
            return true;
        } catch (IllegalStateException e10) {
            this.A0N.A08().ABC(A03(384, 6, 110), AbstractC2312Td.A2I, new C2313Te(e10));
            return false;
        }
    }

    public final /* synthetic */ void A0C() {
        Activity activity = this.A0N.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9d();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final void A9d() {
        if (!this.A0F) {
            AGr(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final boolean A9q() {
        if (this.A06 == null) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                if (trackInfo.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e10) {
            Log.e(A0Q, A03(65, 35, 59), e10);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final boolean A9r() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final boolean AAc() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final void AGr(boolean z10, int i10) {
        this.A0N.A0F().A3e(i10);
        this.A0D = EnumC2842fm.A05;
        if (this.A06 != null) {
            if (!A06()) {
                return;
            }
            this.A0J = z10;
            this.A06.pause();
            if (this.A0C != EnumC2842fm.A06) {
                setVideoState(EnumC2842fm.A05);
                return;
            }
            return;
        }
        setVideoState(EnumC2842fm.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final void AK1(int i10) {
        this.A0N.A0F().ACX(i10);
        setVideoState(EnumC2842fm.A09);
        AKF(5);
        this.A03 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final void AK6(EnumC2787et enumC2787et, int i10) {
        this.A0N.A0F().A3p(i10);
        this.A0J = false;
        this.A0D = EnumC2842fm.A0A;
        this.A0B = enumC2787et;
        if (this.A0C == EnumC2842fm.A0A || this.A0C == EnumC2842fm.A07 || this.A0C == EnumC2842fm.A04 || this.A0C == EnumC2842fm.A05 || this.A0C == EnumC2842fm.A06) {
            if (this.A06 == null) {
                setup(this.A07);
            } else {
                if (this.A03 > 0) {
                    this.A06.seekTo(this.A03);
                }
                this.A06.start();
                if (this.A0C != EnumC2842fm.A07 || this.A0K) {
                    setVideoState(EnumC2842fm.A0A);
                }
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final void AKF(int i10) {
        this.A0N.A0F().A3r(i10);
        this.A0D = EnumC2842fm.A04;
        if (this.A06 != null) {
            int currentPosition = this.A06.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            A09();
            this.A06.release();
            this.A06 = null;
            if (this.A0A != null) {
                this.A0A.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(EnumC2842fm.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final void destroy() {
        if (this.A06 != null) {
            A0A(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            MediaPlayer mediaPlayer = this.A06;
            if (A0P[1].length() == 0) {
                throw new RuntimeException();
            }
            A0P[3] = "r7bVcQo0vwDc4SuX1";
            mediaPlayer.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A09();
            this.A06 = null;
            setVideoState(EnumC2842fm.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public int getCurrentPosition() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public int getDuration() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public long getInitialBufferTime() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public EnumC2787et getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public EnumC2842fm getState() {
        return this.A0C;
    }

    public EnumC2842fm getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(EnumC2842fm.A03);
            this.A0N.A0F().A3i(5);
            AKF(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.A06 != null) {
            this.A06.pause();
        }
        setVideoState(EnumC2842fm.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        this.A0N.A0F().ACW(A03(390, 11, 85) + i10 + A03(0, 14, 21) + i11 + A03(14, 2, 108));
        if (this.A01 > 0 && getState() == EnumC2842fm.A0A) {
            this.A01--;
            AKF(6);
            AK6(this.A0B, 10);
        } else {
            setVideoState(EnumC2842fm.A03);
            this.A0N.A0F().A3i(1);
            AKF(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        switch (i10) {
            case 3:
                this.A0K = true;
                if (this.A0D == EnumC2842fm.A0A) {
                    setVideoState(EnumC2842fm.A0A);
                }
                return true;
            case 701:
                setVideoState(EnumC2842fm.A02);
                return false;
            case 702:
                if (!A08()) {
                    return false;
                }
                setVideoState(EnumC2842fm.A0A);
                return false;
            default:
                return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(EnumC2842fm.A07);
        if (this.A0H && !this.A0G) {
            Activity activityA0E = this.A0N.A0E();
            if (activityA0E != null) {
                this.A0A = new MediaController(activityA0E);
                this.A0A.setAnchorView(this.A09 == null ? this : this.A09);
                this.A0A.setMediaPlayer(this.A0M);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A03 > 0) {
            int i10 = this.A03;
            int duration = ((MediaPlayer) AbstractC2951hX.A00(this.A06)).getDuration();
            if (A0P[3].length() != 17) {
                throw new RuntimeException();
            }
            A0P[5] = "vYKpudhGuKF00mC0lqJEZv1Z";
            if (i10 >= duration) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        if (this.A0D == EnumC2842fm.A0A) {
            AK6(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.A0E == null) {
            return;
        }
        this.A0E.AFr(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A0A(this.A08)) {
            setVideoState(EnumC2842fm.A03);
            this.A0N.A0F().A3i(4);
            destroy();
        } else if (this.A0C == EnumC2842fm.A05 && !this.A0J) {
            AK6(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A0A(null);
        if (this.A08 != null) {
            this.A08.release();
            this.A08 = null;
        }
        if (this.A0C != EnumC2842fm.A05) {
            AGr(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.A06 == null) {
            return;
        }
        if (this.A0A != null && this.A0A.isShowing()) {
            return;
        }
        if (!z10) {
            if (this.A0C != EnumC2842fm.A05) {
                if (!this.A0N.A0H().A01()) {
                    boolean zA25 = C2350Up.A25(this.A0N);
                    if (A0P[2].length() != 22) {
                        throw new RuntimeException();
                    }
                    A0P[5] = "q2iXdwHPhxMMYJm8CrOmbfqNZQSE";
                    if (zA25) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.fg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.A00.A0C();
                                }
                            }, 1000L);
                            return;
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.fg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0C();
                        }
                    }, 1000L);
                    return;
                }
                A9d();
                return;
            }
            return;
        }
        EnumC2842fm enumC2842fm = this.A0C;
        EnumC2842fm enumC2842fm2 = EnumC2842fm.A05;
        if (A0P[6].length() == 4) {
            A0P[6] = "r8oy";
            if (enumC2842fm != enumC2842fm2) {
                return;
            }
        } else if (enumC2842fm != enumC2842fm2) {
            return;
        }
        if (!this.A0J) {
            EnumC2787et enumC2787et = this.A0B;
            if (A0P[3].length() != 17) {
                throw new RuntimeException();
            }
            A0P[1] = "grk6xKjGgtFswoEyrqXB";
            AK6(enumC2787et, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public final void seekTo(int i10) {
        if (this.A06 != null && A07()) {
            if (i10 < getDuration() && i10 > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i10;
                this.A06.seekTo(i10);
                return;
            }
            return;
        }
        this.A03 = i10;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(121, 102, 21));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public void setBackgroundPlaybackEnabled(boolean z10) {
        this.A0F = z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC2839fj(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 94, 102));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public void setFullScreen(boolean z10) {
        this.A0H = z10;
        if (this.A0H && !this.A0G) {
            setOnTouchListener(new ViewOnTouchListenerC2838fi(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public void setRequestedVolume(float f10) {
        this.A00 = f10;
        if (this.A06 == null || this.A0C == EnumC2842fm.A08) {
            return;
        }
        EnumC2842fm enumC2842fm = this.A0C;
        String[] strArr = A0P;
        if (strArr[0].charAt(16) == strArr[7].charAt(16)) {
            throw new RuntimeException();
        }
        A0P[3] = "xC5rxgqNbqLUjjPrr";
        if (enumC2842fm != EnumC2842fm.A04) {
            this.A06.setVolume(f10, f10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public void setVideoMPD(String str) {
    }

    private void setVideoState(EnumC2842fm enumC2842fm) {
        if (enumC2842fm != this.A0C) {
            if (this.A0N.A05().AAO()) {
                String str = A03(356, 23, 106) + enumC2842fm;
            }
            this.A0C = enumC2842fm;
            if (this.A0E != null) {
                this.A0E.AGd(enumC2842fm);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public void setVideoStateChangeListener(InterfaceC2843fn interfaceC2843fn) {
        this.A0E = interfaceC2843fn;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840fk
    public void setup(Uri uri) {
        MediaPlayer mediaPlayer;
        this.A0N.A0F().A3h();
        this.A0K = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A09();
            A0A(null);
            mediaPlayer = this.A06;
            setVideoState(EnumC2842fm.A04);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (((String) AbstractC2951hX.A00(uri.getScheme())).equals(A03(379, 5, 2))) {
                A05(mediaPlayer, uri);
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(EnumC2842fm.A08);
        } catch (Exception e10) {
            setVideoState(EnumC2842fm.A03);
            this.A0N.A0F().A3i(3);
            mediaPlayer.release();
            Log.e(A0Q, A03(16, 49, 14) + e10);
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
