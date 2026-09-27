package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC2098Kr extends AbstractC2585bb implements View.OnClickListener {
    public static byte[] A0E;
    public static String[] A0F = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", a.S4, "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0G;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C2900gi A05;
    public XO A06;
    public C2104Kx A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final C2579bV A0C;
    public final Map<String, String> A0D;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{-30, -21, q.B, -30, -22, -34, q.f83622z, -18, -12, -15, -30, -28, -23, -27, -80, -16, q.B, -10, -10, q.B, -15, -22, q.B, -11, 28, 38, c.f161643u, 41, -27, c.f161643u, c.A, c.B, 38, 28, c.D, 33, 93, 91, 77, 90, 75, 84, 81, 75, 83};
    }

    static {
        A04();
        A0G = (int) (XX.A02 * 24.0f);
    }

    public ViewOnClickListenerC2098Kr(C2900gi c2900gi, AbstractC3065jd abstractC3065jd, C2158Na c2158Na, VA va2, InterfaceC2441Yh interfaceC2441Yh, C2845fp c2845fp, Y2 y10, InterfaceC2415Xh interfaceC2415Xh) {
        this(c2900gi, abstractC3065jd.A0w(), c2158Na, abstractC3065jd.A29().A0J().A06(), va2, interfaceC2441Yh, c2845fp, y10, abstractC3065jd.A2A(), interfaceC2415Xh);
        this.A0C.A08(abstractC3065jd);
    }

    public ViewOnClickListenerC2098Kr(C2900gi c2900gi, String str, C2158Na c2158Na, VA va2, InterfaceC2441Yh interfaceC2441Yh, C2845fp c2845fp, Y2 y10, C2164Ng c2164Ng) {
        this(c2900gi, str, c2158Na, false, va2, interfaceC2441Yh, c2845fp, y10, c2164Ng);
    }

    public ViewOnClickListenerC2098Kr(C2900gi c2900gi, String str, C2158Na c2158Na, boolean z10, VA va2, InterfaceC2441Yh interfaceC2441Yh, C2845fp c2845fp, Y2 y10, C2164Ng c2164Ng) {
        super(c2900gi, c2158Na);
        this.A0D = new HashMap();
        this.A0B = false;
        this.A05 = c2900gi;
        this.A0A = z10;
        this.A0C = new C2579bV(c2900gi, str, c2845fp, y10, va2, c2164Ng, interfaceC2441Yh);
        setOnClickListener(this);
        YB.A0G(1001, this);
    }

    public ViewOnClickListenerC2098Kr(C2900gi c2900gi, String str, C2158Na c2158Na, boolean z10, VA va2, InterfaceC2441Yh interfaceC2441Yh, C2845fp c2845fp, Y2 y10, C2164Ng c2164Ng, InterfaceC2415Xh interfaceC2415Xh) {
        super(c2900gi, c2158Na);
        this.A0D = new HashMap();
        this.A0B = false;
        this.A05 = c2900gi;
        this.A0A = z10;
        this.A0C = new C2579bV(c2900gi, str, c2845fp, y10, va2, c2164Ng, interfaceC2441Yh, interfaceC2415Xh);
        setOnClickListener(this);
        YB.A0G(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(YN.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? YM.MESSENGER : YM.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0G, 0, A0G, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            XO xo2 = this.A06;
            if (A0F[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            xo2.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(AbstractC3065jd abstractC3065jd) {
        return ((long) abstractC3065jd.A25()) > 0 && abstractC3065jd.A23() >= 0;
    }

    public final EnumC2149Mq A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return EnumC2149Mq.A09;
        }
        A03();
        this.A0D.put(A01(0, 12, 6), str);
        this.A0D.put(A01(24, 12, 58), String.valueOf(this.A0B));
        return this.A0C.A05(this.A08, this.A09, this.A0D);
    }

    public final boolean A0F(AbstractC3065jd abstractC3065jd, AbstractC2435Yb abstractC2435Yb) {
        if (this.A06 != null || !A05(abstractC3065jd) || abstractC3065jd.A2D().A02() == null || abstractC3065jd.A2D().A01() == null) {
            return false;
        }
        this.A07 = new C2104Kx(abstractC3065jd.A23(), abstractC3065jd.A25(), abstractC3065jd.A24(), abstractC3065jd.A2D().A02(), abstractC3065jd.A2D().A01(), abstractC2435Yb, this);
        this.A06 = new XO(abstractC3065jd.A25(), this.A07);
        this.A06.A07();
        return true;
    }

    public C2579bV getCtaActionHelper() {
        return this.A0C;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            A0E(A01(36, 9, 111));
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f10 = width - textWidth;
            float textWidth2 = this.A00;
            int i10 = (int) (f10 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i10, top, left + i10, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(XS xs2) {
        this.A0C.A09(xs2);
    }

    public void setCta(C2160Nc c2160Nc, String str, Map<String, String> extraData) {
        setCta(c2160Nc, str, extraData, null);
    }

    public void setCta(C2160Nc c2160Nc, String str, Map<String, String> extraData, InterfaceC2415Xh interfaceC2415Xh, InterfaceC2578bU interfaceC2578bU) {
        setCta(c2160Nc, str, extraData, interfaceC2578bU);
        this.A0C.A0A(interfaceC2415Xh);
    }

    public void setCta(C2160Nc c2160Nc, String str, Map<String, String> extraData, InterfaceC2578bU interfaceC2578bU) {
        this.A08 = str;
        this.A09 = c2160Nc.A05();
        this.A0D.putAll(extraData);
        this.A0C.A0B(interfaceC2578bU);
        String strA04 = c2160Nc.A04();
        if (!TextUtils.isEmpty(strA04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z10) {
        this.A0C.A0C(z10);
    }

    public void setV2Design(boolean z10) {
        this.A0B = z10;
    }
}
