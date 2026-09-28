package com.sportybet.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.p;
import defpackage.m2g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/sportybet/core/domain/model/ApplicableCategoryIds;", "Landroid/os/Parcelable;", "ids", "", "", "domain"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ApplicableCategoryIds implements Parcelable {
    public static final Parcelable.Creator<ApplicableCategoryIds> CREATOR = new a();
    public static final m2g b;
    public final List<Integer> a;

    public static final class a implements Parcelable.Creator<ApplicableCategoryIds> {
        @Override // android.os.Parcelable.Creator
        public final ApplicableCategoryIds createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new ApplicableCategoryIds(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicableCategoryIds[] newArray(int i) {
            return new ApplicableCategoryIds[i];
        }
    }

    static {
        m2g m2gVar = m2g.a;
        m2gVar.getClass();
        b = m2gVar;
    }

    public /* synthetic */ ApplicableCategoryIds(List list) {
        this.a = list;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b A[PHI: r2
      0x004b: PHI (r2v3 java.lang.Enum) = (r2v2 java.lang.Enum), (r2v6 java.lang.Enum) binds: [B:9:0x0029, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            b.b.getClass();
            Enum enumA = b.a.a(iIntValue);
            Enum r4 = null;
            if (enumA == b.None) {
                enumA = null;
            }
            if (enumA == null) {
                c.b.getClass();
                enumA = c.a.a(iIntValue);
                if (enumA == c.None) {
                    enumA = null;
                }
                if (enumA == null) {
                    com.sportybet.core.domain.model.a.b.getClass();
                    Enum enumA2 = com.sportybet.core.domain.model.a.C0358a.a(iIntValue);
                    if (enumA2 != com.sportybet.core.domain.model.a.None) {
                        r4 = enumA2;
                    }
                } else {
                    r4 = enumA;
                }
            } else {
                r4 = enumA;
            }
            if (r4 != null) {
                arrayList.add(r4);
            }
        }
        return arrayList;
    }

    public static String e(List<? extends Integer> list) {
        return p.a("ApplicableCategoryIds(ids=", ")", list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ApplicableCategoryIds) {
            return Intrinsics.g(this.a, ((ApplicableCategoryIds) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return e(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.getClass();
        List<Integer> list = this.a;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }
}
