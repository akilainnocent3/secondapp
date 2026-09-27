package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f155318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f155319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v93 f155320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f155321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f155322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f155323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s93 f155324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f155325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f155326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f155327m;

    public s93(String str, String str2, long j10, long j11, v93 v93Var, String[] strArr, String str3, String str4, s93 s93Var) {
        this.f155315a = str;
        this.f155316b = str2;
        this.f155323i = str4;
        this.f155320f = v93Var;
        this.f155321g = strArr;
        this.f155317c = str2 != null;
        this.f155318d = j10;
        this.f155319e = j11;
        this.f155322h = (String) ni.a((Object) str3);
        this.f155324j = s93Var;
        this.f155325k = new HashMap();
        this.f155326l = new HashMap();
    }

    public final s93 a(int i10) {
        ArrayList arrayList = this.f155327m;
        if (arrayList != null) {
            return (s93) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(TreeSet treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f155315a);
        boolean zEquals2 = "div".equals(this.f155315a);
        if (z10 || zEquals || (zEquals2 && this.f155323i != null)) {
            long j10 = this.f155318d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f155319e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f155327m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f155327m.size(); i10++) {
            ((s93) this.f155327m.get(i10)).a(treeSet, z10 || zEquals);
        }
    }

    public static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            n20 n20Var = new n20();
            n20Var.f152831a = new SpannableStringBuilder();
            treeMap.put(str, n20Var);
        }
        CharSequence charSequence = ((n20) treeMap.get(str)).f152831a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean a(long j10) {
        long j11 = this.f155318d;
        if (j11 == -9223372036854775807L && this.f155319e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f155319e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f155319e) {
            return j11 <= j10 && j10 < this.f155319e;
        }
        return true;
    }

    public final void a(long j10, String str, ArrayList arrayList) {
        if (!"".equals(this.f155322h)) {
            str = this.f155322h;
        }
        if (a(j10) && "div".equals(this.f155315a) && this.f155323i != null) {
            arrayList.add(new Pair(str, this.f155323i));
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f155327m;
            if (i10 >= (arrayList2 == null ? 0 : arrayList2.size())) {
                return;
            }
            a(i10).a(j10, str, arrayList);
            i10++;
        }
    }

    public final void a(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        if (!a(j10)) {
            return;
        }
        String str2 = "".equals(this.f155322h) ? str : this.f155322h;
        Iterator it = this.f155326l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            int iIntValue = this.f155325k.containsKey(str3) ? ((Integer) this.f155325k.get(str3)).intValue() : 0;
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if (iIntValue != iIntValue2) {
                n20 n20Var = (n20) treeMap.get(str3);
                n20Var.getClass();
                t93 t93Var = (t93) map2.get(str2);
                t93Var.getClass();
                int i10 = t93Var.f155792j;
                v93 v93VarA = u93.a(this.f155320f, this.f155321g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) n20Var.f152831a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    n20Var.f152831a = spannableStringBuilder;
                }
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (v93VarA != null) {
                    u93.a(spannableStringBuilder2, iIntValue, iIntValue2, v93VarA, this.f155324j, map, i10);
                    if ("p".equals(this.f155315a)) {
                        float f10 = v93VarA.f156873s;
                        if (f10 != Float.MAX_VALUE) {
                            n20Var.f152847q = (f10 * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = v93VarA.f156869o;
                        if (alignment != null) {
                            n20Var.f152833c = alignment;
                        }
                        Layout.Alignment alignment2 = v93VarA.f156870p;
                        if (alignment2 != null) {
                            n20Var.f152834d = alignment2;
                        }
                    }
                }
            }
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f155327m;
            if (i11 >= (arrayList == null ? 0 : arrayList.size())) {
                return;
            }
            a(i11).a(j10, map, map2, str2, treeMap);
            i11++;
        }
    }

    public final void a(long j10, boolean z10, String str, TreeMap treeMap) {
        this.f155325k.clear();
        this.f155326l.clear();
        if ("metadata".equals(this.f155315a)) {
            return;
        }
        if (!"".equals(this.f155322h)) {
            str = this.f155322h;
        }
        String str2 = str;
        if (this.f155317c && z10) {
            SpannableStringBuilder spannableStringBuilderA = a(str2, treeMap);
            String str3 = this.f155316b;
            str3.getClass();
            spannableStringBuilderA.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f155315a) && z10) {
            a(str2, treeMap).append('\n');
            return;
        }
        if (a(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap map = this.f155325k;
                String str4 = (String) entry.getKey();
                CharSequence charSequence = ((n20) entry.getValue()).f152831a;
                charSequence.getClass();
                map.put(str4, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(this.f155315a);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f155327m;
                if (i10 >= (arrayList == null ? 0 : arrayList.size())) {
                    break;
                }
                a(i10).a(j10, z10 || zEquals, str2, treeMap);
                j10 = j10;
                i10++;
                treeMap = treeMap;
            }
            TreeMap treeMap2 = treeMap;
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderA2 = a(str2, treeMap2);
                int length = spannableStringBuilderA2.length() - 1;
                while (length >= 0 && spannableStringBuilderA2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderA2.charAt(length) != '\n') {
                    spannableStringBuilderA2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap2.entrySet()) {
                HashMap map2 = this.f155326l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequence2 = ((n20) entry2.getValue()).f152831a;
                charSequence2.getClass();
                map2.put(str5, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public static s93 a(String str) {
        return new s93(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public final long[] a() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public final ArrayList a(long j10, Map map, Map map2, Map map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        a(j10, this.f155322h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j10, false, this.f155322h, treeMap);
        a(j10, map, map2, this.f155322h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                t93 t93Var = (t93) map2.get(pair.first);
                t93Var.getClass();
                arrayList2.add(new o20(null, null, null, bitmapDecodeByteArray, t93Var.f155785c, 0, t93Var.f155787e, t93Var.f155784b, 0, Integer.MIN_VALUE, -3.4028235E38f, t93Var.f155788f, t93Var.f155789g, false, -16777216, t93Var.f155792j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            t93 t93Var2 = (t93) map2.get(entry.getKey());
            t93Var2.getClass();
            n20 n20Var = (n20) entry.getValue();
            CharSequence charSequence = n20Var.f152831a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (vf0 vf0Var : (vf0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vf0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(vf0Var), spannableStringBuilder.getSpanEnd(vf0Var), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = t93Var2.f155785c;
            int i18 = t93Var2.f155786d;
            n20Var.f152835e = f10;
            n20Var.f152836f = i18;
            n20Var.f152837g = t93Var2.f155787e;
            n20Var.f152838h = t93Var2.f155784b;
            n20Var.f152842l = t93Var2.f155788f;
            float f11 = t93Var2.f155791i;
            int i19 = t93Var2.f155790h;
            n20Var.f152841k = f11;
            n20Var.f152840j = i19;
            n20Var.f152846p = t93Var2.f155792j;
            arrayList2.add(n20Var.a());
        }
        return arrayList2;
    }
}
