package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer[] f45243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45244b;

    public z(String str) throws y {
        this.f45243a = new Integer[0];
        if (TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new y();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("\\.")) {
            arrayList.add(Integer.valueOf(com.fyber.inneractive.sdk.util.v.a(str2, 0)));
        }
        this.f45243a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
        this.f45244b = str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z zVar) {
        if (zVar == null) {
            return 1;
        }
        int iMax = Math.max(this.f45243a.length, zVar.f45243a.length);
        int i10 = 0;
        while (i10 < iMax) {
            Integer[] numArr = this.f45243a;
            int iIntValue = numArr.length > i10 ? numArr[i10].intValue() : 0;
            Integer[] numArr2 = zVar.f45243a;
            int iIntValue2 = numArr2.length > i10 ? numArr2[i10].intValue() : 0;
            if (iIntValue > iIntValue2) {
                return 1;
            }
            if (iIntValue2 > iIntValue) {
                return -1;
            }
            i10++;
        }
        return 0;
    }

    public final String toString() {
        return this.f45244b;
    }
}
