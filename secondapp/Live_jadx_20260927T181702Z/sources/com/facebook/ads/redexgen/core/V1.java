package com.facebook.ads.redexgen.core;

import com.ironsource.G5;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class V1 {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", G5.f59045q, "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC2359Uy A01 = EnumC2359Uy.A03;
    public EnumC2360Uz A02 = EnumC2360Uz.A06;
    public V0 A03 = V0.A02;
    public EnumC2358Ux A00 = EnumC2358Ux.A02;

    public final void A00() {
        this.A00 = EnumC2358Ux.A03;
    }

    public final void A01() {
        this.A02 = EnumC2360Uz.A04;
    }

    public final void A02() {
        this.A02 = EnumC2360Uz.A05;
    }

    public final void A03() {
        this.A03 = V0.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC2360Uz.A06) {
            EnumC2360Uz enumC2360Uz = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC2360Uz != EnumC2360Uz.A02 && this.A02 != EnumC2360Uz.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC2360Uz.A06 || this.A02 == EnumC2360Uz.A02;
    }

    public final boolean A06() {
        return this.A03 == V0.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC2358Ux.A03;
    }
}
