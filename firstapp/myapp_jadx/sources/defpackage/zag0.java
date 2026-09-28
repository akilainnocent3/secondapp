package defpackage;

import com.sportybet.feature.worldcup.tournament.data.model.StandingDto;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class zag0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((StandingDto) t).getPosition()).compareTo(Integer.valueOf(((StandingDto) t2).getPosition()));
    }
}
