package defpackage;

import com.sportybet.feature.worldcup.tournament.data.model.GroupDto;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class yag0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((GroupDto) t).getDisplayOrder()).compareTo(Integer.valueOf(((GroupDto) t2).getDisplayOrder()));
    }
}
