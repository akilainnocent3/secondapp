package defpackage;

import androidx.compose.animation.k;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class c490<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        grr grrVar = (grr) t;
        grr grrVar2 = (grr) t2;
        return Float.valueOf((grrVar.b() == 0.0f && (grrVar instanceof k) && ((k) grrVar).y == null) ? -1.0f : grrVar.b()).compareTo(Float.valueOf((grrVar2.b() == 0.0f && (grrVar2 instanceof k) && ((k) grrVar2).y == null) ? -1.0f : grrVar2.b()));
    }
}
