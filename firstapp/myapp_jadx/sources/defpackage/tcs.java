package defpackage;

import com.sportybet.repository.limits.model.LimitResponse;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class tcs<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((LimitResponse) t).getGameType()).compareTo(Integer.valueOf(((LimitResponse) t2).getGameType()));
    }
}
