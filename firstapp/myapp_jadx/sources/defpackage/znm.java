package defpackage;

import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class znm implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        hom homVar = (hom) ((m0b) obj).b(hom.b);
        if (homVar == null) {
            return 0;
        }
        return hom.c.getAndIncrement(homVar);
    }
}
