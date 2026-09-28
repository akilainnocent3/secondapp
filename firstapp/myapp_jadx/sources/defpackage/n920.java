package defpackage;

import com.sportygames.pocketrocket.model.response.BetDetails;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class n920<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Double.valueOf(((BetDetails) t).getStakeAmount()).compareTo(Double.valueOf(((BetDetails) t2).getStakeAmount()));
    }
}
