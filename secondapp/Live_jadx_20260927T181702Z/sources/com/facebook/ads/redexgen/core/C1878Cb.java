package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l3.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1878Cb implements InterfaceC2876gK {
    public static byte[] A05;
    public JSONObject A00;
    public JSONObject A01;
    public final EnumC2877gL A03;
    public final List<InterfaceC2878gM> A04 = new ArrayList();
    public boolean A02 = false;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-74, -23, -30, a.f103428n7, -32, a.E7, -108, -103, -25, -108, a.f103428n7, -43, q.B, -43, -108, -23, -28, a.f103428n7, -43, q.B, a.E7, -82, 126, -98, -98, -108, a.f103428n7, -43, q.B, -43, -108, -98, -98, 126, -103, -25, 126, -98, -98, -108, a.B7, -35, -30, -37, a.E7, -26, -28, -26, -35, -30, q.B, -108, -98, -98, 126, -103, -25, 122, -83, -90, -100, -92, -99, 88, -96, -103, -85, 88, -90, -89, 88, -98, -95, -90, -97, -99, -86, -88, -86, -95, -90, -84, 111, -94, -101, -111, -103, -110, 77, -106, -96, 77, -101, -100, -95, 77, -97, -110, -114, -111, -90, a.C7, -34, -15, -34, -99, -70, -70, -99, -21, q.f83622z, -23, -23, -46, -43, a.B7, -45, -47, -34, -36, -34, -43, a.B7, -32, -116, -115, -87, -116, a.B7, a.C7, a.f103428n7, a.f103428n7, -106, -103, -98, -105, -107, -94, -96, -94, -103, -98, -92, 80, 109, 109, 80, -98, -91, -100, -100, a.E7, -32, -41, -41};
    }

    public C1878Cb(EnumC2877gL enumC2877gL) {
        this.A03 = enumC2877gL;
    }

    private boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        return true ^ AbstractC2875gJ.A02(jSONObject, jSONObject2);
    }

    public final synchronized boolean A03(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject != null) {
                if (jSONObject2 == null && this.A03.A05()) {
                    throw new IllegalArgumentException(A00(132, 19, 19));
                }
                if (jSONObject2 == null || this.A03.A05()) {
                    if (!A02(this.A01, jSONObject2) && !A02(this.A00, jSONObject)) {
                        return false;
                    }
                    this.A00 = jSONObject;
                    this.A01 = jSONObject2;
                    this.A02 = true;
                    Iterator<InterfaceC2878gM> it = this.A04.iterator();
                    while (it.hasNext()) {
                        it.next().A4m();
                    }
                    try {
                        String.format(Locale.US, A00(0, 57, 87), this.A03, this.A00 == null ? A00(151, 4, 78) : this.A00.toString(2), this.A01 == null ? A00(151, 4, 78) : this.A01.toString(2));
                    } catch (JSONException unused) {
                    }
                    return true;
                }
                throw new IllegalArgumentException(A00(113, 19, 79));
            }
            throw new IllegalArgumentException(A00(101, 12, 96));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2876gK
    public final synchronized void A41(InterfaceC2878gM interfaceC2878gM) {
        this.A04.add(interfaceC2878gM);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2876gK
    public final synchronized JSONObject A7i() {
        if (this.A00 != null) {
        } else {
            throw new IllegalStateException(A00(82, 19, 16));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2876gK
    public final synchronized JSONObject A88() {
        if (this.A03.A05()) {
            if (this.A01 != null) {
            } else {
                throw new IllegalStateException(A00(82, 19, 16));
            }
        } else {
            throw new IllegalStateException(A00(57, 25, 27));
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2876gK
    public final EnumC2877gL A8F() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2876gK
    public final synchronized boolean AAe() {
        return this.A02;
    }
}
