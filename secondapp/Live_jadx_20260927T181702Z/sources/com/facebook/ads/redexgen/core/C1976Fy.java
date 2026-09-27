package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1976Fy extends R7 {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public InterfaceC2661cp A02;
    public C2845fp A04;
    public List<C2738e5> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C2970hr A0C;
    public final RF A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC2665ct A0F = new G1(this);
    public InterfaceC2663cr A03 = new G0(this);
    public final InterfaceC2664cs A0E = new C1977Fz(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, a.f103520y7, a.f103476t7, a.f103460r7, -52, -60, -68, -42, a.f103460r7, -68, a.f103520y7, -68, a.f103460r7, -42, a.f103484u7, -72, a.f103493v7, -72, -60};
    }

    static {
        A08();
    }

    public C1976Fy(C1J c1j, int i10, List<C2738e5> list, C2845fp c2845fp, Bundle bundle) {
        this.A0C = c1j.getLayoutManager();
        this.A0A = i10;
        this.A05 = list;
        this.A04 = c2845fp;
        this.A0D = new C2969hq(c1j.getContext());
        this.A0B = c1j.getContext();
        c1j.A1h(this);
        A0D(bundle);
    }

    private AbstractC2061Jg A03(int i10, int i11) {
        return A04(i10, i11, true);
    }

    private AbstractC2061Jg A04(int i10, int i11, boolean z10) {
        AbstractC2061Jg abstractC2061Jg = null;
        while (i10 <= i11) {
            AbstractC2061Jg abstractC2061Jg2 = (AbstractC2061Jg) this.A0C.A1o(i10);
            if (abstractC2061Jg2 == null || abstractC2061Jg2.A1U()) {
                return null;
            }
            boolean zA0a = A0a(abstractC2061Jg2);
            if (abstractC2061Jg == null && abstractC2061Jg2.A1V() && zA0a && !this.A0G.contains(Integer.valueOf(i10)) && (!z10 || A0I(abstractC2061Jg2, this.A0A))) {
                abstractC2061Jg = abstractC2061Jg2;
            }
            if (abstractC2061Jg2.A1V() && !zA0a) {
                A0C(i10, false);
            }
            i10++;
        }
        return abstractC2061Jg;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        AbstractC2061Jg abstractC2061JgA03 = A03(lastVisibleItem, firstVisibleItem);
        if (abstractC2061JgA03 != null) {
            abstractC2061JgA03.A1S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA25 = this.A0C.A25();
        if (iA25 != -1) {
            int curPos = this.A05.size();
            if (iA25 < curPos - 1) {
                int curPos2 = iA25 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i10) {
        AbstractC2061Jg abstractC2061JgA04 = A04(i10 + 1, this.A0C.A27(), false);
        if (abstractC2061JgA04 != null) {
            abstractC2061JgA04.A1S();
            A0U(((Integer) abstractC2061JgA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i10, int i11) {
        while (i10 <= i11) {
            A0T(i10);
            i10++;
        }
    }

    private final void A0B(int i10, int i11) {
        A0S(i10);
        A0S(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i10, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i10));
        } else {
            this.A0G.remove(Integer.valueOf(i10));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC2613c3 abstractC2613c3, int i10) {
        int allowedAreaMaxX;
        int furthestX;
        if (i10 == 2) {
            allowedAreaMaxX = XX.A04.widthPixels - 1;
        } else {
            int width = abstractC2613c3.getWidth();
            int allowedAreaMinX = XX.A04.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i10 == 2) {
            furthestX = 1;
        } else {
            int i11 = XX.A04.widthPixels;
            int allowedAreaMinX2 = abstractC2613c3.getWidth();
            furthestX = (int) (((i11 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x10 = abstractC2613c3.getX();
        int allowedAreaMinX3 = abstractC2613c3.getWidth();
        return ((int) (x10 + ((float) allowedAreaMinX3))) <= allowedAreaMaxX && abstractC2613c3.getX() >= ((float) furthestX);
    }

    private boolean A0J(AbstractC2061Jg abstractC2061Jg) {
        if (!this.A08 || !abstractC2061Jg.A1V()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public void A0L(C7M c7m, int i10) {
        super.A0L(c7m, i10);
        if (i10 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public void A0M(C7M c7m, int i10, int i11) {
        super.A0M(c7m, i10, i11);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i10);
    }

    public final InterfaceC2663cr A0N() {
        return this.A03;
    }

    public final InterfaceC2664cs A0O() {
        return this.A0E;
    }

    public final InterfaceC2665ct A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int iA27 = this.A0C.A27();
        for (int iA26 = this.A0C.A26(); iA26 <= iA27 && iA26 >= 0; iA26++) {
            AbstractC2061Jg card = (AbstractC2061Jg) this.A0C.A1o(iA26);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A1U()) {
                this.A01 = iA26;
                card.A1R();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC2061Jg abstractC2061Jg = (AbstractC2061Jg) this.A0C.A1o(this.A01);
        if (abstractC2061Jg != null && this.A01 >= 0) {
            abstractC2061Jg.A1S();
        }
    }

    public final void A0S(int i10) {
        AbstractC2061Jg abstractC2061Jg = (AbstractC2061Jg) this.A0C.A1o(i10);
        if (abstractC2061Jg != null && !A0a(abstractC2061Jg)) {
            A0Z(abstractC2061Jg, false);
        }
    }

    public final void A0T(int i10) {
        AbstractC2061Jg abstractC2061Jg = (AbstractC2061Jg) this.A0C.A1o(i10);
        if (abstractC2061Jg == null) {
            return;
        }
        if (A0a(abstractC2061Jg)) {
            A0Z(abstractC2061Jg, true);
        }
        if (A0J(abstractC2061Jg) && this.A05 != null) {
            this.A0F.setVolume(this.A05.get(((Integer) abstractC2061Jg.getTag(-1593835536)).intValue()).A03().A0H().A0A() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i10) {
        this.A0D.A0A(i10);
        this.A0C.A1N(this.A0D);
    }

    public final void A0V(int i10, int i11, int i12) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A25();
        if (recomputeFrom == -1) {
            recomputeFrom = i12 < 0 ? i10 : i11;
        }
        this.A02.AKa(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC2661cp interfaceC2661cp) {
        this.A02 = interfaceC2661cp;
    }

    public void A0Z(AbstractC2061Jg abstractC2061Jg, boolean z10) {
        if (A0H()) {
            A0X(abstractC2061Jg, z10);
        }
        if (!z10 && abstractC2061Jg.A1U()) {
            abstractC2061Jg.A1R();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
