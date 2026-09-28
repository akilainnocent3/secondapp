package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class gj5 {

    public static final class a extends gj5 {
        @Override // defpackage.gj5
        public final List<? extends tu5.a> a(Executor executor) {
            return Arrays.asList(new km8(), new ebd(executor));
        }

        @Override // defpackage.gj5
        public final List<? extends y2b.a> b() {
            return Collections.singletonList(new m2z());
        }
    }

    public List<? extends tu5.a> a(Executor executor) {
        return Collections.singletonList(new ebd(executor));
    }

    public List<? extends y2b.a> b() {
        return Collections.EMPTY_LIST;
    }
}
