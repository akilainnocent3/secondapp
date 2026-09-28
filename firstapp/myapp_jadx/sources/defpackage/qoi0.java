package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qoi0 {

    public static final class a {
        public final String[] a;

        public a(String[] strArr) {
            this.a = strArr;
        }
    }

    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;

        public c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = bArr;
        }
    }

    public static uov a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String str2 = jrh0.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                cft.g("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(eu00.d(new nsz(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    cft.h("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new noi0(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new uov(arrayList);
    }

    public static a b(nsz nszVar, boolean z, boolean z2) throws ssz {
        if (z) {
            c(3, nszVar, false);
        }
        nszVar.u((int) nszVar.n(), StandardCharsets.UTF_8);
        long jN = nszVar.n();
        String[] strArr = new String[(int) jN];
        for (int i = 0; i < jN; i++) {
            strArr[i] = nszVar.u((int) nszVar.n(), StandardCharsets.UTF_8);
        }
        if (z2 && (nszVar.w() & 1) == 0) {
            throw ssz.a(null, "framing bit expected to be set");
        }
        return new a(strArr);
    }

    public static boolean c(int i, nsz nszVar, boolean z) {
        if (nszVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ssz.a(null, "too short header: " + nszVar.a());
        }
        if (nszVar.w() != i) {
            if (z) {
                return false;
            }
            throw ssz.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (nszVar.w() == 118 && nszVar.w() == 111 && nszVar.w() == 114 && nszVar.w() == 98 && nszVar.w() == 105 && nszVar.w() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ssz.a(null, "expected characters 'vorbis'");
    }
}
