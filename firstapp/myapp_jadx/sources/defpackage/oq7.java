package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class oq7<T> implements Comparator {
    public final /* synthetic */ lq7 a;

    public oq7(lq7 lq7Var) {
        this.a = lq7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        return iCompare != 0 ? iCompare : Long.valueOf(((GiftDetails) t).getUsableTime()).compareTo(Long.valueOf(((GiftDetails) t2).getUsableTime()));
    }
}
