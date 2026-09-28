package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kf {
    public static final kf c = new kf(new a[0]);
    public static final a d;
    public final int a;
    public final a[] b;

    public static final class a {
        public final int a;

        @Deprecated
        public final Uri[] b;
        public final njv[] c;
        public final int[] d;
        public final long[] e;
        public final String[] f;

        static {
            jf.a(0, 1, 2, 3, 4);
            jf.a(5, 6, 7, 8, 9);
            jrh0.J(10);
        }

        public a(int i, int[] iArr, njv[] njvVarArr, long[] jArr, String[] strArr) {
            Uri uri;
            int i2 = 0;
            ly0.b(iArr.length == njvVarArr.length);
            this.a = i;
            this.d = iArr;
            this.c = njvVarArr;
            this.e = jArr;
            this.b = new Uri[njvVarArr.length];
            while (true) {
                Uri[] uriArr = this.b;
                if (i2 >= uriArr.length) {
                    this.f = strArr;
                    return;
                }
                njv njvVar = njvVarArr[i2];
                if (njvVar == null) {
                    uri = null;
                } else {
                    njv.e eVar = njvVar.b;
                    eVar.getClass();
                    uri = eVar.a;
                }
                uriArr[i2] = uri;
                i2++;
            }
        }

        public final int a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.d;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Arrays.equals(this.c, aVar.c) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f);
        }

        public final int hashCode() {
            return (((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31;
        }
    }

    static {
        a aVar = new a(-1, new int[0], new njv[0], new long[0], new String[0]);
        int[] iArr = aVar.d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        d = new a(0, iArrCopyOf, (njv[]) Arrays.copyOf(aVar.c, 0), jArrCopyOf, (String[]) Arrays.copyOf(aVar.f, 0));
        jrh0.J(1);
        jrh0.J(2);
        jrh0.J(3);
        jrh0.J(4);
    }

    public kf(a[] aVarArr) {
        this.a = aVarArr.length;
        this.b = aVarArr;
    }

    public final a a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kf.class != obj.getClass()) {
            return false;
        }
        kf kfVar = (kf) obj;
        return this.a == kfVar.a && Arrays.equals(this.b, kfVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            a[] aVarArr = this.b;
            if (i >= aVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            aVarArr[i].getClass();
            for (int i2 = 0; i2 < aVarArr[i].d.length; i2++) {
                sb.append("ad(state=");
                int i3 = aVarArr[i].d[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(aVarArr[i].e[i2]);
                sb.append(')');
                if (i2 < aVarArr[i].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < aVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
