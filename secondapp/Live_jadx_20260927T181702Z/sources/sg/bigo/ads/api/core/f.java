package sg.bigo.ads.api.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f132774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a.l f132775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.b f132776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.g f132777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f132778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f132779f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.common.g f132780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final b f132781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.api.a.l f132782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.api.b f132783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private final Context f132784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Context f132785f;

        public a(@NonNull b bVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
            this.f132781b = bVar;
            this.f132782c = lVar;
            this.f132783d = bVar2;
            this.f132784e = context;
            this.f132785f = context2;
        }

        public final f a() {
            f fVar = new f(this.f132781b, this.f132782c, this.f132783d, this.f132784e, this.f132785f, (byte) 0);
            fVar.f132777d = this.f132780a;
            return fVar;
        }
    }

    private f(@NonNull b bVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
        this.f132774a = bVar;
        this.f132775b = lVar;
        this.f132776c = bVar2;
        this.f132778e = context;
        this.f132779f = context2;
    }

    public final f a(b bVar) {
        f fVar = new f(bVar, this.f132775b, this.f132776c, this.f132778e, this.f132779f);
        fVar.f132777d = this.f132777d;
        return fVar;
    }

    public /* synthetic */ f(b bVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.b bVar2, Context context, Context context2, byte b10) {
        this(bVar, lVar, bVar2, context, context2);
    }
}
