package sg.bigo.ads.common.u.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f133364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f133365b;

    public d(@NonNull a aVar) {
        this.f133364a = aVar;
        this.f133365b = g.a(aVar.f133357b);
    }

    @NonNull
    public final String a() {
        return this.f133365b;
    }

    @Nullable
    public final String a(String str) {
        return this.f133364a.a(str);
    }
}
