package defpackage;

import com.sportybet.feature.worldcup.tournament.data.model.StageDto;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class abg0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((StageDto) t).getOrder()).compareTo(Integer.valueOf(((StageDto) t2).getOrder()));
    }
}
