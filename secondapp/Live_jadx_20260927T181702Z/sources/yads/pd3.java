package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pd3 {
    public static od3 a(String str) {
        Integer numP1;
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) == '-') {
                str = str.substring(0, i10);
                kotlin.jvm.internal.m0.o(str, "substring(...)");
                break;
            }
        }
        List listN5 = cv.p0.n5(str, new char[]{kj.e.f102543c}, false, 0, 6, null);
        String str2 = (String) fr.r0.b3(listN5, 0);
        if (str2 == null || (numP1 = cv.j0.p1(str2)) == null) {
            return null;
        }
        int iIntValue = numP1.intValue();
        Integer numP2 = cv.j0.p1((String) (1 <= fr.h0.L(listN5) ? listN5.get(1) : "0"));
        if (numP2 == null) {
            return null;
        }
        int iIntValue2 = numP2.intValue();
        Integer numP3 = cv.j0.p1((String) (2 <= fr.h0.L(listN5) ? listN5.get(2) : "0"));
        if (numP3 != null) {
            return new od3(iIntValue, iIntValue2, numP3.intValue());
        }
        return null;
    }
}
