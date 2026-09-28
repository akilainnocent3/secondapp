package defpackage;

import com.sportybet.plugin.sportystories.domain.entity.StoryWidget;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class q3e0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((StoryWidget) t).getSortOrder()).compareTo(Integer.valueOf(((StoryWidget) t2).getSortOrder()));
    }
}
