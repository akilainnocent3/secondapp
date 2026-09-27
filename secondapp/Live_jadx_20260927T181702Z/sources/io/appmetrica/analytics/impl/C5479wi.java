package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5479wi extends C5235mn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RunnableC5454vi f98539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f98540e;

    public C5479wi(@NonNull Y4 y10, @NonNull Ll ll2, @NonNull ICommonExecutor iCommonExecutor) {
        super(y10, ll2);
        this.f98539d = new RunnableC5454vi(this);
        this.f98540e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C5235mn
    public final void a() {
        this.f98540e.remove(this.f98539d);
    }

    @Override // io.appmetrica.analytics.impl.C5235mn
    public final void f() {
        this.f97920b.a();
        C5204lh c5204lh = (C5204lh) ((Y4) this.f97919a).f96800k.a();
        if (c5204lh.f97829k.a(c5204lh.f97828j)) {
            String str = c5204lh.f97831m;
            if (TextUtils.isEmpty(str) || com.ironsource.Y1.f60333f.equals(str)) {
                return;
            }
            try {
                a(Wd.a((Y4) this.f97919a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C5235mn
    public final void g() {
        this.f98540e.executeDelayed(this.f98539d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f97921c.get()) {
            return;
        }
        this.f98540e.remove(this.f98539d);
        if (((C5204lh) ((Y4) this.f97919a).f96800k.a()).f97825g > 0) {
            this.f98540e.executeDelayed(this.f98539d, TimeUnit.SECONDS.toMillis(((C5204lh) ((Y4) this.f97919a).f96800k.a()).f97825g));
        }
    }
}
