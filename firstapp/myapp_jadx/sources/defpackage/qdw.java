package defpackage;

import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class qdw<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((LevelConfigDetailDto) t).getLevel()).compareTo(Integer.valueOf(((LevelConfigDetailDto) t2).getLevel()));
    }
}
