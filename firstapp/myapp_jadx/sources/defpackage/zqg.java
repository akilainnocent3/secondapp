package defpackage;

import com.sporty.android.book.presentation.eventsorting.EventStreamType;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class zqg<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((EventStreamType) t).ordinal()).compareTo(Integer.valueOf(((EventStreamType) t2).ordinal()));
    }
}
