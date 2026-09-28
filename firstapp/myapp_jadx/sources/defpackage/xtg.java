package defpackage;

import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class xtg implements m730 {

    public static final class a {
        public static final xtg a = new xtg();
    }

    @Override // defpackage.m730
    public final Object get() {
        return new sr60(Executors.newSingleThreadExecutor());
    }
}
