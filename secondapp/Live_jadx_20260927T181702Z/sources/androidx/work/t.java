package androidx.work;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends h0 {
    public t(a builder) {
        super(builder.f20112b, builder.f20113c, builder.f20114d);
    }

    @NonNull
    public static t e(@NonNull Class<? extends ListenableWorker> workerClass) {
        return new a(workerClass).b();
    }

    @NonNull
    public static List<t> f(@NonNull List<Class<? extends ListenableWorker>> workerClasses) {
        ArrayList arrayList = new ArrayList(workerClasses.size());
        Iterator<Class<? extends ListenableWorker>> it = workerClasses.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next()).b());
        }
        return arrayList;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends h0.a<a, t> {
        public a(@NonNull Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            this.f20113c.f118912d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.h0.a
        @NonNull
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public t c() {
            if (this.f20111a && this.f20113c.f118918j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new t(this);
        }

        @NonNull
        public a t(@NonNull Class<? extends n> inputMerger) {
            this.f20113c.f118912d = inputMerger.getName();
            return this;
        }

        @Override // androidx.work.h0.a
        @NonNull
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
