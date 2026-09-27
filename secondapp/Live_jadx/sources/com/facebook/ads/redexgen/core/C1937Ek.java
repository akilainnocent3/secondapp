package com.facebook.ads.redexgen.core;

import android.animation.AnimatorSet;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1937Ek extends RelativeLayout implements InterfaceC2843fn, InterfaceC2776ei {
    public static byte[] A0F;
    public static String[] A0G = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final E9 A0H;
    public static final E3 A0I;
    public static final E1 A0J;
    public static final C1923Dw A0K;
    public static final C1922Dv A0L;
    public static final C1919Ds A0M;
    public static final C1917Dq A0N;
    public static final C1916Dp A0O;
    public float A00;
    public int A01;
    public VI A02;
    public C2784eq A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final Handler A09;
    public final View.OnTouchListener A0A;
    public final C2900gi A0B;
    public final UM<UN, UL> A0C;
    public final List<InterfaceC2788eu> A0D;
    public final InterfaceC2840fk A0E;

    public static String A0G(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0G;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[6] = "HxnswxUpcuHv1wuLD4berTHtADZcXTin";
            strArr2[4] = "I3xDTi7RY5fAtwEllKfD6KKH3DCBcY9z";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 57);
            i13++;
        }
    }

    public static void A0J() {
        A0F = new byte[]{93, -80, -94, -96, 93, -79, -84, -79, -98, -87, 93, -76, -98, -79, -96, -91, 93, -79, -90, -86, -94, 125, -81, -84, -84, -97, -88, -82, -90, -77, 90, -101, -82, 90};
    }

    static {
        A0J();
        A0J = new E1();
        A0H = new E9();
        A0K = new C1923Dw();
        A0L = new C1922Dv();
        A0I = new E3();
        A0M = new C1919Ds();
        A0O = new C1916Dp();
        A0N = new C1917Dq();
    }

    public C1937Ek(C2900gi c2900gi) {
        super(c2900gi);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2775eh(this);
        this.A0B = c2900gi;
        if (A0T(c2900gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1900Cz(c2900gi);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1899Cy(c2900gi);
        }
        A0H();
    }

    public C1937Ek(C2900gi c2900gi, AttributeSet attributeSet) {
        super(c2900gi, attributeSet);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2775eh(this);
        this.A0B = c2900gi;
        if (A0T(c2900gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1900Cz(c2900gi, attributeSet);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1899Cy(c2900gi, attributeSet);
        }
        A0H();
    }

    public C1937Ek(C2900gi c2900gi, AttributeSet attributeSet, int i10) {
        super(c2900gi, attributeSet, i10);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2775eh(this);
        this.A0B = c2900gi;
        if (A0T(c2900gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC1900Cz(c2900gi, attributeSet, i10);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC1899Cy(c2900gi, attributeSet, i10);
        }
        A0H();
    }

    private float A06(InterfaceC2840fk interfaceC2840fk) {
        int videoHeight = interfaceC2840fk.getVideoHeight();
        if (videoHeight == 0) {
            return 1.0f;
        }
        int height = interfaceC2840fk.getVideoWidth();
        return height / videoHeight;
    }

    public static /* synthetic */ C1923Dw A0E() {
        C1923Dw c1923Dw = A0K;
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
        strArr[0] = "cKnPTPxPmv7r";
        return c1923Dw;
    }

    private void A0H() {
        this.A07 = C2350Up.A0t(this.A0B);
        this.A0B.A0F().A3d();
        this.A0E.setRequestedVolume(1.0f);
        this.A0E.setVideoStateChangeListener(this);
        this.A03 = new C2784eq(this.A0B, this.A0E);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        YB.A0K(this.A03);
        addView(this.A03, layoutParams);
        setOnTouchListener(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A08.postDelayed(new C1945Es(this), this.A01);
    }

    private final void A0K() {
        for (InterfaceC2788eu interfaceC2788eu : this.A0D) {
            boolean z10 = interfaceC2788eu instanceof ED;
            String[] strArr = A0G;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            A0G[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z10) {
                A0R((ED) interfaceC2788eu);
            }
            interfaceC2788eu.AAv(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i10) {
        if (C2350Up.A10(this.A0B)) {
            Toast.makeText(this.A0B, A0G(21, 13, 1) + (i10 / 1000.0f) + A0G(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(VH vh2) {
        if (this.A02 == null) {
            return;
        }
        this.A02.A04(vh2, null);
    }

    private void A0Q(InterfaceC2788eu interfaceC2788eu) {
        if (interfaceC2788eu instanceof ED) {
            A0S((ED) interfaceC2788eu);
        }
        interfaceC2788eu.AKV(this);
    }

    private void A0R(ED ed2) {
        if (ed2.getParent() == null) {
            if (ed2 instanceof C3S) {
                this.A03.A02(ed2);
            } else {
                addView(ed2);
            }
        }
    }

    private void A0S(ED ed2) {
        if (ed2 instanceof C3S) {
            this.A03.A03(ed2);
        } else {
            YB.A0J(ed2);
        }
    }

    private boolean A0T(C2900gi c2900gi) {
        return C2350Up.A31(c2900gi, C2827fX.A03());
    }

    public final void A0W() {
        this.A0E.setVideoStateChangeListener(null);
        this.A0E.destroy();
    }

    public final void A0X() {
        if (A0n()) {
            return;
        }
        this.A0E.A9d();
    }

    public final void A0Y() {
        Iterator<InterfaceC2788eu> it = this.A0D.iterator();
        while (it.hasNext()) {
            A0Q(it.next());
        }
        this.A0D.clear();
    }

    public final void A0Z(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (this.A00 == 1.0f) {
            this.A00 = A06(this.A0E);
        }
        if (i10 == 1) {
            layoutParams.addRule(10);
        } else if (XL.A05(this.A00)) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(9);
        }
        C2784eq c2784eq = this.A03;
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "Fk13SNDKaQVX0dV87s1e6TAwbDOb9nQX";
        c2784eq.setLayoutParams(layoutParams);
    }

    public final void A0a(int i10) {
        this.A08.removeCallbacksAndMessages(null);
        this.A0E.seekTo(i10);
    }

    public final void A0b(int i10) {
        this.A0E.AKF(i10);
    }

    public final void A0c(AnimatorSet animatorSet, boolean z10) {
        this.A03.A01(animatorSet, z10);
    }

    public final void A0d(EnumC2779el enumC2779el) {
        C1940En c1940En = new C1940En(this);
        if (this.A07) {
            Y4.A00(c1940En);
        } else {
            this.A09.post(c1940En);
        }
        this.A0E.AK1(enumC2779el.A03());
    }

    public final void A0e(EnumC2787et enumC2787et, int i10) {
        if (this.A04 && this.A0E.getState() == EnumC2842fm.A06) {
            this.A04 = false;
        }
        this.A0E.AK6(enumC2787et, i10);
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        A0G[3] = "hMpnI8E";
    }

    public final void A0f(InterfaceC2788eu interfaceC2788eu) {
        this.A0D.add(interfaceC2788eu);
    }

    public final void A0g(InterfaceC2788eu interfaceC2788eu) {
        this.A0D.remove(interfaceC2788eu);
        A0Q(interfaceC2788eu);
    }

    public final void A0h(boolean z10) {
        A0i(z10, 0);
    }

    public final void A0i(boolean z10, int i10) {
        if (A0n()) {
            return;
        }
        this.A0E.AGr(z10, i10);
    }

    public final void A0j(boolean z10, boolean z11, int i10) {
        this.A06 = z11;
        A0i(z10, i10);
    }

    public final boolean A0k() {
        return this.A0E.A9q();
    }

    public final boolean A0l() {
        return this.A0E.A9r();
    }

    public final boolean A0m() {
        return getVolume() == 0.0f;
    }

    public final boolean A0n() {
        return getState() == EnumC2842fm.A05;
    }

    public final boolean A0o() {
        return A0n() && this.A0E.AAc();
    }

    public final boolean A0p() {
        return getState() == EnumC2842fm.A0A;
    }

    public final boolean A0q() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2776ei
    public final boolean AAQ() {
        return A0T(this.A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2776ei
    public final boolean AAV() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843fn
    public final void ADy(final long j10, final long j11, final long j12, final float f10) {
        if (!C2350Up.A20(this.A0B)) {
            return;
        }
        this.A0C.A02(new EC(j10, j11, j12, f10) { // from class: com.facebook.ads.redexgen.X.4F
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843fn
    public final void AEo() {
        A0i(true, 4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843fn
    public final void AEp() {
        A0e(EnumC2787et.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843fn
    public final void AFr(int i10, int i11) {
        C1942Ep c1942Ep = new C1942Ep(this, i10, i11);
        if (this.A07) {
            Y4.A00(c1942Ep);
        } else {
            this.A09.post(c1942Ep);
        }
        A0I();
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843fn
    public final void AGd(EnumC2842fm enumC2842fm) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        C1944Er c1944Er = new C1944Er(this, enumC2842fm, currentPositionInMillis, currentPositionMS);
        if (this.A07) {
            Y4.A00(c1944Er);
        } else {
            this.A09.post(c1944Er);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2776ei
    public int getCurrentPositionInMillis() {
        return this.A0E.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0E.getDuration();
    }

    public UM<UN, UL> getEventBus() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2776ei
    public long getInitialBufferTime() {
        return this.A0E.getInitialBufferTime();
    }

    public List<InterfaceC2788eu> getPlugins() {
        return this.A0D;
    }

    public EnumC2842fm getState() {
        return this.A0E.getState();
    }

    public Handler getStateHandler() {
        return this.A09;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0E;
    }

    public int getVideoHeight() {
        return this.A0E.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0E.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2776ei
    public EnumC2787et getVideoStartReason() {
        return this.A0E.getStartReason();
    }

    public View getVideoView() {
        return this.A03;
    }

    public int getVideoWidth() {
        return this.A0E.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2776ei
    public float getVolume() {
        return this.A0E.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0C.A02(A0N);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0C.A02(A0O);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.A0E != null) {
            this.A0E.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(VI vi2) {
        this.A02 = vi2;
    }

    public void setIsFullScreen(boolean z10) {
        this.A05 = z10;
        this.A0E.setFullScreen(z10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setRoundedCornerVideoView(float f10) {
        this.A03.setRoundedCornersVideoStyle(f10);
    }

    public void setVideoMPD(String str) {
        this.A0E.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i10) {
        this.A01 = i10;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0Y();
        } else {
            A0K();
            if (A0G[2].length() != 10) {
                throw new RuntimeException();
            }
            A0G[2] = "2vtziZXFfU";
            this.A0E.setup(uri);
        }
        this.A04 = false;
    }

    public void setVideoURI(String str) {
        this.A0B.A0F().A3k(str);
        setVideoURI(str != null ? XB.A00(str) : null);
    }

    public void setVolume(float f10) {
        if (f10 == 1.0f) {
            A0M(VH.A0n);
            this.A0B.A0F().A3o();
        } else {
            A0M(VH.A0m);
            this.A0B.A0F().A3n();
        }
        this.A0E.setRequestedVolume(f10);
        getEventBus().A02(A0M);
    }
}
