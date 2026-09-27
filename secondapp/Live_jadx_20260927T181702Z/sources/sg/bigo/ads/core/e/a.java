package sg.bigo.ads.core.e;

import androidx.annotation.NonNull;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.u.b.d;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final k.b f134665a;

    public a(@NonNull k.b bVar) {
        super(bVar.b());
        this.f134665a = bVar;
    }

    @Override // sg.bigo.ads.common.u.b.d, sg.bigo.ads.common.u.a
    public final String a() {
        return this.f134665a.a();
    }

    @Override // sg.bigo.ads.common.u.b.d, sg.bigo.ads.common.u.a
    public final String d() {
        return this.f134665a.c();
    }

    @Override // sg.bigo.ads.common.u.b.d, sg.bigo.ads.common.u.a
    public final boolean e() {
        return this.f134665a.d();
    }
}
