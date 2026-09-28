package defpackage;

import com.sportybet.android.instantwin.domain.GiftCurrentBalance;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class zd5<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return vl8.b(((GiftCurrentBalance) t).a, ((GiftCurrentBalance) t2).a);
    }
}
