package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class dyg0 implements jee0 {
    public final yxg0 a;
    public final long[] b;
    public final Map<String, cyg0> c;
    public final HashMap d;
    public final HashMap e;

    public dyg0(yxg0 yxg0Var, HashMap map, HashMap map2, HashMap map3) {
        this.a = yxg0Var;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        yxg0Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.jee0
    public final int a(long j) {
        long[] jArr = this.b;
        int iA = jrh0.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.jee0
    public final List<j4c> b(long j) {
        ArrayList arrayList = new ArrayList();
        yxg0 yxg0Var = this.a;
        yxg0Var.g(j, yxg0Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        yxg0Var.i(j, false, yxg0Var.h, treeMap);
        String str = yxg0Var.h;
        Map<String, cyg0> map = this.c;
        HashMap map2 = this.d;
        yxg0Var.h(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str2 = (String) this.e.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                ayg0 ayg0Var = (ayg0) map2.get(pair.first);
                ayg0Var.getClass();
                j4c.a aVar = new j4c.a();
                aVar.b = bitmapDecodeByteArray;
                aVar.a = null;
                aVar.h = ayg0Var.b;
                aVar.i = 0;
                aVar.e = ayg0Var.c;
                aVar.f = 0;
                aVar.g = ayg0Var.e;
                aVar.l = ayg0Var.f;
                aVar.m = ayg0Var.g;
                aVar.p = ayg0Var.j;
                arrayList2.add(aVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ayg0 ayg0Var2 = (ayg0) map2.get(entry.getKey());
            ayg0Var2.getClass();
            j4c.a aVar2 = (j4c.a) entry.getValue();
            CharSequence charSequence = aVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (fmd fmdVar : (fmd[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fmd.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(fmdVar), spannableStringBuilder.getSpanEnd(fmdVar), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = ayg0Var2.c;
            int i10 = ayg0Var2.d;
            aVar2.e = f;
            aVar2.f = i10;
            aVar2.g = ayg0Var2.e;
            aVar2.h = ayg0Var2.b;
            aVar2.l = ayg0Var2.f;
            float f2 = ayg0Var2.i;
            int i11 = ayg0Var2.h;
            aVar2.k = f2;
            aVar2.j = i11;
            aVar2.p = ayg0Var2.j;
            arrayList2.add(aVar2.a());
        }
        return arrayList2;
    }

    @Override // defpackage.jee0
    public final long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.jee0
    public final int d() {
        return this.b.length;
    }
}
