package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes7.dex */
public final class brr {
    public final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public final boolean a(int i, String str) throws NoSuchAlgorithmException {
        if (i != 0) {
            if (i < 100) {
                String str2 = SportyGamesManager.getInstance().getDeviceId() + "-" + str;
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                bytes.getClass();
                byte[] bArrDigest = messageDigest.digest(bytes);
                bArrDigest.getClass();
                char[] cArr = new char[bArrDigest.length * 2];
                int length = bArrDigest.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    int i5 = bArrDigest[i2] & 255;
                    int i6 = i3 * 2;
                    char[] cArr2 = this.a;
                    cArr[i6] = cArr2[i5 / 16];
                    cArr[i6 + 1] = cArr2[i5 % 16];
                    i2++;
                    i3 = i4;
                }
                String upperCase = ay0.F("", cArr).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (Intrinsics.h(Integer.valueOf(new BigInteger(upperCase.substring(0, 20), 16).mod(BigInteger.valueOf(100L)).intValue()).intValue(), i) < 0) {
                }
            }
            return true;
        }
        return false;
    }
}
