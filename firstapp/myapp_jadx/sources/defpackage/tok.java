package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class tok<T> implements Comparator {
    public final /* synthetic */ uok a;

    public tok(uok uokVar) {
        this.a = uokVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        return iCompare != 0 ? iCompare : Long.valueOf(((GiftDetails) t).getExpireTime()).compareTo(Long.valueOf(((GiftDetails) t2).getExpireTime()));
    }
}
