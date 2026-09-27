package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3020ik implements OW {
    public static byte[] A06;
    public final OE A00;
    public final OL A01;
    public final C2900gi A02;
    public final Handler A03;
    public final String A04;
    public final OQ A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-104, -85, -92, -102, -94, -101, -75, -101, -82, -86, -88, -105, -87, -75, -95, -101, -81, -25, -20, q.f83622z, -3, -29, -16, -16, -19, -16, -3, a.C7, -19, -30, -29, -3, -23, -29, -9, -6, -5, -7, 6, q.B, -21, 6, -16, -21, 6, q.f83622z, -20, 0, c.f161647y, c.f161648z, c.f161646x, 33, 7, c.f161646x, c.f161646x, 17, c.f161646x, 33, c.f161639q, 7, c.f161647y, c.f161647y, 3, 9, 7, 33, 13, 7, c.E};
    }

    public abstract void A08();

    public abstract void A09();

    public abstract void A0D(boolean z10);

    public AbstractC3020ik(C2900gi c2900gi, String str, OR or2) {
        this.A02 = c2900gi;
        this.A04 = str;
        DynamicLoaderFactory.makeLoader(this.A02).getInitApi().onAdLoadInvoked(this.A02);
        this.A00 = new C3023io(c2900gi, this);
        this.A01 = new OL(c2900gi, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A05 = or2.A5S(this.A00, this, this.A01);
    }

    public final OE A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0F().AI0();
            A06();
        } else {
            this.A02.A0F().AHs();
            this.A01.A02 = true;
            this.A01.A0E(AbstractC2353Us.A02.get());
        }
    }

    public final void A06() {
        this.A02.A0F().AI6();
        if (!this.A01.A0F(this.A05.A8P(), this.A05.A5R(this.A04))) {
            A09();
            this.A02.A0F().AHy();
        }
    }

    public final void A07() {
        if (!C2350Up.A0u(this.A02)) {
            return;
        }
        Y4.A00(new C3021il(this));
    }

    public final void A0A(int i10) {
        this.A01.A0D(this.A02, i10);
    }

    public final void A0B(int i10, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String strA01 = A01(48, 21, 124);
        if (str != null) {
            bundle.putString(strA01, str);
        } else {
            bundle.putString(strA01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 88), adErrorType.getErrorCode());
        AEs(i10, this.A04, bundle);
    }

    public final void A0C(Message message) {
        this.A05.A9j(message);
    }

    @Override // com.facebook.ads.redexgen.core.OW
    public final void AEs(int i10, String str, Bundle bundle) {
        Message messageObtain = Message.obtain((Handler) null, i10);
        messageObtain.getData().putString(A01(35, 13, 97), str);
        if (bundle != null) {
            messageObtain.getData().putBundle(A01(0, 17, 16), bundle);
        }
        Runnable callbackApiRunnable = new C3022im(this, messageObtain);
        this.A03.post(callbackApiRunnable);
    }
}
