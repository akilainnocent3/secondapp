package com.sportygames.spin2win.model.response;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012B\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004\u0018\u00010\u0003j\u001e\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004\u0018\u0001`\u0004¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\t\u001a>\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004\u0018\u00010\u0003j\u001e\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004\u0018\u0001`\u0004HÆ\u0003JO\u0010\n\u001a\u00020\u00002D\b\u0002\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004\u0018\u00010\u0003j\u001e\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004\u0018\u0001`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001RM\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004\u0018\u00010\u0003j\u001e\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/sportygames/spin2win/model/response/RecentWinsResponse;", "", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentWinsResponse {
    public static final int $stable = 8;
    private final ArrayList<ArrayList<Object>> data;

    public RecentWinsResponse(ArrayList<ArrayList<Object>> arrayList) {
        this.data = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentWinsResponse copy$default(RecentWinsResponse recentWinsResponse, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = recentWinsResponse.data;
        }
        return recentWinsResponse.copy(arrayList);
    }

    public final ArrayList<ArrayList<Object>> component1() {
        return this.data;
    }

    public final RecentWinsResponse copy(ArrayList<ArrayList<Object>> data) {
        return new RecentWinsResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecentWinsResponse) && Intrinsics.g(this.data, ((RecentWinsResponse) other).data);
    }

    public final ArrayList<ArrayList<Object>> getData() {
        return this.data;
    }

    public int hashCode() {
        ArrayList<ArrayList<Object>> arrayList = this.data;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public String toString() {
        return "RecentWinsResponse(data=" + this.data + CaxEybC.VBheLOlxI;
    }
}
