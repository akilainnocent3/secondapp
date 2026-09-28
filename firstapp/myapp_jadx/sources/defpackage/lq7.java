package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class lq7<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((GiftDetails) t2).getCurrentBalance()).compareTo(Long.valueOf(((GiftDetails) t).getCurrentBalance()));
    }
}
