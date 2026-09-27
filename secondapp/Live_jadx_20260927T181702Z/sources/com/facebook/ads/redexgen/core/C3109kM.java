package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3109kM implements MP {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public MM A02;
    public boolean A03;
    public final InterfaceC3115kS A04;
    public final MV A05;
    public final C2141Mi A06;
    public final File A07;
    public final HashMap<String, ArrayList<MO>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 43);
            i13++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, q.A, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, c.B, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, 13, q.f83619w, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, c.f161636n, 9, 0, 1, 69, 17, 10, 69, 6, c.A, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, c.f161636n, 9, 0, 95, 69, 31, 56, 48, 53, 60, a.f159811k, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, c.f161636n, c.f161640r, c.G, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, c.f161640r, 10, 112, 87, 95, 90, 83, 82, c.f161648z, 66, 89, c.f161648z, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, c.f161648z, 85, 87, 85, 94, 83, c.f161648z, 95, 88, 82, 95, 85, 83, 69, c.f161636n, c.f161648z, 43, c.f161636n, 4, 1, 8, 9, 77, c.C, 2, 77, 1, 4, c.H, c.C, 77, c.f161638p, c.f161636n, c.f161638p, 5, 8, 77, 9, 4, 31, 8, c.f161638p, c.C, 2, 31, c.f161646x, 77, c.f161635m, 4, 1, 8, c.H, 87, 77, 48, c.A, 31, c.D, 19, c.f161643u, 86, 2, c.C, 86, 4, 19, c.E, c.C, 0, 19, 86, c.f161640r, 31, c.D, 19, 86, 31, c.B, c.f161643u, 19, c.f161638p, 86, 19, c.B, 2, 4, c.f161639q, 86, c.f161640r, c.C, 4, 76, 86, 56, c.f161646x, c.C, 19, c.D, 7, c.B, c.f161640r, 17, 85, 32, 60, 49, 85, 19, 28, c.C, c.f161640r, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, 64, 91, 92, 85, c.f161643u, 91, 92, 86, 87, 74, c.f161643u, 84, 91, 94, 87, c.f161643u, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0G(File file, boolean z10, File[] fileArr, Map<String, MU> map) {
        long j10;
        long j11;
        MU muRemove;
        C3108kL c3108kLA01;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z10 && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else if (z10) {
                    boolean zA0A = C2141Mi.A0A(name);
                    if (A0C[0].length() != 2) {
                        String[] strArr2 = A0C;
                        strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                        strArr2[4] = "SAWP83LvD";
                        if (!zA0A && !name.endsWith(A04(0, 4, SignalKey.EVENT_ID))) {
                            j10 = -1;
                            j11 = -9223372036854775807L;
                            if (map != null) {
                                muRemove = map.remove(name);
                            } else {
                                muRemove = null;
                            }
                            if (muRemove != null) {
                                j10 = muRemove.A01;
                                j11 = muRemove.A00;
                            }
                            c3108kLA01 = C3108kL.A01(file2, j10, j11, this.A06);
                            if (c3108kLA01 != null) {
                                A0C(c3108kLA01);
                            } else {
                                file2.delete();
                            }
                        }
                    }
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                    if (map != null) {
                        muRemove = map.remove(name);
                    } else {
                        muRemove = null;
                    }
                    if (muRemove != null) {
                        j10 = muRemove.A01;
                        j11 = muRemove.A00;
                    }
                    c3108kLA01 = C3108kL.A01(file2, j10, j11, this.A06);
                    if (c3108kLA01 != null) {
                        A0C(c3108kLA01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<MZ> A0I(String str) {
        C2139Mg c2139MgA0C;
        AbstractC16843y.A08(!this.A03);
        c2139MgA0C = this.A06.A0C(str);
        return (c2139MgA0C == null || c2139MgA0C.A09()) ? new TreeSet() : new TreeSet((Collection) c2139MgA0C.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized long A7B(String str, long j10, long j11) {
        long j12;
        long j13 = j10;
        synchronized (this) {
            long j14 = j11 == -1 ? Long.MAX_VALUE : j13 + j11;
            if (j14 < 0) {
                j14 = Long.MAX_VALUE;
            }
            j12 = 0;
            while (j13 < j14) {
                long jA7C = A7C(str, j13, j14 - j13);
                if (jA7C > 0) {
                    j12 += jA7C;
                } else {
                    jA7C = -jA7C;
                }
                j13 += jA7C;
            }
        }
        return j12;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C3109kM(File file, InterfaceC3115kS interfaceC3115kS) {
        this(file, interfaceC3115kS, (byte[]) null, false);
    }

    public C3109kM(File file, InterfaceC3115kS interfaceC3115kS, C5O c5o, byte[] bArr, boolean z10, boolean z11) {
        MV mv2;
        C2141Mi c2141Mi = new C2141Mi(c5o, file, bArr, z10, z11);
        if (c5o != null && !z11) {
            mv2 = new MV(c5o);
        } else {
            mv2 = null;
        }
        this(file, interfaceC3115kS, c2141Mi, mv2);
    }

    public C3109kM(File file, InterfaceC3115kS interfaceC3115kS, C2141Mi c2141Mi, MV mv2) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC3115kS;
            this.A06 = c2141Mi;
            this.A05 = mv2;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC3115kS.AIj();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C2148Mp(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C3109kM(File file, InterfaceC3115kS interfaceC3115kS, byte[] bArr, boolean z10) {
        this(file, interfaceC3115kS, null, bArr, z10, true);
    }

    public static long A00(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + A04(0, 4, SignalKey.EVENT_ID));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, SignalKey.EVENT_ID))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AbstractC16924g.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C3108kL A03(String str, long j10, long j11) {
        C3108kL c3108kLA04;
        C2139Mg c2139MgA0C = this.A06.A0C(str);
        if (c2139MgA0C == null) {
            return C3108kL.A04(str, j10, j11);
        }
        while (true) {
            c3108kLA04 = c2139MgA0C.A04(j10, j11);
            if (!c3108kLA04.A05 || c3108kLA04.A03.length() == c3108kLA04.A01) {
                break;
            }
            A06();
        }
        return c3108kLA04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (MM e10) {
                this.A02 = e10;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] fileArrListFiles = file.listFiles();
        String strA04 = A04(297, 11, 30);
        if (fileArrListFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AbstractC16924g.A05(strA04, str);
            this.A02 = new MM(str);
            return;
        }
        this.A01 = A02(fileArrListFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e11) {
                String str2 = A04(102, 28, 114) + this.A07;
                AbstractC16924g.A08(strA04, str2, e11);
                this.A02 = new MM(str2, e11);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, MU> mapA05 = this.A05.A05();
                A0G(this.A07, true, fileArrListFiles, mapA05);
                this.A05.A09(mapA05.keySet());
            } else {
                A0G(this.A07, true, fileArrListFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e12) {
                AbstractC16924g.A08(strA04, A04(308, 25, 25), e12);
            }
        } catch (IOException e13) {
            String str3 = A04(164, 36, 29) + this.A07;
            AbstractC16924g.A08(strA04, str3, e13);
            this.A02 = new MM(str3, e13);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<C2139Mg> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            for (C3108kL c3108kL : it.next().A06()) {
                if (c3108kL.A03.length() != c3108kL.A01) {
                    arrayList.add(c3108kL);
                }
            }
        }
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i11 = str.charAt(29);
            if (i11 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i10 < size) {
                A0A((MZ) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws MM {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(MZ mz) {
        ArrayList<MO> arrayList = this.A08.get(mz.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).AG3(this, mz);
            }
        }
        this.A04.AG3(this, mz);
    }

    private void A0A(MZ mz) {
        C2139Mg c2139MgA0C = this.A06.A0C(mz.A04);
        if (c2139MgA0C == null || !c2139MgA0C.A0D(mz)) {
            return;
        }
        this.A00 -= mz.A01;
        if (this.A05 != null) {
            String name = mz.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AbstractC16924g.A07(A04(297, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(c2139MgA0C.A02);
        A09(mz);
    }

    private void A0C(C3108kL c3108kL) {
        this.A06.A0D(c3108kL.A04).A08(c3108kL);
        this.A00 += c3108kL.A01;
        A0D(c3108kL);
    }

    private void A0D(C3108kL c3108kL) {
        ArrayList<MO> arrayList = this.A08.get(c3108kL.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MO mo2 = arrayList.get(size);
                int i10 = A0C[0].length();
                if (i10 == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                mo2.AG2(this, c3108kL);
            }
        }
        this.A04.AG2(this, c3108kL);
    }

    private void A0E(C3108kL c3108kL, MZ mz) {
        ArrayList<MO> arrayList = this.A08.get(c3108kL.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).AG4(this, c3108kL, mz);
            }
        }
        this.A04.AG4(this, c3108kL, mz);
    }

    public static void A0F(File file) throws MM {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(297, 11, 30);
        AbstractC16924g.A05(message, str);
        throw new MM(str);
    }

    public static synchronized boolean A0H(File file) {
        return A0D.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void A4E(String str, C2144Ml c2144Ml) throws MM {
        AbstractC16843y.A08(!this.A03);
        A08();
        this.A06.A0L(str, c2144Ml);
        try {
            this.A06.A0I();
        } catch (IOException e10) {
            throw new MM(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void A55(File file, long j10) throws MM {
        AbstractC16843y.A08(!this.A03);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            C3108kL c3108kL = (C3108kL) AbstractC16843y.A01(C3108kL.A02(file, j10, this.A06));
            C2139Mg c2139Mg = (C2139Mg) AbstractC16843y.A01(this.A06.A0C(c3108kL.A04));
            AbstractC16843y.A08(c2139Mg.A0B(c3108kL.A02, c3108kL.A01));
            long jA00 = AbstractC2142Mj.A00(c2139Mg.A03());
            if (jA00 != -1) {
                AbstractC16843y.A08(c3108kL.A02 + c3108kL.A01 <= jA00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c3108kL.A01, c3108kL.A00);
                    A0C(c3108kL);
                    try {
                        this.A06.A0I();
                        notifyAll();
                        return;
                    } catch (IOException e10) {
                        throw new MM(e10);
                    }
                } catch (IOException e11) {
                    throw new MM(e11);
                }
            }
            A0C(c3108kL);
            this.A06.A0I();
            notifyAll();
            return;
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized long A7A() {
        AbstractC16843y.A08(!this.A03);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    @MetaExoPlayerCustomization
    public final synchronized long A7C(String str, long j10, long j11) {
        C2139Mg cachedContent;
        AbstractC16843y.A08(!this.A03);
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized InterfaceC2143Mk A7S(String str) {
        AbstractC16843y.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AHg(MZ mz) {
        AbstractC16843y.A08(!this.A03);
        C2139Mg c2139Mg = (C2139Mg) AbstractC16843y.A01(this.A06.A0C(mz.A04));
        c2139Mg.A07(mz.A02);
        this.A06.A0K(c2139Mg.A02);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AIU(String str) {
        AbstractC16843y.A08(!this.A03);
        Iterator<MZ> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AIV(MZ mz) {
        AbstractC16843y.A08(!this.A03);
        A0A(mz);
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized File AK8(String str, long lastTouchTimestamp, long j10) throws MM {
        C2139Mg c2139MgA0C;
        File file;
        AbstractC16843y.A08(!this.A03);
        A08();
        c2139MgA0C = this.A06.A0C(str);
        AbstractC16843y.A01(c2139MgA0C);
        AbstractC16843y.A08(c2139MgA0C.A0B(lastTouchTimestamp, j10));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AG5(this, str, lastTouchTimestamp, j10);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C3108kL.A05(file, c2139MgA0C.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized MZ AKA(String str, long j10, long j11, MN mn2) throws InterruptedException, MM {
        MZ span;
        AbstractC16843y.A08(!this.A03);
        A08();
        while (true) {
            span = AKB(str, j10, j11, mn2);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized C3108kL AKB(String str, long j10, long j11, MN mn2) throws MM {
        AbstractC16843y.A08(!this.A03);
        A08();
        C3108kL c3108kLA03 = A03(str, j10, j11);
        if (c3108kLA03.A05) {
            C3108kL span = this.A06.A0C(str).A05(c3108kLA03, c3108kLA03.A00, false);
            A0E(c3108kLA03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j10, c3108kLA03.A01)) {
            return c3108kLA03;
        }
        return null;
    }
}
