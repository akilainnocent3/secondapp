package qy;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @TargetApi(24)
    public static final class a extends c {
        @Override // qy.c
        public List<? extends e.a> a(@zq.h Executor executor) {
            return Arrays.asList(new h(), new j(executor));
        }

        @Override // qy.c
        public List<? extends i.a> b() {
            return Collections.singletonList(new y());
        }
    }

    public List<? extends e.a> a(@zq.h Executor executor) {
        return Collections.singletonList(new j(executor));
    }

    public List<? extends i.a> b() {
        return Collections.EMPTY_LIST;
    }
}
