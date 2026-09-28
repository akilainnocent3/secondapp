package defpackage;

import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class rab0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((DetailResponse.BetConfigList) t).getOrderedPosition()).compareTo(Integer.valueOf(((DetailResponse.BetConfigList) t2).getOrderedPosition()));
    }
}
