package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.t;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45010c;

    public g(int i10, int i11, int i12) {
        this.f45008a = i10;
        this.f45009b = i11;
        this.f45010c = i12;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        Integer num2 = 2;
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        if (!TextUtils.equals("VPAID", rVar2.f45227f)) {
            if (!TextUtils.equals("VPAID", rVar.f45227f)) {
                Integer num3 = rVar.f45226e;
                int iIntValue = num3 == null ? 0 : num3.intValue();
                Integer num4 = rVar2.f45226e;
                int iIntValue2 = num4 == null ? 0 : num4.intValue();
                int i10 = this.f45008a;
                if (iIntValue2 <= i10 || iIntValue > i10) {
                    if (iIntValue <= i10 || iIntValue2 > i10) {
                        t tVarA = t.a(rVar2.f45225d);
                        t tVar = t.MEDIA_TYPE_MP4;
                        if (tVarA == tVar) {
                            num = 3;
                        } else if (tVarA == t.MEDIA_TYPE_3GPP) {
                            num = num2;
                        } else {
                            num = tVarA == t.MEDIA_TYPE_WEBM ? 1 : -1;
                        }
                        t tVarA2 = t.a(rVar.f45225d);
                        if (tVarA2 == tVar) {
                            num2 = 3;
                        } else if (tVarA2 != t.MEDIA_TYPE_3GPP) {
                            num2 = tVarA2 == t.MEDIA_TYPE_WEBM ? 1 : -1;
                        }
                        int iCompareTo = num.compareTo(num2);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                        if (iIntValue >= iIntValue2) {
                            if (iIntValue <= iIntValue2) {
                                Integer num5 = rVar.f45223b;
                                int iIntValue3 = num5 == null ? 0 : num5.intValue();
                                Integer num6 = rVar.f45224c;
                                int iIntValue4 = num6 == null ? 0 : num6.intValue();
                                Integer num7 = rVar2.f45223b;
                                int iIntValue5 = num7 == null ? 0 : num7.intValue();
                                Integer num8 = rVar2.f45224c;
                                int i11 = iIntValue3 * iIntValue4;
                                int iIntValue6 = iIntValue5 * (num8 == null ? 0 : num8.intValue());
                                int i12 = this.f45009b * this.f45010c;
                                int iAbs = Math.abs(i11 - i12);
                                int iAbs2 = Math.abs(iIntValue6 - i12);
                                if (iAbs >= iAbs2) {
                                    if (iAbs <= iAbs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
